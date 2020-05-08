package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.ResultSet;

public class Program {
	public static void main(String[] args) {
		
		try {
			
			String driverName = "com.mysql.cj.jdbc.Driver";                        
			Class.forName(driverName);
		
			String url = "jdbc:mysql://";
			String server = "localhost:3306/";
			String database = "aplicacao";
			String user = "root";
			String password = "root";
			String time = "?useTimezone=true&serverTimezone=UTC";
				
			Connection conn = DriverManager.getConnection(url + server + database + time, user , password);
			
			System.out.println("O que deseja?");
			Scanner sc = new Scanner(System.in);
			String opcao = sc.next();
			sc.nextLine();
			
			String query,nome,email,login,senha;
			
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			if("procurar".equals(opcao)) { 
				query = "select * from conta where email = ? ";
				System.out.println("Qual email deseja procurar ?");
				email = sc.nextLine();
				if (!email.contains("@") && email.toLowerCase().charAt(0) == 'n')query = "select * from conta"; ;
				ps = conn.prepareStatement(query);
				if(query.contains("@"))ps.setString(1,email);
				
				rs = ps.executeQuery();
			};
			
			if("inserir".equals(opcao)) { 
				query = "insert into conta (nome,email,login,senha) values (?,?,?,?)";
				System.out.println("Insira os dados na seguinte ordem:");
				System.out.println("1.nome");
				nome = sc.nextLine();
				System.out.println("2.email");
				email = sc.nextLine();
				System.out.println("3.login");
				login = sc.nextLine();
				System.out.println("4.senha");
				senha = sc.next();
				
				ps = conn.prepareStatement(query);
				ps.setString(1,nome);
				ps.setString(2,email);
				ps.setString(3,login);
				ps.setString(4,senha);
				
				int row = ps.executeUpdate();
			};
			
			if("procurar".equals(opcao)) {
				while(rs.next()) {
					System.out.printf(rs.getString("login") + "\t | \t" + rs.getString("senha") + "\t | \t" + rs.getString("email") + "\t | \t" + rs.getString("nome") + "\n\n");
				}
			}
			
			sc.close();
			if(rs != null)rs.close();
			if(ps != null)ps.close();
			if(conn != null)conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}			
	}

}
