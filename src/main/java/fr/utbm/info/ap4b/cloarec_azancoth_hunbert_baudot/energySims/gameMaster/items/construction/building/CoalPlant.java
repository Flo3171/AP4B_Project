package fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.building;

import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.ConstructionType;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.Resource;

import java.awt.*;

public class CoalPlant extends Building{

    public CoalPlant() {
        super(10, 10);
        this.setConstructionType(ConstructionType.COAL_PLANT);
    }

    @Override
    public void build(Point position) {

    }

    @Override
    public void update() {

    }

    @Override
    public Resource destroy() {
        return null;
    }
}
