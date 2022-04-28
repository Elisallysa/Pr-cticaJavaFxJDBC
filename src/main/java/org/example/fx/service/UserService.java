package org.example.fx.service;

import org.example.fx.model.connector.MySQLConnector;
import org.example.fx.model.manager.UserManager;

import java.sql.Connection;
import java.sql.SQLException;

public class UserService {

    private final UserManager userManager;

    public UserService(UserManager userManager) {
        this.userManager = userManager;
    }

    public boolean validateUser(String username, String password) {
        try (Connection con = new MySQLConnector().getMySQLConnection()) {

            return userManager.findUser(con, username, password);


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }

    }
}
