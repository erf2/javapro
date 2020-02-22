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
        /*int sum = 5050;
        int p = 1;
        for (int i=1;i<=100;i++){
            for (int j=2;j<=(i/2);j++){
                if (i%j==0){
                    sum-=i;
                    break;
                }
            }
        }
        System.out.println(sum);*/
        /*int sum = 0;
        //1到100的质数，从2开始判断
        for (int x=2;x<=100;x++){
            //判断范围 从2开始
            int y = 2;
            //假设是质数
            String str = "是质数";
            //判断范围 2开始，到判断值的一半为止或者到判断值
            while (y<(x/2)||y<x){
                //2是质数 从不是2开始判断
                if (x!=2){
                    //判断值除以假设的因数，余零，则不是质数，结束循环
                    if (x%y==0){
                        str = "不是质数";
                        break;
                    }
                    //更新计数器
                    y++;
                }
            }
            //是质数 就相加
            if (str == "是质数")
                sum += x;
        }
        //得出1到100质数和
        System.out.println(sum);*/
    }
}
