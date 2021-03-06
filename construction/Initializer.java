package construction;

import com.elenemts.*;
import construction.ContextService.OceanService;
import construction.ContextService.PortService;
import menu.MenuController;

import java.util.ArrayList;

public class Initializer {

    private  void generatePort(){
        Port port = new Port();
        Ocean ocean = new Ocean();
        PortService servicePort = new PortService(port);
        OceanService serviceOcean = new OceanService(ocean);
        port.setWater(0);
    }
    private  void generateOcean() {
        Ocean ocean= new Ocean();
        ocean.setOceanShips(new ArrayList<>());
    }
    private    void  initContext()
    {
        Context.setPort(new Port());
        Context.setOcean(new Ocean());
        generatePort();
        generateOcean();
    }

    private  void initMenu() {
        MenuController.getInstance().run();
    }

    public  void init() {
        initContext();
        initMenu();
    }
}
