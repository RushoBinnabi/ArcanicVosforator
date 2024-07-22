vosforRates = [3, 12, 14, 18, 20, 21, 22, 24, 28, 84, 98]


arbitrationArcaneSet = ["Arcane Blade Charger", "Arcane Bodyguard", "Arcane Pistoleer",
                        "Arcane Primary Charger", "Arcane Tanker"]

mirrorDefenseArcaneSet = ["Arcane Double Back", "Arcane Steadfast", "Primary Plated Round",
                          "Secondary Encumber", "Secondary Kinship"]

caviaArcaneSet = ["Melee Fortification", "Melee Retaliation", "Melee Animosity",
                  "Melee Exposure", "Melee Influence", "Melee Vortex",
                  "Melee Crescendo", "Melee Duplicate"]

plagueStarArcaneSet = ["Exodia Contagion", "Exodia Epidemic"]

cetusArcaneSet = ["Exodia Brave", "Exodia Force", "Exodia Hunt", "Exodia Might", "Exodia Triumph", "Exodia Valor"]

duviriArcaneSet = ["Akimbo Slip Shot", "Arcane Intention", "Arcane Power Ramp", "Magus Aggress",
                   "Primary Blight", "Primary Exhilarate", "Primary Obstruct", "Secondary Outburst",
                   "Shotgun Vendetta", "Arcane Reaper", "Longbow Sharpshot", "Secondary Shiver"]

fortunaArcaneSet = ["Pax Bolt", "Pax Charge", "Pax Seeker", "Pax Soar"]

luaConjunctionArcaneSet = ["Arcane Blessing", "Arcane Rise", "Conjunction Voltage", "Primary Frostbite"]

necraliskArcaneSet = ["Residual Boils", "Residual Malodor", "Residual Shock", "Residual Viremia",
                      "Theorem Contagion", "Theorem Demulcent", "Theorem Infection"]

eidolonArcaneSet = ["Arcane Acceleration", "Arcane Aegis", "Arcane Agility", "Arcane Arachne",
                    "Arcane Avenger", "Arcane Awakening", "Arcane Barrier", "Arcane Consequence",
                    "Arcane Deflection", "Arcane Energize", "Arcane Eruption", "Arcane Fury",
                    "Arcane Grace", "Arcane Guardian", "Arcane Healing", "Arcane Ice", "Arcane Momentum",
                    "Arcane Nullifier", "Arcane Phantasm", "Arcane Precision", "Arcane Pulse", "Arcane Rage",
                    "Arcane Resistance", "Arcane Strike", "Arcane Tempo,", "Arcane Trickery", "Arcane Ultimatum",
                    "Arcane Velocity", "Arcane Victory", "Arcane Warmth"]

steelPathArcaneSet = ["Primary Deadhead", "Primary Dexterity", "Primary Merciless", "Secondary Deadhead",
                      "Secondary Dextirity", "Secondary Merciless.", "Secondary Dextirity", "Secondary Merciless"]

quillsArcaneSet = ["Magus Vigor, ""Virtous Null", "Magus Husk", "Virtous Tempo", "Virtous Fury,", "Magus Cadence"
                                                                                                  "Magus Cloud",
                   "Magus Elevant", "Magus Nourish", "Magus Replenish", "Virtuous Ghost",
                   "Virtuous Shadow", "Virtous Strike"]

voxSolarisArcaneSet = ["Virtous Spike", "Virtous Surge", "Virtuous Forge", "Virtuous Trojan", "Magus Accelerant",
                       "Magus Anomaly", "Magus Destruct", "Magus Drive", "Magus Firewall", "Magus Glitch",
                       "Magus Lockdown", "Magus Melt", "Magus Overload", "Magus Repair", "Magus Revert"]

zarimanArcaneSet = ["Cascadia Accuracy", "Emergence Savior", "Eternal Eradicate", "Fractilized Reset", "Molt Vigor",
                    "Cascadia Flare", "Eternal Onslaught", "Cascadia Empowered", "Emergence Renewed", "Molt Efficiency",
                    "Eternal Logistics", "Molt Reconstruct", "Cascadia Overcharge", "Emergence Dissipate",
                    "Molt Augmented"]

totalVosfor = 0
totalVosfor = int(totalVosfor)

grandTotalVosforCount = 0
grandTotalVosforCount = int(grandTotalVosforCount)

def addToTotalVosforCount(vosforRate):
    global totalVosfor
    totalVosfor += int(vosforRate)

def getTotalVosforCount():
    return totalVosfor

def clearTotalVosforCount():
    global totalVosfor
    totalVosfor = 0

def addToGrandTotalVosforCount(vosforRate):
    global grandTotalVosforCount
    grandTotalVosforCount += int(vosforRate)

def getGrandTotalVosforCount():
    return grandTotalVosforCount

def clearGrandTotalVosforCount():
    global grandTotalVosforCount
    grandTotalVosforCount = 0