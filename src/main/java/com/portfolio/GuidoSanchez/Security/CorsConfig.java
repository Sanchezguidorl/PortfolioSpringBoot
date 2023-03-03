
package com.portfolio.GuidoSanchez.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    
    
    
    @Bean
   public WebMvcConfigurer corsConfigurer(){
       
       
       return new WebMvcConfigurer(){

           @Override
           public void addCorsMappings(CorsRegistry registry){
               registry.addMapping("/login")
                       .allowedOrigins("*")
                       .allowedMethods("*")
                       .allowedHeaders("Authorization", "Content-Type", "X-Custom-Header")
                       .exposedHeaders("*")
                       .allowCredentials(true);
               
               registry.addMapping("/api/**")
                       .allowedOrigins("*")
                       .allowedMethods("*");
                    
           }
       };
   }
}
