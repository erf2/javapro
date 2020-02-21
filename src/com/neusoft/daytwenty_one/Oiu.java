package com.neusoft.daytwenty_one;

/**
 * Created by lan_jia_nao on 2020/2/21.
 */
public class Oiu {
    public static void main(String[] args) {
        /*int year =2004;
        if (year%4==0&&year%100!=0||year%400==0){
            System.out.println("是闰年");
        }else{
            System.out.println("是平年");
        }*/
        /*int sum = 0;
        for (int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println(sum);*/
        /*byte i=1;
        i=(byte)(i+10);
        System.out.println(i);*/
        /*int i =1;
        i++;
        System.out.println(i);
        int j = i++;
        System.out.println(j);
        j = ++i;
        System.out.println(j);*/
        /*int i = 0;
        int sum = 0;
        for (i=1;i<=100;i++)
            sum+=i;
        System.out.println(sum);*/
        int sum = 5050;
        int p = 1;
        for (int i=1;i<=100;i++){
            for (int j=2;j<=(i/2);j++){
                if (i%j==0){
                    sum-=i;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
