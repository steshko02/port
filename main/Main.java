package main;

import com.elenemts.Ocean;
import com.elenemts.Port;
import menu.MainMenu;

public class Main {

    public static void main(String[] args) {
        Port port = new Port();
        Ocean ocean = new Ocean();
        MainMenu mainMenu= new MainMenu();
        mainMenu.menu(port,ocean);

    }
}
