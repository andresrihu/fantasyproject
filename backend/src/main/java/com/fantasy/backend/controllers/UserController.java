package com.fantasy.backend.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.fantasy.backend.models.LoginUser;
import com.fantasy.backend.models.User;
import com.fantasy.backend.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    
    @Autowired
  private UserService userService;

    public UserController(UserService userService) {
    this.userService = userService;
  }

    // ========= LOGIN & REGISTRATION =================
  
  @GetMapping(value = { "/signup" })
  public String main(Model model) {
    model.addAttribute("newUser", new User());
    model.addAttribute("newLogin", new LoginUser());
    return "forward:/index.html";
  }
  
  @PostMapping("/register")
  public String register(@Valid @ModelAttribute("newUser") User user, BindingResult result, Model model, HttpSession session) {
    if(result.hasErrors()) {
      model.addAttribute("newLogin", new LoginUser());
      return "main";
    }
    User errors = userService.register(user, result);
    if(errors == null) {
      return "main";
    }
    session.setAttribute("user_id", user.getId());
    session.setAttribute("user_name", user.getUserName());
    return "redirect:/";
  }

    @PostMapping("/login")
  public String login(@Valid @ModelAttribute("newLogin") LoginUser form_user, BindingResult result, Model model, HttpSession session) {
    if(result.hasErrors()) {
      model.addAttribute("user", new User());
      return "main";
    }
    User user = userService.login(form_user, result);
    if(user == null) {
      return "main";
    }
    session.setAttribute("user_id", user.getId());
    session.setAttribute("user_name", user.getUserName());
    return "redirect:/fantasyhome";
  }

    // =========== LOGOUT ==========================
  
  @GetMapping("/logout")
  public String singOut(HttpSession session) {
    userService.signOut(session);
    return "redirect:/";
  }
}
