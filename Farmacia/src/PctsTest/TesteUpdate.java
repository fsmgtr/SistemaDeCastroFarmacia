package PctsTest;

 

import java.sql.SQLException;

import org.junit.Test;

import br.com.farmacia.dao.FornecedoresDao;
import br.com.farmacia.domain.Fornecedores;

public class TesteUpdate {

	@Test
	public void test() throws SQLException {
		
		try {
			Fornecedores fornecedores = new Fornecedores();
			FornecedoresDao fornecedoresdao = new FornecedoresDao();
			
			fornecedores.setCodigo(2L);
			fornecedores.setDescricao("TEste se editou ou não");
			fornecedoresdao.editar(fornecedores);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
