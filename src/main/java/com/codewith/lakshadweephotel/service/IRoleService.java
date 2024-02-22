package com.codewith.lakshadweephotel.service;

import com.codewith.lakshadweephotel.model.Role;
import com.codewith.lakshadweephotel.model.User;

import java.util.List;

/**
 * @author Nehal Ansari
 */

public interface IRoleService {
    List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long id);
    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);
}
