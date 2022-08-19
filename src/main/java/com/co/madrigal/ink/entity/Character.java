package com.co.madrigal.ink.entity;


public class Character {

    private String name;
    private int lifePoints;
    private int stamina;
    private int manaPoints;
    private int level;
    private int nextLevel;

    public Character(String name, int lifePoints, int stamina, int manaPoints, int level, int nextLevel) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.stamina = stamina;
        this.manaPoints = manaPoints;
        this.level = level;
        this.nextLevel = nextLevel;
    }

    public String getName() {
        return name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public int getStamina() {
        return stamina;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public int getLevel() {
        return level;
    }

    public int getNextLevel() {
        return nextLevel;
    }

    public void setNextLevel(int nextLevel) {
        this.nextLevel = nextLevel;
    }
}
