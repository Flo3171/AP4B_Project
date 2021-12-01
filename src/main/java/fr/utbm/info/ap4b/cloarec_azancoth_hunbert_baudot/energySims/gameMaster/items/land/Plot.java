package fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.land;

import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.building.Building;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.Resource;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource.ResourceType;

import java.util.Random;

/**
 * class that represent a case on the game map
 *
 * @author Florian CLOAREC
 */
public class Plot {

    private PlotType type;
    private boolean buildable;
    private Building building;
    private Resource undergroundResources;

    public Plot(){
        Random r = new Random();
        int pattern = r.nextInt((10));
        if (pattern <  9){
            /*
             * available to have undergroundResources
             */
            int resources = r.nextInt(3);
            if (resources == 0){

                int resourceType = r.nextInt(20);
                double resourceAmount = r.nextInt(91) + 10;
                if (resourceType < 4){
                    this.undergroundResources = new Resource(resourceAmount, ResourceType.IRON);
                }
                else if (resourceType < 8){
                    this.undergroundResources = new Resource(resourceAmount, ResourceType.COPPER);
                }
                else if (resourceType < 12){
                    this.undergroundResources = new Resource(resourceAmount, ResourceType.COAL);
                }
                else if (resourceType < 13){
                    this.undergroundResources = new Resource(resourceAmount, ResourceType.URANIUM);
                }
                else if (resourceType < 15){
                    this.undergroundResources = new Resource(resourceAmount, ResourceType.WATER);
                }
                else if (resourceType < 18){
                    this.undergroundResources = new Resource(resourceAmount, ResourceType.OIL);
                }
                else {
                    this.undergroundResources = new Resource(resourceAmount, ResourceType.GAS);
                }

            }
            else{
                this.undergroundResources = null;
            }

            this.buildable = true;
            this.building = null;

            if (pattern < 3){
                this.type = PlotType.GRASS;
                this.building = new Building(); /* TODO : ajouter un arbre*/
                this.buildable = false;

            }
            else if (pattern < 4){
                this.type = PlotType.SAND;
            }
            else if (pattern < 6){
                this.type = PlotType.DIRT;
            }
            else if (pattern < 8){
                this.type = PlotType.STONE;
            }
            else {
                this.type = PlotType.CLAY;
            }


        }
        else{
            this.undergroundResources = new Resource(r.nextInt(64-10+1)+10, ResourceType.WATER);
            this.buildable = false;
            this.type = PlotType.WATER;
        }

    }
}
