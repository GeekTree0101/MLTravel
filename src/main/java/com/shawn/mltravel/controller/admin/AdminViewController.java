package com.shawn.mltravel.controller.admin;

import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.ArrayList;

import com.shawn.mltravel.pojo.User;
import com.shawn.mltravel.service.UserServiceImpl;
import org.springframework.ui.Model;

@Controller
public class AdminViewController {

  @Autowired
  UserServiceImpl userService;

  @GetMapping("/admin-list.html")
  public String getAdminList(Model model) {

    List<User> userList = userService.queryUserList();
    model.addAttribute("users",userList);
    return "travel/admin/admin-list";
  }

}