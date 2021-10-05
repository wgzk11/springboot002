package com.openlab.Controller;

import com.openlab.dao.UserDao;
import com.openlab.pojo.User;
import com.openlab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
 @Autowired
    UserService userService;

 @RequestMapping("/")
 public ModelAndView queryAllUser()
 {
     ModelAndView modelAndView = new ModelAndView();
     List<User> all = userService.getUserList();
     modelAndView.addObject("list",all);
     modelAndView.setViewName("list");
     return modelAndView;
 }

 @RequestMapping("/toAdd")
 public  String toAdd()
 {
     return "/aa";
 }

 @RequestMapping("/save")
    public  ModelAndView save(User user)
 {
     System.out.println(user.getId());
     ModelAndView m = new ModelAndView();
     userService.createUser(user);
     m.setViewName("redirect:/");
     return  m;
 }

 @RequestMapping("/doUpdate/{id}")
 public ModelAndView doUpdate(@PathVariable("id") Long id)
 {
     ModelAndView modelAndView = new ModelAndView();
     User user = userService.getUserById(id);
     modelAndView.addObject("user",user);
     modelAndView.setViewName("/userEdit");
     return modelAndView;
 }

 @RequestMapping("/update")
 public ModelAndView Update(User user)
 {
     ModelAndView modelAndView = new ModelAndView();
     userService.updateUser(user.getId(),user);
     modelAndView.setViewName("redirect:/");
     return modelAndView;
 }
}
