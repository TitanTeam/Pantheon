package com.titan.pantheon.manager;

import java.util.List;

public interface  BaseManager {
	public <T> T getEntity(Class<T> clazz, long id);

	public <T> T getEntity(Class<T> clazz, String id);
	
	public void saveEntity(Object entity);

	public void saveOrUpdateEntity(Object entity);

	public void deleteEntity(Object entity);

	public <T> List<T> getEntities(Class<T> clazz);

}
