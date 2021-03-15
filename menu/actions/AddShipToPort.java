package menu.actions;

import construction.ContextService.OceanService;
import construction.ContextService.PortService;
import menu.Action;

import java.util.Scanner;

public class AddShipToPort implements  Action
{
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя корабля: ");
                String name = sc.next();
                if(OceanService.searchByName(name)!=null)
                {
                    System.out.println("На какое место загрузить корабль?");
                    if(PortService.tryaddShip(sc.nextInt()-1,OceanService.searchByName(name))) {
                        System.out.println("Корабль " + OceanService.searchByName(name).getName() + " загружен!");
                        OceanService.removeShip(OceanService.searchByName(name));
                    }
                    else {
                        System.out.println("Место уже занято.");
                    }
                }
                else System.out.println("Корабль с именем " + name+" не найден.");
    }
}
