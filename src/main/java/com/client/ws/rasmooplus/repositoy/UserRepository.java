package com.client.ws.rasmooplus.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.client.ws.rasmooplus.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
