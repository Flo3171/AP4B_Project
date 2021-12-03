package fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction;

import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.Resource;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.ResourceType;

import java.awt.*;

public class Tree extends Construction{

    public Tree(Point position){
        super(position);
        setConstructionType(ConstructionType.TREE);
    }

    @Override
    public void build(Point position) {

    }

    @Override
    public void update() {

    }

    @Override
    public Resource destroy() {
        return new Resource(10, ResourceType.WOOD);
    }
}