package builder;

import java.util.Arrays;

import Strategy.BeeType;

public class Beehive {

    BeeType beeType;
    private Room[][] roomList;
    //private Bee[][] beeList;
    
    public Beehive(BeehiveBuilder builder) {
        this.roomList = builder.roomList;
        this.beeType = builder.beeType;
        //this.beeList = builder.beeList;
    }
    
    public Room[][] getRooms() {
        return roomList;
    }
    
    public BeeType getBeeType() {
        return beeType;
    }
    /*
    public Bee[][] getBees() {
        return beeList;
    }
    */
    
    public String printRooms() {
        String output = "";
        for (int i = 0; i < roomList.length; i++) {
            for (int j = 0; j < roomList[i].length; j++) {
                output += roomList[i][j] + " ";
            }
            output += "\n";
        }
        return output;
    }
}
