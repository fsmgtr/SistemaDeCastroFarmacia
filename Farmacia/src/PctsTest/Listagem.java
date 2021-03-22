package PctsTest;

 

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import br.com.farmacia.dao.FornecedoresDao;
import br.com.farmacia.domain.Fornecedores;

public class Listagem {

	@Test
	public void test() throws SQLException {
	 
		 FornecedoresDao fornecedoresdao = new FornecedoresDao();
		 
		 ArrayList<Fornecedores> listagemTotal = fornecedoresdao.listar();
		 
		 for (Fornecedores fornecedores2 : listagemTotal) {
			 System.out.println("Resultado: " + fornecedores2);
			
		}
		 
		 
	}

}
