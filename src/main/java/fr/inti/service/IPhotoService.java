package fr.inti.service;

import java.util.List;

import fr.inti.entities.Photo;

public interface IPhotoService {
	
	
	public List<Photo> getAllPhotos();
	
	public Photo addPhoto (Photo photo);
	
	public Photo getPhotoById (int id);
	
	public Photo updatePhoto (Photo photo);
	
	public void deletePhoto (int id);
	

}
