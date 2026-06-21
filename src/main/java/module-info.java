module org.example.szso {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.szso to javafx.fxml;
    exports org.example.szso;
}