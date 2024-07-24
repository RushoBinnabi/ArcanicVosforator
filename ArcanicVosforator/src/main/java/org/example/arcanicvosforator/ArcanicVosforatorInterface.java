package org.example.arcanicvosforator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ArcanicVosforatorInterface extends Application {

    ArcanicVosforatorData data = new ArcanicVosforatorData();

    public ArcanicVosforatorData getData() {
        return data;
    }

    @Override
    public void start(Stage stage) {
        ComboBox arcaneSetList = new ComboBox();
        HBox arcaneSetFilters = new HBox();
        HBox arcaneSetBreakdown = new HBox();
        VBox arcaneSet = new VBox();
        Button getArcaneVosfor = new Button();
        getArcaneVosfor.setText("Select");
        CheckBox eidolonArcaneSet = new CheckBox();
        eidolonArcaneSet.setText("Eidolon Arcane Set");
        CheckBox cetusArcaneSet = new CheckBox();
        cetusArcaneSet.setText("Cetus Arcane Set");
        GridPane selectArcanes = new GridPane();
        arcaneSetFilters.getChildren().addAll(new Text("Filters: "), eidolonArcaneSet, cetusArcaneSet);
        arcaneSetFilters.setSpacing(12);
        arcaneSetBreakdown.getChildren().addAll(arcaneSetList, getArcaneVosfor);
        arcaneSetBreakdown.setSpacing(12);
        arcaneSet.getChildren().addAll(arcaneSetFilters, arcaneSetBreakdown);
        arcaneSet.setSpacing(12);
        selectArcanes.setAlignment(Pos.TOP_LEFT);
        selectArcanes.setPadding(new Insets(20, 20, 20, 20));
        selectArcanes.add(arcaneSet, 0, 2);
        Scene scene = new Scene(selectArcanes, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Arcanic Vosforator");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}