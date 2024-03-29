package com.tutorial.objects;

import java.text.NumberFormat;

public class FormatNumber {

    public static void main(String[] args) {

        formatToNumberK(10000); // 10K
        formatToNumberK(100000); // 100K
    }

    public static void formatToNumberK(Integer number){

        NumberFormat format = NumberFormat.getCompactNumberInstance();
        String result = format.format(number); // String format (Object obj)
        System.out.println("result:  " + result); // result:  valueK /// 10k, 5k, 20k, etc
    }

}
