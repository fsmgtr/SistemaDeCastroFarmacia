package br.com.farmacia.test;

 

 

import java.sql.SQLException;

import org.junit.Test;

import br.com.farmacia.DAO.ProdutoDAO;
import br.com.farmacia.domain.Produtos;

public class ExcluirProd {

	@Test
	public void test() throws SQLException {
		Produtos produtos = new Produtos();
		ProdutoDAO produtoDao = new ProdutoDAO();
		
		produtos.setCodigo(2L);
		produtoDao.excluir(produtos);
	}

}
