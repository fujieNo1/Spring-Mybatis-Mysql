package com.fj.controller;

import com.fj.pojo.User;
import com.fj.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/list")
    public String list(HttpServletRequest request, Model model){

        List<User> userList = userService.findAllUser();
        if(userList.size() > 0){
            model.addAttribute("userList",userList);
        }
        return "userList";
    }

    @RequestMapping("/add")
    public String add(HttpServletRequest request, Model model){

        return "userAdd";
    }

    @RequestMapping("/save")
    public String save(User user, HttpServletRequest request, Model model){

        userService.save(user);
        return "redirect:user/list";
    }
}
