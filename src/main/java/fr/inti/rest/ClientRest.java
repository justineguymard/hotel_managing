package fr.inti.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.inti.entities.Client;
import fr.inti.service.IClientService;

@RestController
@RequestMapping("/client")
public class ClientRest {

		@Autowired
		private IClientService clientService;

		@GetMapping(value="/all", produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Client> getAllClients(){
			return clientService.getAllClients();
		}
		
		@PostMapping(value="/add", produces= MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
		public Client addClient (@RequestBody Client client) {
			return clientService.addClient(client);
		}
		
		@PutMapping(value="/update", produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
		public Client updateClient (@RequestBody Client client) {
			return clientService.updateClient(client);
		}
		
		@GetMapping(value="/find", produces=MediaType.APPLICATION_JSON_VALUE)
		public Client getClient(@RequestParam("pId") int id) {
			return clientService.getClientById(id);
		}
		
		@DeleteMapping (value="/remove/{pId}")
		public void deleteClient(@PathVariable("pId") int id) {
			clientService.deleteClient(id);
		}
		
}
