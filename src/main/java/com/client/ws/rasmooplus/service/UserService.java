package com.client.ws.rasmooplus.service;

import java.util.List;

import com.client.ws.rasmooplus.dto.UserDto;
import com.client.ws.rasmooplus.model.User;

public interface UserService {
    
    List<User> findAll();

    User findById(Long id);
    
    User create(UserDto dto);
    
    User update(Long id, UserDto dto);
    
    void delete(Long id);

}
