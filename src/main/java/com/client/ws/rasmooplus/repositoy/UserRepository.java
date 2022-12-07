package com.client.ws.rasmooplus.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.ws.rasmooplus.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
