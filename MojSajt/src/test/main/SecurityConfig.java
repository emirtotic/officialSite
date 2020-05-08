package test.main;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Autowired
	private DataSource myDataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		
		// REMOVING HARD CODED USERS, CONNECTING DATABASE TABLES FOR USERS AND AUTHORITIES
		
//		UserBuilder users = User.withDefaultPasswordEncoder();
//		auth.inMemoryAuthentication()
//		.withUser(users.username("emir").password("emir12345").roles("admin"));
		
		
		auth.jdbcAuthentication().dataSource(myDataSource);
		
		
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
