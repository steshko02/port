package com.elenemts;
public class Container
{
     private int volume=0;
     public int getVolume() {
          return volume;
     }
     public void setVolume(int volume) {
          if(volume==450 || volume==1000) {
               this.volume = volume;
               return;
          }
          this.volume = 0;
     }
     public Container (int volume)
     {
          setVolume(volume);
     }

     @Override
     public String toString() {
          return ""+getVolume();  //fix
     }
}
