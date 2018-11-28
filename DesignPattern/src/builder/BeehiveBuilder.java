package builder;

public class BeehiveBuilder {

    protected Room[][] roomList;
    //protected Bee[][] beeList;
    
    private BeehiveBuilder() {
        
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
