package com.cognizant.truyum.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.repository.MenuItemRepository;
import com.cognizant.truyum.service.MenuItemService;

@Component
@Qualifier("menuItemDaoSqlImpl")
public class MenuItemDaoSqlImpl implements MenuItemDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(MenuItemDaoSqlImpl.class);

	@Autowired
	private MenuItemService menuItemService;
	@Autowired
	MenuItemRepository menuItemRepository;
	
	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		// TODO Auto-generated method stub
		LOGGER.info("start getMenuItemListAdmin");
		List<MenuItem> items=(List<MenuItem>)menuItemRepository.findAll();
		for(MenuItem m:items)
		LOGGER.debug(m.toString());
		LOGGER.info("end getMenuItemListCustomer");
		return items;
	}

	@Override
	
	@Transactional
	public List<MenuItem> getMenuItemListAdmin(){
		LOGGER.info("start getMenuItemListAdmin");
		List<MenuItem> items=(List<MenuItem>)menuItemRepository.findAll();
		for(MenuItem m:items)
			System.out.println(m);
		//LOGGER.debug(m.toString());
		LOGGER.info("end getMenuItemListAdmin");
		return items;
	}
	
	@Transactional
	public void modifyMenuItem(MenuItem menuItem) {
		LOGGER.info("start modifyMenuItem");
		menuItemRepository.save(menuItem);
		System.out.println(menuItem);
		LOGGER.debug(menuItem.toString());
		LOGGER.info("end modifyMenuItem");
	}
	
	@Transactional
	public MenuItem getMenuItem(long menuItemId) {
		LOGGER.info("getMenuItem");
		MenuItem menuItem = menuItemRepository.getOne(menuItemId);
		System.out.println(menuItem);
		LOGGER.debug(menuItem.toString());
		LOGGER.info("end getMenuItem");
		return menuItem;
	}
	
	

}
