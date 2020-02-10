package com.neusoft.daytest;

/**
 * Created by lan_jia_nao on 2020/2/10.
 */
public class Day25 {
    public static void main(String[] args) {
        int[] array={1,34,53,534,23,54,346,867,89,76};
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for (int a : array){
            System.out.println(a);
        }


    }
}
