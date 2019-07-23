package com.wanjia.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.wanjia.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EurekaFeignController {
    @RequestMapping("/test")
    public String test(){
        String src = "hello boy!";
        return src;
    }

    @RequestMapping("/test1")
    public List<User> test1(@RequestBody User use, @RequestParam("id") String id){
        System.out.println(use+"--"+id);

        List<User> users = new ArrayList<>();
        for (int i=0;i<5;i++){
            User user = new User();
            user.setId(String.valueOf(i));
            user.setName("小米"+i);
            user.setAge("女"+i+"号");
            users.add(user);
        }
        return users;
    }

}
