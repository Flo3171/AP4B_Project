package fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.connector;

import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.building.Building;

import java.util.ArrayList;
import java.util.List;

public class ElectricalNetwork {
    private List<Pylon> pylonList;
    private List<Building> buildingList;

    private double availableElectricity;

    public ElectricalNetwork(){
        this.pylonList = new ArrayList<>();
        this.buildingList = new ArrayList<>();
        this.availableElectricity = 0;
    }


}
