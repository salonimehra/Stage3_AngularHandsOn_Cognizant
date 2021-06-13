package com.cognizant.truyum.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.repository.MenuItemRepository;

@Service("menuItemService")
public class MenuItemService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MenuItemService.class);

	
	  //core functionaly
	  
	  @Autowired(required = true)	  
	  @Qualifier("menuItemDaoCollectionImpl") 
	  private MenuItemDao menuItemDao;
	  
	  
	  //comment menu repository when using core functionality
	 
	  @Autowired 
	 // private MenuItemRepository menuItemRepository;
	 
		
		  // core functionality 
	  public List<MenuItem> getMenuItemListAdmin(){ 
		  return menuItemDao.getMenuItemListAdmin(); 
		  }
		  
		  public void modifyMenuItem(MenuItem menuItem) {
		  menuItemDao.modifyMenuItem(menuItem); 
		  }
		  
		  public MenuItem getMenuItem(long menuItemId) { 
			  return menuItemDao.getMenuItem(menuItemId); 
			  }
	
	  /*
	@Transactional
	public List<MenuItem> getMenuItemListAdmin() {
		LOGGER.info("start getMenuItemListAdmin");
		List<MenuItem> items = (List<MenuItem>) menuItemRepository.findAll();
		LOGGER.debug(items.toString());
		LOGGER.info("end getMenuItemListAdmin");
		return items;
	}

	@Transactional
	public void modifyMenuItem(MenuItem menuItem) {
		LOGGER.info("start modifyMenuItem");
		menuItemRepository.save(menuItem);
		LOGGER.debug(menuItem.toString());
		LOGGER.info("end modifyMenuItem");
	}

	@Transactional
	public MenuItem getMenuItem(long menuItemId) {
		LOGGER.info("getMenuItem");
		MenuItem menuItem = menuItemRepository.getOne(menuItemId);
		LOGGER.debug(menuItem.toString());
		LOGGER.info("end getMenuItem");
		return menuItem;
	}*/
	  
	

}
