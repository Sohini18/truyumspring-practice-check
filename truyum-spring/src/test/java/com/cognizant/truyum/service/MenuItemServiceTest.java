package com.cognizant.truyum.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemServiceTest {

	static {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(MenuItemServiceTest.class);

	private static MenuItemService menuItemService;

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		menuItemService = context.getBean(MenuItemService.class);

		testGetMenuItemListAdmin();
		// testGetMenuItemListCustomer();
		// testGetMenuItem();
		// testEditMenuItem();
	}

	public static void testGetMenuItemListAdmin() {
		LOGGER.info("start");
		List<MenuItem> items = menuItemService.getMenuItemListAdmin();
		LOGGER.debug("Items{}", items);
		LOGGER.info("end");
	}

	public static void testGetMenuItemListCustomer() {
		LOGGER.info("start");
		List<MenuItem> items = menuItemService.getMenuItemListCustomer();
		LOGGER.debug("Items{}", items);
		LOGGER.info("end");
	}

	public static void testGetMenuItem() {
		LOGGER.info("start");
		MenuItem item = menuItemService.getMenuItem(6);
		LOGGER.debug("Item{}", item);
		LOGGER.info("end");
	}

	public static void testModifyMenuItem() {
		LOGGER.info("start");
		MenuItem menuItem = new MenuItem(2, "Hotdog", 129f, true, DateUtil.convertToDate("23/12/2017"), "Main Course",
				false);
		menuItemService.modifyMenuItem(menuItem);
		List<MenuItem> items = menuItemService.getMenuItemListAdmin();
		LOGGER.debug("Items{}", items);
		LOGGER.info("end");
	}
}
