package Znach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Znach.service.UserService;

@Controller
public class UserController {
	
	  @Autowired
	  private UserService usersService;
	  
	  @RequestMapping(value = "/register", method = RequestMethod.POST)
		  public String register(@RequestParam("first_name") String first_name,
				  @RequestParam("last_name") String last_name,
		      @RequestParam("email") String email, 
		      @RequestParam("pass") String pass) { 
		    usersService.register(first_name,last_name, email,pass);
		    return "redirect: home";
	  }
	  
}