package com.cognizant.truyum.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.repository.MenuItemRepository;

@Service("menuItemService")
public class MenuItemService {
	 
	private static final Logger LOGGER = LoggerFactory.getLogger(MenuItemService.class);

	@Autowired
	private MenuItemDao menuItemDao;

	@Autowired
	private MenuItemRepository menuItemRepository;

	public void setMenuItemDao(MenuItemDao menuItemDao) {
		this.menuItemDao = menuItemDao;
	}

	@Transactional
	public List<MenuItem> getMenuItemListAdmin() {
		LOGGER.info("start");
		// return menuItemDao.getMenuItemListAdmin();
		return menuItemRepository.findAll();
	}

	@Transactional
	public List<MenuItem> getMenuItemListCustomer() {
		LOGGER.info("start");
		// return menuItemDao.getMenuItemListCustomer();
		return menuItemRepository.getMenuItemListCustomer(new Date());
	}

	@Transactional
	public MenuItem getMenuItem(long menuItemId) {
		LOGGER.info("start");
		return menuItemRepository.getOne(menuItemId);
	}

	@Transactional
	public void editMenuItem(MenuItem menuItem) {
		LOGGER.info("start");
		// menuItemDao.modifyMenuItem(menuItem);
		menuItemRepository.save(menuItem);
		LOGGER.info("end");
	}
	@Transactional
	public void modifyMenuItem(MenuItem menuItem) {
//		menuItemDao.modifyMenuItem(menuItem);
		menuItemRepository.save(menuItem);
	}
	
}
	

