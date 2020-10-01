package ufm.cis.jayani.di;

public class HouseImpl implements House {

    Door door;

    public HouseImpl(Door door) {
        this.door = door;
    }

    public void constructHouse() {
        System.out.println("*** Constructing House ***");
        String info = door.getInfo();
        System.out.println(info);
    }

    public void setDoor(Door door) {
        this.door = door;
    }
}