package com.mycompany.computer;

public class Harddisk {

    private String brand;
    String capacity;

    public Harddisk(String brand) {
        this.brand = brand;

    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    @Override
    public String toString(){
        return this.brand;
    }
}
