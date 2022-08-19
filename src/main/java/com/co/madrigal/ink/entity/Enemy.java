package com.co.madrigal.ink.entity;

public class Enemy extends Character{

    private int areaBonus;
    private String type;
    private Item leftItem;
    private boolean boos ;
    private int totalDamange;

    public Enemy(String name, int lifePoints, int stamina, int manaPoints, int level) {
        super(name, lifePoints, stamina, manaPoints, level);
    }

    public int getAreaBonus() {
        return areaBonus;
    }

    public void setAreaBonus(int areaBonus) {
        this.areaBonus = areaBonus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Item getLeftItem() {
        return leftItem;
    }

    public void setLeftItem(Item leftItem) {
        this.leftItem = leftItem;
    }

    public boolean isBoos() {
        return boos;
    }

    public void setBoos(boolean boos) {
        this.boos = boos;
    }

    public int getTotalDamange() {
        return totalDamange;
    }

    public void setTotalDamange(int totalDamange) {
        this.totalDamange = totalDamange;
    }
}
