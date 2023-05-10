package com.goltaraya.siscc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goltaraya.siscc.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
