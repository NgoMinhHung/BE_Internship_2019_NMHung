package com.minhhung.Bookstore.Repositories;

import com.minhhung.Bookstore.Models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByName(String name);
}
