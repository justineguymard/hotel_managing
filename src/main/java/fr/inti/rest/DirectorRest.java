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

import fr.inti.entities.Director;
import fr.inti.service.IDirectorService;

@RestController
@RequestMapping("/director")
public class DirectorRest {
	
	
	@Autowired
	private IDirectorService directorService;

	@GetMapping(value="/liste", produces = MediaType.ALL_VALUE)
	public List<Director> getAllDirectors(){
		return directorService.getAllDirectors();
	}
	
	@PostMapping(value="/add", produces= MediaType.ALL_VALUE, consumes=MediaType.ALL_VALUE)
	public Director addDirector (@RequestBody Director director) {
		return directorService.addDirector(director);
	}
	
	@PutMapping(value="/update", produces=MediaType.ALL_VALUE, consumes = MediaType.ALL_VALUE)
	public Director updateDirector (@RequestBody Director director) {
		return directorService.updateDirector(director);
	}
	
	@GetMapping(value="/find", produces=MediaType.ALL_VALUE)
	public Director getDirector(@RequestParam("pId") int id) {
		return directorService.getDirectorById(id);
	}
	
	@DeleteMapping (value="/remove/{pId}")
	public void deleteDirector(@PathVariable("pId") int id) {
		directorService.deleteDirector(id);
	}

}
