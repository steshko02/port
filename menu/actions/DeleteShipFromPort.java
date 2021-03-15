package menu.actions;

import construction.ContextService.PortService;
import menu.Action;

import java.util.Scanner;

public class DeleteShipFromPort implements Action {
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("С какого места удалить корабль?");
                int number = sc.nextInt();
                if(PortService.getPort().getPortShips()[number - 1]!=null) {
                    PortService.unload(number - 1);
                    PortService.removeShip(number - 1);
                }
                else {
                    System.out.println("Пустое место!");
                }
    }
}
