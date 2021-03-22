package PctsTest;

 

import org.junit.Test;

import br.com.farmacia.dao.ProdutoDao;
import br.com.farmacia.domain.Produtos;

public class ExcluirProd {

	@Test
	public void test() {
		Produtos produtos = new Produtos();
		ProdutoDao produtoDao = new ProdutoDao();
		
		produtos.setCodigo(2L);
		produtoDao.excluir(produtos);
	}

}
