package com.cognizant.truyum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.truyum.service.MenuItemService;

/**
 * Hello world!
 *
 */
public class App 
{
	@Autowired
	static MenuItemService menuItemService;
	private static ApplicationContext ctx;
	
    public static void main( String[] args )
    {
    	ctx=new ClassPathXmlApplicationContext("spring-config.xml");
    	 menuItemService=ctx.getBean(MenuItemService.class);
        System.out.println(menuItemService.getMenuItemListAdmin() );
    }
}
