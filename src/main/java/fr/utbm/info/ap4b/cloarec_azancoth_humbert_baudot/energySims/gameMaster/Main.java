package fr.utbm.info.ap4b.cloarec_azancoth_humbert_baudot.energySims.gameMaster;

import fr.utbm.info.ap4b.cloarec_azancoth_humbert_baudot.energySims.gameMaster.items.construction.ConstructionType;
import fr.utbm.info.ap4b.cloarec_azancoth_humbert_baudot.energySims.gameMaster.items.land.Map;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Map m = new Map(8, 5);

        m.build(new Point(1,1), ConstructionType.PYLON);

        System.out.println(m);




    }
}
