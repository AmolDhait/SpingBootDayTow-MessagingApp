package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.sql.Struct;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @RequestMapping(value= {"","/","/home"})
    public String sayHello(){

        return "Hello World!";
    }
    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name")String name)
    {

        return "Hello" +name+"!";
    }
    // localhost:8080/hello/param/Narayan -w "\n"
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "hello"+name+"!";
    }
    @PostMapping("/post")
    public String sayHello(@RequestBody User user)
    {

        return "hello"+user.getFirstName() + "" + user.getLastName()+"!";
    }
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName,@RequestParam(value = "lastName") String lastName){
        return "Hello" +firstName + "" + lastName + "!";
    }
}
