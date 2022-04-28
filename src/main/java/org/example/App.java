package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static Label lblMessage;
    private static TextField tfUser;
    private static PasswordField pwfPassword;
    private static Button btnLogin;
    private static Button btnReset;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"));
        configureUIComponents();
        stage.setTitle("My First App");
        stage.setScene(scene);
        stage.getIcons().add(new Image(App.class.getResourceAsStream("/static/img/icon.png")));
        stage.show();
    }

    public void configureUIComponents(){
        lblMessage = new Label();
        tfUser = new TextField();
        pwfPassword = new PasswordField();
        btnLogin = new Button();
        btnReset = new Button();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}