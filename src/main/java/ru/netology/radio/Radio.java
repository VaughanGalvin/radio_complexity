package ru.netology.radio;

public class Radio {
    private int currentChannel;
    private int currentVolume;
    private int maxChannel = 9;
    private int minChannel = 0;
    private int maxVolume = 10;
    private int minVolume = 0;

    /* метод получения некст канала
    public void NextChannel () {
       if (currentChannel == maxChannel) {
            this.currentChannel = minChannel;
            return;
            }
        currentChannel++;
        }
        */

    // метод получения некст канала
    public int NextChannel () {
        currentChannel++;
        if (currentChannel > maxChannel) {
            this.currentChannel = minChannel;
        }
        return currentChannel;
    }

    // метод получения прев канала
    public int PrevChannel (){
        currentChannel--;
        if (currentChannel < minChannel){
            currentChannel = maxChannel;
        }
        return currentChannel;
    }
    // метод получения некст звука
    public int nextVolume (){
        currentVolume++; // увеличиваем звук на 1
        if (currentVolume > maxVolume){ // если он оказывается больше
            return currentVolume--; // то отнимаем у него обратно эту единицу
        }
        return currentVolume; // в обычном случае возвращаем результат увеличения
    }
    // метод получения прев звука
    public int prevVolume (){
        currentVolume--;
        if (currentVolume < minVolume){
            return currentVolume++;
        }
       return currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    } // логика не нужна

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel){
            this.currentChannel = minChannel;
            return;
        }
        if (currentChannel < minChannel){
            this.currentChannel = maxChannel;
            return;
        }
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    } // логика не нужна

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxChannel() {
        return maxChannel;
    } // логика не нужна

    public void setMaxChannel(int maxChannel) {
        this.maxChannel = maxChannel;
    } // логика не нужна

    public int getMinChannel() {
        return minChannel;
    } // логика не нужна

    public void setMinChannel(int minChannel) {
        this.minChannel = minChannel;
    } // логика не нужна

    public int getMaxVolume() {
        return maxVolume;
    } // логика не нужна

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    } // логика не нужна

    public int getMinVolume() {
        return minVolume;
    } // логика не нужна

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    } // логика не нужна
} // скобка класса
