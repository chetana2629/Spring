package example.spring.rest.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
@EnableWebSecurity //Enable Spring Security customized using securityFilterChain
public class SpringRestSecurityProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestSecurityProjectApplication.class, args);
	}
	
	//Configuring Password Encoder - BCryPasswordEncoder
	
	@Bean
	public BCryptPasswordEncoder encoder() {
		
		return new BCryptPasswordEncoder();
	}
	
	//Configuring Users & Roles 
	@Bean
	public UserDetailsService getUserDetailsService() {
		UserDetails adminUser=User.withUsername("admin")
				.password(encoder().encode("1234")).roles("ADMIN").build();
		
		UserDetails reguralUser=User.withUsername("regular")
				.password(encoder().encode("1234")).roles("REGULAR").build();
		
		InMemoryUserDetailsManager usersManager=new InMemoryUserDetailsManager(adminUser,reguralUser);
		return usersManager;
	}
	
	@Bean
	public SecurityFilterChain getSecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(auth -> {
			auth.requestMatchers("/greet").permitAll().
			requestMatchers("/regular-work").hasAnyRole("ADMIN","REGULAR")
			.requestMatchers("/admin-work").hasAnyRole("ADMIN").anyRequest().authenticated();
			
		});
		
	 http.formLogin(Customizer.withDefaults());
	 http.httpBasic(Customizer.withDefaults());
	 
		
		return http.build();
	}

}
