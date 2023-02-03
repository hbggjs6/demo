package com.demo.controller;

import com.demo.dao.UserDao;
import com.demo.pojo.Person;
import com.demo.pojo.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedList;

@Controller
public class MyController {
    @Autowired
    UserDao userdao;
    @GetMapping("/register")
    @ResponseBody
    public Person deal1(String name) {
        return userdao.getInformation(name);
    }

    @PostMapping("/query")
    @ResponseBody
    public LinkedList<Project> deal2(int grade) {
        return  userdao.getAllPeople(grade);
    }
}
