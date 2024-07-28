package org.example.arcanicvosforator;

import java.util.ArrayList;

public class ArcanicVosforatorData {

    private final ArrayList<Integer> vosforRates = new ArrayList<>();
    private final ArrayList<String> arbitrationArcaneSet = new ArrayList<>();
    private final ArrayList<String> mirrorDefenseArcaneSet = new ArrayList<>();
    private final ArrayList<String> caviaArcaneSet = new ArrayList<>();
    private final ArrayList<String> plagueStarArcaneSet = new ArrayList<>();
    private final ArrayList<String> cetusArcaneSet = new ArrayList<>();
    private final ArrayList<String> duviriArcaneSet = new ArrayList<>();
    private final ArrayList<String> fortunaArcaneSet = new ArrayList<>();
    private final ArrayList<String> luaConjunctionArcaneSet = new ArrayList<>();
    private final ArrayList<String> necraliskArcaneSet = new ArrayList<>();
    private final ArrayList<String> eidolonArcaneSet = new ArrayList<>();
    private final ArrayList<String> steelPathArcaneSet = new ArrayList<>();
    private final ArrayList<String> quillsArcaneSet = new ArrayList<>();
    private final ArrayList<String> voxSolarisArcaneSet = new ArrayList<>();
    private final ArrayList<String> zarimanArcaneSet = new ArrayList<>();
    static final int UI_HEIGHT = 620;
    static final int UI_WIDTH = 800;

    private int totalVosfor = 0;
    private int grandTotalVosforCount = 0;

    public int getTotalVosforCount() {
        return totalVosfor;
    }

    public void addToTotalVosforCount(int vosforRate, int arcaneQuantity) {
        totalVosfor += (vosforRate * arcaneQuantity);
    }

    public void clearTotalVosforCount() {
        totalVosfor = 0;
    }

    public int getGrandTotalVosfor() {
        return grandTotalVosforCount;
    }

    public void addToGrandTotalVosforCount() {
        grandTotalVosforCount += getTotalVosforCount();
    }

    public void clearGrandTotalVosforCount() {
        grandTotalVosforCount = 0;
    }

    public ArcanicVosforatorData() {

    }

    public ArrayList<Integer> getVosforRates() {
        return vosforRates;
    }

    public ArrayList<String> getArbitrationArcaneSet() {
        return arbitrationArcaneSet;
    }

    public ArrayList<String> getMirrorDefenseArcaneSet() {
        return mirrorDefenseArcaneSet;
    }

    public ArrayList<String> getCaviaArcaneSet() {
        return caviaArcaneSet;
    }

    public ArrayList<String> getPlagueStarArcaneSet() {
        return plagueStarArcaneSet;
    }

    public ArrayList<String> getCetusArcaneSet() {
        return cetusArcaneSet;
    }

    public ArrayList<String> getDuviriArcaneSet() {
        return duviriArcaneSet;
    }

    public ArrayList<String> getFortunaArcaneSet() {
        return fortunaArcaneSet;
    }

    public ArrayList<String> getLuaArcaneSet() {
        return luaConjunctionArcaneSet;
    }

    public ArrayList<String> getNecraliskArcaneSet() {
        return necraliskArcaneSet;
    }

    public ArrayList<String> getEidolonArcaneSet() {
        return eidolonArcaneSet;
    }

    public ArrayList<String> getSteelPathArcaneSet() {
        return steelPathArcaneSet;
    }

    public ArrayList<String> getQuillsArcaneSet() {
        return quillsArcaneSet;
    }

    public ArrayList<String> getVoxSolarisArcaneSet() {
        return voxSolarisArcaneSet;
    }

    public ArrayList<String> getZarimanArcaneSet() {
        return zarimanArcaneSet;
    }

    public void setVosforRates() {
        getVosforRates().add(3);
        getVosforRates().add(12);
        getVosforRates().add(14);
        getVosforRates().add(18);
        getVosforRates().add(20);
        getVosforRates().add(21);
        getVosforRates().add(22);
        getVosforRates().add(24);
        getVosforRates().add(28);
        getVosforRates().add(84);
        getVosforRates().add(98);
    }

    public void setArbitrationArcaneSet() {
        getArbitrationArcaneSet().add("Arcane Blade Charger");
        getArbitrationArcaneSet().add("Arcane Bodyguard");
        getArbitrationArcaneSet().add("Arcane Pistoleer");
        getArbitrationArcaneSet().add("Arcane Primary Charger");
        getArbitrationArcaneSet().add("Arcane Tanker");
    }

