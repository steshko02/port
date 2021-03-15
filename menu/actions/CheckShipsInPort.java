package menu.actions;

import construction.ContextService.PortService;
import menu.Action;

public class CheckShipsInPort implements Action {
    @Override
    public void execute() {
        System.out.println(PortService.getPort().toString());
    }
}
