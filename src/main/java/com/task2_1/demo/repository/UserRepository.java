package com.task2_1.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task2_1.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