    public void setMirrorDefenseArcaneSet() {
        getMirrorDefenseArcaneSet().add("Arcane Double Back");
        getMirrorDefenseArcaneSet().add("Arcane Steadfast");
        getMirrorDefenseArcaneSet().add("Primary Plated Round");
        getMirrorDefenseArcaneSet().add("Secondary Encumber");
        getMirrorDefenseArcaneSet().add("Secondary Kinship");
    }

    public void setCaviaArcaneSet() {
        getCaviaArcaneSet().add("Melee Fortification");
        getCaviaArcaneSet().add("Melee Retaliation");
        getCaviaArcaneSet().add("Melee Animosity");
        getCaviaArcaneSet().add("Melee Exposure");
        getCaviaArcaneSet().add("Melee Influence");
        getCaviaArcaneSet().add("Melee Vortex");
        getCaviaArcaneSet().add("Melee Crescendo");
        getCaviaArcaneSet().add("Melee Duplicate");
    }

    public void setPlagueStarArcaneSet() {
        getPlagueStarArcaneSet().add("Exodia Contagion");
        getPlagueStarArcaneSet().add("Exodia Epidemic");
    }

    public void setCetusArcaneSet() {
        getCetusArcaneSet().add("Exodia Brave");
        getCetusArcaneSet().add("Exodia Force");
        getCetusArcaneSet().add("Exodia Hunt");
        getCetusArcaneSet().add("Exodia Might");
        getCetusArcaneSet().add("Exodia Triumph");
        getCetusArcaneSet().add("Exodia Valor");
    }

    public void setDuviriArcaneSet() {
        getDuviriArcaneSet().add("Akimbo Slip Shot");
        getDuviriArcaneSet().add("Arcane Intention");
        getDuviriArcaneSet().add("Arcane Power Ramp");
        getDuviriArcaneSet().add("Magus Aggress");
        getDuviriArcaneSet().add("Primary Blight");
        getDuviriArcaneSet().add("Primary Exhilarate");
        getDuviriArcaneSet().add("Primary Obstruct");
        getDuviriArcaneSet().add("Secondary Outburst");
        getDuviriArcaneSet().add("Shotgun Vendetta");
        getDuviriArcaneSet().add("Arcane Reaper");
        getDuviriArcaneSet().add("Longbow Sharpshot");
        getDuviriArcaneSet().add("Secondary Shiver");
    }

    public void setFortunaArcaneSet() {
        getFortunaArcaneSet().add("Pax Bolt");
        getFortunaArcaneSet().add("Pax Charge");
        getFortunaArcaneSet().add("Pax Seeker");
        getFortunaArcaneSet().add("Pax Soar");
    }

    public void setLuaArcaneSet() {
        getLuaArcaneSet().add("Arcane Blessing");
        getLuaArcaneSet().add("Arcane Rise");
        getLuaArcaneSet().add("Conjunction Voltage");
        getLuaArcaneSet().add("Primary Frostbite");
    }

    public void setNecraliskArcaneSet() {
        getNecraliskArcaneSet().add("Residual Boils");
        getNecraliskArcaneSet().add("Residual Malodor");
        getNecraliskArcaneSet().add("Residual Shock");
        getNecraliskArcaneSet().add("Residual Viremia");
        getNecraliskArcaneSet().add("Theorem Contagion");
        getNecraliskArcaneSet().add("Theorem Demulcent");
        getNecraliskArcaneSet().add("Theorem Infection");
    }

