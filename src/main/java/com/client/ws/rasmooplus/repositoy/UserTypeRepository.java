package com.client.ws.rasmooplus.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.client.ws.rasmooplus.model.UserType;

public interface UserTypeRepository extends JpaRepository<UserType, Long>{
    
}
