package tn.enis.gestionhotelliere.TestDB;

import java.util.List;

import tn.enis.gestionhotelliere.DAO.IClientDAO;
import tn.enis.gestionhotelliere.DAOImpl.IClientDAOImpl;
import tn.enis.gestionhotelliere.entites.Client;

public class TestDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IClientDAO clientDAO = new IClientDAOImpl();
		clientDAO.addClient(new Client("mohamed00@gmail.com", "Att", "Jean", "1234"));
		Client c =clientDAO.getClient("mdiaby00@gmail.com");
		System.out.println(c.getNom()+"  "+c.getPrenom()+"   "+c.getEmail());
		
		List<Client> clients= clientDAO.getClients();
		for(Client client:clients) {
			System.out.println(client.getNom()+"  "+client.getPrenom()+"   "+client.getEmail());
		}
		
	}

}
