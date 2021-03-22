package br.com.farmacia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.famarcia.factory.ConexaoFactory;
import br.com.farmacia.domain.Fornecedores;
import br.com.farmacia.domain.Produtos;

public class ProdutoDao {

	public void salvar(Produtos produtos) {

		try {

			String sql = "INSERT INTO produtos (descricao, preco, quantidade, fornecedores_codigo) VALUES (?,?,?,?)";
			Connection conexao = ConexaoFactory.conectar();
			PreparedStatement insert = conexao.prepareStatement(sql);
			insert.setString(1, produtos.getDescricao());
			insert.setFloat(2, produtos.getPreco());
			insert.setLong(3, produtos.getQuantidade());
			insert.setLong(4, produtos.getFornecedores().getCodigo());
			insert.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	public ArrayList<Produtos> listar() throws SQLException {

		String sql =  "SELECT p.codigo, p.descricao, p.preco,  p.quantidade, f.codigo, f.descricao "
				+ "FROM produtos p "
				+ "INNER JOIN fornecedores f "
				+ "ON f.codigo = p.fornecedores_codigo;";
		Connection conexao = ConexaoFactory.conectar();
		PreparedStatement selectList = conexao.prepareStatement(sql);
		ResultSet retorno = selectList.executeQuery();

		ArrayList<Produtos> lista = new ArrayList<Produtos>();

		while (retorno.next()) {
			Produtos produtos = new Produtos();
			Fornecedores fornecedores = new Fornecedores();
			
			fornecedores.setCodigo(retorno.getLong("f.codigo"));
			fornecedores.setDescricao(retorno.getString("f.descricao"));
			
			produtos.setCodigo(retorno.getLong("p.codigo"));
			produtos.setDescricao(retorno.getString("p.descricao"));
			produtos.setPreco(retorno.getFloat("p.preco"));
			produtos.setQuantidade(retorno.getLong("p.quantidade"));
			
			produtos.setFornecedores(fornecedores);

			lista.add(produtos);

		}
		return lista;

	}


	
	
	
	public void editar(Produtos produtos) {

		try {
			String sql = "UPDATE produtos SET descricao = ? , preco = ? , "
					+ "quantidade = ? , fornecedores_codigo = ? WHERE codigo = ? ";
			Connection conexao = ConexaoFactory.conectar();
			PreparedStatement update = conexao.prepareStatement(sql);

			update.setString(1, produtos.getDescricao());
			update.setDouble(2, produtos.getPreco());
			update.setLong(3, produtos.getQuantidade());	
			update.setLong(4, produtos.getFornecedores().getCodigo());
			update.setLong(5, produtos.getCodigo());

			update.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public void excluir(Produtos produto) {

		try {
			String sql = "DELETE FROM produtos WHERE codigo = ?";
			Connection conexao;
			conexao = ConexaoFactory.conectar();
			PreparedStatement delete = conexao.prepareStatement(sql);
			delete.setLong(1, produto.getCodigo());
			delete.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	
	
	
	
	
}
