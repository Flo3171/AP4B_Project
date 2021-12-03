package fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.building;

import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.ConstructionType;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.Resource;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.ResourceType;

import java.awt.*;

public class House extends Building{

    private final int inhabitant;

    public House(){
        super(2, 1);
        this.setConstructionType(ConstructionType.HOUSE);
        this.inhabitant = 4;
        this.getInput().add(new Resource(2, ResourceType.WATER));
        this.getOutput().add(new Resource(10, ResourceType.EUROS));
        this.getOutput().add(new Resource(2,  ResourceType.SATISFACTION));
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
