package fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction;

import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.Resource;

import java.awt.*;

public abstract class Construction {

    private Point position;

    private ConstructionType constructionType;


    @Override
    public String toString() {
        return constructionType.toString();
    }

    public void setConstructionType(ConstructionType constructionType) {
        this.constructionType = constructionType;
    }

    public abstract void build(Point position);

    public abstract void update();

    public abstract Resource destroy();

}
