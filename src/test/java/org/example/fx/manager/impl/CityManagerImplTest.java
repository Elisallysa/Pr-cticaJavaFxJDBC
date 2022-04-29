package org.example.fx.manager.impl;

import org.example.fx.model.manager.impl.UserManagerImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Connection;

@ExtendWith(MockitoExtension.class)
public class CityManagerImplTest {

    @Mock
    private Connection connection;

    @Test
    public void findAllCities_ok(){

        UserManagerImpl userManager = new UserManagerImpl();

    //    Mockito.when(connection.createStatement()).thenReturn(statement));


    }

}
