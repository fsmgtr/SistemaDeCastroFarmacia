package br.com.farmacia.test;

 

 

import java.sql.SQLException;

import org.junit.Test;

import br.com.farmacia.DAO.FornecedoresDAO;
 
import br.com.farmacia.domain.Fornecedores;

public class BuscarPorCodigo {

	@Test
	public void test() throws SQLException {
		 Fornecedores fornecedores = new Fornecedores();
		 Fornecedores fornecedores2 = new Fornecedores();
		 FornecedoresDAO fornecedoresdao = new FornecedoresDAO();
		 
		 fornecedores.setCodigo(4L);
		 fornecedores2.setCodigo(5L);
		 
	Fornecedores f22 =  fornecedoresdao.buscaPorCodigo(fornecedores2);
	 
		 
		 System.out.println("Resultado:_________________");
		 System.out.println(" _________________");
		 System.out.println(f22);
		 System.out.println(" _________________");
		 System.out.println(fornecedores2);
		 
	}

}
