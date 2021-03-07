package IOC;

import com.elenemts.*;
import sun.awt.geom.AreaOp;

import java.util.ArrayList;
import java.util.SortedMap;

public class IOC {

    public  static void outPort(Port port)
    {
        System.out.println("ПОРТ:\n");
        System.out.print(port.toString());
    }
    public static  boolean tryInputShipName(String shipName, Ocean ocean)
    {
        if(ocean.searchByName(shipName)!=null){
            return  false;
        }
        return true;
    }

}

//command - паттерн
// почистить классы
// хеш код
// lambol -get-set