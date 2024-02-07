package com.msyla.usergreeter.greeter.web;

import com.msyla.usergreeter.greeter.service.GreetService;
import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greet")
public class GreetResource {

    @Autowired
    private GreetService service;

    @GetMapping
    public String get(Principal user) {
        return service.getGreetByUsername(user.getName());
    }
}
