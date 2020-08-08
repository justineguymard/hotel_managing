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

import fr.inti.entities.Photo;
import fr.inti.service.IPhotoService;

@RestController
@RequestMapping("/photo")
public class PhotoRest {
	
	@Autowired
	private IPhotoService photoService;

	@GetMapping(value="/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Photo> getAllPhotos(){
		return photoService.getAllPhotos();
	}
	
	@PostMapping(value="/add", produces= MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Photo addPhoto (@RequestBody Photo photo) {
		return photoService.addPhoto(photo);
	}
	
	@PutMapping(value="/update", produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Photo updatePhoto (@RequestBody Photo photo) {
		return photoService.updatePhoto(photo);
	}
	
	@GetMapping(value="/find", produces=MediaType.APPLICATION_JSON_VALUE)
	public Photo getPhoto(@RequestParam("pId") int id) {
		return photoService.getPhotoById(id);
	}
	
	@DeleteMapping (value="/remove/{pId}")
	public void deletePhoto(@PathVariable("pId") int id) {
		photoService.deletePhoto(id);
	}

}
