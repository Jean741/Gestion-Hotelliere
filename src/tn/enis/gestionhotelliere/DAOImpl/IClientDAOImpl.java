package tn.enis.gestionhotelliere.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import tn.enis.gestionhotelliere.DAO.IClientDAO;
import tn.enis.gestionhotelliere.connection.ConnectionDB;
import tn.enis.gestionhotelliere.entites.Client;

public class IClientDAOImpl implements IClientDAO {

	Connection connection = ConnectionDB.getConnection();

	@Override
	public void addClient(Client client) {
		try {
			PreparedStatement ps = connection.prepareStatement("insert into Client(emailClient, nomClient, prenomClient, motPasse) values(?,?,?,?)");
			ps.setString(1, client.getEmail());
			ps.setString(2,client.getNom());
			ps.setString(3, client.getPrenom());
			ps.setString(4, client.getMotPasse());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Client getClient(String email) {
		Client c = new Client();
		try {
			PreparedStatement ps = connection.prepareStatement("select * from Client where emailClient=?");
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				c.setEmail(rs.getString("emailClient"));
				c.setNom(rs.getString("nomClient"));
				c.setPrenom(rs.getString("prenomClient"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public List<Client> getClients() {
		List<Client> clients = new ArrayList<>();
		try {
			PreparedStatement ps = connection.prepareStatement("select emailClient,nomClient,prenomClient from Client");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Client client = new Client();
				client.setEmail(rs.getString("emailClient"));
				client.setNom(rs.getString("nomClient"));
				client.setPrenom(rs.getString("prenomClient"));
				clients.add(client);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clients;
	}

	@Override
	public void deleteClient(String email) {
	

	}

	@Override
	public void updateClient(String email) {
		// TODO Auto-generated method stub

	}

}
