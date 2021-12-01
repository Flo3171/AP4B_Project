package fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.building;

import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.Resource;

import java.awt.*;

public abstract class Construction {

    private Point position;


    public abstract void build(Point position);

    public abstract void update();

    public abstract Resource destroy();

}
