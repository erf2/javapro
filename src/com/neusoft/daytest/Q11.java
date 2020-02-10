package com.neusoft.daytest;

/**
 * Created by lan_jia_nao on 2020/2/10.
 */
public class Q11 {
    public static void main(String[] args) {
        int a;
        int b;
        String c;
        int sum = 0;
        for (a=2;a<=100;a++){
            b=2;
            c="是质数";
            while(b<=(a/2)){
                if (a!=2){
                    if (a%b==0){
                        c = "不是质数";
                        if (c=="不是质数"){
                            break;
                        }
                    }
                }
                b++;
            }
            if (c=="是质数"){
                sum=sum+a;
            }
        }
        System.out.println(sum);
        /*int a = 25;
        int b = 2;
        String c= "是质数";
        while (b<=(a/2)){
            if (a!=2){
                if (a%b==0){
                    c = "不是质数";
                    if (c!="是质数"){
                        System.out.println(b);
                        break;
                    }
                }
            }
            b++;
        }
        System.out.println(c);*/
    }
}

