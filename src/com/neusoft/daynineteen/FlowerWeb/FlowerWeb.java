package com.neusoft.daynineteen.FlowerWeb;

import com.neusoft.daynineteen.FlowerService.FlowerService;
import com.neusoft.daynineteen.FlowerService.IflowerService;
import com.neusoft.daynineteen.pojo.Flower;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lan_jia_nao on 2020/2/19.
 */
public class FlowerWeb {
    IflowerService flowerService = new FlowerService();
    public void showmenue(){
        System.out.println("-------------0.目录-------------");
        System.out.println("-------------1.查询-------------");
        System.out.println("-------------2.买入-------------");
        System.out.println("-------------3.卖出-------------");
        System.out.println("-------------4.调换-------------");
        System.out.println("-------------5.退出-------------");
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入选项");
        int i = scanner.nextInt();
        switch (i){
            case 1: {
                query();
                break;
            }
            case 2: {
                buy(scanner);
                break;
            }
            case 3: {
                sell(scanner);
                break;
            }
            case 4: {
                exchange(scanner);
                break;
            }
            default : {
                quit();
            }
        }
    }
    public void query(){
        List<Flower> list = flowerService.query();
        for (Flower flowers : list){
            System.out.println(flowers);
        }
    }
    public void buy(Scanner scanner){
        System.out.println("请输入要买入的花名");
        String name = scanner.next();
        System.out.println("请输入花的颜色");
        String color = scanner.next();
        System.out.println("请输入花季");
        String weather = scanner.next();
        System.out.println("请输入花的数量");
        int no = scanner.nextInt();
        Flower flower = new Flower(name,color,weather,no);
        flowerService.buy(flower);
    }
    public void sell(Scanner scanner){
        System.out.println("请输入花的id");
        int id = scanner.nextInt();
        flowerService.sell(id);
    }
    public void exchange(Scanner scanner){
        System.out.println("请输入要调换的花id");
        int  id= scanner.nextInt();
        System.out.println("请输入要调换过后的花名");
        String name = scanner.next();
        System.out.println("请输入花的颜色");
        String color = scanner.next();
        System.out.println("请输入花季");
        String weather = scanner.next();
        System.out.println("请输入花的数量");
        int no = scanner.nextInt();
        Flower flower = new Flower(id,name,color,weather,no);
        flowerService.exchange(flower);
    }
    public void quit(){
        System.exit(0);
    }
}
