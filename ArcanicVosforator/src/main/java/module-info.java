module org.example.arcanicvosforator {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.accessibility;


    opens org.example.arcanicvosforator to javafx.fxml;
    exports org.example.arcanicvosforator;
}