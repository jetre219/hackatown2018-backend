package com.hackatown.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/users")
public class UserResource {

    @PostMapping("/authenticate")
    public void authenticate(Principal principal){

    }

}
