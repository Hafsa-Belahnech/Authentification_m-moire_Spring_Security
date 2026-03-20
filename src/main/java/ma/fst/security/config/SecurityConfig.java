package ma.fst.security.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;





@Configuration //SecurityConfig contient des définitions de beans Spring

public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails admin = User.withUsername("admin")
                .password("{noop}8888") // le mot de passe n’est pas encodé, c'est juste un cas pour ce lab
                .roles("ADMIN")
                .build();

        UserDetails user = User.withUsername("user")
                .password("{noop}7777")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(admin, user);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .requestMatchers("/user/**").hasAnyRole("USER", "ADMIN")
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        .loginPage("/login")
                        .permitAll()
                ) //modifiée après l'ajout de login.html

                .logout(logout -> logout
                        .logoutSuccessUrl("/login?logout") // Redirige vers le login après déconnexion
                        .permitAll()
                );

        return http.build();
    }
}


//UserDetailsService est pour déclarer le/les utilisateurs et son/leurs rôle(s)
//SecurityFilterChain pour la définition des règles de sécurité des routes HTTP (inspection API)