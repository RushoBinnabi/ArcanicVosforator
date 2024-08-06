/**
 * Name: Rusho Binnabi
 * Date: 8/6/2024
 * Project: Arcanic Vosforator
 * Contact Information: RushoBinnabi123@yahoo.com
 */

package org.example.arcanicvosforator;

import java.util.ArrayList;

public class ArcanicVosforatorData {

    // this ArcanicVosforatorData data has the data needed for the Arcanic Vosforator project to work.

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

    /**
     * this getTotalVosforCount() method gets the total vosfor count.
     * @return the total vosfor count.
     */

    public int getTotalVosforCount() {
        return totalVosfor;
    }

    /**
     * this addToTotalVosforCount() method adds to the total vosfor count for the arcanes.
     * @param vosforRate how much the arcanes are worth in vosfor.
     * @param arcaneQuantity the number of arcanes being broken down.
     */

    public void addToTotalVosforCount(int vosforRate, int arcaneQuantity) {
        totalVosfor += (vosforRate * arcaneQuantity);
    }

    /**
     * this clearTotalVosforCount() method clears the total vosfor.
     */

    public void clearTotalVosforCount() {
        totalVosfor = 0;
    }

    /**
     * this getGrandTotalVosfor() method gets the grand total amount of vosfor.
     * @return the grand total amount of vosfor.
     */

    public int getGrandTotalVosfor() {
        return grandTotalVosforCount;
    }

    /**
     * this addToGrandTotalVosforCount() method adds to the grand total vosfor count every time arcanes gets broken down.
     */

    public void addToGrandTotalVosforCount() {
        grandTotalVosforCount += getTotalVosforCount();
    }

    /**
     * this clearGrandTotalVosforCount() method clears the grand total vosfor count.
     */

    public void clearGrandTotalVosforCount() {
        grandTotalVosforCount = 0;
    }

    /**
     * empty constructor.
     */

    public ArcanicVosforatorData() {

    }

    /**
     * this getVosforRates() method gets the array list of vosfor values for the arcanes.
     * @return the array list of vosfor values for the arcanes.
     */

    public ArrayList<Integer> getVosforRates() {
        return vosforRates;
    }

    /**
     * this getArbitrationArcaneSet() method gets the array list of the arbitration arcane set.
     * @return the array list of the arbitration arcane set.
     */

    public ArrayList<String> getArbitrationArcaneSet() {
        return arbitrationArcaneSet;
    }

    /**
     * this getMirrorDefenseArcaneSet() method gets the array list of the mirror defense arcane set.
     * @return the array list of the mirror defense arcane set.
     */

    public ArrayList<String> getMirrorDefenseArcaneSet() {
        return mirrorDefenseArcaneSet;
    }

    /**
     * this getCaviaArcaneSet() method gets the array list of the cavia arcane set.
     * @return the array list of the cavia arcane set.
     */

    public ArrayList<String> getCaviaArcaneSet() {
        return caviaArcaneSet;
    }

    /**
     * this getPlagueStarArcaneSet() method gets the array list of the plague star arcane set.
     * @return the array list of the plague star arcane set.
     */

    public ArrayList<String> getPlagueStarArcaneSet() {
        return plagueStarArcaneSet;
    }

    /**
     * this getCetusArcaneSet() method gets the array list of the cetus arcane set.
     * @return the array list of the cetus arcane set.
     */

    public ArrayList<String> getCetusArcaneSet() {
        return cetusArcaneSet;
    }

    /**
     * this getDuviriArcaneSet() method gets the array list of the duviri arcane set.
     * @return the array list of the duviri arcane set.
     */

    public ArrayList<String> getDuviriArcaneSet() {
        return duviriArcaneSet;
    }

    /**
     * this getFortunaArcaneSet() method gets the array list of the fortuna arcane set.
     * @return the array list of the fortuna arcane set.
     */

    public ArrayList<String> getFortunaArcaneSet() {
        return fortunaArcaneSet;
    }

    /**
     * this getLuaArcaneSet() method gets the array list of the lua arcane set.
     * @return the array list of the lua arcane set.
     */

    public ArrayList<String> getLuaArcaneSet() {
        return luaConjunctionArcaneSet;
    }

    /**
     * this getNecraliskArcaneSet() method gets the array list of the necralisk arcane set.
     * @return the array list of the necralisk arcane set.
     */

    public ArrayList<String> getNecraliskArcaneSet() {
        return necraliskArcaneSet;
    }

    /**
     * this getEidolonArcaneSet() method gets the array list of the eidolon arcane set.
     * @return the array list of the eidolon arcane set.
     */

    public ArrayList<String> getEidolonArcaneSet() {
        return eidolonArcaneSet;
    }

    /**
     * this getSteelPathArcaneSet() method gets the array list of the steel path arcane set.
     * @return the array list of the steel path arcane set.
     */

    public ArrayList<String> getSteelPathArcaneSet() {
        return steelPathArcaneSet;
    }

    /**
     * this getQuillsArcaneSet() method gets the array list of the quills arcane set.
     * @return the array list of the quills arcane set.
     */

    public ArrayList<String> getQuillsArcaneSet() {
        return quillsArcaneSet;
    }

    /**
     * this getVoxSolarisArcaneSet() method gets the array list of the vox solaris arcane set.
     * @return the array list of the vox solaris arcane set.
     */

    public ArrayList<String> getVoxSolarisArcaneSet() {
        return voxSolarisArcaneSet;
    }

    /**
     * this getZarimanArcaneSet() method gets the array list of the zariman arcane set.
     * @return the array list of the zariman arcane set.
     */

    public ArrayList<String> getZarimanArcaneSet() {
        return zarimanArcaneSet;
    }

