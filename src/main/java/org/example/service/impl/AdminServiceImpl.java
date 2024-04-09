package org.example.service.impl;

import org.example.dto.Admin;
import org.example.entity.AdminEntity;
import org.example.repository.AdminRepository;
import org.example.service.AdminService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {
@Autowired
    AdminRepository repository;

    ModelMapper mapper;

    public void setup(){
        this.mapper=new ModelMapper();
    }
    @Override
    public void addAdmin(Admin admin) {
        AdminEntity entity=mapper.map(admin, AdminEntity.class);
        repository.save(entity);
    }

    public List<AdminEntity> getAdmin() {
       return (List<AdminEntity>) repository.findAll();
    }

    @Override
    public boolean deleteAdmin(String id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Admin getAdminById(String id) {
        Optional<AdminEntity> byId = repository.findById(id);
        return mapper.map(byId,Admin.class) ;
    }

}
