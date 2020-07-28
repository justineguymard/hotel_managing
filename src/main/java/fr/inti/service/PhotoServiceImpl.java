package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.IPhotoDao;
import fr.inti.entities.Photo;

@Service
@Transactional
public class PhotoServiceImpl implements IPhotoService {
	
	@Autowired
	private IPhotoDao photoDao;

	@Override
	public List<Photo> getAllPhotos() {
		return photoDao.findAll();
	}

	@Override
	public Photo addPhoto(Photo photo) {
		return photoDao.save(photo);
	}

	@Override
	public Photo getPhotoById(int id) {
		return photoDao.getOne(id);
	}

	@Override
	public Photo updatePhoto(Photo photo) {
		return photoDao.save(photo);
	}

	@Override
	public void deletePhoto(int id) {
		photoDao.deleteById(id);
	}

}
