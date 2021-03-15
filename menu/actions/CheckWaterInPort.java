package menu.actions;

import com.elenemts.Port;
import menu.Action;
import construction.ContextService.*;

public class CheckWaterInPort implements Action {
    @Override
    public void execute() {
        System.out.println("Количество воды в порту: "+ PortService.getPort().getWater());
    }
}
