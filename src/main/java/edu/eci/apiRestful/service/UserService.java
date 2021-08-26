package edu.eci.apiRestful.service;

import edu.eci.apiRestful.data.User;
import edu.eci.apiRestful.dto.UserDto;

import java.util.List;

public interface UserService {
    User create( UserDto user );
    User findById( String id );
    List<User> all();
    boolean deleteById( String id );
    User update( UserDto user, String userId );
}
