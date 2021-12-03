package fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.land;

import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.Construction;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.ConstructionType;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.building.Building;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.connector.Connector;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.connector.ElectricalNetwork;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.connector.Pylon;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.Inventory;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.Resource;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * class that represent the map of the game
 *
 * @author Florian CLOAREC
 */
public class Map {
    private final int mapWidth;
    private final int mapHeight;

    private Plot[][] casesTable;
    private List<ElectricalNetwork> electricalNetworks;

    private Inventory inventory;

    public Map(int mapWidth, int mapHeight){
        this.inventory = new Inventory();
        this.electricalNetworks = new ArrayList<>();
        this.mapWidth = mapWidth;
        this.mapHeight = mapHeight;
        this.casesTable = new Plot[this.mapWidth][this.mapHeight];
        for (int i = 0; i < this.mapWidth; i++) {
            for (int j = 0; j < this.mapHeight; j++) {
                this.casesTable[i][j] = new Plot();
            }
        }
    }

    @Override
    public String toString() {
        return "Map :" +
                "\nmapWidth=" + mapWidth +
                ", \nmapHeight=" + mapHeight +
                ", \ncasesTable=" + Arrays.toString(casesTable) +
                ", \nelectricalNetworks=" + electricalNetworks +
                ", \ninventory=" + inventory;
    }

    public void build(Point position, ConstructionType constructionType) {
        this.casesTable[position.x][position.y].build(constructionType);
        this.update();
    }

    public void update(){
        for (int i = 0; i < this.mapWidth; i++) {
            for (int j = 0; j < this.mapHeight; j++) {
                this.casesTable[i][j].update();
            }
        }
    }

    private void updateElectricalNetwork(){
        for (int i = 0; i < this.mapWidth; i++) {
            for (int j = 0; j < this.mapHeight; j++) {
                Construction construction = this.casesTable[i][j].getConstruction();
                if (construction.getClass() == Pylon.class){
                    Connector connector = (Connector) construction;
                    for (int k = 0; k < this.mapWidth; k++) {
                        for (int l = 0; l < this.mapHeight; l++) {
                            Construction otherConstruction = this.casesTable[k][l].getConstruction();
                            if (otherConstruction.getClass() == Pylon.class && Math.sqrt(Math.pow(i-k, 2) + Math.pow(j-l,2)) <= 4){
                                connector.addConnectorNeighbours((Connector) otherConstruction);
                            }
                            if (otherConstruction.getClass() == Building.class && Math.sqrt(Math.pow(i-k, 2) + Math.pow(j-l,2)) < 2){
                               connector.addBuildingNeighbours((Building) otherConstruction);
                            }


                        }
                    }
                }
            }
        }
    }

    public Resource destroyConstruction(Point position){
        Resource  resource = this.casesTable[position.x][position.y].destroy();
        this.update();
        return  resource;
    }


}
