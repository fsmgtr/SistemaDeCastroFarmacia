package br.com.farmacia.test;

 

 

import java.sql.SQLException;

import org.junit.Test;

import br.com.farmacia.DAO.ProdutoDAO;
import br.com.farmacia.domain.Fornecedores;
import br.com.farmacia.domain.Produtos;

public class TesteInsertProdutos {

	@Test
	public void test() throws SQLException {
		Produtos produto = new Produtos();
		ProdutoDAO produtodao = new ProdutoDAO();
		Fornecedores fornecedores = new Fornecedores();
		
		fornecedores.setCodigo(11L);
		
		produto.setDescricao("BEZETACIL");
		produto.setPreco((double) 2000);
		produto.setQuantidade(230L);
		produto.setFornecedores(fornecedores);
		 
		
		produtodao.salvar(produto);
		
	}

}
