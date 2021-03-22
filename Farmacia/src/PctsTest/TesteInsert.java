package PctsTest;
 

import java.sql.SQLException;

import org.junit.Test;

import br.com.farmacia.dao.FornecedoresDao;
import br.com.farmacia.domain.Fornecedores;

public class TesteInsert {

	@Test
	public void test() throws SQLException {
		Fornecedores fornecedores = new Fornecedores();
		FornecedoresDao fornecedoresdao = new FornecedoresDao();
		
		
		fornecedores.setDescricao("TEste descrição");
		fornecedoresdao.salvar(fornecedores);
		
	}

}
