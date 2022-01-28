package com.danilo.Help_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danilo.Help_app.model.Login;
import com.danilo.Help_app.service.LoginService;




@RestController
@CrossOrigin(origins = "https://dreamy-jang-746cbf.netlify.app")
@RequestMapping("/log")
public class LoginController {

	@Autowired
    private LoginService loginService;

    // Add new Login
    @PostMapping("/addLogin")
    public Login addLogin(@RequestBody Login login) {
        return loginService.addLogin(login);
    }

    // Add more than 1 Login
    @PostMapping("/addLogins")
    public List<Login> addAllLogins(@RequestBody List<Login> logins) {
        return loginService.addAllLogins(logins);
    }

    // Get Login by Id
    @GetMapping("/getLoginByID/{id}")
    public Login getLoginById(@PathVariable int id) {
        return loginService.getLoginByID(id);
    }

    // Get Login by name
    @GetMapping("/getLoginByName/{name}")
    public  Login getLoginByName(@PathVariable String name) {
        return  loginService.getLoginByName(name);
    }

    // Update Login
    @PutMapping("/updateLogin")
    public Login updateLogin(@RequestBody Login login) {
        return loginService.updateLogin(login);
    }

    // Delete Login
    @DeleteMapping("/deleteLoginById/{id}")
    public boolean deleteLoginByID(@PathVariable int id) {
        return loginService.deleteLoginByID(id);
    }

    // Get all Login
    @GetMapping("/getAll")
    public List<Login> getAllLogin() {
        return loginService.getAllLogins();
    }
}

