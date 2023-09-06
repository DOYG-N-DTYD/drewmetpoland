package com.drewmetpoland.drewmet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DrewmetApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrewmetApplication.class, args);
	}
//	@Bean
//    public CorsFilter corsFilter() {
//        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        final CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials(true);
//        config.addAllowedOrigin("*"); // this allows all origin
//        config.addAllowedHeader("*"); // this allows all headers
//        config.addAllowedMethod("OPTIONS");
//        config.addAllowedMethod("HEAD");
//        config.addAllowedMethod("GET");
//        config.addAllowedMethod("PUT");
//        config.addAllowedMethod("POST");
//        config.addAllowedMethod("DELETE");
//        config.addAllowedMethod("PATCH");
//        source.registerCorsConfiguration("/**", config);
//        return new CorsFilter(source);
//    }
	// @Bean
	// public WebMvcConfigurer corsConfigurer(){
	// 	return new WebMvcConfigurer() {
	// 		@Override
	// 		public void addCorsMappings(CorsRegistry registry){
	// 			registry.addMapping("/**").allowedOrigins("http://localhost:4200");
	// 		}
	// 	};
	// }

//	@Bean
//	public WebMvcConfigurer corsConfigurer()
//	{
//	String[] allowDomains = new String[2];
//	allowDomains[0] = "http://localhost:4200";
//	allowDomains[1] = "http://localhost:8080";
//
//		System.out.println("CORS configuration....");
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/**").allowedOrigins(allowDomains);
//			}
//		};
//	}
	
}
