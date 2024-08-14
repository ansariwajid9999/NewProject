package com.example.newAssignment.repository;

import com.example.newAssignment.models.User;
import org.springframework.data.jpa.repository.JpaRepository;



import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> findByFirstName(String firstName);
    List<User> findByLastName(String lastName);
    List<User> findByCity(String city);
    List<User> findByEmail(String email);
    List<User> findByPhone(String phone);
}
