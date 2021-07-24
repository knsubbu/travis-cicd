package com.subbu.travisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TravisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravisDemoApplication.class, args);
    }


    @GetMapping("/hello")
    public String greet(){
        return "Hello Travis CI CD";
    }

}
