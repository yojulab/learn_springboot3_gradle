package com.yojulab.study_springboot.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
        @Bean
        public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
                // None using csrf protection
                httpSecurity.csrf().disable();
                // 권한에 대한 부분 : url & roles : user url & roles
                // url, roles from Dao
                httpSecurity.authorizeHttpRequests() // 로그인
                        .requestMatchers("/admin*").authenticated()
                        .anyRequest().permitAll()
                ;
                httpSecurity.formLogin(login -> login.loginPage("/loginForm")
                                .failureUrl("/loginForm?fail=true")
                                .loginProcessingUrl("/login")
                                .defaultSuccessUrl("/"));
                httpSecurity.logout(logout -> logout
                                .logoutSuccessUrl("/main")
                                .invalidateHttpSession(true)
                                .deleteCookies("JSESSIONID"));

                return httpSecurity.build();
        }
        @Bean
        public BCryptPasswordEncoder encoderPasswordEncoder() {
                return new BCryptPasswordEncoder();
        }
    
}
