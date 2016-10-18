package com.marash.general.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter  {

	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/authorize", "/securedAuthorize" ).permitAll();
        http.authorizeRequests().antMatchers("/getMap").hasRole("USER");
        http.authorizeRequests().anyRequest().authenticated();
        
        // disable csrf in order to allow rest login
        http.csrf().disable();
        //enable login/logout without form
        //http.httpBasic();
        
        http.formLogin().loginPage("/login").permitAll()
        	.and().logout().permitAll();
    }
	 
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
        auth.inMemoryAuthentication().withUser("user2").password("password2").roles("NOTUSER");
    }

}
