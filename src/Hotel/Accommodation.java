package Hotel;

import java.util.List;
/**
 * Created by OriginalEvil on 23.10.2014.
 */
public class Accommodation extends Thread {
    private List<String> Group;
    private int time;
    private Hotel hotel;


    public Accommodation(List<String>Group, int time, Hotel hotel )
    {
        this.Group = Group;
        this.hotel = hotel;
        this.time = time;
    }

    @Override
    public void run()
    {
        try
        {
            Thread.sleep(time);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        hotel.remove(Group);
    }

    public void add(){
        hotel.add(Group, time, hotel );
    }
}
