package fr.inti.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class AbstractHibernateDao <T extends Serializable> {
	private Class<T> genericClass;
	
	@Autowired
	SessionFactory sessionFactory;

	public void setGenericClass(Class<T> genericClass) {
		this.genericClass = genericClass;
	}
	
	//Find an entity by his ID
	public T findOne (int id) {
		return (T) sessionFactory.getCurrentSession().get(genericClass, id);
	}
	
	//Get the list of the objects in the DB using Criteria & root
	public List<T> findAll() { //usingCriteria to avoid JPQL
		CriteriaBuilder criteriaBuilder = sessionFactory.getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(genericClass);
		Root<T> rootEntry = criteriaQuery.from(genericClass);
		CriteriaQuery<T> all = criteriaQuery.select(rootEntry);
		TypedQuery<T> allQuery = sessionFactory.getCurrentSession().createQuery(all);
		return allQuery.getResultList();
	}
	
	//Second method to get the list
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<T> findAll2() {
		return sessionFactory.getCurrentSession().createCriteria(genericClass).list();
		
	}
	
	//Save an entity in the database
	@SuppressWarnings("unchecked")
	public T save (T entity) {
		return (T) sessionFactory.getCurrentSession().save(entity) ;			
	}
	
	//Update an entity in the database
	@SuppressWarnings("unchecked")
	public T update(T entity) {
		return (T) sessionFactory.getCurrentSession().merge(entity);
	}
	
	//Delete an entity in the database
	public void delete(T entity) {
		System.out.println("Appel de la fonction générique de suppression");
		System.out.println("Suppression de "+entity.toString());
		sessionFactory.getCurrentSession().delete(entity);
	}
	
	//Delete an entity by ID
	public void deleteById(int id) {
		T entity = findOne(id);
		delete(entity);
	}

	
//  //Method to get the current session instead of calling sessionFactory.getCurrentSession() for each method
//	protected Session getCurrentSession() {
//		return sessionFactory.getCurrentSession();
//	}

	
}
