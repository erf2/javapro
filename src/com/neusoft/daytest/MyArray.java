package com.neusoft.daytest;

/**
 * Created by lan_jia_nao on 2020/2/10.
 */
public class MyArray {
    private int[] array;
    private int size;
    public  MyArray(){
        size=0;
        array=new int[10];
    }
    public void add(int i){
        if (size>=array.length){
            int[] newarray=new int[size+size/2];
            for (int j=0;j<array.length;j++){
                newarray[j]=array[j];
            }
            array=newarray;
            System.out.println("扩容了新数组长度为"+array.length);
        }
        array[size++]=i;
    }
    /*public MyArray(int[] newarray,int size){
        size=size+size/2;
        for (int i=0;i<newarray.length;i++){
            newarray=new int[size];
        }
        array=newarray;
    }*/

    /*public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getNewarray() {
        return newarray;
    }

    public void setNewarray(int[] newarray) {
        this.newarray = newarray;
    }*/
    /*public static void main(String[] args) {
        int[] array = new int[6];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;
        array[5]=6;
        int[] newarray = new int[11];
        newarray[0]=array[0];
        newarray[1]=array[1];
        newarray[2]=array[2];
        newarray[3]=array[3];
        newarray[4]=array[4];
        newarray[5]=array[5];
        newarray[6]=7;
        array=newarray;
        for (int a: array){
            System.out.println(a);
        }
    }*/
}
