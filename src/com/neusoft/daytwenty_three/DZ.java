package com.neusoft.daytwenty_three;

/**
 * Created by lan_jia_nao on 2020/2/23.
 */
public class DZ {
    public int[] array;
    public int size;

    public DZ() {
        size = 0;
        array = new int[10];
    }

    public int getSize(){
        return size;
    }

    public void add(int i) {
        if (size>=array.length){
            int[] newarray = new int[size+size/2];
            for (int j=0;j<array.length;j++){
                newarray[j] = array[j];
            }
            array=newarray;
            System.out.println("扩容完成，新数组长度为"+array.length);
        }
        array[size++] = i;
    }

    public int getIndex(int index){
        if (index<0||index>size){
            System.out.println("索引错误");
            return -1;
        }
        return array[index];
    }
}
