package fr.utbm.info.ap4b.cloarec_azancoth_humbert_baudot.energySims.gameMaster.items.construction.building;

import fr.utbm.info.ap4b.cloarec_azancoth_humbert_baudot.energySims.gameMaster.items.construction.ConstructionType;
import fr.utbm.info.ap4b.cloarec_azancoth_humbert_baudot.energySims.gameMaster.items.ressource.Resource;

import java.awt.*;

public class NuclearPlant extends Building{

    public NuclearPlant(Point position){
        super(1, 30, position);
        this.setConstructionType(ConstructionType.NUCLEAR_PLANT);
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
