package com.example.firebase;


public class Place {
    public String name;
    public double lat, lon;

    public Place() {}
    public Place(String name, float lat, float lon) {
        this.name = name;
        this.lat = lat;
        this.lon = lon;
    }
    public String toString () {
        return "Наименование: " + name + ", Широта: " + lat + ", Долгота: " + lon;
    }
}
