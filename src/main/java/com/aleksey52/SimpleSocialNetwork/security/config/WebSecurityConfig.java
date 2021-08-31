package com.aleksey52.SimpleSocialNetwork.security.config;

import com.aleksey52.SimpleSocialNetwork.domain.User;
import com.aleksey52.SimpleSocialNetwork.repository.UserDetailsRepository;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableOAuth2Sso
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    public PrincipalExtractor principalExtractor(UserDetailsRepository userDetailsRepository) {
        return map -> {
            String id = map.get("sub").toString();
            User user = userDetailsRepository.findById(id).orElseGet(() -> {
                User newUser = new User();
                newUser.setId(id);
                newUser.setName(map.get("name").toString());
                newUser.setFirstName(map.get("given_name").toString());
                newUser.setLastName(map.get("family_name").toString());
                newUser.setPicture(map.get("picture").toString());
                newUser.setEmail(map.get("email").toString());
                newUser.setLocale(map.get("locale").toString());

                return newUser;
            });

            return userDetailsRepository.save(user);
        };
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .mvcMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and()
                .csrf().disable();
    }
}
