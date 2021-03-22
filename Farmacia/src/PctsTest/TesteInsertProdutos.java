package PctsTest;

 

import org.junit.Test;

import br.com.farmacia.dao.ProdutoDao;
import br.com.farmacia.domain.Fornecedores;
import br.com.farmacia.domain.Produtos;

public class TesteInsertProdutos {

	@Test
	public void test() {
		Produtos produto = new Produtos();
		ProdutoDao produtodao = new ProdutoDao();
		Fornecedores fornecedores = new Fornecedores();
		
		fornecedores.setCodigo(11L);
		
		produto.setDescricao("BEZETACIL");
		produto.setPreco(2000);
		produto.setQuantidade(230L);
		produto.setFornecedores(fornecedores);
		 
		
		produtodao.salvar(produto);
		
	}

}
