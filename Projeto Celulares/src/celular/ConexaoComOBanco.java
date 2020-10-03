package celular;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoComOBanco {

	public static Connection criarConexao() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/teste"; //Nome da base de dados
		String user = "root"; //nome do usuário do MySQL
		String password = "123"; //senha do MySQL

		Connection conexao = null;
		conexao = DriverManager.getConnection(url, user, password);

		System.out.println("Conectado com o banco.");
		
		return conexao;
	}
}