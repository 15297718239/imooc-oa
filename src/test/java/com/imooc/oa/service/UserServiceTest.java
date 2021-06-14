package com.imooc.oa.service;

import com.imooc.oa.entity.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {
    private UserService userService = new UserService();
    @Test
    public void checkLogin1() {
        User user = userService.checkLogin("m8", "test");
        System.out.println(user);
    }

    @Test
    public void checkLogin2() {
        User user = userService.checkLogin("test1", "test");
        System.out.println(user);
    }

    @Test
    public void checkLogin3() {
        User user = userService.checkLogin("m8", "test1");
        System.out.println(user);
    }
}