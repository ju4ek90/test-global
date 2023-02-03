package com.global.common.utils;

public class Calc {

    public static String taxCalc( double vat, double value){
        int res;
        double tax;
        tax = 100*(vat/(100*(value + (value * (vat/100)))));
        res = (100 - (int)Math.round(tax));
        System.out.println(res);
        return String.valueOf(res);
    }
}
