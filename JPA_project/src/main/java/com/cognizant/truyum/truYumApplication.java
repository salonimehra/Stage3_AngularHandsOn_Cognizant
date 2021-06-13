package com.cognizant.truyum;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import com.cognizant.truyum.dao.MenuItemDaoSqlImpl;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.MenuItemService;


@SpringBootApplication
public class truYumApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(truYumApplication.class);
	private static MenuItemDaoSqlImpl menuItemDaoSqlImpl;
	
	public static void main(String[] args) {

		LOGGER.info("Inside main");
		ApplicationContext context = SpringApplication.run(truYumApplication.class, args);

		menuItemDaoSqlImpl = context.getBean(MenuItemDaoSqlImpl.class);

		testGetAllItems();
	}
	
	private static void testGetAllItems() {

		LOGGER.info("Start");

		List<MenuItem> menuItem = menuItemDaoSqlImpl.getMenuItemListAdmin();
		
		for(MenuItem m:menuItem)
		LOGGER.debug("countries={}", m.toString());

		LOGGER.info("End");

		}
}
