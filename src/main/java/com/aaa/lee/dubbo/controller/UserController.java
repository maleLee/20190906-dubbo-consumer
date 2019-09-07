package com.aaa.lee.dubbo.controller;

import com.aaa.lee.dubbo.model.User;
import com.aaa.lee.dubbo.service.IUserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019/9/6 11:19
 * @Description
 **/
@RestController
public class UserController {

    /**
     * roundrobin:轮询
     * random:随机
     * leastActive:最小活跃数访问
     *      谁的请求最少访问哪一个
     * 如果当consumer去zookeeper发现服务的时候，一旦zookeeper中有两个或者两个以上的同一类服务(application.name一样)
     *  consumer会自动开启负载均衡，默认的算法是轮询
     */
    @Reference(loadbalance = "random")
    private IUserService userService;

    @RequestMapping("/all")
    public List<User> selectAllUsers() {
        return userService.selectAllUsers();
    }

}
