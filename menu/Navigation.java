package menu;

public class Navigation {

    public Menu getCurrentMenu() {
        return currentMenu;
    }

    public void setCurrentMenu(Menu currentMenu) {
        this.currentMenu = currentMenu;
    }

    public static void setInstance(Navigation instance) {
        Navigation.instance = instance;
    }

    private Menu currentMenu;

    private static Navigation instance;

    private Navigation() {}

    public static Navigation getInstance() {
        if (instance == null) {
            instance = new Navigation();
        }
        return instance;
    }

    public void printMenu() {
        for (MenuItem menuItem : currentMenu.getMenuItems()) {
            System.out.println(menuItem.getTitle());
        }
    }

    public void navigate(int index) {
        --index;

        int itemsCounter = currentMenu.getMenuItems().size();
        if (itemsCounter < index && itemsCounter < 0) {
            System.out.println("we have a problem Huston");
            return;
        }

        MenuItem menuChoice = currentMenu.getMenuItems().get(index);

        if (menuChoice.getAction() == null || (menuChoice.getAction() != null && (menuChoice.getNextMenu() != null || menuChoice.getPreviousMenu() != null))) {
            if (menuChoice.getNextMenu() == null) {
                this.setCurrentMenu(getCurrentMenu().getMenuItems().get(index).getPreviousMenu());
            }else if(menuChoice.getAction() != null && menuChoice.getNextMenu() != null){
                menuChoice.executeAction();
                this.setCurrentMenu(getCurrentMenu().getMenuItems().get(index).getNextMenu());
            }
            else {
                this.setCurrentMenu(getCurrentMenu().getMenuItems().get(index).getNextMenu());
            }
        } else {
            menuChoice.executeAction();
        }
    }
}
