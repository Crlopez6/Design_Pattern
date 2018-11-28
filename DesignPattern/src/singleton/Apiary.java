
/**
 * @author corey
 *
 */

package singleton;

import builder.Beehive;
import builder.BeehiveBuilder;
import builder.Room;

public class Apiary {

    private final int col = 5;
    private final int row = 5;
    private static Apiary instance = null;
    Beehive[][] beehive = new Beehive[row][col];
    Room[][] room = new Room[row][col];

    protected Apiary() {
    }

    public static Apiary getInstance() {
        if (instance == null) {
            instance = new Apiary();
        }
        return instance;
    }
    
    public void spawnHive() {
        
        int i = 0;
        int j = 0;
        
        for (i = 0; i < beehive.length; i++) {
            if (beehive[i][0] == null) {
                beehive[i][0] = new BeehiveBuilder().buildHive();
                return;
            }
            for (j = 0; j < beehive[i].length; j++) {
                if (beehive[i][j] == null) {
                    beehive[i][j] = new BeehiveBuilder().buildHive();
                    return;
                }
            }
        }
    }
    
    public void spawnRoom(int i, int j, Room[][] room) {
        beehive[i][j] = new BeehiveBuilder(room).buildHive();
    }
    
    public void printHives() {
        for (int i = 0; i < beehive.length; i++) {
            for (int j = 0; j < beehive[i].length; j++) {
                if (beehive[i][j] != null) {
                    System.out.println(beehive[i][j].printRooms());
                }
                else {
                    return;
                }
            }
        }
    }
    
    public void printHiveTypes() {
        for (int i = 0; i < beehive.length; i++) {
            for (int j = 0; j < beehive[i].length; j++) {
                if (beehive[i][j] != null) {
                    System.out.print(beehive[i][j].getBeeType() + ". ");
                }
                else {
                    return;
                }
            }
        }
        System.out.println("\n");
    }
}