package liar.xiaoyu.www.controller;

import liar.xiaoyu.www.entity.User;
import liar.xiaoyu.www.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final String url = "/User";
    @Autowired
    UserService userService;

    @PostMapping(value = url)
    public Boolean addUser(@RequestBody User user){
        Boolean aBoolean = false;
        Integer integer = userService.addUser(user);
        if(integer>0){
            aBoolean = true;
        }
        System.out.println(user.toString());
        return aBoolean;
    }

    @DeleteMapping(value = url)
    public Boolean deleteUser(@Param("id")Integer id){
        Boolean aBoolean = false;
        Integer integer = userService.deleteUserByID(id);
        if(integer > 0){
            aBoolean = true;
        }
        return aBoolean;
    }

    @PutMapping(value = url)
    public Boolean updateUser(@RequestBody User user){
        Boolean aBoolean = false;
        Integer integer = userService.updateUserByID(user);
        if(integer > 0){
            aBoolean = true;
        }
        return aBoolean;
    }
}
