package org.example.fx.service;

import org.example.fx.model.connector.MySQLConnector;
import org.example.fx.model.manager.UserManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserManager userManager;

    @Mock
    private MySQLConnector mySQLConnector;

    @InjectMocks
    private UserService userService;

    @Test
    public void validateUser_ok() {
        Mockito.doReturn(true).when(userManager).findUser(Mockito.any(), Mockito.any(), Mockito.any());
        Mockito.doReturn(mySQLConnector).when(userManager).getConnector();
        assertTrue(userService.validateUser("",""));
    }

    @Test
    public void validateUser_ko() throws SQLException, ClassNotFoundException {
        Mockito.when(mySQLConnector.getMySQLConnection())
                .thenThrow(new SQLException());
        Mockito.doReturn(mySQLConnector).when(userManager).getConnector();
        assertFalse(userService.validateUser("",""));
    }

}
