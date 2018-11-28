package singleton;

public class MainTest {
    
    public static void main(String[] args) {
        Apiary Test = Apiary.getInstance();
        Test.spawnHive();
        Test.spawnHive();
        Test.spawnHive();
        System.out.println(Test.beehive[0][0].printRooms());
        System.out.println(Test.beehive[0][1].printRooms());
        System.out.println(Test.beehive[0][2].printRooms());
    }
}
