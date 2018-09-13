package liar.xiaoyu.www.controller;

import liar.xiaoyu.www.entity.User;
import liar.xiaoyu.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    private final String address = "/User";
    @Autowired
    UserService userService;

    @ResponseBody
    @PostMapping(value = address)
    public Boolean addUser(User user){
        Boolean aBoolean = false;
        Integer integer = userService.addUser(user);
        if(integer>0){
            aBoolean = true;
        }
        return aBoolean;
    }
}
