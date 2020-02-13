package com.neusoft.daytwelve;

/**
 * Created by lan_jia_nao on 2020/2/13.
 */
public interface JieKou2 {
    int method(int a, int b);
}
class Test {

    public static void main(String[] args) {
        JieKou2 jia = new Add();
        JieKou2 jian = new Jian();
        System.out.println(jia.method(1,2));
        System.out.println(jian.method(1,2));
    }
}
class Test1 {
    public static int method(int a,int b,JieKou2 jieKou2){
        return jieKou2.method(1,2);
    }
}
class Add implements JieKou2 {

    @Override
    public int method(int a, int b) {
        return a + b;
    }
}

class Jian implements JieKou2 {

    @Override
    public int method(int a, int b) {
        return a - b;
    }
}
