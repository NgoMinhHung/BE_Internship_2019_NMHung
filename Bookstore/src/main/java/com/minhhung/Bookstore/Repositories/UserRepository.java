package com.minhhung.Bookstore.Repositories;

import com.minhhung.Bookstore.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
