package construction.ContextService;

import com.elenemts.Container;
import com.elenemts.Deck;
import com.elenemts.Ocean;

public class DeckService {
    private  Deck deck;

    public void clear ()
    {
        deck.getContent().clear();
    }

    public void addConteiner(Container container)
    {
        if(!checkSize(container)) {
            return;
        }
        int water=0;
        deck.getContent().add(container);
        water+=container.getVolume();
        deck.setWater(water);
    }

    public Boolean checkSize(Container container)
    {
        if((container.getVolume()+deck.getWater()) > deck.getMAX_VOLUME()){
            return false;
        }
        return true;
    }
}
