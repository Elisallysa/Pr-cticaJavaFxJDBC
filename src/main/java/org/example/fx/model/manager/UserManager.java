package org.example.fx.model.manager;

import java.sql.Connection;

public interface UserManager {

    public boolean findUser(Connection con, String name, String pass);
}
