package celular;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProgramaCelular {

	public static void main(String[] args) {

		ConexaoComOBanco NovaConexao = new ConexaoComOBanco();
		Celulares celulares = new Celulares();

		String LerSql = "Select * From Celular;";
		String InserirSql = "Insert Into Celular(nome) Values ('Ifhone 12');";
		String AtualizarSql = "Update Celular set nome = 'Iphone 12' where id = '7'";
		String DeletarSql = "Delete from Celular Where id='5';";
		String AdicionarColuna = "Alter Table Celular Add Column id int(20) AUTO_INCREMENT PRIMARY KEY FIRST;";
		
		
		try {
			
			Connection conexao = NovaConexao.criarConexao();
			
			PreparedStatement ps = conexao.prepareStatement(LerSql);
			PreparedStatement ps2 = conexao.prepareStatement(AtualizarSql);
			
			
			ps2.executeUpdate();
			
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next()) {
				
				String nome = rs.getString("nome");
				int id = rs.getInt("id");
				
				celulares.getNome().add(nome);
				celulares.getId().add(id);
				
			}
			
			System.out.println("id | nome ");
			System.out.println();
			
			for (int i = 0; i < celulares.getNome().size(); i++) {
				
				System.out.println(celulares.getId().get(i) + "    " + celulares.getNome().get(i));
				
			}
			
			rs.close();
			ps.close();
			conexao.close();
			
		} catch (SQLException | NullPointerException erro ) {
			
			System.out.println( "OCORREU UM ERRO!  " + erro.getMessage() );
			
		}
		
	}
}
