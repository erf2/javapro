package com.neusoft.daytwenty_one;

/**
 * Created by lan_jia_nao on 2020/2/22.
 */
public class WBD32 {
    public static void main(String[] args) {
        int[] array = {1,32,23,15,3432,56,43,768,78,6,9,57};
        /*for (int i=0;i<array.length-1;i++){
            int flag = 0;
            for (int j=0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag++;
                }
            }
            if (flag==0)
                break;
        }
        for (int a:array)
            System.out.println(a);*/
        for (int i=0;i<array.length-1;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    int tepm = array[i];
                    array[i] = array[j];
                    array[j] = tepm;
                }
            }
        }
        for (int a:array)
            System.out.println(a);
    }
}
