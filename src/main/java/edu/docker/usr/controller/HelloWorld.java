package edu.docker.usr.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloWorld {
    @GetMapping("/index.html")
    public String hello(){
        log.info("this is my first dome in the docker and thread is {}",Thread.currentThread().getName());
        return "Hello World";
    }
}
