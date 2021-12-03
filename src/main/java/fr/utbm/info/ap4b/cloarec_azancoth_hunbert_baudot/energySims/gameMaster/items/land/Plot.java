package fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.land;

import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.Construction;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.ConstructionType;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.Tree;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.building.*;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.connector.Pipe;
import fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.construction.connector.Pylon;
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
    private Construction construction;
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
            this.construction = null;

            if (pattern < 3){
                this.type = PlotType.GRASS;
                this.construction = new Tree();
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

    @Override
    public String toString() {
        return construction.toString() ;
    }

    public Construction getConstruction() {
        return construction;
    }

    public void build(ConstructionType constructionType){
        switch (constructionType){
            case TREE -> this.construction = new Tree();
            case PYLON -> this.construction = new Pylon();
            case PIPE -> this.construction = new Pipe();
            case HOUSE -> this.construction = new House();
            case NUCLEAR_PLANT -> this.construction = new NuclearPlant();
            case COAL_PLANT -> this.construction = new CoalPlant();
            case GAZ_PLANT -> this.construction = new GazPlant();
            case OIL_PLANT -> this.construction = new OilPlant();
            case WINDMILL -> this.construction = new WindMill();
            case SOLAR_PANEL -> this.construction = new SolarPanel();

        }
        this.buildable = false;

    }

    void update(){

        if (this.construction != null) {
            this.construction.update();
        }
    }

    Resource destroy(){
        Resource resource = this.construction.destroy();
        this.buildable = true;
        this.construction = null;
        return resource;
    }


}
