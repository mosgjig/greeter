package com.msyla.usergreeter.greeter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class Greeter {

    private static final Logger log = LoggerFactory.getLogger(Greeter.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Greeter.class, args);
    }
}
