package br.com.farmacia.test;

 

 

import java.sql.SQLException;

import org.junit.Test;

import br.com.farmacia.DAO.ProdutoDAO;
 
import br.com.farmacia.domain.Fornecedores;
import br.com.farmacia.domain.Produtos;

public class EditarProduto {

	@Test
	public void test() throws SQLException {
		Produtos produtos = new Produtos();
		ProdutoDAO produtodao = new ProdutoDAO ();
		
		Produtos p = new Produtos();
		/*
		produtos.setCodigo(1L);
		produtos.setDescricao("Teste de alteração");
		produtos.setPreco
		produtos.setQuantidade(8547L);	
		*/
		Fornecedores fornecedores = new Fornecedores();
		fornecedores.setCodigo(6L);
		
		produtos.setFornecedores(fornecedores);
		
		
		produtodao.editar(produtos);
		
		
		
	}

}
