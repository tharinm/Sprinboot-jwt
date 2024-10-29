package spring_react_jwt.spring_boot_jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        // Configuring request authorization rules
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/api/v1/loan/get-my-loan", "/api/auth/user").authenticated()
                        .requestMatchers("/api/v1/notice/get-my-notice").permitAll()
                )
                // Configuring form-based login
                .formLogin(withDefaults())
                // Configuring HTTP Basic authentication
                .httpBasic(withDefaults());

        return http.build();
    }

}
