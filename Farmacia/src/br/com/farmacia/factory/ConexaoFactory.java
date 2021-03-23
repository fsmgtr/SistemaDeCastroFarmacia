package br.com.farmacia.factory;

 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 

public class ConexaoFactory {

	private static final String user = "root";
	private static final String password = "";
	private static final String url = "jdbc:mysql://localhost:3306/sysdrograria?useTimezone=true&serverTimezone=UTC";

	public static Connection conectar() throws SQLException {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection conexao = DriverManager.getConnection(url, user, password);

		return conexao;
	}
	
	
}
