package Znach.repositories;

import org.springframework.data.repository.CrudRepository;
    
	import Znach.models.User;
	public interface UserRepository extends CrudRepository<User, Long>{
		User findByEmail(String email);

}
