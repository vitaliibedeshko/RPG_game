package com.griddynamics.rpg.model.npc.race.impl;

import com.griddynamics.rpg.model.npc.NpcRaceType;
import com.griddynamics.rpg.model.npc.race.NpcRace;

public class Elemental implements NpcRace {

    @Override
    public String toString() {
        return NpcRaceType.ELEMENTAL.name();
    }
}
