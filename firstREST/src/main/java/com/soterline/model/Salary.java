package com.soterline.model;

/**
 * Created by tozogabee on 7/14/17.
 */
public class Salary {

    private int money;
    private int coin;
    private String currency;

    public Salary(int money, int coin, String currency) {
        this.money = money;
        this.coin = coin;
        this.currency = currency;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
