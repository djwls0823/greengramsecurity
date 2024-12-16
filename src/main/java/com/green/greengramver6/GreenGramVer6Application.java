package com.green.greengramver6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class GreenGramVer6Application {

    public static void main(String[] args) {
        SpringApplication.run(GreenGramVer6Application.class, args);
    }

}
