
/**
 * @author corey
 *
 */

package singleton;

import builder.Beehive;
import builder.BeehiveBuilder;

public class Apiary {

    private final int col = 5;
    private final int row = 5;
    private static Apiary instance = null;
    Beehive[][] beehive = new Beehive[row][col];

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
            if (beehive[i][j] == null) {
                beehive[i][j] = new BeehiveBuilder().buildHive();
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
}