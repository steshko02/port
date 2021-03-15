package construction.ContextService;

import com.elenemts.Container;
import com.elenemts.Deck;
import com.elenemts.Ocean;

public class DeckService {
    //private  Deck deck;

    public static void clear (Deck deck) {
        deck.getContent().clear();
    }

    public static void addContainer(Deck deck,Container container)
    {
        if(container.getVolume()+deck.getWater() > deck.getMAX_VOLUME()) {
            return;
        }
        int water=0;
        deck.getContent().add(container);
        water+=container.getVolume();
        deck.setWater(water);
    }

    public static Boolean checkSize(Deck deck,Container container)
    {
        return (container.getVolume() + deck.getWater()) <= deck.getMAX_VOLUME();
    }
}
