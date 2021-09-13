package io.github.icon02.springhttpsdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.icon02.springhttpsdemo.payload.Wrapper;

import java.io.File;

@RestController
public class SimpleRestController {

    private static final double GB = 1024d * 1024d * 1024d;

    @GetMapping("/test")
    public ResponseEntity<Wrapper<String>> test() {
        return ResponseEntity.ok(new Wrapper<>("Test"));
    }

    @GetMapping("/total-space")
    public ResponseEntity<Wrapper<Double>> getTotalSpace() {
        File file = new File(".");
        return ResponseEntity.ok(new Wrapper<>((double) file.getTotalSpace() / GB));
    }

    @GetMapping("/free-space")
    public ResponseEntity<Wrapper<Double>> getFreeSpace() {
        File file = new File(".");
        return ResponseEntity.ok(new Wrapper<>((double) file.getFreeSpace() / GB));
    }

    @GetMapping("/usable-space")
    public ResponseEntity<Wrapper<Double>> getUsableSpace() {
        File file = new File(".");
        return ResponseEntity.ok(new Wrapper<>((double) file.getUsableSpace() / GB));
    }
}
