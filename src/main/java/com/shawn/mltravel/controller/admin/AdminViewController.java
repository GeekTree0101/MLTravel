package com.shawn.mltravel.controller.admin;

import org.springframework.stereotype.Controller;

// import com.shawn.mltravel.pojo.User;
// import com.shawn.mltravel.service.UserServiceImpl;
// import org.springframework.beans.factory.annotation.Autowired;
import com.shawn.mltravel.pojo.DummyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.ArrayList;

@Controller
public class AdminViewController {

  // @Autowired
  // UserServiceImpl userService;

  @GetMapping("/admin-list.html")
  public String getAdminList(Model model) {

    // TODO: replace to user service :]
    List<DummyUser> users = new ArrayList();
    DummyUser user = new DummyUser(1, "test", "123456", "active");
    DummyUser user2 = new DummyUser(2, "test2", "123456", "active");

    users.add(user);
    users.add(user2);

    model.addAttribute("users", users);
      
    return "travel/admin/admin-list";
  }

}