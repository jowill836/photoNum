package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TheConnection {
	
	// Etablissement de la connection
	DatabaseAccessProperties dataBaseProperties = new DatabaseAccessProperties("src/BD.properties");
	
	private String url = dataBaseProperties.getDatabaseUrl();
	private String user = dataBaseProperties.getUsername();
	private String passwd = dataBaseProperties.getPassword();
	private static Connection connect;
	
	private TheConnection() {
		try {
			
			// Enregistrement du driver Oracle
	  	    System.out.print("Loading Oracle driver... "); 
	  	    DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());  	   
	  	    System.out.println("loaded");
	  	    
	  	   // System.out.print("Connecting to the database... "); 
			connect = DriverManager.getConnection(url, user, passwd);
			
			
		}catch(SQLException e) {
			System.err.println("failed");
            System.out.println("Affichage de la pile d'erreur");
	          e.printStackTrace(System.err);
            System.out.println("Affichage du message d'erreur");
            System.out.println(e.getMessage());
            System.out.println("Affichage du code d'erreur");
	          System.out.println(e.getErrorCode());
			}
	}
	
	public static Connection getInstance() {
		if(connect == null) {
			new TheConnection();
			System.out.println("Une nouvelle connexion SQL a été ouverte !");
			return connect;
		}else {
			System.out.println("Une connexion est déjà ouverte ! ");
			return connect;
		}
	}

}
 