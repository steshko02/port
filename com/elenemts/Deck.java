package com.elenemts;
import java.util.ArrayList;

public class Deck {
    private ArrayList<Container> content = new ArrayList<>();
    private final int MAX_VOLUME = 1000;
    private  int water=0;

    public int getWater() {
        return water;
    }

    public ArrayList<Container> getContent() {
        return content;
    }

    public void setContent(ArrayList<Container> content) {
        this.content = content;
    }

    @Override
    public String toString() {
       String str="";
       for(int i = 0; i<content.size(); i++){
           str += (" |" +content.get(i).toString()+"| "); // mb toString ne nado
       }
       return str ;
    }

    public void clear ()
    {
        content.clear();
    }

    public void addConteiner(Container container)
    {
        if(!checkSize(container)) {
           return;
        }
        content.add(container);
        water+=container.getVolume();
    }

    public Boolean checkSize(Container container)
    {
        if((container.getVolume()+water) > MAX_VOLUME){
            return false;
        }
        return true;
    }
}
