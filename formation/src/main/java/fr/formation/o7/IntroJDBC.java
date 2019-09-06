package fr.formation.o7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IntroJDBC {
	
	private static String URL ="jdbc:mysql://localhost:3306/client?serverTimezone=GMT";
	private static String USER = "root";
	private static String PWD = "lanfeust59";
	
	
	public static Connection conn;
	
	public static void main(String[] args) {
		
	
		try {
			conn = DriverManager.getConnection(URL, USER, PWD);
			if (conn != null) {
				System.out.println("Connecté!!");
			} else {
				System.out.println("Connexion échouée");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Statement statement;
		
		try {
			statement = conn.createStatement();
			String sql = "insert into repertoire (nom, prenom)" + "values ('John', 'Smith')";
			statement = conn.createStatement();
			int success = statement.executeUpdate(sql);
			System.out.println("nb inser : " + success);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
		

}
