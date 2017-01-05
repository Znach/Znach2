package Znach.service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import Znach.models.User;
import Znach.repositories.UserRepository;

@Service
public class UserService {
  @Autowired
  private UserRepository usersRepo;

  @Transactional
  @PostConstruct
	public void createAdminUser() {		
		User userAdmin=usersRepo.findByEmail("admin");
		if(userAdmin==null){
			register("admin","admin", "admin@mail.com", "admin");
		}
	}
    
  public void register(String first_name, String last_name, String email, String pass) {
    String passHash = new BCryptPasswordEncoder().encode(pass);
    User u = new User(first_name,last_name, email.toLowerCase(), passHash);
    usersRepo.save(u);
  }

}
