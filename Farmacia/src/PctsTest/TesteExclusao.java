package PctsTest;

 

import java.sql.SQLException;

import org.junit.Test;

import br.com.farmacia.dao.FornecedoresDao;
import br.com.farmacia.domain.Fornecedores;

public class TesteExclusao {

	@Test
	public void test() throws SQLException {
		Fornecedores fornecedores = new Fornecedores();
		FornecedoresDao fornecedoresdao = new FornecedoresDao();

		fornecedores.setCodigo(1L);
	 
		fornecedoresdao.excluir(fornecedores);
	 
	}

}
