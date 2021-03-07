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
    public void addShip(Ship ship)
    {
        oceanShips.add(ship);
    }

    public void removeShip(Ship ship)
    {
        oceanShips.remove(ship);
    }

        public Ship searchByName(String name)
        {
            for(int i = 0; i<oceanShips.size(); i++)
            {
                if(oceanShips.get(i).getName().equals(name))
                {
                    return oceanShips.get(i);
                }
            }
        return null;
    }

    @Override
    public String toString() {

        String str="";
        for (int i=0; i<oceanShips.size(); i++) {
            if(oceanShips.get(i)== null) {
                str+=(i+1)+" - free"+"\n";
            }
            else{
                str+= (i+1)+" "+oceanShips.get(i).toString()+"\n";
            }
        }
        return  str;
    }
}
