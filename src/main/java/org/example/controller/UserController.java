package org.example.controller;

import lombok.RequiredArgsConstructor;

import org.example.dto.User;
import org.example.entity.UserEntity;
import org.example.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {
    final UserService service;

    @PostMapping("/addUser")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody User user){
    service.addUser(user);
}

    @GetMapping("/getUser")
    public Iterable<UserEntity> getUser(){
        return service.getUser();
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteUser(@PathVariable String id){
        if (service.deleteUser(id)){
            return "Deleted";
        }else{
            return "Not Deleted";
        }
    }


    @GetMapping("search/{id}")
    public User getUserId(@PathVariable String id){
        return service.getUserById(id);
    }
}
