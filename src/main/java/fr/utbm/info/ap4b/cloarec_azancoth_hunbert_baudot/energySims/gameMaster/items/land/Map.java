package fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.land;

import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.land.Plot;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.Inventory;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.Resource;

import javax.swing.*;
import java.awt.*;

/**
 * class that represent the map of the game
 *
 * @author Florian CLOAREC
 */
public class Map {
    private final int mapWidth;
    private final int mapHeight;

    private Plot[][] casesTable;

    private Inventory inventory;

    public Map(int mapWidth, int mapHeight){
        this.inventory = new Inventory();
        this.mapWidth = mapWidth;
        this.mapHeight = mapHeight;
        this.casesTable = new Plot[this.mapWidth][this.mapHeight];
        for (int i = 0; i < this.mapWidth; i++) {
            for (int j = 0; j < this.mapHeight; j++) {
                this.casesTable[i][j] = new Plot();
            }
        }
    }

    public void build(Point position, Class constructionType) {

    }

    public void update(){
        for (int i = 0; i < this.mapWidth; i++) {
            for (int j = 0; j < this.mapHeight; j++) {
                this.casesTable[i][j].update();
            }
        }
    }

    public Resource destroyConstruction(Point position){
        return this.casesTable[position.x][position.y].destroy();
    }


}
