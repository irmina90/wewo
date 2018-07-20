//package pl.wewo.church.calendar.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import pl.wewo.church.calendar.services.MongoUserDetailsService;
//
//@Configuration
//@EnableWebSecurity
//@EnableConfigurationProperties
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	MongoUserDetailsService userDetailsService;
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//				.authorizeRequests()
//				.antMatchers("/", "/home").permitAll()
//				.anyRequest().authenticated()
//				.and()
//				.formLogin()
//				.loginPage("/login")
//				.permitAll()
//				.and()
//				.logout()
//				.permitAll();
//	}
//
//	@Override
//	public void configure(AuthenticationManagerBuilder builder) throws Exception {
//		builder.userDetailsService(userDetailsService);
//	}
//
//
//}
