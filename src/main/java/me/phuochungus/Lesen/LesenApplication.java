package me.phuochungus.Lesen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;


@SpringBootApplication
public class LesenApplication {
    public static Logger logger = Logger.getLogger("LesenApplication");


    public static void main(String[] args) {
        SpringApplication.run(LesenApplication.class, args);
    }

}
