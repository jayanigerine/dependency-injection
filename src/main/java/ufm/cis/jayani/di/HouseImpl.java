package ufm.cis.jayani.di;

public class HouseImpl implements House {

    Door door;

    public HouseImpl(Door door) {
        this.door = door;
    }

    public void describeHouse() {
        System.out.println("*** Constructing House ***");
        String result = door.getInfo();
        System.out.println(result);
    }

    public void setDoor(Door door) {
        this.door = door;
    }
}