package pl.wewo.church.calendar.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by lasjak on 7/4/2017.
 */
@RestController
@RequestMapping("/users")
public class UserController {

	private final UserRepository userRepository;

	@Autowired
	public UserController(UserRepository repository) {
		this.userRepository = repository;
	}

	@RequestMapping(method = RequestMethod.GET)
	public Collection<User> listUsers() {
		return userRepository.findAll();
	}


}
