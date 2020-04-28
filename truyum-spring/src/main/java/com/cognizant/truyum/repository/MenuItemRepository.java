package com.cognizant.truyum.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.truyum.model.MenuItem;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem,Long> {

	@Query("SELECT m FROM MenuItem m WHERE m.active=true AND m.dateOfLaunch< ?1")
	public List<MenuItem> getMenuItemListCustomer(Date dateOfLaunch);

	
	
	
}
