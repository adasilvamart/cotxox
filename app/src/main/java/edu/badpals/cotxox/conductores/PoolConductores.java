package edu.badpals.cotxox.conductores;

import java.util.List;

public class PoolConductores {

    private List<Conductor> poolConductores;

    public PoolConductores(List<Conductor> poolConductores) {
        this.poolConductores = poolConductores;
    }

    public List<Conductor> getPoolConductores() {
        return poolConductores;
    }

    public Conductor asignarConductor(){
        return poolConductores.stream()
                              .filter(c -> !c.isOcupado())
                              .toList()
                              .getFirst();
    }
}
