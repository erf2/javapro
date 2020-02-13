package com.neusoft.daythirteen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lan_jia_nao on 2020/2/13.
 */
public class LianXishisaneryue {
    public static void main(String[] args) {
        System.out.println(method(7));
    }
    public static int method(int n){
        if (n==1||n==2){
            return 1;
        }else{
            int f1=1;
            int f2=1;
            int sum;
            for (int i=3;i<=n;i++){
                sum = f1+f2;
                f1=f2;
                f2=sum;
            }
            return f2;
        }
    }
}
