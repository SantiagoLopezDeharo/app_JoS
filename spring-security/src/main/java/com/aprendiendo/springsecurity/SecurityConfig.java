package com.aprendiendo.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public DaoAuthenticationProvider authProvider()
    {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();

        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance()); // No uso encoder porque es una aplicacion de muestra

        return provider;
    }

    @Bean
    public SecurityFilterChain sfc(HttpSecurity hs) throws Exception
    {
        hs  .csrf(customizer -> 
                customizer.disable())
            .authorizeHttpRequests(request -> 
                request.anyRequest().authenticated())
            //.formLogin(Customizer.withDefaults())
            .httpBasic(Customizer.withDefaults())
            .sessionManagement(session -> 
                session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        return hs.build();
    } 

    // @Bean
    // public UserDetailsService userDetailsService()
    // {
    //     UserDetails user = User
    //         .withDefaultPasswordEncoder()   //Solo porque es una aplicacion de muestra
    //         .username("Sant")
    //         .password("1234")
    //         .roles("USER")
    //         .build(); 
    //     UserDetails admin = User
    //         .withDefaultPasswordEncoder()   //Solo porque es una aplicacion de muestra
    //         .username("admin")
    //         .password("admin1234")
    //         .roles("ADMIN")
    //         .build();
        
    //     return new InMemoryUserDetailsManager(user, admin);
    // }
}
