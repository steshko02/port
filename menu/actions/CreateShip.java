package menu.actions;

import com.elenemts.Ship;
import construction.ContextService.OceanService;
import menu.Action;

public class CreateShip implements Action {

    @Override
    public void execute() {

        System.out.print("Введите имя корабля: ");
                String shipName = "";  // ввод
                if(OceanService.searchByName(shipName)==null){
                  Ship ship = new Ship(shipName);
//                  CreateShipMenu createShipMenu = new CreateShipMenu();
//                  createShipMenu.menu(ship);
//                  ocean.addShip(ship);
                }
                else{
                    System.out.println("Корабль с таким именем уже существует. Повторите операцию.");
                }
    }
}
