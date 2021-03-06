package io.getstarted.springbootstarter.hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello(@RequestParam( value = "name", required = false) String name){
        String helper = "World";
        System.out.println(name);
        if (name != null){
            return "Hello there kritin boy how you doing?" + name;
        }
        else {
            return "Hello " + helper;
        }
    }
}
