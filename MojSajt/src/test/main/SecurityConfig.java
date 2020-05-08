package test.main;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		UserBuilder users = User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication()
		.withUser(users.username("emir").password("emir123").roles("admin"));
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		.antMatchers("/").permitAll()   // rootu naseg sajta mogu da pristupe svi
		.antMatchers("/administration/contact-list").hasRole("admin")
		.antMatchers("/administration/contacts-page").hasRole("admin")
		.antMatchers("/administration/downloaders-page").hasRole("admin")
		.antMatchers("/administration/**").hasAnyRole("admin") // sve ono sto u svojoj ruti ima /administration uvodimo restrikcuju ko ima rolu admin!
		.and().formLogin()
		.loginPage("/loginPage")
		.loginProcessingUrl("/authenticateTheUser").permitAll();
		
		
	}
	
}
