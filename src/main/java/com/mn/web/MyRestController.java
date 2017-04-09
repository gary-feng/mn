package com.mn.web;

import com.mn.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by FGJ on 2017/4/9.
 */
@RestController
@RequestMapping(value = "/users")
public class MyRestController {

    @RequestMapping(value = "/{user}/customers", method = RequestMethod.GET)
    public User getUser(@PathVariable String user) {
        return new User(user, 30);
    }

    @RequestMapping(value = "/{user}", method = RequestMethod.DELETE)
    public User deleteUser(@PathVariable Long user) {
        return null;
    }
}
