package menu.actions;

import com.elenemts.Container;
import com.elenemts.Deck;
import com.elenemts.Ship;
import construction.ContextService.DeckService;
import construction.ContextService.OceanService;
import menu.Action;

public class OceanShips implements Action {

    @Override
    public void execute() {
        System.out.println("Ожидают прибытия: \n"+OceanService.getOcean().getOceanShips().toString());
    }
}
