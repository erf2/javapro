package com.neusoft.daythirteen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lan_jia_nao on 2020/2/13.
 */
public class SanLiKai {
    public static void main(String[] args) {
        /*System.out.println(method(10));*/
        /*System.out.println(gao(4));*/
        System.out.println(bao(1000));
    }
    public static int bao(int n){
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            list.add(i);
        }
        int m=1;
        while (list.size()>1){
            if (m!=3){
                int first = list.remove(0);
                list.add(first);
                m++;
            }else{
                list.remove(0);
                m=1;
            }
        }
        return list.get(0);
    }
    public static int gao(int a){
        int b=0;
        int c=1;
        for (int i=1;i<=a;i++){
            c=c*2;
            b=100;
            b=b/c;
        }
        return b;
    }
    public static int method(int a){
        if (a==1||a==2){
            return 1;
        }else{
            int f1=1;
            int f2=1;
            int sum;
            for (int i=3;i<=a;i++){
                sum = f1+f2;
                f1=f2;
                f2=sum;
            }
            return f2;
        }
    }
}
