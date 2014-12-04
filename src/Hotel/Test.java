package Hotel;

import java.util.LinkedList;
import java.util.List;
/**
 * Created by OriginalEvil on 23.10.2014.
 */
public class Test {
    private static List<String> group1 = new LinkedList<String>();
    private static List<String> group2 = new LinkedList<String>();
    private static List<String> group3 = new LinkedList<String>();
    private static List<String> group4 = new LinkedList<String>();


    public static void main(String[] args)throws InterruptedException
    {

        Hotel hotel = new Hotel();

        group1.add("Bob");
        group1.add("Jack");
        group1.add("Bet");
        group1.add("Luck");
        new Accommodation(group1, 10000, hotel ).add();
        Thread.sleep(1000);
        group2.add("Bob2");
        group2.add("Jack2");
        group2.add("Bet2");
        group2.add("Luck2");
        new Accommodation(group2, 10000, hotel ).add();
        Thread.sleep(1000);
        group3.add("Bob3");
        group3.add("Jack3");
        group3.add("Bet3");
        group3.add("Luck3");
        new Accommodation(group3, 10000, hotel ).add();
        Thread.sleep(1000);
        group4.add("Bob4");
        group4.add("Jack4");
        group4.add("Bet4");
        group4.add("Luck4");
        new Accommodation(group4, 10000, hotel ).add();


    }
}
