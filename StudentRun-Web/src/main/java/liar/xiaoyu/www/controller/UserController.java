package liar.xiaoyu.www.controller;

import liar.xiaoyu.www.entity.RequestMessage;
import liar.xiaoyu.www.entity.ResponseMessage;
import liar.xiaoyu.www.entity.User;
import liar.xiaoyu.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    private final String url = "/User";

    @GetMapping(value = url+"s")
    public ResponseMessage<List<User>> getAllUser(@RequestBody RequestMessage<?> requestMessage){
        ResponseMessage<List<User>> responseMessage = new ResponseMessage<>();
        return responseMessage;
    }

    @PostMapping(value = url)
    public ResponseMessage<Integer> addUser(@RequestBody RequestMessage<User> requestMessage){
        ResponseMessage<Integer> responseMessage = new ResponseMessage<>();
        return responseMessage;
    }

    @PutMapping(value = url)
    public ResponseMessage<Integer> updateUser(@RequestBody RequestMessage<User> requestMessage){
        ResponseMessage<Integer> responseMessage = new ResponseMessage<>();
        return responseMessage;
    }

    @DeleteMapping(value = url)
    public ResponseMessage<Integer> deleteUser(@RequestBody RequestMessage<Integer> requestMessage){
        ResponseMessage<Integer> responseMessage = new ResponseMessage<>();
        return responseMessage;
    }

    @GetMapping(value = url)
    public ResponseMessage<User> getUserByID(@RequestBody RequestMessage<Integer> requestMessage){
        ResponseMessage<User> responseMessage = new ResponseMessage<>();
        return responseMessage;
    }

    @PostMapping("/ValidPhone")
    public ResponseMessage<Boolean> validPhone(@RequestBody RequestMessage<Integer> requestMessage){
        ResponseMessage<Boolean> responseMessage = new ResponseMessage<>();
        return responseMessage;
    }

    @PostMapping("ValidLogin")
    public ResponseMessage<User> validLogin(@RequestBody RequestMessage<Integer> requestMessage){
        ResponseMessage<User> responseMessage = new ResponseMessage<>();
        return responseMessage;
    }
}
