package com.faterap.mydemo;

/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 04/08/2019, tanminghui, Create file
 */
public class JavaTest {
    public static void main() {


    }

    static JavaTest javaTest = new JavaTest();

    int price = 110;
    static int amount = 112;

    static {
        System.out.println("书的静态代码块");
        System.out.println("amount=" + amount);
    }

    {
        System.out.println("书的普通代码块");
    }

    JavaTest() {
        System.out.println("书的构造方法");
        System.out.println("price=" + price + ",amount=" + amount);
    }

    public static void staticFunction() {
        System.out.println("书的静态方法");
    }
}
