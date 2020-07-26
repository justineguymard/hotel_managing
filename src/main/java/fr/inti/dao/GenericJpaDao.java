package fr.inti.dao;

import java.io.Serializable;
import java.util.List;

public class GenericJpaDao <T extends Serializable> extends AbstractJpaDao<T> implements IGenericDao<T> {

}
