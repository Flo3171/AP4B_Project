package fr.utbm.info.ap4b.cloarec_azancoth_humbert_baudot.energySims.gameMaster.items.construction.connector;

import fr.utbm.info.ap4b.cloarec_azancoth_humbert_baudot.energySims.gameMaster.items.construction.ConstructionType;
import fr.utbm.info.ap4b.cloarec_azancoth_humbert_baudot.energySims.gameMaster.items.ressource.Resource;

import java.awt.*;

public class Pylon extends Connector{

    public Pylon(Point position){
        super(position);
        this.setConstructionType(ConstructionType.PYLON);

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
