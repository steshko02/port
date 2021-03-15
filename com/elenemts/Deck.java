package com.elenemts;
import java.util.ArrayList;

public class Deck {
    private ArrayList<Container> content = new ArrayList<>();

    public int getMAX_VOLUME() {
        return MAX_VOLUME;
    }

    private  int water=0;

    private final int MAX_VOLUME = 1000;

    public void setWater(int water) {
        this.water = water;
    }

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
       StringBuilder str= new StringBuilder();
        for (Container container : content) {
            str.append(" |").append(container.toString()).append("| ");
        }
       return str.toString();
    }
}
