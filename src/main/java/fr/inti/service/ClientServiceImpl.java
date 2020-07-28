package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.IClientDao;
import fr.inti.entities.Client;

@Service
@Transactional
public class ClientServiceImpl implements IClientService {
	
	@Autowired
	private IClientDao clientDao;

	@Override
	public List<Client> getAllClients() {
		return clientDao.findAll();
	}

	@Override
	public Client addClient(Client client) {
		return clientDao.save(client);
	}

	@Override
	public Client getClientById(int id) {
		return clientDao.getOne(id);
	}

	@Override
	public Client updateClient(Client client) {
		return clientDao.save(client);
	}

	@Override
	public void deleteClient(int id) {
		clientDao.deleteById(id);;
	}

}
