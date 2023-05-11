package com.goltaraya.siscc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goltaraya.siscc.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
