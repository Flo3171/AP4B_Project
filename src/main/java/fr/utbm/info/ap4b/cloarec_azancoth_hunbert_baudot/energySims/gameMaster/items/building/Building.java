package fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.building;

import java.awt.*;

public abstract class Building extends Construction {
    private Point position;

    abstract boolean built(Point position);
}
