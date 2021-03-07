package construction.ContextService;

import com.elenemts.Port;
import com.elenemts.Ship;

public class PortService {
    private static Port port;

    public static Port getPort() {
        return port;
    }

    public static void setPort(Port port) {
        PortService.port = port;
    }


    public  PortService(Port port) {
        this.port = port;
    }
    public  static boolean tryaddShip(int index, Ship ship) {

        if(port.getPortShips()[index]!= null || index>= port.getCOUNT() ||ship == null) {
            return false;
        }
        port.getPortShips()[index]=ship;
        return  true;
    }
    public static void removeShip(int index) {
        if(port.getPortShips()[index]== null || index>=port.getCOUNT()) {
            return;
        }
        port.getPortShips()[index]=null;
        //countShips--;
    }

    public static void unload(int index)
    {
        if(port.getPortShips()[index]== null || index>=port.getCOUNT()) {
            return;
        }
        int water=0;
        for (int i=0;i<2;i++) {
            water +=  port.getPortShips()[index].content[i].getWater();
            port.getPortShips()[index].content[i].getContent().clear();
        }
        port.setWater(water);
    }

}
