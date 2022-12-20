package com.br.ehnois.simpleproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/test")
    public String getResponse() {
        return "Hello World";
    }
}
