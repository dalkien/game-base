package com.co.madrigal.ink.entity;

public class Item {

    private String typeItem;
    private String name;
    private int amount;
    private String status;

    public Item() {
    }

    public Item(String typeItem, String name, int amount, String status) {
        this.typeItem = typeItem;
        this.name = name;
        this.amount = amount;
        this.status = status;
    }

    public String getTypeItem() {
        return typeItem;
    }

    public void setTypeItem(String typeItem) {
        this.typeItem = typeItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