    /**
     * this setVosforRates() method sets the vosfor values for the arcane sets.
     */

    public void setVosforRates() {
        getVosforRates().add(3); // index 0
        getVosforRates().add(12); // index 1
        getVosforRates().add(14); // index 2
        getVosforRates().add(18); // index 3
        getVosforRates().add(20); // index 4
        getVosforRates().add(21); // index 5
        getVosforRates().add(22); // index 6
        getVosforRates().add(24); // index 7
        getVosforRates().add(28); // index 8
        getVosforRates().add(84); // index 9
        getVosforRates().add(98); // index 10
        getVosforRates().add(0); // index 11.
    }

    /**
     * this setArbitrationArcaneSet() method sets the array list for the arbitration arcane set.
     */

    public void setArbitrationArcaneSet() {
        getArbitrationArcaneSet().add("Arcane Blade Charger");
        getArbitrationArcaneSet().add("Arcane Bodyguard");
        getArbitrationArcaneSet().add("Arcane Pistoleer");
        getArbitrationArcaneSet().add("Arcane Primary Charger");
        getArbitrationArcaneSet().add("Arcane Tanker");
    }

    /**
     * this setMirrorDefenseArcaneSet() method sets the array list for the mirror defense arcane set.
     */

    public void setMirrorDefenseArcaneSet() {
        getMirrorDefenseArcaneSet().add("Arcane Double Back");
        getMirrorDefenseArcaneSet().add("Arcane Steadfast");
        getMirrorDefenseArcaneSet().add("Primary Plated Round");
        getMirrorDefenseArcaneSet().add("Secondary Encumber");
        getMirrorDefenseArcaneSet().add("Secondary Kinship");
    }

    /**
     * this setCaviaArcaneSet() method sets the array list for the cavia arcane set.
     */

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

    /**
     * this setPlagueStarArcaneSet() method sets the array list for the plague star arcane set.
     */

    public void setPlagueStarArcaneSet() {
        getPlagueStarArcaneSet().add("Exodia Contagion");
        getPlagueStarArcaneSet().add("Exodia Epidemic");
    }

    /**
     * this setCetusArcaneSet() method sets the array list for the cetus arcane set.
     */

    public void setCetusArcaneSet() {
        getCetusArcaneSet().add("Exodia Brave");
        getCetusArcaneSet().add("Exodia Force");
        getCetusArcaneSet().add("Exodia Hunt");
        getCetusArcaneSet().add("Exodia Might");
        getCetusArcaneSet().add("Exodia Triumph");
        getCetusArcaneSet().add("Exodia Valor");
    }

    /**
     * this setDuviriArcaneSet() method sets the array list for the duviri arcane set.
     */

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

    /**
     * this setFortunaArcaneSet() method sets the array list for the fortuna arcane set.
     */

    public void setFortunaArcaneSet() {
        getFortunaArcaneSet().add("Pax Bolt");
        getFortunaArcaneSet().add("Pax Charge");
        getFortunaArcaneSet().add("Pax Seeker");
        getFortunaArcaneSet().add("Pax Soar");
    }

    /**
     * this setLuaArcaneSet() method sets the array list for the lua arcane set.
     */

    public void setLuaArcaneSet() {
        getLuaArcaneSet().add("Arcane Blessing");
        getLuaArcaneSet().add("Arcane Rise");
        getLuaArcaneSet().add("Conjunction Voltage");
        getLuaArcaneSet().add("Primary Frostbite");
    }

    /**
     * this setNecraliskArcaneSet() method sets the array list for the necralisk arcane set.
     */

    public void setNecraliskArcaneSet() {
        getNecraliskArcaneSet().add("Residual Boils");
        getNecraliskArcaneSet().add("Residual Malodor");
        getNecraliskArcaneSet().add("Residual Shock");
        getNecraliskArcaneSet().add("Residual Viremia");
        getNecraliskArcaneSet().add("Theorem Contagion");
        getNecraliskArcaneSet().add("Theorem Demulcent");
        getNecraliskArcaneSet().add("Theorem Infection");
    }

    /**
     * this setEidolonArcaneSet() method sets the array list for the eidolon arcane set.
     */

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

    /**
     * this setSteelPathArcaneSet() method sets the array list for the steel path arcane set.
     */

    public void setSteelPathArcaneSet() {
        getSteelPathArcaneSet().add("Primary Deadhead");
        getSteelPathArcaneSet().add("Primary Dexterity");
        getSteelPathArcaneSet().add("Primary Merciless");
        getSteelPathArcaneSet().add("Secondary Deadhead");
        getSteelPathArcaneSet().add("Secondary Dexterity");
        getSteelPathArcaneSet().add("Secondary Merciless");
    }

    /**
     * this setQuillsArcaneSet() method sets the array list for the quills arcane set.
     */

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

    /**
     * this setVoxSolarisArcaneSet() method sets the array list for the vox solaris arcane set.
     */

    public void setVoxSolarisArcaneSet() {
        getVoxSolarisArcaneSet().add("Virtous Spike");
        getVoxSolarisArcaneSet().add("Virtous Surge");
        getVoxSolarisArcaneSet().add("Virtous Forge");
        getVoxSolarisArcaneSet().add("Virtous Trojan");
        getVoxSolarisArcaneSet().add("Magus Accelerant");
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

    /**
     * this setZarimanArcaneSet() method sets the array list for the zariman arcane set.
     */

    public void setZarimanArcaneSet() {
        getZarimanArcaneSet().add("Cascadia Accuracy");
        getZarimanArcaneSet().add("Emergence Savior");
        getZarimanArcaneSet().add("Eternal Eradicate");
        getZarimanArcaneSet().add("Fractalized Reset");
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