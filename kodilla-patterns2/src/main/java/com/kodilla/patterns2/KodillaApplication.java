package com.kodilla.patterns2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class KodillaApplication {

    public static void main(String[] args) {
        final Logger LOGGER = LoggerFactory.getLogger(KodillaApplication.class);
        try {
            SpringApplication.run(KodillaApplication.class, args);
        } catch (Throwable e) {
            LOGGER.error("System exception",e);
        }
     }
}