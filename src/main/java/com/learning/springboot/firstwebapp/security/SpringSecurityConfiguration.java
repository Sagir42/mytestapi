package com.learning.springboot.firstwebapp.security;

import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.function.Function;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {
	
	@Bean
	public InMemoryUserDetailsManager createUserDetails() {
		
		UserDetails userDetail1 = createNewUser("Learning_Hub", "123");
		UserDetails userDetail2 = createNewUser("Sagir", "1234");
		
		return new InMemoryUserDetailsManager(userDetail1, userDetail2);
	}

	private UserDetails createNewUser(String username, String password) {
		Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);	
		UserDetails userDetail = User.builder().passwordEncoder(passwordEncoder )
				.username(username)
				.password(password)
				.roles("USER","ADMIN").build();
		return userDetail;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
		http.formLogin(withDefaults());
		
//		http.csrf().disable();
		http.csrf(t -> t.disable());
//		http.headers().frameOptions().disable();
		
		http.headers(t -> t.frameOptions(t1 -> t1.disable()));
		
		return http.build();
	}

}
