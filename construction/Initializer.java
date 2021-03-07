package construction;

import com.elenemts.*;

import java.util.ArrayList;

public class Initializer {

    private static void generatePort(){
        Port port = new Port();
        Ocean ocean = new Ocean();
        port.setWater(0);
    }
    private static void generateOcean() {
        Ocean ocean= new Ocean();
        ocean.setOceanShips(new ArrayList<>());
    }
    private  static  void  initContext()
    {
        Context.setPort(new Port());
        Context.setOcean(new Ocean());
        generatePort();
        generateOcean();
    }
}
