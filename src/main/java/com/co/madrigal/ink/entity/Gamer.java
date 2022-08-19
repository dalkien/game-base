package com.co.madrigal.ink.entity;

public class Gamer extends Character{

    private String classe;
    private int bonusLP;
    private int bonusSP;
    private int bonusMP;
    private Item[] itemsToUse;
    private int totalDamange;

    public Gamer(String name, int lifePoints, int stamina, int manaPoints, int level) {
        super(name, lifePoints, stamina, manaPoints, level);
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getBonusLP() {
        return bonusLP;
    }

    public void setBonusLP(int bonusLP) {
        this.bonusLP = bonusLP;
    }

    public int getBonusSP() {
        return bonusSP;
    }

    public void setBonusSP(int bonusSP) {
        this.bonusSP = bonusSP;
    }

    public int getBonusMP() {
        return bonusMP;
    }

    public void setBonusMP(int bonusMP) {
        this.bonusMP = bonusMP;
    }

    public Item[] getItemsToUse() {
        return itemsToUse;
    }

    public void setItemsToUse(Item[] itemsToUse) {
        this.itemsToUse = itemsToUse;
    }

    public int getTotalDamange() {
        return totalDamange;
    }

    public void setTotalDamange(int totalDamange) {
        this.totalDamange = totalDamange;
    }
}
