package builder;

import java.util.Arrays;

public class Beehive {

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
