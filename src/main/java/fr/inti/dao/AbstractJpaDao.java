package fr.inti.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public abstract class AbstractJpaDao <T extends Serializable> {
	
	private Class <T> genericClass;
	
	@PersistenceContext
	EntityManager entityManager;

	public void setGenericClass(Class<T> genericClass) {
		this.genericClass = genericClass;
	}
	
	public T findOne (int id) {
		return entityManager.find(genericClass, id);
	}
	
	
	public List <T> findAll(){
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(genericClass);
		Root<T> rootEntry = criteriaQuery.from(genericClass);
		CriteriaQuery<T> all = criteriaQuery.select(rootEntry);
		TypedQuery<T> allQuery =  entityManager.createQuery(all);
		return allQuery.getResultList();
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List<T> findAll2 (){
		return entityManager.createQuery("FROM "+genericClass.getName()).getResultList();
	}
	
	
	//save an entity object
	public T save (T entity) {
		entityManager.persist(entity);
		return entity;
	}
	
	//update an entity object
	public T update (T entity) {
		entityManager.merge(entity);
		return entity;
	}
	
	public void delete (T entity) {
		System.out.println("Appel de la fonction générique de suppression (JPA)");
		System.out.println("Suppression de "+entity.toString());
		entityManager.remove(entity);
	}
	
	public void deleteById (int id) {
		T entity = findOne(id);
	}

}
