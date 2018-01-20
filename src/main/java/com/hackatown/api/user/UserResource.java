package com.hackatown.api.user;

import com.hackatown.api.user.dto.LoginStatusDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @PostMapping("/authenticate")
    public void authenticate(@RequestBody LoginStatusDto loginStatusDto){
        boolean test = true;
    }

}
