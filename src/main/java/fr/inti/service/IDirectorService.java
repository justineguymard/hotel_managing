package fr.inti.service;

import java.util.List;

import fr.inti.entities.Director;

public interface IDirectorService {
	
	
	public List<Director> getAllDirectors();
	
	public Director addDirector (Director director);
	
	public Director getDirectorById (int id);
	
	public Director updateDirector (Director director);
	
	public void deleteDirector (int id);
	

}
