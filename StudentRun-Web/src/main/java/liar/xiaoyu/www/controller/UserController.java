package liar.xiaoyu.www.controller;

import liar.xiaoyu.www.entity.ResponseMessage;
import liar.xiaoyu.www.entity.User;
import liar.xiaoyu.www.service.UserService;
import liar.xiaoyu.www.utils.MD5Util;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    private final String url = "/User";

    @GetMapping(value = url+"s")
    public ResponseMessage<List<User>> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping(value = url)
    public ResponseMessage<Integer> addUser(@RequestBody User user){
        user.setPassword(MD5Util.XMD5(user.getPassword()));
        return userService.addUser(user);
    }

    @PutMapping(value = url)
    public ResponseMessage<Integer> updateUser(@RequestBody User user){
        return userService.updateUserByID(user);
    }

    @DeleteMapping(value = url)
    public ResponseMessage<Integer> deleteUser(@Param("id")String postid){
        Integer id = Integer.parseInt(postid);
        return userService.deleteUserByID(id);
    }

    @GetMapping(value = url)
    public ResponseMessage<User> getUserByID(@Param("id") String postid){
        Integer id = Integer.parseInt(postid);
        return userService.getUserByID(id);
    }

    @PostMapping("/ValidPhone")
    public ResponseMessage<Integer> validPhone(@Param("phone") String phone){
        return userService.validationPhone(phone);
    }

    @PostMapping("ValidLogin")
    public ResponseMessage<User> validPassword(@Param("phone") String phone,@Param("password") String password){
        return userService.validationLogin(phone,password);
    }
}
