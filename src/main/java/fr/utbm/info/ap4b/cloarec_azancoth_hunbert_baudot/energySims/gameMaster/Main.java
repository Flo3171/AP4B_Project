package fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster;

import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.ConstructionType;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.land.Map;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.Inventory;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.Resource;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.ResourceType;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Map m = new Map(5, 5);

        m.build(new Point(1,1), ConstructionType.PYLON);

        System.out.println(m);




    }
}
