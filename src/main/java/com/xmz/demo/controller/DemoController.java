package com.xmz.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/demo")
@RestController
public class DemoController {

    protected static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @GetMapping("")
    public String demo1() {
        logger.debug("Hello World!");
        return "Hello World!";
    }

}
