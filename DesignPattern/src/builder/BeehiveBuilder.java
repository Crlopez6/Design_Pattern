package builder;

import java.util.Arrays;

public class BeehiveBuilder {

    protected Room[][] roomList;
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
    }
    
    //TODO: ADD BEES TO THE INPUT
    public BeehiveBuilder(Room[][] roomList) {
        this.roomList = roomList;
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
