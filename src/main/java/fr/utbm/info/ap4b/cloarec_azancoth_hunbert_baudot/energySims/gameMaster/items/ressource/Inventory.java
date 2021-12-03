package fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource;

import java.util.Arrays;

public class Inventory {
    
    private Resource[] resources;
    
    public Inventory(){
        this.resources = new Resource[ResourceType.values().length];
        int i = 0;
        for (ResourceType t:
             ResourceType.values()) {
            this.resources[i] = new Resource(0, t);
            i ++;
        }
    }

    @Override
    public String toString() {
        StringBuilder value = new StringBuilder();
        for (Resource resource:
             this.resources) {
            value.append("\n\t").append(resource.toString());
        }
        return value.toString();
    }

    public boolean addResource(Resource resource){
        return this.resources[resource.getType().ordinal()].addResource(resource.getAmount());
    }
}
