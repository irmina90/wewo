package pl.wewo.church.calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.wewo.church.calendar.user.User;
import pl.wewo.church.calendar.user.UserRepository;

import javax.annotation.PostConstruct;

@Service
public class DataLoader {

	@Autowired
	private UserRepository userRepository;
	private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	@PostConstruct
	private void initDatabase() {

		userRepository.deleteAll();

		userRepository.save(createNewUser("admin", "root", "ROLE_ADMIN"));
		userRepository.save(createNewUser("werka", "werka", "ROLE_USER"));
		userRepository.save(createNewUser("wojtus", "wojtus", "ROLE_USER"));

	}

	private User createNewUser(String username, String password, String role){
		User user = new User();
		user.setUsername(username);
		user.setPassword(passwordEncoder.encode(password));
		user.addRole(role);
		return user;
	}

}