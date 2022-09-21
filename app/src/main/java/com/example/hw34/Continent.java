package com.example.hw34;

import java.io.Serializable;

public class Continent implements Serializable {
    private int getKeId;
    private String name;
    private String map;

    public Continent(String name, String map, int getKeyId) {
        this.name = name;
        this.map = map;
        this.getKeId = getKeyId;
    }

    public String getName() {
        return name;
    }
    public int getGetKeId() {
        return getKeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }
}
