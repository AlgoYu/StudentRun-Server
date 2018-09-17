package liar.xiaoyu.www.controller;

import liar.xiaoyu.www.entity.ResponseMessageCommon;
import liar.xiaoyu.www.entity.User;
import liar.xiaoyu.www.service.UserService;
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
    public ResponseMessageCommon<List<User>> getAllUser(){
        return (ResponseMessageCommon<List<User>>) userService.getAllUser();
    }

    @PostMapping(value = url)
    public ResponseMessageCommon<Integer> addUser(@RequestBody User user){
        return (ResponseMessageCommon<Integer>) userService.addUser(user);
    }

    @PutMapping(value = url)
    public ResponseMessageCommon<Integer> updateUser(@RequestBody User user){
        return (ResponseMessageCommon<Integer>) userService.updateUserByID(user);
    }

    @DeleteMapping(value = url)
    public ResponseMessageCommon<Integer> deleteUser(@Param("id")String postid){
        Integer id = Integer.parseInt(postid);
        return (ResponseMessageCommon<Integer>) userService.deleteUserByID(id);
    }

    @GetMapping(value = url)
    public ResponseMessageCommon<User> getUserByID(@Param("id") String postid){
        Integer id = Integer.parseInt(postid);
        return (ResponseMessageCommon<User>) userService.getUserByID(id);
    }

    @GetMapping("validPhone")
    public ResponseMessageCommon<Integer> validPhone(@Param("phone") String phone){
        return (ResponseMessageCommon<Integer>) userService.validationPhone(phone);
    }
}
