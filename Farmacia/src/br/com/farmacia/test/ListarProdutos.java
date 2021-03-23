package br.com.farmacia.test;

 

  
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import br.com.farmacia.DAO.ProdutoDAO;
import br.com.farmacia.domain.Produtos;

public class ListarProdutos {

	@Test
	public void test() {
		 
		
		try {
			ProdutoDAO dao = new ProdutoDAO();
			ArrayList<Produtos> lista = dao.listar();
			 
			
			for (Produtos produtos : lista) {
				System.out.println("REsult" + produtos);
				System.out.println("- - - - - - - - - -");
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
