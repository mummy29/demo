package com.example.demo;

import java.math.BigDecimal;

/**
 * @author: wucheng
 * @date: 2022/6/9
 **/
public class Test {

    public static void main(String[] args) {
        toBigDecimal();
    }

    private static void toBigDecimal() {
        // 字符串
        BigDecimal bg = new BigDecimal("1.1");
        System.out.println("字符串->BigDecimal：" + bg);

        // float
        bg = new BigDecimal(Float.parseFloat("1.1"));
        System.out.println("float->BigDecimal：" + bg);

        // double
        bg = new BigDecimal(Double.parseDouble("1.1"));
        System.out.println("double->BigDecimal：" + bg);
    }
}
