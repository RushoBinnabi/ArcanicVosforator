/**
 * Name: Rusho Binnabi
 * Date: 8/6/2024
 * Project: Arcanic Vosforator
 * Contact Information: RushoBinnabi123@yahoo.com
 */

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

import java.text.DecimalFormat;
import java.util.ArrayList;

@SuppressWarnings("DuplicateBranchesInSwitch") // there was nothing wrong with the branches.

public class ArcanicVosforatorInterface extends Application {

    // this ArcanicVosforatorInterface class is the class that runs the overall application.

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
    DecimalFormat numberFormat = new DecimalFormat("#,###,###");

    /**
     * this getData() method gets the data from the ArcanicVosforatorData class.
     * @return the data from the ArcanicVosforatorData class.
     */

    public ArcanicVosforatorData getData() {
        return data;
    }

    /**
     * this start() method has everything needed for the application to function.
     * @param stage the window of the application.
     */

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
        arcaneSetFilters.setPadding(new Insets(50, 50, 50, 50));
        arcaneSetFilters.setSpacing(12);
        arcaneSetFilters.setAlignment(Pos.TOP_CENTER);
        setArcanes();
        getData().setVosforRates();
        eidolonArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getEidolonArcaneSet()));
                clearSelectedFilter("eidolon");
            }
        });
        cetusArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getCetusArcaneSet()));
                clearSelectedFilter("cetus");
            }
        });
        arbitrationArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getArbitrationArcaneSet()));
                clearSelectedFilter("arbitration");
            }
        });
        steelPathArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getSteelPathArcaneSet()));
                clearSelectedFilter("steelpath");
            }
        });
        zarimanArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getZarimanArcaneSet()));
                clearSelectedFilter("zariman");
            }
        });
        quillsArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getQuillsArcaneSet()));
                clearSelectedFilter("quills");
            }
        });
        necraliskArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getNecraliskArcaneSet()));
                clearSelectedFilter("necralisk");
            }
        });
        duviriArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getDuviriArcaneSet()));
                clearSelectedFilter("duviri");
            }
        });
        caviaArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getCaviaArcaneSet()));
                clearSelectedFilter("cavia");
            }
        });
        luaArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getLuaArcaneSet()));
                clearSelectedFilter("lua");
            }
        });
        fortunaArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getFortunaArcaneSet()));
                clearSelectedFilter("fortuna");
            }
        });
        mirrorDefenseArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getMirrorDefenseArcaneSet()));
                clearSelectedFilter("mirror");
            }
        });
        plagueStarArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getPlagueStarArcaneSet()));
                clearSelectedFilter("plague");
            }
        });
        voxSolarisArcaneSetFilter.selectedProperty().addListener((observable, unchecked, checked) -> {
            if (checked) {
                arcaneSetList.setItems(FXCollections.observableArrayList(getData().getVoxSolarisArcaneSet()));
                clearSelectedFilter("vox");
            }
        });
        listOfArcanes.setScaleX(2.2);
        listOfArcanes.setPrefSize(150, 450);
        buttons.getChildren().addAll(selectArcane, clearArcanes);
        buttons.setSpacing(12);
        buttons.setAlignment(Pos.CENTER);
        arcaneBreakdown.getChildren().addAll(listOfArcanes, buttons, label);
        arcaneBreakdown.setSpacing(12);
        arcaneBreakdown.setAlignment(Pos.CENTER);
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

    /**
     * this setArcanes() method sets the arcane sets in their array lists.
     */

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

    /**
     * this selectArcaneEvent() method handles the process of getting the amount of vosfor for the breakdown of the arcane sets.
     */

    private void selectArcaneEvent() {
        int quantity;
        String arcane;
        try {
            quantity = Integer.parseInt(arcaneQuantity.getText());
            arcane = String.valueOf(arcaneSetList.getValue());
            listOfArcanes.setFont(Font.font("Serif", 9));
            arcaneList.add(quantity + "x" + " " + arcane);
            for (String s : arcaneList) {
                listOfArcanes.appendText(s + "\n");
            }
            arcaneList.remove(quantity + "x" + " " + arcane);
            switch (arcane) {
                // arbitration arcane set.
                case "Arcane Blade Charger":
                    addToVosforCount(4, quantity);
                    break;
                case "Arcane Bodyguard":
                    addToVosforCount(4, quantity);
                    break;
                case "Arcane Pistoleer":
                    addToVosforCount(4, quantity);
                    break;
                case "Arcane Primary Charger":
                    addToVosforCount(4, quantity);
                    break;
                case "Arcane Tanker":
                    addToVosforCount(4, quantity);
                    break;
                // arbitration arcane set.
                // tyana pass arcane set.
                case "Arcane Double Back":
                    addToVosforCount(7, quantity);
                    break;
                case "Arcane Steadfast":
                    addToVosforCount(7, quantity);
                    break;
                case "Primary Plated Round":
                    addToVosforCount(7, quantity);
                    break;
                case "Secondary Encumber":
                    addToVosforCount(7, quantity);
                    break;
                case "Secondary Kinship":
                    addToVosforCount(7, quantity);
                    break;
                // tyana pass arcane set.
                // cavia arcane set.
                case "Melee Fortification":
                    addToVosforCount(3, quantity);
                    break;
                case "Melee Retaliation":
                    addToVosforCount(3, quantity);
                    break;
                case "Melee Animosity":
                    addToVosforCount(7, quantity);
                    break;
                case "Melee Exposure":
                    addToVosforCount(7, quantity);
                    break;
                case "Melee Influence":
                    addToVosforCount(7, quantity);
                    break;
                case "Melee Vortex":
                    addToVosforCount(7, quantity);
                    break;
                case "Melee Crescendo":
                    addToVosforCount(9, quantity);
                    break;
                case "Melee Duplicate":
                    addToVosforCount(9, quantity);
                    break;
                // cavia arcane set.
                // plague star arcane set.
                case "Exodia Contagion":
                    addToVosforCount(11, quantity);
                    break;
                case "Exodia Epidemic":
                    addToVosforCount(11, quantity);
                    break;
                // plague star arcane set.
                // cetus arcane set.
                case "Exodia Brave":
                    addToVosforCount(7, quantity);
                    break;
                case "Exodia Force":
                    addToVosforCount(7, quantity);
                    break;
                case "Exodia Hunt":
                    addToVosforCount(7, quantity);
                    break;
                case "Exodia Might":
                    addToVosforCount(7, quantity);
                    break;
                case "Exodia Triumph":
                    addToVosforCount(3, quantity);
                    break;
                case "Exodia Valor":
                    addToVosforCount(3, quantity);
                    break;
                // cetus arcane set.
                // duviri arcane set.
                case "Akimbo Slip Shot":
                    addToVosforCount(7, quantity);
                    break;
                case "Arcane Intention":
                    addToVosforCount(3, quantity);
                    break;
                case "Arcane Power Ramp":
                    addToVosforCount(7, quantity);
                    break;
                case "Magus Aggress":
                    addToVosforCount(3, quantity);
                    break;
                case "Primary Blight":
                    addToVosforCount(7, quantity);
                    break;
                case "Primary Exhilarate":
                    addToVosforCount(7, quantity);
                    break;
                case "Primary Obstruct":
                    addToVosforCount(7, quantity);
                    break;
                case "Secondary Outburst":
                    addToVosforCount(7, quantity);
                    break;
                case "Shotgun Vendetta":
                    addToVosforCount(7, quantity);
                    break;
                case "Arcane Reaper":
                    addToVosforCount(9, quantity);
                    break;
                case "Longbow Sharpshot":
                    addToVosforCount(9, quantity);
                    break;
                case "Secondary Shiver":
                    addToVosforCount(9, quantity);
                    break;
                // duviri arcane set.
                // fortuna arcane set.
                case "Pax Bolt":
                    addToVosforCount(7, quantity);
                    break;
                case "Pax Charge":
                    addToVosforCount(7, quantity);
                    break;
                case "Pax Seeker":
                    addToVosforCount(7, quantity);
                    break;
                case "Pax Soar":
                    addToVosforCount(7, quantity);
                    break;
                // fortuna arcane set.
                // lua arcane set.
                case "Arcane Blessing":
                    addToVosforCount(6, quantity);
                    break;
                case "Arcane Rise":
                    addToVosforCount(6, quantity);
                    break;
                case "Conjunction Voltage":
                    addToVosforCount(6, quantity);
                    break;
                case "Primary Frostbite":
                    addToVosforCount(6, quantity);
                    break;
                // lua arcane set.
                // necralisk arcane set.
                case "Residual Boils":
                    addToVosforCount(7, quantity);
                    break;
                case "Residual Malodor":
                    addToVosforCount(7, quantity);
                    break;
                case "Residual Shock":
                    addToVosforCount(7, quantity);
                    break;
                case "Residual Viremia":
                    addToVosforCount(7, quantity);
                    break;
                case "Theorem Contagion":
                    addToVosforCount(7, quantity);
                    break;
                case "Theorem Demulcent":
                    addToVosforCount(7, quantity);
                    break;
                case "Theorem Infection":
                    addToVosforCount(7, quantity);
                    break;
                // necralisk arcane set.
                // eidolon arcane set.
                case "Arcane Acceleration":
                    addToVosforCount(5, quantity);
                    break;
                case "Arcane Aegis":
                    addToVosforCount(8, quantity);
                    break;
                case "Arcane Agility":
                    addToVosforCount(5, quantity);
                    break;
                case "Arcane Arachne":
                    addToVosforCount(8, quantity);
                    break;
                case "Arcane Avenger":
                    addToVosforCount(8, quantity);
                    break;
                case "Arcane Awakening":
                    addToVosforCount(5, quantity);
                    break;
                case "Arcane Barrier":
                    addToVosforCount(10, quantity);
                    break;
                case "Arcane Consequence":
                    addToVosforCount(2, quantity);
                    break;
                case "Arcane Deflection":
                    addToVosforCount(5, quantity);
                    break;
                case "Arcane Energize":
                    addToVosforCount(10, quantity);
                    break;
                case "Arcane Eruption":
                    addToVosforCount(5, quantity);
                    break;
                case "Arcane Fury":
                    addToVosforCount(8, quantity);
                    break;
                case "Arcane Grace":
                    addToVosforCount(10, quantity);
                    break;
                case "Arcane Guardian":
                    addToVosforCount(5, quantity);
                    break;
                case "Arcane Healing":
                    addToVosforCount(5, quantity);
                    break;
                case "Arcane Ice":
                    addToVosforCount(2, quantity);
                    break;
                case "Arcane Momentum":
                    addToVosforCount(0, quantity);
                    break;
                case "Arcane Nullifier":
                    addToVosforCount(2, quantity);
                    break;
                case "Arcane Phantasm":
                    addToVosforCount(5, quantity);
                    break;
                case "Arcane Precision":
                    addToVosforCount(8, quantity);
                    break;
                case "Arcane Pulse":
                    addToVosforCount(8, quantity);
                    break;
                case "Arcane Rage":
                    addToVosforCount(8, quantity);
                    break;
                case "Arcane Resistance":
                    addToVosforCount(5, quantity);
                    break;
                case "Arcane Strike":
                    addToVosforCount(5, quantity);
                    break;
                case "Arcane Tempo":
                    addToVosforCount(2, quantity);
                    break;
                case "Arcane Trickery":
                    addToVosforCount(5, quantity);
                    break;
                case "Arcane Ultimatum":
                    addToVosforCount(8, quantity);
                    break;
                case "Arcane Velocity":
                    addToVosforCount(5, quantity);
                    break;
                case "Arcane Victory":
                    addToVosforCount(5, quantity);
                    break;
                case "Arcane Warmth":
                    addToVosforCount(2, quantity);
                    break;
                // eidolon arcane set.
                // steel path arcane set.
                case "Primary Deadhead":
                    addToVosforCount(4, quantity);
                    break;
                case "Primary Dexterity":
                    addToVosforCount(4, quantity);
                    break;
                case "Primary Merciless":
                    addToVosforCount(4, quantity);
                    break;
                case "Secondary Deadhead":
                    addToVosforCount(4, quantity);
                    break;
                case "Secondary Dexterity":
                    addToVosforCount(4, quantity);
                    break;
                case "Secondary Merciless":
                    addToVosforCount(4, quantity);
                    break;
                // steel path arcane set.
                // quills arcane set.
                case "Magus Vigor":
                    addToVosforCount(1, quantity);
                    break;
                case "Virtous Null":
                    addToVosforCount(1, quantity);
                    break;
                case "Magus Husk":
                    addToVosforCount(1, quantity);
                    break;
                case "Virtous Tempo":
                    addToVosforCount(1, quantity);
                    break;
                case "Virtous Fury":
                    addToVosforCount(3, quantity);
                    break;
                case "Magus Cadence":
                    addToVosforCount(3, quantity);
                    break;
                case "Magus Cloud":
                    addToVosforCount(3, quantity);
                    break;
                case "Magus Elevate":
                    addToVosforCount(7, quantity);
                    break;
                case "Magus Nourish":
                    addToVosforCount(7, quantity);
                    break;
                case "Magus Replenish":
                    addToVosforCount(3, quantity);
                    break;
                case "Virtous Ghost":
                    addToVosforCount(7, quantity);
                    break;
                case "Virtous Shadow":
                    addToVosforCount(7, quantity);
                    break;
                case "Virtous Strike":
                    addToVosforCount(3, quantity);
                    break;
                // quills arcane set.
                // vox solaris arcane set.
                case "Virtous Spike":
                    addToVosforCount(1, quantity);
                    break;
                case "Virtous Surge":
                    addToVosforCount(1, quantity);
                    break;
                case "Virtous Forge":
                    addToVosforCount(3, quantity);
                    break;
                case "Virtous Trojan":
                    addToVosforCount(3, quantity);
                    break;
                case "Magus Accelerant":
                    addToVosforCount(1, quantity);
                    break;
                case "Magus Anomaly":
                    addToVosforCount(1, quantity);
                    break;
                case "Magus Destruct":
                    addToVosforCount(7, quantity);
                    break;
                case "Magus Drive":
                    addToVosforCount(1, quantity);
                    break;
                case "Magus Firewall":
                    addToVosforCount(1, quantity);
                    break;
                case "Magus Glitch":
                    addToVosforCount(3, quantity);
                    break;
                case "Magus Lockdown":
                    addToVosforCount(7, quantity);
                    break;
                case "Magus Melt":
                    addToVosforCount(7, quantity);
                    break;
                case "Magus Overload":
                    addToVosforCount(1, quantity);
                    break;
                case "Magus Repair":
                    addToVosforCount(3, quantity);
                    break;
                case "Magus Revert":
                    addToVosforCount(7, quantity);
                    break;
                // vox solaris arcane set.
                // zariman arcane set.
                case "Cascadia Accuracy":
                    addToVosforCount(6, quantity);
                    break;
                case "Emergence Savior":
                    addToVosforCount(6, quantity);
                    break;
                case "Eternal Eradicate":
                    addToVosforCount(6, quantity);
                    break;
                case "Fractalized Reset":
                    addToVosforCount(6, quantity);
                    break;
                case "Molt Vigor":
                    addToVosforCount(6, quantity);
                    break;
                case "Cascadia Flare":
                    addToVosforCount(6, quantity);
                    break;
                case "Eternal Onslaught":
                    addToVosforCount(6, quantity);
                    break;
                case "Cascadia Empowered":
                    addToVosforCount(6, quantity);
                    break;
                case "Emergence Renewed":
                    addToVosforCount(6, quantity);
                    break;
                case "Molt Efficiency":
                    addToVosforCount(6, quantity);
                    break;
                case "Eternal Logistics":
                    addToVosforCount(6, quantity);
                    break;
                case "Molt Reconstruct":
                    addToVosforCount(6, quantity);
                    break;
                case "Cascadia Overcharge":
                    addToVosforCount(6, quantity);
                    break;
                case "Emergence Dissipate":
                    addToVosforCount(6, quantity);
                    break;
                case "Molt Augmented":
                    addToVosforCount(6, quantity);
                    break;
                // zariman arcane set.
            }
            label.setText("Total" + " " + numberFormat.format(getData().getGrandTotalVosfor()));
            getData().clearGrandTotalVosforCount();
        }
        catch (Exception e) {
            label.setText("Error. Please make sure you select an arcane and quantity");
        }
    }

    /**
     * this addToVosforCount() method fixes some issues with the vosfor calculations.
     * @param value // how much the arcanes are worth in vosfor.
     * @param quantity the amount of arcanes being broken down.
     */

    private void addToVosforCount(int value, int quantity){
        getData().addToTotalVosforCount(getData().getVosforRates().get(value), quantity);
        getData().addToGrandTotalVosforCount();
    }

    /**
     * this clearDataEvent() clears the data.
     */

    private void clearDataEvent() {
        getData().clearTotalVosforCount();
        getData().clearGrandTotalVosforCount();
        arcaneQuantity.clear();
        listOfArcanes.clear();
        label.setText("");
        arcaneSetList.setItems(null);
        clearSelectedFilter(null);
    }

    /**
     * this clearSelectedFilter() method clears the filters for the arcane sets.
     * @param filter the selected filter being cleared.
     */

    private void clearSelectedFilter(String filter){
        if(!"eidolon".equals(filter)){
            eidolonArcaneSetFilter.setSelected(false);
        }
        if(!"cetus".equals(filter)){
            cetusArcaneSetFilter.setSelected(false);
        }
        if(!"arbitration".equals(filter)){
            arbitrationArcaneSetFilter.setSelected(false);
        }if(!"steelpath".equals(filter)){
            steelPathArcaneSetFilter.setSelected(false);
        }
        if(!"zariman".equals(filter)){
            zarimanArcaneSetFilter.setSelected(false);
        }
        if(!"quills".equals(filter)){
            quillsArcaneSetFilter.setSelected(false);
        }
        if(!"necralisk".equals(filter)){
            necraliskArcaneSetFilter.setSelected(false);
        }
        if(!"duviri".equals(filter)){
            duviriArcaneSetFilter.setSelected(false);
        }
        if(!"cavia".equals(filter)){
            caviaArcaneSetFilter.setSelected(false);
        }
        if(!"lua".equals(filter)){
            luaArcaneSetFilter.setSelected(false);
        }
        if(!"fortuna".equals(filter)){
            fortunaArcaneSetFilter.setSelected(false);
        }
        if(!"mirror".equals(filter)){
            mirrorDefenseArcaneSetFilter.setSelected(false);
        }
        if(!"plague".equals(filter)){
            plagueStarArcaneSetFilter.setSelected(false);
        }
        if(!"vox".equals(filter)){
            voxSolarisArcaneSetFilter.setSelected(false);
        }
    }

    /**
     * this main() method runs the code.
     * @param args the application being run.
     */

    public static void main(String[] args) {
        launch();
    }

}