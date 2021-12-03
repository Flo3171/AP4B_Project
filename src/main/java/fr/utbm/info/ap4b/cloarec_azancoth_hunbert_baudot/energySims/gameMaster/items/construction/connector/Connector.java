package fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.connector;

import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.building.Building;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.Construction;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Connector extends Construction {

    private List<Connector> connectorNeighbours;
    private List<Building> buildingNeighbours;

    public Connector(Point position){
        super(position);
        this.connectorNeighbours = new ArrayList<>();
        this.buildingNeighbours = new ArrayList<>();
    }

    public void addConnectorNeighbours(Connector newElem){
        if (!this.connectorNeighbours.contains(newElem)){
            this.connectorNeighbours.add(newElem);
        }
    }

    public void addBuildingNeighbours(Building newElem){
        if(!this.buildingNeighbours.contains(newElem)){
            this.buildingNeighbours.add(newElem);
        }
    }


}
