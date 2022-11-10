package com.gec.controller;

import com.gec.pojo.User;
import com.gec.utils.ResultBean;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@CrossOrigin(origins = "*")
public class HelloController {


    //@RequestMapping(value = "/hello")
    @GetMapping("/hello")
    public String hello(int id) {
        return "Hello World! id = " + id;
    }

    @GetMapping("/student")
    public ResultBean student() {
        return ResultBean.ok();
    }

    @PostMapping("/getUser")
    public User getUser(@RequestBody User user) {
        return user;
    }
}
