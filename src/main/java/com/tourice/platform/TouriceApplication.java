package com.tourice.platform;

import com.tourice.platform.model.User;
import com.tourice.platform.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TouriceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TouriceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            UserService userService
    ){
        return args -> {
            for(int i=0; i<100; i++){
                userService.registerUser(
                        User.builder()
                                .firstName("shop" +i)
                                .lastName("Hatsu" +i)
                                .email("hatsu"+i +"@gmail.com")
                                .password(i+"m@"+i)
                                .build()
                );
            }
        };
    }
}
