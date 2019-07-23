package com.wanjia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients         //feign服务
@EnableEurekaClient         //注册中心
public class FoodEurekaWebOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodEurekaWebOneApplication.class, args);
    }

}
