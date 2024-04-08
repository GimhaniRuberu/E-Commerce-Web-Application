package org.example.service.impl;

import org.example.dto.User;
import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository repository;

    ModelMapper mapper;
    @Bean
    public void setup(){
        this.mapper=new ModelMapper();
    }
    @Override
    public void addUser(User user) {
        UserEntity entity=mapper.map(user, UserEntity.class);
        repository.save(entity);
    }

    public List<UserEntity> getUser() {
       return (List<UserEntity>) repository.findAll();
    }

    @Override
    public boolean deleteUser(String id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public User getUserById(String id) {
        Optional<UserEntity> byId = repository.findById(id);
        return mapper.map(byId,User.class) ;
    }
    
}
