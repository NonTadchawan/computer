package com.mycompany.computer;

public class Keybord {

    String color;

    public void chooseButtonColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color;
    }

}
