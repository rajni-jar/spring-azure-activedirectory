package com.active.directory.springazureactivedirectory.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rajni Kanth Tupakula
 */
@RestController
public class SayHello {

    @PreAuthorize("hasRole('User')")
    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }

    @PreAuthorize("hasRole('Grp1')")
    @RequestMapping("/Group1")
    public String groupOne() {
        return "Hello Group 1 Users!";
    }
    @PreAuthorize("hasRole('Grp2')")
    @RequestMapping("/Group2")
    public String groupTwo() {
        return "Hello Group 2 Users!";
    }
}
