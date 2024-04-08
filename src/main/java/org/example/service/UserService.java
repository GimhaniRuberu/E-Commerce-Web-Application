package org.example.service;

import org.example.dto.User;
import org.example.entity.UserEntity;

import java.util.List;

public interface UserService {
        void addUser(User user);

        List<UserEntity> getUser();

        boolean deleteUser(String id);


        User getUserById(String id);

}
