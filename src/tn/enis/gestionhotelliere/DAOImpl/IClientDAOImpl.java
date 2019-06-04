package tn.enis.gestionhotelliere.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import tn.enis.gestionhotelliere.DAO.IClientDAO;
import tn.enis.gestionhotelliere.connection.ConnectionDB;
import tn.enis.gestionhotelliere.entites.Client;

public class IClientDAOImpl implements IClientDAO {

	Connection connection = ConnectionDB.getConnection(); 
	@Override
	public void addClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client getClient(String email){
		Client c = new Client();
		try {
			PreparedStatement ps = connection.prepareStatement("select * from Client where email=?");
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				c.setEmail(rs.getString("email"));
				c.setNom(rs.getString("nom"));
				c.setPrenom(rs.getString("prenom"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public List<Client> getClients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteClient(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateClient(String email) {
		// TODO Auto-generated method stub
		
	}

}
