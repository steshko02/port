package menu;
import IOC.IOC;
import com.elenemts.*;

import java.util.Scanner;

public class MainMenu {
    protected boolean exit = false;

    private void contextMenu()
    {
        System.out.println("1) Посмотреть сколько воды в порту.\n"+ "2) Список короблей в порту.\n" + "3) Удалить корабль из порта.\n"+
                "4) Создать корабль. \n" + "5) Список кораблей ожидающих прибытие в порт.\n" + "6) Загрузить корабль в порт.\n"+"0) Выход. \n");
    }
    public void  menu(Port port, Ocean ocean)
    {
        Scanner sc = new Scanner(System.in);
        do {
            contextMenu();
            int command= sc.nextInt();
        switch (command)
        {
            case 1:
                System.out.println("Количество воды в порту: "+port.getWater());
                break;
            case 2:
                System.out.println(port);
                break;
            case 3:
                System.out.println("С какого места удалить корабль?");
                int number = sc.nextInt();
                if(port.getPortShips()[number - 1]!=null) {
                    port.unload(number - 1);
                    port.removeShip(number - 1);
                }
                else {
                    System.out.println("Пустое место!");
                }
                break;
            case 4:
                System.out.print("Введите имя корабля: ");
                String shipName;
                if(IOC.tryInputShipName(shipName = sc.next(),ocean)){
                  Ship ship = new Ship(shipName);
                  CreateShipMenu createShipMenu = new CreateShipMenu();
                  createShipMenu.menu(ship);
                  ocean.addShip(ship);
                }
                else{
                    System.out.println("Корабль с таким именем уже существует. Повторите операцию.");
                }
                break;
            case 5:
                System.out.println("Ожидают прибытия: \n"+ocean.toString());
                break;
            case 6:
                System.out.print("Введите имя корабля: ");
                String name = sc.next();
                if(ocean.searchByName(name)!=null)
                {
                    System.out.println("На какое место загрузить корабль?");
                    if(port.tryaddShip(sc.nextInt()-1,ocean.searchByName(name))) {
                        System.out.println("Корабль " + ocean.searchByName(name).getName() + " загружен!");
                        ocean.removeShip(ocean.searchByName(name));
                    }
                    else {
                        System.out.println("Место уже занято.");
                    }
                }
                else System.out.println("Корабль с именем " + name+" не найден.");
                break;
            case 0:
                exit=true;
                break;
            default:  System.out.println("Неккоректный ввод! ");
        }
        }
        while (!exit);
    }
}
// 3) - если пустая ячейка, то не удалять, а сообщать
// 4) - если ввожу не 1,2 палубу, сообщать, если ввожу е 450 1000 сообщать
// 5)
// 6) - чек по имени