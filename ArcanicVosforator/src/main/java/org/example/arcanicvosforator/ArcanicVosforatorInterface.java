package org.example.arcanicvosforator;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ArcanicVosforatorInterface extends Application {

    private final ArcanicVosforatorData data = new ArcanicVosforatorData();

    public ArcanicVosforatorData getData() {
        return data;
    }

    @Override
    public void start(Stage stage) {
        getData().setEidolonArcaneSet();
        ComboBox arcaneSetList = new ComboBox(FXCollections.observableArrayList(getData().getEidolonArcaneSet()));
        TextField arcaneQuantity = new TextField();
        HBox arcaneSetBreakdown = new HBox();
        Button selectArcane = new Button();
        ScrollPane listOfArcanes = new ScrollPane();
        listOfArcanes.setScaleX(2.2);
        listOfArcanes.setPrefSize(150, 450);
        Text label = new Text();
        VBox arcaneBreakdown = new VBox();
        GridPane grid = new GridPane();
        arcaneBreakdown.getChildren().addAll(listOfArcanes, label);
        arcaneBreakdown.setSpacing(12);
        selectArcane.setText("Select");
        label.setText("Ember Heirloom Ass > Wisp Ass"); // placeholder text.
        label.setScaleX(1.4);
        label.setScaleY(1.4);
        arcaneSetBreakdown.getChildren().addAll(arcaneSetList, arcaneQuantity, selectArcane);
        arcaneSetBreakdown.setSpacing(12);
        arcaneSetBreakdown.setPadding(new Insets(20, 20, 20, 20));
        grid.add(arcaneSetBreakdown, 0, 0);
        grid.add(arcaneBreakdown, 1, 1);
        grid.setHgap(100);
        grid.setVgap(-45);
        Scene scene = new Scene(grid, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Arcanic Vosforator");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}