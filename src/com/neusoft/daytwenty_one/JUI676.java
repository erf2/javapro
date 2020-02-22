package com.neusoft.daytwenty_one;

/**
 * Created by lan_jia_nao on 2020/2/22.
 */
public class JUI676 {
    public static void main(String[] args){
        /*int[] array = {1,2,3,4};
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                for (int k=0;k<array.length;k++){
                    if (array[j]!=array[i]){
                        if (array[k]!=array[i]&&array[k]!=array[j]){
                            int a = array[i]*100+array[j]*10+array[k];
                            System.out.println(a);
                        }
                    }
                }
            }
        }*/
        /*int sum = 0;
        for (int i=1;i<=100;i++){
            if (i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);*/
        /*int m = 5;
        int n = 2;
        int sum = 1;
        for (int i = 0; i < n; i++) {
            sum = sum*m;
        }
        System.out.println(sum);*/
        /*int x = 18;
        int y = 45;
        for (int i=min(x,y);i<(x*y);i++){
            if (i%x==0&&i%y==0){
                System.out.println(i);
                break;
            }
        }*/
        /*int x = 9;
        int y = 6;
        int max = 1;
        for (int i=1;i<=min(x,y);i++){
            if (x%i==0&&y%i==0){
                max = i;
            }
        }
        System.out.println(max);*/
        /*for (int i=100;i<=999;i++){
            int x = (i/100)*(i/100)*(i/100);
            int y = ((i/10)%10)*((i/10)%10)*((i/10)%10);
            int z = (i%10)*(i%10)*(i%10);
            if ((x+y+z)==i)
                System.out.println(i);
        }*/
        /*for (int i=100;i<=999;i++){
            if ((i/100)*(i/100)*(i/100)+((i/10)%10)*((i/10)%10)*((i/10)%10)+(i%10)*(i%10)*(i%10)==i){
                System.out.println(i);
            }
        }*/

    }

    private static int min(int x, int y) {
        return (x>y)?x:y;
    }
}
