package br.com.farmacia.test;

 

 

import java.sql.SQLException;

import org.junit.Test;

import br.com.farmacia.DAO.FornecedoresDAO;
import br.com.farmacia.domain.Fornecedores;

public class TesteUpdate {

	@Test
	public void test() throws SQLException {
		
		try {
			Fornecedores fornecedores = new Fornecedores();
			FornecedoresDAO fornecedoresdao = new FornecedoresDAO();
			
			fornecedores.setCodigo(2L);
			fornecedores.setDescricao("TEste se editou ou não");
			fornecedoresdao.editar(fornecedores);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
