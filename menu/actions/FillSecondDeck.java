package menu.actions;

import com.elenemts.Container;
import construction.ContextService.DeckService;
import construction.ContextService.OceanService;
import menu.Action;

import java.util.Scanner;

public class FillSecondDeck implements Action {
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tЧерез Enter вводите объём контейнера.");
        int water1;
        do {
            water1 = sc.nextInt();
            Container container1;
            if (water1 == 450 || water1 == 1000) {
                if (DeckService.checkSize(OceanService.getOcean().getOceanShips().get(OceanService.getOcean().
                        getOceanShips().size() - 1).content[1], container1 = new Container(water1))) {
                    DeckService.addContainer(OceanService.getOcean().getOceanShips().get(OceanService.getOcean().
                            getOceanShips().size() - 1).content[1], container1);
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
    }
}
