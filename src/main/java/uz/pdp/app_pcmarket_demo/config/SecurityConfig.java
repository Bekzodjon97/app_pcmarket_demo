package uz.pdp.app_pcmarket_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration//bean qilib beradi va ichida ham hohlagancha bean ochishga ruxsat beradi
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("super_admin").password(passwordEncoder().encode("super_admin")).roles("SUPER_ADMIN").authorities("READ_ALL","ADD","EDIT","DELETE","READ_ONE")
                .and()
                .withUser("moderator").password(passwordEncoder().encode("moderator")).roles("MODERATOR").authorities("READ_ALL","ADD","EDIT","READ_ONE")
                .and()
                .withUser("operator").password(passwordEncoder().encode("operator")).roles("OPERATOR").authorities("READ_ALL","ADD","READ_ONE");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {




        http
                .csrf().disable()
                .authorizeRequests()

                //Authority bo'yicha
                .antMatchers(HttpMethod.DELETE,"/api/**").hasAuthority("DELETE")
                .antMatchers(HttpMethod.PUT,"/api/**").hasAuthority("EDIT")
                .antMatchers("/api/**").hasAnyAuthority("READ_ALL","ADD","EDIT","DELETE","READ_ONE")

                //Role based boyicha
//                .antMatchers(HttpMethod.GET,"/api/product/**").hasAnyRole("SUPER_ADMIN","MODERATOR","OPERATOR")
//                .antMatchers(HttpMethod.POST,"/api/product/**").hasAnyRole("SUPER_ADMIN","MODERATOR","OPERATOR")
//                .antMatchers(HttpMethod.PUT,"/api/product/**").hasAnyRole("SUPER_ADMIN","MODERATOR")
//                .antMatchers("/api/product/**").hasRole("SUPER_ADMIN")
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
