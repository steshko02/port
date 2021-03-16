package menu;

import com.sun.xml.internal.bind.v2.model.nav.Navigator;
import menu.actions.*;

public class MenuBuilder {
    public  Menu mainMenu;
    public Menu createMenu;

    private static MenuBuilder instance;

    private MenuBuilder() {
        buildMenu();
    }

    public static MenuBuilder getInstance() {
        if (instance == null) {
            instance = new MenuBuilder();
        }
        return instance;
    }
    public void buildMenu() {
        createMenu = new Menu("Create");
        createMenuInit();
        mainMenu = new Menu("Main");
        mainMenuInit();

        Navigation.getInstance().setCurrentMenu(mainMenu);
    }
    public void mainMenuInit() {
        mainMenu.getMenuItems().add(new MenuItem("1. Посмотреть сколько воды в порту", new CheckWaterInPort(), null, null));
        mainMenu.getMenuItems().add(new MenuItem("2. Посмотреть список кораблей в порту", new CheckShipsInPort(), null, null));
        mainMenu.getMenuItems().add(new MenuItem("3. Удалить корабль из порта", new DeleteShipFromPort(), null, null));
        mainMenu.getMenuItems().add(new MenuItem("4. Создать корабль", new CreateShip(), createMenu, null));
        mainMenu.getMenuItems().add(new MenuItem("5. Посмотреть список кораблей, ожидающих прибытия в порт", new OceanShips(), null, null));
        mainMenu.getMenuItems().add(new MenuItem("6. Загрузить корабль в порт", new AddShipToPort(), null, null));
        mainMenu.getMenuItems().add(new MenuItem("7. Выйти из программы", new ExitAction(), null, null));
    }
    public void createMenuInit() {
        mainMenu = new Menu("Main");
        mainMenuInit();
        createMenu.getMenuItems().add(new MenuItem("1. Первая палуба", new FillFirstDeck(), null, null));
        createMenu.getMenuItems().add(new MenuItem("2. Вторая палуба", new FillSecondDeck(), null, null));
        createMenu.getMenuItems().add(new MenuItem("3. Выйти из программы", new ExitToPreviousMenu(), null, mainMenu));
       // Navigation.getInstance().setCurrentMenu(createMenu);
    }

}

