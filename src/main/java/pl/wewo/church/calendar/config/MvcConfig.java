package pl.wewo.church.calendar.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {

		registry.addViewController("/").setViewName("index");
		registry.addViewController("/user").setViewName("user/index");
		registry.addViewController("/login").setViewName("login");
		registry.addViewController("/access-denied").setViewName("/error/access-denied");
	}

}