package com.gec.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gec.pojo.User;
import com.gec.service.UserService;
import com.gec.utils.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/finduserlist")
    public ResultBean<User> findAllUser() {

        List<User> list = userService.list();
        for (User record : list) {
            System.out.println(record.toString());
        }
        return ResultBean.ok(list);
    }


    @PostMapping("/students")
    public ResultBean<User> students(@RequestBody User user) {
        System.out.println(user.toString());
        return ResultBean.ok(user);
    }

}
