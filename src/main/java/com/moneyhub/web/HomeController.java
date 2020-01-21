package com.moneyhub.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.moneyhub.web.admin.AdminChart;
import com.moneyhub.web.enums.SQL;
import com.moneyhub.web.mappers.SchemaMapper;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired SchemaMapper schemaMapper;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		schemaMapper.createNewDb(SQL.CREATE_CUSTOMER.toString());
		if(schemaMapper.existRow("CUSTOMER")==0) {
			schemaMapper.createNewDb("INSERT INTO CUSTOMER ( CEMAIL, CPWD, CNAME \n" + 
					"	    						) \n" + 
					"	    VALUES (\n" + 
					"	    	'kim', '1', '김길동' \n" + 
					"	    )");
		}
		
		System.out.println(">>>> 1st");
		return "index";
	}
	
}
