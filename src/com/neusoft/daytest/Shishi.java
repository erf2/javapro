package com.neusoft.daytest;

/**
 * Created by lan_jia_nao on 2020/2/10.
 */
public abstract class Shishi {
    private int age;
    private int shengri;
    private int jinri;
    public Shishi(int age){
        this.age=age;
    }
    public abstract int getAge();
    public static void main(String[] args) {
        /*int[] array={1,2,3,4};
        for (int i=0;i<array.length;i++){
            int x=array[i]*100;
            for (int j=0;j<array.length;j++){
                if (j!=i){
                    int y=array[j]*10;
                    for (int k=0;k<array.length;k++){
                        if (k!=j&&k!=i){
                            int z=array[k];
                            int p=x+y+z;
                            System.out.println(p);
                        }
                    }
                }
            }
        }*/
        /*int sum=0;
        for(int i=1;i<=100;i++){
            if (i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);*/
        /*int m=4;
        int n=3;
        int r=1;
        for (int i=0;i<n;i++){
            r=r*m;
        }
        System.out.println(r);*/
        /*for (int x=100;x<=999;x++){
            int a=x/100;
            int b=x/10%10;
            int c=x%10;
            if (a*a*a+b*b*b+c*c*c==a*100+b*10+c){
                System.out.println(a*100+b*10+c);
            }
        }*/
        /*int a=2;
        int b=32;
        int max=1;
        int min=max(a,b);
        for (int i=1;i<=a&&i<=b;i++){
            if (a%i==0&&b%i==0){
                max=i;
            }
        }
        for (int i=min;i<=a*b;i++){
            if (i%a==0&&i%b==0){
                min=i;
                break;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    public static int max(int a,int b){
        return (a>b)? a:b;*/
    }
}
