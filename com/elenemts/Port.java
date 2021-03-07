package com.elenemts;

public class Port {
    private final int count = 10;
    private  int water;
    private Ship[] portShips = new Ship[count];  // get, set
    public Ship[] getPortShips() {
        return portShips;
    }
    public void setPortShips(Ship[] portShips) {
        this.portShips = portShips;
    }
    public  int getWater() {
        return water;
    }
    public void setWater(int water) {
        this.water = water;
    }
/////////////////////////////////
    public boolean tryaddShip(int index, Ship ship) {

       if(portShips[index]!= null || index>=count ||ship == null) {
           return false;
       }
       portShips[index]=ship;

       return  true;
    }

    public void removeShip(int index) {
        if(portShips[index]== null || index>=count) {
            return;
        }
        portShips[index]=null;
        //countShips--;
    }

    public void unload(int index)
    {
        if(portShips[index]== null || index>=count) {
            return;
        }
        for (int i=0;i<2;i++) {
            water +=  portShips[index].content[i].getWater();
            portShips[index].content[i].clear();
        }
    }
////////////////////////////
    @Override
    public String toString() {

        String str="";
        for (int i=0; i<count; i++) {
            if(portShips[i]== null) {
                str+=(i+1)+" - free"+"\n";
            }
            else
                str+= (i+1)+" "+portShips[i].toString()+"\n";
        }
        return  str;
    }
}