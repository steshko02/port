package com.elenemts;

public class Port {
    public int getCOUNT() {
        return COUNT;
    }

    private final int COUNT = 10;
    private  int water;
    private Ship[] portShips = new Ship[COUNT];  // get, set
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

    @Override
    public String toString() {

        StringBuilder str= new StringBuilder();
        for (int i=0; i<COUNT; i++) {
            if(portShips[i]== null) {
                str.append(i + 1).append(" - free").append("\n");
            }
            else
                str.append(i + 1).append(" ").append(portShips[i].toString()).append("\n");
        }
        return str.toString();
    }
}
