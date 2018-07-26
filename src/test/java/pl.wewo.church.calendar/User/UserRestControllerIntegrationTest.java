//package pl.wewo.church.calendar.User;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.mock.web.MockHttpSession;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import pl.wewo.church.calendar.services.MongoUserDetailsService;
//import pl.wewo.church.calendar.user.UserRepository;
//
//import static org.hamcrest.Matchers.*;
//import static org.springframework.boot.test.context.SpringBootTest.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
//public class UserRestControllerIntegrationTest {
//
//	@Autowired
//	private MockMvc mvc;
//
//	@Autowired
//	private UserRepository repository;
//
//	@Autowired
//	protected MongoUserDetailsService userDetailsService;
//
//	protected UsernamePasswordAuthenticationToken getPrincipal(String username) {
//
//		UserDetails user = this.userDetailsService.loadUserByUsername(username);
//
//		UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
//						user.getUsername(),
//						user.getPassword(),
//						user.getAuthorities());
//
//		return authentication;
//	}
//
//
//	public static class MockSecurityContext implements SecurityContext {
//
//		private static final long serialVersionUID = -1386535243513362694L;
//
//		private Authentication authentication;
//
//		public MockSecurityContext(Authentication authentication) {
//			this.authentication = authentication;
//		}
//
//		@Override
//		public Authentication getAuthentication() {
//			return this.authentication;
//		}
//
//		@Override
//		public void setAuthentication(Authentication authentication) {
//			this.authentication = authentication;
//		}
//	}
//
//	@Test
//	public void givenUsers_whenGetUsers_thenStatus200() throws Exception {
//
//		UsernamePasswordAuthenticationToken principal = this.getPrincipal("admin");
//
//		MockHttpSession session = new MockHttpSession();
//		session.setAttribute(
//				HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY,
//				new MockSecurityContext(principal));
//
//
//		mvc.perform(get("/users")
//				.session(session)
//				.contentType(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
//				.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
//				.andExpect(jsonPath("$[0].username", is("admin")));
//	}
//
//
//}
