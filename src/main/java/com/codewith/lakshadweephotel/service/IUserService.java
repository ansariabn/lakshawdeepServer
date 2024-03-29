package com.codewith.lakshadweephotel.service;

import com.codewith.lakshadweephotel.model.User;

import java.util.List;

/**
 * @author Nehal Ansari
 */

public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}
