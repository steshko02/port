package com.elenemts;

import java.util.ArrayList;

public class Ocean {

    public void setOceanShips(ArrayList<Ship> oceanShips) {
        this.oceanShips = oceanShips;
    }

    private ArrayList<Ship> oceanShips = new ArrayList<Ship>();

    public ArrayList<Ship> getOceanShips() {
        return oceanShips;
    }
//
    @Override
    public String toString() {

        StringBuilder str= new StringBuilder();
        for (int i=0; i<oceanShips.size(); i++) {
            if(oceanShips.get(i)== null) {
                str.append(i + 1).append(" - free").append("\n");
            }
            else{
                str.append(i + 1).append(" ").append(oceanShips.get(i).toString()).append("\n");
            }
        }
        return str.toString();
    }
}
