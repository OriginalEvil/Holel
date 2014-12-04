package Hotel;

import java.util.LinkedList;
import java.util.List;
/**
 * Created by OriginalEvil on 23.10.2014.
 */
public class Hotel {

    public static final int max_places = 12;
    public static final int rooms = 4;
    private int NumberOfPeople;
    private int counter;

    private List<String> listoftenants = new LinkedList<String>();

    public synchronized boolean add(List<String> Group, int time, Hotel hotel){
        if (NumberOfPeople + Group.size() > max_places){
            Wait(Group);
            for(String w:Group){
                listoftenants.add(w);
                System.out.println(w);
            }
            System.out.println("wait");
            System.out.println(" ");
            return false;
        }
        if (addplace(Group, time, hotel )) return true;
        Wait(Group);
        for(String a: Group){
            listoftenants.add(a);
            System.out.println(a);
        }
        System.out.println("wait");
        System.out.println(" ");
        return false;
    }

    public boolean addplace(List<String> Group, int time, Hotel hotel)
    {
        if(counter < rooms){
            counter++;
            NumberOfPeople += Group.size();
            for(String w: Group){
                listoftenants.add(w);
                System.out.println(w);
            }
            System.out.println("Free places: " + (max_places - NumberOfPeople));
            System.out.println("settled");
            System.out.println(" ");
            new Accommodation(Group, time, hotel ).start();
            return true;
                }
        return false;

    }

    public synchronized void remove(List<String> Group) {
        NumberOfPeople -= Group.size();
        for (String w : Group) {
            listoftenants.remove(w);
            System.out.println(w);
        }
        System.out.println("Free places: " + (max_places - NumberOfPeople));
        System.out.println("evicted");
        System.out.println(" ");
    }

    public void Wait(List<String> Group)
    {
           for (String w:Group) {
               listoftenants.add(w);
           }
    }

    }
