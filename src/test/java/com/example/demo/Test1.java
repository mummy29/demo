package com.example.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: wucheng
 * @date: 2022/9/8
 **/
public class Test1 {

    /*
    输入: 2736
    输出: 7236
    解释: 交换数字2和数字7
     */

    public static void main(String[] args) {
        int num = 2134;

        String numStr = String.valueOf(num);
        String[] numArr = numStr.split("");
        List<String> numList = Arrays.stream(numArr).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        numList.get(0);

        numList.forEach(item -> System.out.println(item));
    }
}
