package com.skyon.framework.manager;

import java.math.BigDecimal;

public class MyThread {
    public static void main(String[] args) {
//        Shop shop = new Shop();
//
//        Consumer consumer = new Consumer(shop);
//        consumer.start();
//
//        Product product = new Product(shop);
//        product.start();

        StringBuilder sb = new StringBuilder("1");
        String d = null;
        sb.append(d);
        System.out.println(sb);

        BigDecimal bigDecimal = new BigDecimal("2222");


    }


}

class Consumer extends Thread {
    private Shop shop;

    Consumer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        while (true) {
            shop.get();
        }
    }
}

class Product extends Thread {
    private Shop shop;

    Product(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        while (true) {
            shop.save();
        }
    }
}

class Shop {
    int i;

    public synchronized void save() {
        if (i >= 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("生产了一个，共：" + (++i));
        notify();
    }

    public synchronized void get() {
        if (i<=0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费了一个，共：" + (--i));
        notify();
    }
}