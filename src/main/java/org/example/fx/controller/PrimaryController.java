package org.example.fx.controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.example.fx.model.connector.MySQLConnector;
import org.example.fx.model.manager.impl.UserManagerImpl;
import org.example.fx.service.UserService;

public class PrimaryController implements Initializable {

    @FXML
    private Button btnLogin;
    @FXML
    private Button btnReset;
    @FXML
    private TextField tfUser;
    @FXML
    private PasswordField pwfPassword;
    @FXML
    private Label lblMessage;
    private UserService userService;

    @FXML
    private void validate(ActionEvent event) {

            if (!tfUser.getText().isEmpty() && !pwfPassword.getText().isEmpty()) {
                if (userService.validateUser(tfUser.getText(), pwfPassword.getText())) {
                    lblMessage.setText("Login successful.");
                    System.out.println("MÉTODO VALIDATE");
                } else {
                    lblMessage.setText("User not found.");
                }
            } else {
                lblMessage.setText("Fill in username and password.");
            }


    }

    @FXML
    private void resetFields(ActionEvent event) {
        tfUser.clear();
        pwfPassword.clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        userService = new UserService(new UserManagerImpl());

        /**
         *  btnLogin.setOnAction((event) -> {
         *             if(!tfUser.getText().isEmpty() && !pwfPassword.getText().isEmpty()) {
         *                 lblMessage.setText("Login successful.");
         *                 System.out.println("EVENT!");
         *             } else {
         *                 lblMessage.setText("Fill in username and password.");
         *             }
         *         });
         *
         *         btnReset.setOnAction((event) -> {
         *             tfUser.clear();
         *             pwfPassword.clear();
         *         });
         */

    }
}
