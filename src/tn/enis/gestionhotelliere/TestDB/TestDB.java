package tn.enis.gestionhotelliere.TestDB;

import tn.enis.gestionhotelliere.DAO.IClientDAO;
import tn.enis.gestionhotelliere.DAOImpl.IClientDAOImpl;
import tn.enis.gestionhotelliere.entites.Client;

public class TestDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IClientDAO clientDAO = new IClientDAOImpl();
		Client c =clientDAO.getClient("mdiaby00@gmail.com");
		System.out.println(c.getNom()+"  "+c.getPrenom()+"   "+c.getEmail());
	}

}
