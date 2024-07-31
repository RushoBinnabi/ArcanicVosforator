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
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ArcanicVosforatorInterface extends Application {

    private final ArcanicVosforatorData data = new ArcanicVosforatorData();
    ComboBox arcaneSetList = new ComboBox();
    TextField arcaneQuantity = new TextField();
    HBox arcaneSetBreakdown = new HBox();
    HBox buttons = new HBox();
    Button selectArcane = new Button();
    Button clearArcanes = new Button();
    TextArea listOfArcanes = new TextArea();
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
    ArrayList<String> arcaneList = new ArrayList<>();

    public ArcanicVosforatorData getData() {
        return data;
    }

    @Override
    public void start(Stage stage) {
        listOfArcanes.setEditable(false);
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
        eidolonArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getEidolonArcaneSet()));
                cetusArcaneSetFilter.setSelected(false);
                arbitrationArcaneSetFilter.setSelected(false);
                steelPathArcaneSetFilter.setSelected(false);
                zarimanArcaneSetFilter.setSelected(false);
                quillsArcaneSetFilter.setSelected(false);
                necraliskArcaneSetFilter.setSelected(false);
                duviriArcaneSetFilter.setSelected(false);
                caviaArcaneSetFilter.setSelected(false);
                luaArcaneSetFilter.setSelected(false);
                fortunaArcaneSetFilter.setSelected(false);
                mirrorDefenseArcaneSetFilter.setSelected(false);
                plagueStarArcaneSetFilter.setSelected(false);
                voxSolarisArcaneSetFilter.setSelected(false);
            }
        });
        cetusArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getCetusArcaneSet()));
                eidolonArcaneSetFilter.setSelected(false);
                arbitrationArcaneSetFilter.setSelected(false);
                steelPathArcaneSetFilter.setSelected(false);
                zarimanArcaneSetFilter.setSelected(false);
                quillsArcaneSetFilter.setSelected(false);
                necraliskArcaneSetFilter.setSelected(false);
                duviriArcaneSetFilter.setSelected(false);
                caviaArcaneSetFilter.setSelected(false);
                luaArcaneSetFilter.setSelected(false);
                fortunaArcaneSetFilter.setSelected(false);
                mirrorDefenseArcaneSetFilter.setSelected(false);
                plagueStarArcaneSetFilter.setSelected(false);
                voxSolarisArcaneSetFilter.setSelected(false);
            }
        });
        arbitrationArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getArbitrationArcaneSet()));
                eidolonArcaneSetFilter.setSelected(false);
                cetusArcaneSetFilter.setSelected(false);
                steelPathArcaneSetFilter.setSelected(false);
                zarimanArcaneSetFilter.setSelected(false);
                quillsArcaneSetFilter.setSelected(false);
                necraliskArcaneSetFilter.setSelected(false);
                duviriArcaneSetFilter.setSelected(false);
                caviaArcaneSetFilter.setSelected(false);
                luaArcaneSetFilter.setSelected(false);
                fortunaArcaneSetFilter.setSelected(false);
                mirrorDefenseArcaneSetFilter.setSelected(false);
                plagueStarArcaneSetFilter.setSelected(false);
                voxSolarisArcaneSetFilter.setSelected(false);
            }
        });
        steelPathArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getSteelPathArcaneSet()));
                eidolonArcaneSetFilter.setSelected(false);
                cetusArcaneSetFilter.setSelected(false);
                arbitrationArcaneSetFilter.setSelected(false);
                zarimanArcaneSetFilter.setSelected(false);
                quillsArcaneSetFilter.setSelected(false);
                necraliskArcaneSetFilter.setSelected(false);
                duviriArcaneSetFilter.setSelected(false);
                caviaArcaneSetFilter.setSelected(false);
                luaArcaneSetFilter.setSelected(false);
                fortunaArcaneSetFilter.setSelected(false);
                mirrorDefenseArcaneSetFilter.setSelected(false);
                plagueStarArcaneSetFilter.setSelected(false);
                voxSolarisArcaneSetFilter.setSelected(false);
            }
        });
        zarimanArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getZarimanArcaneSet()));
                eidolonArcaneSetFilter.setSelected(false);
                cetusArcaneSetFilter.setSelected(false);
                arbitrationArcaneSetFilter.setSelected(false);
                steelPathArcaneSetFilter.setSelected(false);
                quillsArcaneSetFilter.setSelected(false);
                necraliskArcaneSetFilter.setSelected(false);
                duviriArcaneSetFilter.setSelected(false);
                caviaArcaneSetFilter.setSelected(false);
                luaArcaneSetFilter.setSelected(false);
                fortunaArcaneSetFilter.setSelected(false);
                mirrorDefenseArcaneSetFilter.setSelected(false);
                plagueStarArcaneSetFilter.setSelected(false);
                voxSolarisArcaneSetFilter.setSelected(false);
            }
        });
        quillsArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getQuillsArcaneSet()));
                eidolonArcaneSetFilter.setSelected(false);
                cetusArcaneSetFilter.setSelected(false);
                arbitrationArcaneSetFilter.setSelected(false);
                steelPathArcaneSetFilter.setSelected(false);
                zarimanArcaneSetFilter.setSelected(false);
                necraliskArcaneSetFilter.setSelected(false);
                duviriArcaneSetFilter.setSelected(false);
                caviaArcaneSetFilter.setSelected(false);
                luaArcaneSetFilter.setSelected(false);
                fortunaArcaneSetFilter.setSelected(false);
                mirrorDefenseArcaneSetFilter.setSelected(false);
                plagueStarArcaneSetFilter.setSelected(false);
                voxSolarisArcaneSetFilter.setSelected(false);
            }
        });
        necraliskArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getNecraliskArcaneSet()));
                eidolonArcaneSetFilter.setSelected(false);
                cetusArcaneSetFilter.setSelected(false);
                arbitrationArcaneSetFilter.setSelected(false);
                steelPathArcaneSetFilter.setSelected(false);
                zarimanArcaneSetFilter.setSelected(false);
                quillsArcaneSetFilter.setSelected(false);
                duviriArcaneSetFilter.setSelected(false);
                caviaArcaneSetFilter.setSelected(false);
                luaArcaneSetFilter.setSelected(false);
                fortunaArcaneSetFilter.setSelected(false);
                mirrorDefenseArcaneSetFilter.setSelected(false);
                plagueStarArcaneSetFilter.setSelected(false);
                voxSolarisArcaneSetFilter.setSelected(false);
            }
        });
        duviriArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getDuviriArcaneSet()));
                eidolonArcaneSetFilter.setSelected(false);
                cetusArcaneSetFilter.setSelected(false);
                arbitrationArcaneSetFilter.setSelected(false);
                steelPathArcaneSetFilter.setSelected(false);
                zarimanArcaneSetFilter.setSelected(false);
                necraliskArcaneSetFilter.setSelected(false);
                caviaArcaneSetFilter.setSelected(false);
                luaArcaneSetFilter.setSelected(false);
                fortunaArcaneSetFilter.setSelected(false);
                mirrorDefenseArcaneSetFilter.setSelected(false);
                plagueStarArcaneSetFilter.setSelected(false);
                voxSolarisArcaneSetFilter.setSelected(false);
            }
        });
        caviaArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getCaviaArcaneSet()));
                eidolonArcaneSetFilter.setSelected(false);
                cetusArcaneSetFilter.setSelected(false);
                arbitrationArcaneSetFilter.setSelected(false);
                steelPathArcaneSetFilter.setSelected(false);
                zarimanArcaneSetFilter.setSelected(false);
                quillsArcaneSetFilter.setSelected(false);
                necraliskArcaneSetFilter.setSelected(false);
                duviriArcaneSetFilter.setSelected(false);
                luaArcaneSetFilter.setSelected(false);
                fortunaArcaneSetFilter.setSelected(false);
                mirrorDefenseArcaneSetFilter.setSelected(false);
                plagueStarArcaneSetFilter.setSelected(false);
                voxSolarisArcaneSetFilter.setSelected(false);
            }
        });
        luaArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getLuaArcaneSet()));
                eidolonArcaneSetFilter.setSelected(false);
                cetusArcaneSetFilter.setSelected(false);
                arbitrationArcaneSetFilter.setSelected(false);
                steelPathArcaneSetFilter.setSelected(false);
                zarimanArcaneSetFilter.setSelected(false);
                necraliskArcaneSetFilter.setSelected(false);
                duviriArcaneSetFilter.setSelected(false);
                caviaArcaneSetFilter.setSelected(false);
                fortunaArcaneSetFilter.setSelected(false);
                mirrorDefenseArcaneSetFilter.setSelected(false);
                plagueStarArcaneSetFilter.setSelected(false);
                voxSolarisArcaneSetFilter.setSelected(false);
            }
        });
        fortunaArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getFortunaArcaneSet()));
                eidolonArcaneSetFilter.setSelected(false);
                cetusArcaneSetFilter.setSelected(false);
                arbitrationArcaneSetFilter.setSelected(false);
                steelPathArcaneSetFilter.setSelected(false);
                zarimanArcaneSetFilter.setSelected(false);
                necraliskArcaneSetFilter.setSelected(false);
                duviriArcaneSetFilter.setSelected(false);
                caviaArcaneSetFilter.setSelected(false);
                mirrorDefenseArcaneSetFilter.setSelected(false);
                plagueStarArcaneSetFilter.setSelected(false);
                voxSolarisArcaneSetFilter.setSelected(false);
            }
        });
        mirrorDefenseArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getMirrorDefenseArcaneSet()));
                eidolonArcaneSetFilter.setSelected(false);
                cetusArcaneSetFilter.setSelected(false);
                arbitrationArcaneSetFilter.setSelected(false);
                steelPathArcaneSetFilter.setSelected(false);
                zarimanArcaneSetFilter.setSelected(false);
                necraliskArcaneSetFilter.setSelected(false);
                duviriArcaneSetFilter.setSelected(false);
                caviaArcaneSetFilter.setSelected(false);
                plagueStarArcaneSetFilter.setSelected(false);
                voxSolarisArcaneSetFilter.setSelected(false);
            }
        });
        plagueStarArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getPlagueStarArcaneSet()));
                eidolonArcaneSetFilter.setSelected(false);
                cetusArcaneSetFilter.setSelected(false);
                arbitrationArcaneSetFilter.setSelected(false);
                steelPathArcaneSetFilter.setSelected(false);
                zarimanArcaneSetFilter.setSelected(false);
                necraliskArcaneSetFilter.setSelected(false);
                duviriArcaneSetFilter.setSelected(false);
                caviaArcaneSetFilter.setSelected(false);
                mirrorDefenseArcaneSetFilter.setSelected(false);
                voxSolarisArcaneSetFilter.setSelected(false);
            }
        });
        voxSolarisArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getVoxSolarisArcaneSet()));
                eidolonArcaneSetFilter.setSelected(false);
                cetusArcaneSetFilter.setSelected(false);
                arbitrationArcaneSetFilter.setSelected(false);
                steelPathArcaneSetFilter.setSelected(false);
                zarimanArcaneSetFilter.setSelected(false);
                necraliskArcaneSetFilter.setSelected(false);
                duviriArcaneSetFilter.setSelected(false);
                caviaArcaneSetFilter.setSelected(false);
                mirrorDefenseArcaneSetFilter.setSelected(false);
                plagueStarArcaneSetFilter.setSelected(false);
            }
        });
        listOfArcanes.setScaleX(2.2);
        listOfArcanes.setPrefSize(150, 450);
        buttons.getChildren().addAll(selectArcane, clearArcanes);
        buttons.setSpacing(12);
        buttons.setAlignment(Pos.CENTER);
        arcaneBreakdown.getChildren().addAll(listOfArcanes, buttons, label);
        arcaneBreakdown.setSpacing(12);
        selectArcane.setText("Select");
        clearArcanes.setText("Clear");
        selectArcane.setOnAction(actionEvent -> selectArcaneEvent());
        clearArcanes.setOnAction(actionEvent -> clearDataEvent());
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
        scene = new Scene(grid, ArcanicVosforatorData.UI_WIDTH, ArcanicVosforatorData.UI_HEIGHT);
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

    private void selectArcaneEvent() {
        int quantity;
        String arcane;
        try {
            quantity = Integer.parseInt(arcaneQuantity.getText());
            arcane = String.valueOf(arcaneSetList.getValue());
            listOfArcanes.setFont(Font.font("Ariel", 9));
            arcaneList.add(quantity + "x" + " " + arcane);
            for (String s : arcaneList) {
                listOfArcanes.appendText(s + "\n");
            }
            arcaneList.remove(quantity + "x" + " " + arcane);
        }
        catch (Exception e) {
            label.setText("Error. Please make sure you select an arcane and quantity");
        }
    }

    private void clearDataEvent() {
        arcaneQuantity.clear();
        listOfArcanes.clear();
        label.setText("");
        arcaneSetList.setItems(null);
        eidolonArcaneSetFilter.setSelected(false);
        cetusArcaneSetFilter.setSelected(false);
        arbitrationArcaneSetFilter.setSelected(false);
        steelPathArcaneSetFilter.setSelected(false);
        zarimanArcaneSetFilter.setSelected(false);
        quillsArcaneSetFilter.setSelected(false);
        necraliskArcaneSetFilter.setSelected(false);
        duviriArcaneSetFilter.setSelected(false);
        caviaArcaneSetFilter.setSelected(false);
        luaArcaneSetFilter.setSelected(false);
        fortunaArcaneSetFilter.setSelected(false);
        mirrorDefenseArcaneSetFilter.setSelected(false);
        plagueStarArcaneSetFilter.setSelected(false);
        voxSolarisArcaneSetFilter.setSelected(false);
    }


    public static void main(String[] args) {
        launch();
    }
}