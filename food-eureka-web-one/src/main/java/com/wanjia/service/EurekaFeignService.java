package com.wanjia.service;

import com.wanjia.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@FeignClient(value = "food-service-one")
public interface EurekaFeignService {
    @RequestMapping(value = "/test")
    public String test();

    //@RequestBody TbItem item, @RequestParam("desc") String desc
    @RequestMapping(value = "test1",method = RequestMethod.POST)
    public List<User> test1(@RequestBody User user, @RequestParam("id") String id);

}
