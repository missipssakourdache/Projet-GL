package Projet_gl_KAC.FileExplorer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class SingletonConnexion {

	protected boolean Connection(String nom, String mdp) {
		boolean res =false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("erreur lors du chragement du drive !"+e.getMessage()+ "\n");
		}
		String url = "jdbc:mysql://localhost/fileexplorer";
		String utilisateur = "root";
		String mdpass = "";
		Connection conn = null;
		Statement statement = null;
		ResultSet resultat = null;
		try {
			conn = DriverManager.getConnection(url, utilisateur, mdpass);
			statement = conn.createStatement();
			resultat = statement.executeQuery("SELECT NOM_USER, MDP_USER FROM user;");
			/* SI AUCUN USER DANS LA BASE DE DONNEES? AU REVOIR CAR NE FONCTIONNE PAS
			if(resultat.equals(0)) {
				System.out.println(" aucun utilisateur \n");
			}else {*/
				while (resultat.next()) {
					String name = resultat.getString("NOM_USER");
					String motDePasseUser = resultat.getString("MDP_USER");
					   if (name.equals(nom) && motDePasseUser.equals(mdp)) { 
						   System.out.println("inscrit \n");
						   res = true;
						   } else {
							   System.out.println("pas inscrit");
							   res = false;
							   } 
				}
			//}
		} catch(SQLException e) { 
			System.out.println("Erreur lors de la connexion : <br/>" + 
					e.getMessage()); 
		} finally {
			System.out.println("Fermeture de l'objet ResultSet."); 
			if (resultat != null) { 
				try { 
					statement.close(); 
				}  catch (SQLException ignore) {} 
			}
			System.out.println("Fermeture de l'objet Connection."); 
			if (conn != null) {
				try {
					conn.close(); 
				}  catch (SQLException ignore) {} 
			}
		}
		return res;
		
	}
	
}
