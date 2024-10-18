package org.pack;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringApplicationTest {
    public static void main(String[] args) {
        System.out.println("Test application");
        SpringApplication.run(SpringApplicationTest.class, args);
    }
}