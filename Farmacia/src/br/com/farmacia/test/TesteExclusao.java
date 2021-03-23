package br.com.farmacia.test;

 

 

import java.sql.SQLException;

import org.junit.Test;

import br.com.farmacia.DAO.FornecedoresDAO;
 
import br.com.farmacia.domain.Fornecedores;

public class TesteExclusao {

	@Test
	public void test() throws SQLException {
		Fornecedores fornecedores = new Fornecedores();
		FornecedoresDAO fornecedoresdao = new FornecedoresDAO();

		fornecedores.setCodigo(1L);
	 
		fornecedoresdao.excluir(fornecedores);
	 
	}

}
