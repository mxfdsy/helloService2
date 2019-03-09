package com.cloud.hello1.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloProvideController {

    @RequestMapping(value = "/getHelloUser", method = RequestMethod.POST)
    public User getHelloUser() {
        User user = new User();
        user.setName("helloUser2");
        user.setAge(100);
        return user;
    }
}

