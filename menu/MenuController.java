package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuController {
    private MenuBuilder builder;
    private Navigation navigator;

    private static MenuController instance;

    private MenuController() {
        this.builder = MenuBuilder.getInstance();
        this.navigator = Navigation.getInstance();
    }

    public static MenuController getInstance() {
        if (instance == null) {
            instance = new MenuController();
        }
        return instance;
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        while (true) {
            navigator.printMenu();
            try {
                Integer indexAction = in.nextInt();
                navigator.navigate(indexAction);
            }
            catch (InputMismatchException e) {
                System.err.println("wrong input.");
            }
        }
    }
}
