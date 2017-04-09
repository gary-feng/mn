package com.mn.web;

import com.mn.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by FGJ on 2017/4/9.
 */
@Controller
public class MyRestController {

    @Value("${application.hello:Hello Angel}")
    private String hello;

    @RequestMapping(value = "/users/{user}/customers", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable String user) {
        return new User(user, 30);
    }

    @RequestMapping(value = "/{user}", method = RequestMethod.DELETE)
    public User deleteUser(@PathVariable Long user) {
        return null;
    }

    @RequestMapping("/hello1")
    public String hello(Map<String, Object> model) {
        model.put("test", hello);
        return "hello";
    }
}
