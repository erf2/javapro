package com.neusoft.daytwenty_one;

/**
 * Created by lan_jia_nao on 2020/2/22.
 */
public class HDR889 {
    public static void main(String[] args) {
        int[] array = new int[50000];
        for (int i=0;i<array.length;i++)
            array[i]=i+1;
        System.out.println(method(array,5000));
    }

    public static int method0(int[] array,int value){
        int count = 0;
        for (int i=0;i<array.length;i++){
            count++;
            if (array[i]==value){
                System.out.println("查找了"+count+"次");
                return i;
            }
        }
        return -1;
    }

    public static int method(int[] array, int value) {
        int min = 0;
        int max = array.length-1;
        int mid = (max + min) / 2;
        int count = 0;
        while (min<=max){
            count++;
            if (value == array[mid]){
                System.out.println("查找了"+count+"次");
                return mid;
            }else if (value < array[mid])
                max = mid-1;
            else if (value >array[mid])
                min = mid+1;
            mid = (max + min) / 2;
        }
        return -1;
    }
}
