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
        String str= name+"\n";
        for (int i=0; i<content.length; i++) {
            str+= "\t"+(i+1)+" :"+content[i].toString()+"\n";
        }
        return  str;
    }


}
//1) создаем корабль
//2) заполняем палубы
//3) заполняем палубы с проверкой
//4) по менюшке