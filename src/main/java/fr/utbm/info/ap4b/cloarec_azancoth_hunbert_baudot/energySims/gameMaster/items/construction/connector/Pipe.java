package fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.connector;

import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.ConstructionType;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.Resource;

import java.awt.*;

public class Pipe extends Connector{

    public  Pipe(){
        super();
        this.setConstructionType(ConstructionType.PIPE);
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
