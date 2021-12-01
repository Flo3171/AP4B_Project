package fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster;

import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.land.Map;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.Inventory;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.Resource;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.ResourceType;

public class Main {

    public static void main(String[] args) {
        Map m = new Map(5, 5);
        Inventory i = new Inventory();
        i.addResource(new Resource(1, ResourceType.COAL));
        i.addResource(new Resource(-2, ResourceType.COAL));
        i.addResource(new Resource(-1, ResourceType.COAL));




    }
}
