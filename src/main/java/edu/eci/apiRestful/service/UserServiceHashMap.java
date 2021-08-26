package edu.eci.apiRestful.service;

import edu.eci.apiRestful.data.User;
import edu.eci.apiRestful.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceHashMap implements UserService{

    private HashMap< String , User> users =  new  HashMap <> ();
    private Date date = new Date();

    @Override
    public User create(UserDto user) {
        User user1 = new User(String.valueOf(users.size()+1), user);
        users.put(user1.getId(),user1);
        return user1;
    }

    @Override
    public User findById(String id) {
        User user = users.get(id);
        return user;
    }

    @Override
    public List<User> all() {
        ArrayList<User> userList = new ArrayList<>(users.values());
        return userList;
    }

    @Override
    public boolean deleteById(String id) {
       return users.remove(id) != null;
    }

    @Override
    public User update(UserDto user, String userId) {
        User user1 = new User(userId, user);
        users.put(userId,user1);
        return user1;
    }
}
