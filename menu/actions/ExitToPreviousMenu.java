package menu.actions;

import menu.Action;
import menu.Menu;
import menu.MenuBuilder;
import menu.Navigation;

public class ExitToPreviousMenu implements Action {
    @Override
    public void execute() {
        Menu menu;
        menu = new Menu("Main");
        MenuBuilder.getInstance().buildMenu();
        Navigation.getInstance().setCurrentMenu(menu);
    }
}