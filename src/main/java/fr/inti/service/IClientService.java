package fr.inti.service;

import java.util.List;

import fr.inti.entities.Client;

public interface IClientService {
	
	
	public List<Client> getAllClients();
	
	public Client addClient (Client client);
	
	public Client getClientById (int id);
	
	public Client updateClient (Client client);
	
	public void deleteClient (int id);
	

}
