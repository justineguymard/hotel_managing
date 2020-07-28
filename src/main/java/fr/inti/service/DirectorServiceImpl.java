package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.IDirectorDao;
import fr.inti.entities.Director;

@Service
@Transactional
public class DirectorServiceImpl implements IDirectorService {
	
	@Autowired
	private IDirectorDao directorDao;

	@Override
	public List<Director> getAllDirectors() {
		return directorDao.findAll();
	}

	@Override
	public Director addDirector(Director director) {
		return directorDao.save(director);
	}

	@Override
	public Director getDirectorById(int id) {
		return directorDao.getOne(id);
	}

	@Override
	public Director updateDirector(Director director) {
		return directorDao.save(director);
	}

	@Override
	public void deleteDirector(int id) {
		directorDao.deleteById(id);
	}

}
