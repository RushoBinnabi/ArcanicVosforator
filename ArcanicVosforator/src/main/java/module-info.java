module org.example.arcanicvosforator {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.arcanicvosforator to javafx.fxml;
    exports org.example.arcanicvosforator;
}