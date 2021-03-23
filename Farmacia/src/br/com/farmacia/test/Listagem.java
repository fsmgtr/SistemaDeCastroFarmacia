package br.com.farmacia.test;

 

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import br.com.farmacia.DAO.FornecedoresDAO;
import br.com.farmacia.domain.Fornecedores;

 

public class Listagem {

	@Test
	public void test() throws SQLException {
	 
		 FornecedoresDAO fornecedoresdao = new FornecedoresDAO();
		 
		 ArrayList<Fornecedores> listagemTotal = fornecedoresdao.listar();
		 
		 for (Fornecedores fornecedores2 : listagemTotal) {
			 System.out.println("Resultado: " + fornecedores2);
			
		}
		 
		 
	}

}
