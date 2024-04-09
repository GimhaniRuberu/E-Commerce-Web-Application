package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Admin;
import org.example.entity.AdminEntity;
import org.example.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
@CrossOrigin
public class AdminController {
    final AdminService service;

    @PostMapping("/addAdmin")
    @ResponseStatus(HttpStatus.CREATED)
    public void addAdmin(@RequestBody Admin admin){
    service.addAdmin(admin);
}

    @GetMapping("/getAdmin")
    public Iterable<AdminEntity> getAdmin(){
        return service.getAdmin();
    }

    @DeleteMapping("/{adminId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteAdmin(@PathVariable String id){
        if (service.deleteAdmin(id)){
            return "Deleted";
        }else{
            return "Not Deleted";
        }
    }

    @GetMapping("search/{id}")
    public Admin getAdminId(@PathVariable String id){
        return service.getAdminById(id);
    }
}
