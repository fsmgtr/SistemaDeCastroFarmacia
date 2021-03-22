package PctsTest;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import br.com.famarcia.factory.ConexaoFactory;

@SuppressWarnings("unused")
public class TesteConexao {

	@Test
	 public void conexao() {
		try {
			Connection conexao = ConexaoFactory.conectar();
			System.out.println("Conectou!");
		} catch (SQLException e) {
			System.out.println("Não conectou");
			e.printStackTrace();
		}
	}
		
	

}