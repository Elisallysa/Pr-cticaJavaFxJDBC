module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires lombok;

    exports org.example.fx.controller;
    opens org.example.fx.controller to javafx.fxml;
    exports org.example;
    opens org.example to javafx.fxml;
}