package com.learning.springboot.firstwebapp.hello.login;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.learning.springboot.firstwebapp.hello.login.authentication.LoginAuthentication;


@Controller
@SessionAttributes("name")
public class WelcomeController {
	
//	private Logger logger = LoggerFactory.getLogger(getClass());
//	LoginAuthentication login;
	
	
	
//	public LoginController(LoginAuthentication login) {
//		super();
//		this.login = login;
//	}
//	@RequestMapping("/loginwithparameter")
//	@ResponseBody
//	public String loginPageparam(@RequestParam String name, ModelMap model) {
////		logger.debug("At debug level {}",name);
////		logger.error("At debug level {}",name);
////		logger.info("At debug level {}",name);
////		logger.trace("At debug level {}",name);
////		logger.warn("At debug level {}",name);
//
////		model.put("name", name);
//		
//		return "login";
//	}
//	@RequestMapping(value = "/login",method = RequestMethod.GET)
//	public String loginPage() {
//		
//		return "login";
//	}
//	
//	@RequestMapping(value = "/login",method = RequestMethod.POST)
//	public String welcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
////		logger.debug(password);
//		model.put("name", name);
//		if(login.isValidCredentials(name, password))
//		return "welcome";
//		else {
//			model.put("errormessage", "Invalid username or password");
//			return "login"; 
//		}
//	}
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String loginPage(ModelMap model) {
		model.put("name", getLoggedinUsername());
		
		return "welcome";
	}
	
	private String getLoggedinUsername() {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String userName = authentication.getName();
		return userName;
	}
}

