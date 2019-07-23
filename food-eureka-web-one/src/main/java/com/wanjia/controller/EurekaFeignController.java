package com.wanjia.controller;

import com.wanjia.entity.User;
import com.wanjia.service.EurekaFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EurekaFeignController {
    @Autowired
    EurekaFeignService eurekaFeignService;

    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        String src = eurekaFeignService.test();
        return src;
    }

    @ResponseBody
    @RequestMapping(value = "/test1")
    public List<User> test1(){
        User user = new User("2","小心","女");
        return eurekaFeignService.test1(user,"3");
    }
}
