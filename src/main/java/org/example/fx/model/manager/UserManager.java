package org.example.fx.model.manager;

import org.example.fx.model.connector.MySQLConnector;

import java.sql.Connection;

public interface UserManager {

    public boolean findUser(Connection con, String name, String pass);

    public MySQLConnector getConnector();
}
