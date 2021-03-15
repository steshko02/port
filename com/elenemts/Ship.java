package com.elenemts;

public class Ship {

    public Deck[] content = new Deck[]{new Deck(),new Deck()}; // геттеры сетеры

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ship(String name)
    {
        setName(name);
    }

    @Override
    public String toString() {
        StringBuilder str= new StringBuilder(name + "\n");
        for (int i=0; i<content.length; i++) {
            str.append("\t").append(i + 1).append(" :").append(content[i].toString()).append("\n");
        }
        return str.toString();
    }


}
//1) создаем корабль
//2) заполняем палубы
//3) заполняем палубы с проверкой
//4) по менюшке