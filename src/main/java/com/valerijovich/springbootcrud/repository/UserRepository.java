package com.valerijovich.springbootcrud.repository;

import com.valerijovich.springbootcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
