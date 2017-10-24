package com.gcpkr.bitcoin.be.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

public class ResourceController {

    @GetMapping(path = "/", produces = MediaType.TEXT_HTML_VALUE)
    public Resource index() {
        return new ClassPathResource("static/index.html");
    }
}