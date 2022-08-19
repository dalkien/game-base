package com.co.madrigal.ink.entity;

public class StageGame {

    private int totalEnemis;
    private String name;
    private String typeEnviroment;
    private int totalItems;
    private int checkPoint;
    private int maxBonusDamange;
    private int minBonusDamange;

    public StageGame(int totalEnemis, String name, String typeEnviroment,
                     int totalItems, int checkPoint, int maxBonusDamange, int minBonusDamange) {
        this.totalEnemis = totalEnemis;
        this.name = name;
        this.typeEnviroment = typeEnviroment;
        this.totalItems = totalItems;
        this.checkPoint = checkPoint;
        this.maxBonusDamange = maxBonusDamange;
        this.minBonusDamange = minBonusDamange;
    }

    public int getTotalEnemis() {
        return totalEnemis;
    }

    public void setTotalEnemis(int totalEnemis) {
        this.totalEnemis = totalEnemis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeEnviroment() {
        return typeEnviroment;
    }

    public void setTypeEnviroment(String typeEnviroment) {
        this.typeEnviroment = typeEnviroment;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public int getCheckPoint() {
        return checkPoint;
    }

    public void setCheckPoint(int checkPoint) {
        this.checkPoint = checkPoint;
    }

    public int getMaxBonusDamange() {
        return maxBonusDamange;
    }

    public void setMaxBonusDamange(int maxBonusDamange) {
        this.maxBonusDamange = maxBonusDamange;
    }

    public int getMinBonusDamange() {
        return minBonusDamange;
    }

    public void setMinBonusDamange(int minBonusDamange) {
        this.minBonusDamange = minBonusDamange;
    }
}
