package com.neusoft.daytest;

/**
 * Created by lan_jia_nao on 2020/2/10.
 */
public class Go {
    public static void main(String[] args) {
        Go1 g1=new Go1(10,32);
        g1.setAge(30);
        System.out.println(g1.getAge());
        System.out.println(g1.getNo());
        /*int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        int a = 6000;
        int index=search(array,a);
        System.out.println(index);
    }
    public static int find(int[] array,int value) {
        int cont=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.println("查找了"+cont+"次");
                return i;
            }
            cont++;
        }
        return -1;
    }
    public  static  int search(int[] array,int value){
        int min=0;
        int max=array.length-1;
        int mid;
        int cont=0;
        while (min<=max){
            cont++;
            mid=(min+max)/2;
            if (value==array[mid]){
                System.out.println("查找了"+cont+"次");
                return mid;
            }else if (value<array[mid]){
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return -1;*/
    }
        /*int[] array = {1,5,3,6,2,8,7,9,12,23,32,35,31,34};
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        for (int a:array){
            System.out.println(a);
        }*/
        /*for (int i=0;i<array.length-1;i++){
            int size=0;
            for (int j=size;j<array.length-1;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                    size++;
                }
            }
        }
        for (int a:array){
            System.out.println(a);
        }*/
        /*for (int i=0;i<array.length-1;i++){
            int flag=0;
            for (int j=0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag++;
                }
                if (flag==0){
                    break;
                }
            }
        }
        for (int a: array){
            System.out.println(a);
        }*/
}
