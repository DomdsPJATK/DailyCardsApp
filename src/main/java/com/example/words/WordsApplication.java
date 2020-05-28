package com.example.words;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.words.Controllers"})
public class WordsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WordsApplication.class, args);
    }

}