    public void setEidolonArcaneSet() {
        getEidolonArcaneSet().add("Arcane Acceleration");
        getEidolonArcaneSet().add("Arcane Aegis");
        getEidolonArcaneSet().add("Arcane Agility");
        getEidolonArcaneSet().add("Arcane Arachne");
        getEidolonArcaneSet().add("Arcane Avenger");
        getEidolonArcaneSet().add("Arcane Awakening");
        getEidolonArcaneSet().add("Arcane Barrier");
        getEidolonArcaneSet().add("Arcane Consequence");
        getEidolonArcaneSet().add("Arcane Deflection");
        getEidolonArcaneSet().add("Arcane Energize");
        getEidolonArcaneSet().add("Arcane Eruption");
        getEidolonArcaneSet().add("Arcane Fury");
        getEidolonArcaneSet().add("Arcane Grace");
        getEidolonArcaneSet().add("Arcane Guardian");
        getEidolonArcaneSet().add("Arcane Healing");
        getEidolonArcaneSet().add("Arcane Ice");
        getEidolonArcaneSet().add("Arcane Momentum");
        getEidolonArcaneSet().add("Arcane Nullifier");
        getEidolonArcaneSet().add("Arcane Phantasm");
        getEidolonArcaneSet().add("Arcane Precision");
        getEidolonArcaneSet().add("Arcane Pulse");
        getEidolonArcaneSet().add("Arcane Rage");
        getEidolonArcaneSet().add("Arcane Resistance");
        getEidolonArcaneSet().add("Arcane Strike");
        getEidolonArcaneSet().add("Arcane Tempo");
        getEidolonArcaneSet().add("Arcane Trickery");
        getEidolonArcaneSet().add("Arcane Ultimatum");
        getEidolonArcaneSet().add("Arcane Velocity");
        getEidolonArcaneSet().add("Arcane Victory");
        getEidolonArcaneSet().add("Arcane Warmth");
    }

    public void setSteelPathArcaneSet() {
        getSteelPathArcaneSet().add("Primary Deadhead");
        getSteelPathArcaneSet().add("Primary Dexterity");
        getSteelPathArcaneSet().add("Primary Merciless");
        getSteelPathArcaneSet().add("Secondary Deadhead");
        getSteelPathArcaneSet().add("Secondary Dexterity");
        getSteelPathArcaneSet().add("Secondary Merciless");
    }

    public void setQuillsArcaneSet() {
        getQuillsArcaneSet().add("Magus Vigor");
        getQuillsArcaneSet().add("Virtous Null");
        getQuillsArcaneSet().add("Magus Husk");
        getQuillsArcaneSet().add("Virtous Tempo");
        getQuillsArcaneSet().add("Virtous Fury");
        getQuillsArcaneSet().add("Magus Cadence");
        getQuillsArcaneSet().add("Magus Cloud");
        getQuillsArcaneSet().add("Magus Elevate");
        getQuillsArcaneSet().add("Magus Nourish");
        getQuillsArcaneSet().add("Magus Replenish");
        getQuillsArcaneSet().add("Virtous Ghost");
        getQuillsArcaneSet().add("Virtous Shadow");
        getQuillsArcaneSet().add("Virtous Strike");
    }

    public void setVoxSolarisArcaneSet() {
        getVoxSolarisArcaneSet().add("Virtous Spike");
        getVoxSolarisArcaneSet().add("Virtous Surge");
        getVoxSolarisArcaneSet().add("Virtous Forge");
        getVoxSolarisArcaneSet().add("Virtous Trojan");
        getVoxSolarisArcaneSet().add("Magus Anomaly");
        getVoxSolarisArcaneSet().add("Magus Destruct");
        getVoxSolarisArcaneSet().add("Magus Drive");
        getVoxSolarisArcaneSet().add("Magus Firewall");
        getVoxSolarisArcaneSet().add("Magus Glitch");
        getVoxSolarisArcaneSet().add("Magus Lockdown");
        getVoxSolarisArcaneSet().add("Magus Melt");
        getVoxSolarisArcaneSet().add("Magus Overload");
        getVoxSolarisArcaneSet().add("Magus Repair");
        getVoxSolarisArcaneSet().add("Magus Revert");
    }

    public void setZarimanArcaneSet() {
        getZarimanArcaneSet().add("Cascadia Accuracy");
        getZarimanArcaneSet().add("Emergence Savior");
        getZarimanArcaneSet().add("Eternal Eradicate");
        getZarimanArcaneSet().add("Fractilized Reset");
        getZarimanArcaneSet().add("Molt Vigor");
        getZarimanArcaneSet().add("Cascadia Flare");
        getZarimanArcaneSet().add("Eternal Onslaught");
        getZarimanArcaneSet().add("Cascadia Empowered");
        getZarimanArcaneSet().add("Emergence Renewed");
        getZarimanArcaneSet().add("Eternal Logistics");
        getZarimanArcaneSet().add("Molt Reconstruct");
        getZarimanArcaneSet().add("Cascadia Overcharge");
        getZarimanArcaneSet().add("Emergence Dissipate");
        getZarimanArcaneSet().add("Molt Augmented");
    }

}
