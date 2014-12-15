package com.titan.pantheon.manager.impl;

import java.util.List;
import javax.annotation.Resource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.titan.pantheon.manager.BaseManager;


@SuppressWarnings("unchecked")
@Service("baseManager")
public class BaseManagerImpl extends HibernateTemplate implements BaseManager {
	
	@Resource(name = "sessionFactory")
	private SessionFactory _sessionFactory;
	
	@Autowired
	public void _setSessionFactory(SessionFactory sessionFactory){
	  super.setSessionFactory(sessionFactory);
	}

	public <T> T getEntity(Class<T> clazz, long id) {
		return (T) this.getSession().get(clazz, id);
	}
	
	public <T> T getEntity(Class<T> clazz, String id) {
		return (T) this.getSession().get(clazz, id);
	}
	
	public void saveEntity(Object entity) {
		this.getSession().save(entity);
	}

	public void saveOrUpdateEntity(Object entity) {
		this.getSession().saveOrUpdate(entity);
	}

	public void deleteEntity(Object entity) {
		this.getSession().delete(entity);
	}


	public <T> List<T> getEntities(Class<T> clazz) {
		return loadAll(clazz);
	}
}