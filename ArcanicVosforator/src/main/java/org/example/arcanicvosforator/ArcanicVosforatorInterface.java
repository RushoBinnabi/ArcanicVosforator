package org.example.arcanicvosforator;

import javafx.application.Application;
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
    ComboBox arcaneSetList = new ComboBox();
    TextField arcaneQuantity = new TextField();
    HBox arcaneSetBreakdown = new HBox();
    HBox buttons = new HBox();
    Button selectArcane = new Button();
    Button clearArcanes = new Button();
    ScrollPane listOfArcanes = new ScrollPane();
    Text label = new Text();
    VBox arcaneBreakdown = new VBox();
    GridPane grid = new GridPane();
    Scene scene;
    VBox arcaneSetFilters = new VBox();
    CheckBox eidolonArcaneSetFilter = new CheckBox();
    CheckBox cetusArcaneSetFilter = new CheckBox();
    CheckBox arbitrationArcaneSetFilter = new CheckBox();
    CheckBox steelPathArcaneSetFilter = new CheckBox();
    CheckBox zarimanArcaneSetFilter = new CheckBox();
    CheckBox quillsArcaneSetFilter = new CheckBox();
    CheckBox necraliskArcaneSetFilter = new CheckBox();
    CheckBox duviriArcaneSetFilter = new CheckBox();
    CheckBox caviaArcaneSetFilter = new CheckBox();
    CheckBox luaArcaneSetFilter = new CheckBox();
    CheckBox fortunaArcaneSetFilter = new CheckBox();
    CheckBox mirrorDefenseArcaneSetFilter = new CheckBox();
    CheckBox plagueStarArcaneSetFilter = new CheckBox();
    CheckBox voxSolarisArcaneSetFilter = new CheckBox();

    public ArcanicVosforatorData getData() {
        return data;
    }

    @Override
    public void start(Stage stage) {
        eidolonArcaneSetFilter.setText("Eidolon Arcane Set");
        cetusArcaneSetFilter.setText("Cetus Arcane Set");
        arbitrationArcaneSetFilter.setText("Arbitration Arcane Set");
        steelPathArcaneSetFilter.setText("Steel Path Arcane Set");
        zarimanArcaneSetFilter.setText("Zariman Arcane Set");
        quillsArcaneSetFilter.setText("Quills Arcane Set");
        necraliskArcaneSetFilter.setText("Necralisk Arcane Set");
        duviriArcaneSetFilter.setText("Duviri Arcane Set");
        caviaArcaneSetFilter.setText("Cavia Arcane Set");
        luaArcaneSetFilter.setText("Lua Arcane Set");
        fortunaArcaneSetFilter.setText("Fortuna Arcane Set");
        mirrorDefenseArcaneSetFilter.setText("Mirror Defense Arcane Set");
        plagueStarArcaneSetFilter.setText("Plague Star Arcane Set");
        voxSolarisArcaneSetFilter.setText("Vox Solaris Arcane Set");
        arcaneSetFilters.getChildren().addAll(eidolonArcaneSetFilter, cetusArcaneSetFilter, arbitrationArcaneSetFilter,
                steelPathArcaneSetFilter, zarimanArcaneSetFilter, quillsArcaneSetFilter, necraliskArcaneSetFilter,
                duviriArcaneSetFilter, caviaArcaneSetFilter, luaArcaneSetFilter, fortunaArcaneSetFilter,
                mirrorDefenseArcaneSetFilter, plagueStarArcaneSetFilter, voxSolarisArcaneSetFilter);
        arcaneSetFilters.setPadding(new Insets(50,50,50,50));
        arcaneSetFilters.setSpacing(12);
        arcaneSetFilters.setAlignment(Pos.TOP_CENTER);
        setArcanes();
        getData().setVosforRates();
        listOfArcanes.setScaleX(2.2);
        listOfArcanes.setPrefSize(150, 450);
        buttons.getChildren().addAll(selectArcane, clearArcanes);
        buttons.setSpacing(12);
        buttons.setAlignment(Pos.CENTER);
        arcaneBreakdown.getChildren().addAll(listOfArcanes, buttons, label);
        arcaneBreakdown.setSpacing(12);
        selectArcane.setText("Select");
        clearArcanes.setText("Clear");
        label.setScaleX(1.4);
        label.setScaleY(1.4);
        arcaneSetBreakdown.getChildren().addAll(arcaneSetList, arcaneQuantity);
        arcaneSetBreakdown.setSpacing(12);
        arcaneSetBreakdown.setPadding(new Insets(35, 35, 35, 35));
        grid.add(arcaneSetBreakdown, 0, 0);
        grid.add(arcaneSetFilters, 0, 1);
        grid.add(arcaneBreakdown, 1, 1);
        grid.setHgap(120);
        grid.setVgap(-45);
        scene = new Scene(grid, 800, 620);
        stage.setScene(scene);
        stage.setTitle("Arcanic Vosforator");
        stage.show();
    }

    public void setArcanes() {
        getData().setEidolonArcaneSet();
        getData().setZarimanArcaneSet();
        getData().setArbitrationArcaneSet();
        getData().setQuillsArcaneSet();
        getData().setNecraliskArcaneSet();
        getData().setDuviriArcaneSet();
        getData().setCaviaArcaneSet();
        getData().setLuaArcaneSet();
        getData().setFortunaArcaneSet();
        getData().setMirrorDefenseArcaneSet();
        getData().setCetusArcaneSet();
        getData().setPlagueStarArcaneSet();
        getData().setSteelPathArcaneSet();
        getData().setVoxSolarisArcaneSet();
    }

    public static void main(String[] args) {
        launch();
    }
}