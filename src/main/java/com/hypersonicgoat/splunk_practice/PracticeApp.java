package com.hypersonicgoat.splunk_practice;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@Log4j2
@RestController
@SpringBootApplication
public class PracticeApp {

    @PostMapping
    JsonNode post(@RequestBody JsonNode json) {
        LOGGER.info("Received POST: {}", json);
        return json;
    }

    public static void main(String[] args) {
        SpringApplication.run(PracticeApp.class, args);
    }

}
