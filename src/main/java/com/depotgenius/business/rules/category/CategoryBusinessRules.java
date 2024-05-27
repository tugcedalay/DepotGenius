package com.depotgenius.business.rules.category;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.depotgenius.core.exceptions.BusinessExceptions;
import com.depotgenius.core.exceptions.Messages;
import com.depotgenius.dataAccess.CategoryRepository;

@Service
public class CategoryBusinessRules {
  
    @Autowired
	private CategoryRepository categoryRepository;
    
    public void checkIfCategoryNameExists(String name) {
    	if (categoryRepository.existsByCategoryName(name)) {
    		throw new BusinessExceptions(Messages.CATEGORY_NAME_ALREADY_EXISTS);
    	}
    	
    }
   
    public void CheckIfByIdExists(UUID id) {
    	if (!categoryRepository.existsById(id)) {
    		throw new BusinessExceptions(Messages.CATEGORY_ID_NOT_FOUND);
    	}
    }
}
