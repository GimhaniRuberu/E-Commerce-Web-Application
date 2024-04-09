package org.example.repository;

import org.example.entity.AdminEntity;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<AdminEntity,String> {
}
