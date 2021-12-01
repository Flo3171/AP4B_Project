package fr.utbm.info.ap4b.cloarec_azancoth_hunbert_baudot.energySims.gameMaster.items.ressource;

public class Resource {
    private double amount;
    private ResourceType type;

    public Resource(double amount, ResourceType type){
        this.amount = amount;
        this.type = type;
    }
}
