package org.example.service;

import org.example.dto.Admin;

import org.example.entity.AdminEntity;


import java.util.List;

public interface AdminService {
        void addAdmin(Admin admin);

        List<AdminEntity> getAdmin();

        boolean deleteAdmin(String id);


        Admin getAdminById(String id);

}
