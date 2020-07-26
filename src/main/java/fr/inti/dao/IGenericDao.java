package fr.inti.dao;

import java.io.Serializable;
import java.util.List;

public interface IGenericDao <T extends Serializable> {
	
	public T findOne (int id);
	
	public List <T> findAll();
	
	public List <T> findAll2();
	
	public T save (T entity);
	
	public T update (T entity);
	
	public void delete (T entity);
	
	public void deleteById (int id);
	
}
