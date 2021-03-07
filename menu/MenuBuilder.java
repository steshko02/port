package menu;

import com.sun.xml.internal.bind.v2.model.nav.Navigator;
import menu.actions.*;

public class MenuBuilder {
    public Menu mainMenu;

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
        mainMenu = new Menu("Main");
        mainMenuInit();

        Navigation.getInstance().setCurrentMenu(mainMenu);
    }
    public void mainMenuInit() {
        mainMenu.getMenuItems().add(new MenuItem("1. Посмотреть сколько воды в порту", null, null, null));
        mainMenu.getMenuItems().add(new MenuItem("2. Посмотреть список кораблей в порту", null, null, null));
        mainMenu.getMenuItems().add(new MenuItem("3. Удалить корабль из порта", null, null, null));
        mainMenu.getMenuItems().add(new MenuItem("4. Создать корабль", null, null, null));
        mainMenu.getMenuItems().add(new MenuItem("5. Посмотреть список кораблей, ожидающих прибытия в порт", null, null, null));
        mainMenu.getMenuItems().add(new MenuItem("6. Загрузить корабль в порт", null, null, null));
        mainMenu.getMenuItems().add(new MenuItem("7. Выйти из программы", new ExitAction(), null, null));
    }
}
