package com.example.demo.repository;
import com.example.demo.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long>{
    // JPA Repository is an interface, Your User repository should be interface too. If not, you should implement. But in jpa, spring framework handel the object creation. So, just you have to create an interface and extend it from JPARepo
    //custom quaries
}
