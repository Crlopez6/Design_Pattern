package builder;

import java.util.Arrays;

import Strategy.BeeType;

public class BeehiveBuilder {

    protected Room[][] roomList;
    protected BeeType beeType;
    //protected Bee[][] beeList;
    private int col;
    private int row;
    
    /*
    private BeehiveBuilder() {
    }
    */
    
    public BeehiveBuilder() {
        Room[][] temp = new Room[5][5];
        this.roomList = temp;
        this.beeType = BeeType.Worker;
    }
    
    public BeehiveBuilder(Room[][] roomList) {
        this.roomList = roomList;
        this.beeType = BeeType.Worker;
        //this.beeList = beeList;
    }
    
    public BeehiveBuilder(Room[][] roomList, BeeType beeType) {
        this.roomList = roomList;
        this.beeType = beeType;
        //this.beeList = beeList;
    }
    
    public BeehiveBuilder setRooms(Room[][] roomList) {
        this.roomList = roomList;
        return this;
    }
    
    /*
    public BeehiveBuilder setBees(Bee[][] beeList) {
        this.beeList = beeList;
        return this;
    }
    */
    
    public Beehive buildHive() {
        return new Beehive(this);
    }
}
