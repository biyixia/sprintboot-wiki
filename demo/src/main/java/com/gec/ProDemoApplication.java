package com.gec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@MapperScan("com.gec.mapper")
public class ProDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProDemoApplication.class, args);
    }

//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("http://localhost:7070")
//                .allowedMethods("*")//"OPTIONS", "GET", "POST", "PUT", "DELETE"
//                .allowCredentials(true)
//                .allowedHeaders("*");
//    }
}
