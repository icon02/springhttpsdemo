package io.github.icon02.springhttpsdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.icon02.springhttpsdemo.payload.Wrapper;

@RestController
public class SimpleRestController {

    @GetMapping("/test")
    public ResponseEntity<Wrapper<String>> test() {
        return ResponseEntity.ok(new Wrapper<>("Test"));
    }
}
