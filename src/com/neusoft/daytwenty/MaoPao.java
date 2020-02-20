package com.neusoft.daytwenty;

/**
 * Created by lan_jia_nao on 2020/2/20.
 */
public class MaoPao {
    public static void main(String[] args) {
        int[] ints ={1,2,3,45,7,8,41,0,11,44,33,5,24};
        int flag = 0;
        for (int i=0;i<ints.length-1;i++){
            for ( int j=0;j<ints.length-1-i;j++){
                if (ints[j]>ints[j+1]){
                    int temp = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = temp;
                }
                flag++;
            }
            if (flag==0){
                break;
            }
        }
        for (int a : ints){
            System.out.println(a);
        }
    }
}
