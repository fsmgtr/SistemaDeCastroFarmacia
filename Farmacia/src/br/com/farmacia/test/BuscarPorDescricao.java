package br.com.farmacia.test;

 

 

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import br.com.farmacia.DAO.FornecedoresDAO;
import br.com.farmacia.domain.Fornecedores;

public class BuscarPorDescricao {

	@Test
	public void test() throws SQLException {
		 
		try {
			Fornecedores fornecedores = new Fornecedores();		  
			 FornecedoresDAO fornecedoresdao = new FornecedoresDAO();
			 
			 fornecedores.setDescricao("nu");
			 
			 ArrayList<Fornecedores> listar = fornecedoresdao.buscarPorDescricao(fornecedores);
			 for (Fornecedores fornecedores2 : listar) {
				 System.out.println(fornecedores2);
				 System.out.println("- - - - - - -- ");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	 
		 
	}

}
