package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private List<MenuItem> menuItems = new ArrayList<>();
    private String name;

    public Menu(String name) {
        this.name = name;
    }

    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Menu(String name, List<MenuItem> menuItems) {
        this.name = name;
        this.menuItems = menuItems;
    }
}
