package PctsTest;

 

import org.junit.Test;

import br.com.farmacia.dao.ProdutoDao;
import br.com.farmacia.domain.Fornecedores;
import br.com.farmacia.domain.Produtos;

public class EditarProduto {

	@Test
	public void test() {
		Produtos produtos = new Produtos();
		ProdutoDao produtodao = new ProdutoDao();
		
		produtos.setCodigo(1L);
		produtos.setDescricao("Teste de alteração");
		produtos.setPreco((float) 1.65);
		produtos.setQuantidade(8547L);	
		
		Fornecedores fornecedores = new Fornecedores();
		fornecedores.setCodigo(6L);
		
		produtos.setFornecedores(fornecedores);
		
		
		produtodao.editar(produtos);
		
		
		
	}

}
