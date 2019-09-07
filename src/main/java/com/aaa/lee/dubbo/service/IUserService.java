package com.aaa.lee.dubbo.service;

import com.aaa.lee.dubbo.model.User;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019/9/6 11:18
 * @Description
 **/
public interface IUserService {

    List<User> selectAllUsers();

}
