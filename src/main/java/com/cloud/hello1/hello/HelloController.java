package com.cloud.hello1.hello;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JackWangon[www.coder520.com] 2017/11/20.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public  String hello () throws InterruptedException {
        System.out.println("访问来了。。");
        return "hello cloud 2";
    }

    @RequestMapping("/laowangs")
    public  List<String> laowangs (String ids) {
        List<String> list = new ArrayList<>();
        list.add("laowang1");
        list.add("laowang2");
        list.add("laowang3");
        return list;
    }

    @RequestMapping(value = "/hellol", method= RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/hello2", method= RequestMethod.GET)
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
            return new User(name, age);
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello (@RequestBody User user) {
        return "Hello "+ user. getName () + ", " + user. getAge ();
    }
}
