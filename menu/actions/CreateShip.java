package menu.actions;

import com.elenemts.Container;
import com.elenemts.Deck;
import com.elenemts.Ship;
import construction.ContextService.DeckService;
import construction.ContextService.OceanService;
import menu.Action;

import java.util.Scanner;

public class CreateShip implements Action {

    @Override
    public void execute() {
        System.out.print("Введите имя корабля: ");
        Scanner sc = new Scanner(System.in);
                String shipName =sc.next();  // ввод
                if(OceanService.searchByName(shipName)==null){
                  Ship ship = new Ship(shipName);
                  OceanService.addShip(ship);
                  //  createShip(OceanService.getOcean().getOceanShips().get(OceanService.getOcean().getOceanShips().size()-1));
                }
                else{
                    System.out.println("Корабль с таким именем уже существует. Повторите операцию.");
                }
    }
    private void createShip(Ship ship)
    {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        do {
            System.out.println("Выберите палубу для загрузки товара.Вам доступно: 450,1000.\n Чтобы выйти в главное меню введите 0.");
            int command = sc.nextInt();
            System.out.println("\tЧерез Enter вводите объём контейнера.");
                switch (command) {
                    case 1:
                        int water1;
                    do {
                    water1 = sc.nextInt();
                    Container container1;
                    if (water1 == 450 || water1 == 1000) {
                        if (DeckService.checkSize(ship.content[0],container1 = new Container(water1))) {
                            DeckService.addContainer(ship.content[0],container1);
                        } else {
                            System.out.println("\t\t Палуба заполнена. Последний груз не вместился! ");
                            System.out.println("\t\t\tВыход...");
                            break;
                        }
                    } else if (water1 == 0) {
                        System.out.println("\t\t\tВыход...");
                        break;
                    } else {
                        System.out.println("\t\t Неккоректный ввод!(Доступно: 450,1000)");
                    }
                    } while (water1 != 0);
                    break;
                case 2:
                    int water2;
                    do {
                        water2 = sc.nextInt();
                        Container container2;
                        if (water2 == 450 || water2 == 1000) {
                            if (DeckService.checkSize(ship.content[1],container2 = new Container(water2))) {
                                DeckService.addContainer(ship.content[1],container2);
                            } else {
                                System.out.println("\t\t Палуба заполнена. Последний груз не вместился! ");
                                System.out.println("\t\t\tВыход...");
                                break;
                            }
                        } else if (water2 == 0) {
                            System.out.println("\t\t\tВыход...");
                            break;
                        } else {
                            System.out.println("\t\t Неккоректный ввод!(Доступно: 450,1000)");
                        }
                    } while (water2 != 0);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Неккоректный ввод! ");
                    break;
            }
        }
        while (!exit);
    }
}
//        Scanner sc = new Scanner(System.in);
//        int water1;
//            do {
//            water1 = sc.nextInt();
//            Container container1;
//            if (water1 == 450 || water1 == 1000) {
//                if (DeckService.checkSize(ship.content[0],container1 = new Container(water1))) {
//                    DeckService.addConteiner(ship.content[0],container1);
//                } else {
//                    System.out.println("\t\t Палуба заполнена. Последний груз не вместился! ");
//                    System.out.println("\t\t\tВыход...");
//                    break;
//                }
//            } else if (water1 == 0) {
//                System.out.println("\t\t\tВыход...");
//                break;
//            } else {
//                System.out.println("\t\t Неккоректный ввод!(Доступно: 450,1000)");
//            }
//        } while (water1 != 0);


