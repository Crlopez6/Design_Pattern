package builder;

class Beehive {

    private Room[][] roomList;
    //private Bee[][] beeList;
    
    public Beehive(BeehiveBuilder builder) {
        this.roomList = builder.roomList;
        //this.beeList = builder.beeList;
    }
    
    public Room[][] getRooms() {
        return roomList;
    }
    
    /*
    public Bee[][] getBees() {
        return beeList;
    }
    */
}
