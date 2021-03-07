package menu;

import com.elenemts.*;

import java.util.Scanner;


public class CreateShipMenu extends MainMenu {

    public void menu(Ship ship) {

        Scanner sc = new Scanner(System.in);
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
                            if (ship.content[0].checkSize(container1 = new Container(water1))) {
                                ship.content[0].addConteiner(container1);
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
                            if (ship.content[1].checkSize(container2 = new Container(water2))) {
                                ship.content[1].addConteiner(container2);
                            } else {
                                System.out.println("\t Палуба заполнена. Последний груз не вместился! ");
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
// enum для ящиков