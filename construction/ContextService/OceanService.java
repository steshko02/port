package construction.ContextService;

import com.elenemts.Ocean;
import com.elenemts.Ship;

public class OceanService {

    private static Ocean ocean;

    public static Ocean getOcean() {
        return ocean;
    }

    public static void setOcean(Ocean ocean) {
        OceanService.ocean = ocean;
    }

    public OceanService(Ocean ocean) {
        OceanService.ocean = ocean;
    }

    public static void addShip(Ship ship)
    {
        ocean.getOceanShips().add(ship);
    }
    public static void removeShip(Ship ship)
    {
        ocean.getOceanShips().remove(ship);
    }

    public static Ship searchByName(String name)
    {
        for(int i = 0; i<ocean.getOceanShips().size(); i++)
        {
            if(ocean.getOceanShips().get(i).getName().equals(name))
            {
                return ocean.getOceanShips().get(i);
            }
        }
        return null;
    }

}
