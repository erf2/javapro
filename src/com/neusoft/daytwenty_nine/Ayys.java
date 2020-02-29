package com.neusoft.daytwenty_nine;

/**
 * Created by lan_jia_nao on 2020/2/29.
 */
public class Ayys {
    private Integer[] array;
    private Integer size;
    public Ayys(int number){
        array = new Integer[number];
        size = 0;
    }
    public Ayys(){
        array = new Integer[10];
        size = 0;
    }
    public void add(int a){
        if (size>=array.length){
            Integer[] newArray = new Integer[size+size/2];
            for (int i=0;i<array.length;i++){
                newArray[i]=array[i];
            }
            array=newArray;
        }
        array[size++]=a;
    }
    public int length(){
        return size;
    }
    public int getIndex(int b){
        if (b<0||b>=size){
            System.out.println("索引错误");
            return -1;
        }
        return array[b];
    }
}
