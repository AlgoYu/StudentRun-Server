package liar.xiaoyu.www.controller;

import liar.xiaoyu.www.entity.ResponseMessageCommon;
import liar.xiaoyu.www.entity.User;
import liar.xiaoyu.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    private final String url = "/User";

    @GetMapping(name = url)
    public ResponseMessageCommon<List<User>> getAllUser(){
        return (ResponseMessageCommon<List<User>>) userService.getAllUser();
    }

    @PostMapping(name = url)
    public ResponseMessageCommon<Integer> addUser(@RequestBody User user){
        return (ResponseMessageCommon<Integer>) userService.addUser(user);
    }
}
