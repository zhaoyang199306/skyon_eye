package com.skyon.framework.manager;

/**
 * 银行取钱 存钱 1000以内
 */
public class MyThreadBank {

    public static void main(String[] args) {
        Bank bank = new Bank("zhangsan", 10000);

        Cunqian cunqian = new Cunqian(bank);
        cunqian.start();

        Queqian queqian = new Queqian(bank);
        queqian.start();

    }

}

class Cunqian extends Thread {
    private Bank bank;

    public Cunqian(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bank) {
                while (bank.getMoney() > 20000) { // 大于20000不存了 用不完
                    try {
                        bank.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int v = (int) (Math.random() * 1000);
                bank.setMoney(bank.getMoney() + v);
                System.out.println("账户：" + bank.getName() + ",存钱了：" + v + ",余额为：" + bank.getMoney());
                bank.notify();
            }

        }
    }
}


class Queqian extends Thread {
    private Bank bank;

    public Queqian(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bank) {
                int v = (int) (Math.random() * 1000);
                while (v > bank.getMoney()) {
                    try {
                        bank.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                bank.setMoney(bank.getMoney() - v);
                System.out.println("账户：" + bank.getName() + ",取钱了：" + v + ",余额为：" + bank.getMoney());
                bank.notify();
            }
        }
    }
}


class Bank {

    public Bank(String name, int money) {
        this.name = name;
        this.money = money;
    }

    private String name;
    private int money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}


