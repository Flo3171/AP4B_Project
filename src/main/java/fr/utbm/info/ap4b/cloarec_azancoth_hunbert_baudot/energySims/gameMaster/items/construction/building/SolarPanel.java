package fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.building;

import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.ConstructionType;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.Resource;

import java.awt.*;

public class SolarPanel extends Building{

    public SolarPanel() {
        super(0, 3);
        this.setConstructionType(ConstructionType.SOLAR_PANEL);
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
