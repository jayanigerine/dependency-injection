package ufm.cis.jayani.di;

public class WoodenDoor implements Door {
    private int cost;

    public int getCost() {

        return cost;
    }

    public void setCost(int cost) {

        this.cost = cost;
    }

    public String getInfo() {
        return "Door type : Wooden\nCost : " +this.getCost();
    }
}