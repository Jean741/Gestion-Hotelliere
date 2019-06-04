package tn.enis.gestionhotelliere.DAO;

import java.util.List;

import tn.enis.gestionhotelliere.entites.Client;

public interface IClientDAO {

	public void addClient(Client client);

	public Client getClient(String email);

	public List<Client> getClients();

	public void deleteClient(String email);

	public void updateClient(String email);

}
