
/**
 * @author corey
 *
 */

package singleton;

public class Apiary {

    private static Apiary instance = null;

    protected Apiary() {
    }

    public static Apiary getInstance() {
        if (instance == null) {
            instance = new Apiary();
        }
        return instance;
    }
    
    private void spawnHive() {
        
    }
}