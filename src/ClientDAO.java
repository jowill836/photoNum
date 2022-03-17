package src;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientDAO extends DAO<Client> {
	

	public ClientDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public boolean create(Client obj) {
		
		try {
			 Statement requete =this.connect.createStatement();
			 int  result =  requete.executeUpdate("insert into LesClients values ("+obj.getIdClient()+", '"+obj.getAdresseMail()+"', '"+
					 		obj.getNom()+"', '"+obj.getPrenom()+"', '"+obj.getMotDePasse()+"', '"+obj.getAlerte()+"', '"+obj.getAdresseLivraison()+"', '"+
					 		obj.getAUnCodePromo()+")");
			 System.out.println("Le client "+obj.getPrenom()+" a bien été ajouté inscrit !");
			 return true;
		}catch(SQLException e) {
			System.out.println("failed");
			System.out.println("OUPS !  il semble avoir eu une erreur Le client n'a pas été inscrit.");
			System.out.println(" Son id_client est peut-être déjà utilisé ? ");
			e.printStackTrace();
			return false;
		}
				
	}

	@Override
	public Client read(int id) {
		Client client = new Client();
		try {
			
			Statement requete = this.connect.createStatement();
			ResultSet result = requete.executeQuery("SELECT * FROM LesClients WHERE id_client="+id);
			
			if(result.first()) {
				client = new Client(id,result.getString("adresseMail"),result.getString("nom"),
						result.getString("prenom"), result.getString("motDepasse"),result.getString("alerte"),
						result.getString("adresseLivraison"), result.getBoolean("aUnCodePromo"));
			}
			
		}catch(SQLException e) {
			System.out.println("failed");
		}
		
		return client;
	}

	@Override
	public boolean update(Client obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Client obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
