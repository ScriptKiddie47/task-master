package com.scriptkiddie.task.master.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	@Bean
	protected UserDetailsService userDetailsService() {

		List<UserDetails> users = new ArrayList<>();

		UserDetails Raju = User.withDefaultPasswordEncoder().username("Raju").password("pass1").roles("USER").build();
		UserDetails Ghanshyam = User.withDefaultPasswordEncoder().username("Ghanshyam").password("pass1").roles("USER").build();
		UserDetails BaburaoGanpatraoApte = User.withDefaultPasswordEncoder().username("BaburaoGanpatraoApte").password("pass1").roles("USER").build();
		UserDetails KhadakSingh = User.withDefaultPasswordEncoder().username("KhadakSingh").password("pass1").roles("USER").build();
		UserDetails DeviPrasad = User.withDefaultPasswordEncoder().username("DeviPrasad").password("pass1").roles("USER").build();
		UserDetails ChotaChetan = User.withDefaultPasswordEncoder().username("ChotaChetan").password("pass1").roles("USER").build();
		UserDetails Anuradha = User.withDefaultPasswordEncoder().username("Anuradha").password("pass1").roles("USER").build();
		UserDetails TiwariSeth = User.withDefaultPasswordEncoder().username("TiwariSeth").password("pass1").roles("USER").build();
		UserDetails KachraSeth = User.withDefaultPasswordEncoder().username("KachraSeth").password("pass1").roles("USER").build();
	
		
		users.add(Raju);
		users.add(Ghanshyam);
		users.add(BaburaoGanpatraoApte);
		users.add(KhadakSingh);
		users.add(DeviPrasad);
		users.add(ChotaChetan);
		users.add(Anuradha);
		users.add(TiwariSeth);
		users.add(KachraSeth);

		return new InMemoryUserDetailsManager(users);
	}
}


