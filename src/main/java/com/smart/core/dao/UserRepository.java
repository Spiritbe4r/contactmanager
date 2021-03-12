package com.smart.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;



import com.smart.core.entities.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	

}
