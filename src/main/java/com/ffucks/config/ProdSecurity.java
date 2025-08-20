package com.ffucks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@Profile("prod")
public class ProdSecurity {

    @Bean
    SecurityFilterChain prod(HttpSecurity http) throws Exception {
        http.securityMatcher("/internal/**").authorizeHttpRequests(a -> a.anyRequest().denyAll());
        return http.build();
    }
}
