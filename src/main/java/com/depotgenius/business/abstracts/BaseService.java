package com.depotgenius.business.abstracts;

import java.util.UUID;

import com.depotgenius.dtos.category.CreateCategoryRequest;
import com.depotgenius.entities.concretes.Category;

public interface BaseService<T> {
    
	T create(T entity);
	
	T update(T entity);
	
	void delete (UUID id);

	Category create(CreateCategoryRequest entity);
}
