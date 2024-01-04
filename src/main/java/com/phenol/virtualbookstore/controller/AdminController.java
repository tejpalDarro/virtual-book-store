package com.phenol.virtualbookstore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phenol.virtualbookstore.entity.UserPass;
import com.phenol.virtualbookstore.generate.UserPassList;

@RestController
@RequestMapping(path = "/admin", produces = "application/json")
public class AdminController {

    private List<UserPass> list;

    @Autowired
    private UserPassList userPassList;

    @Autowired
    private AdminController(UserPassList user) {
        super();
        list = user.generateUserPassList();
    }


    @GetMapping("/listUsers")
    public List<UserPass> getUser() {
        return list;
    }

    @GetMapping("/login/{name}/{pass}")
    public UserPass getLogin(@PathVariable String name, @PathVariable String pass) {
        Optional<UserPass> exists = userPassList.checkUserPass(list, name, pass);

        if (exists.isPresent()) {
            return exists.get();
        } else {
            System.out.println("User not found");
        }
        return null;
    }
}
