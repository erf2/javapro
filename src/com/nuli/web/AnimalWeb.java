package com.nuli.web;

import com.nuli.pojo.Animal;
import com.nuli.service.AnimalService;
import com.nuli.service.IanimalService;

import java.util.List;
import java.util.Scanner;

/**
 * Created by lan_jia_nao on 2020/2/19.
 */
public class AnimalWeb {
    IanimalService animalService = new AnimalService();
    public void showmain(){
        System.out.println("0 -----------------");
        System.out.println("1 -------------查询");
        System.out.println("2 -------------添加");
        System.out.println("3 -------------删除");
        System.out.println("4 -------------修改");
        System.out.println("其它-----------退出");
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i==1){
            query();
        }else if (i==2){
            add(scanner);
        }else if (i==3){
            del(scanner);
        }else  if (i==4){
            update(scanner);
        }else{
            System.exit(0);
        }
    }
    private void query(){
        List<Animal> list = animalService.query();
        for (Animal animal : list){
            System.out.println(animal);
        }
    }
    private void add(Scanner scanner){
        System.out.println("请输入动物的名字");
        String name = scanner.next();
        System.out.println("请输入动物的所有者");
        String holder = scanner.next();
        Animal animal = new Animal(name,holder);
        animalService.add(animal);
        query();
    }
    private void del(Scanner scanner){
        System.out.println("请输入要删除的动物id");
        int id = scanner.nextInt();
        animalService.del(id);
        query();
    }
    private void update(Scanner scanner){
        System.out.println("请输入要修改的动物id");
        int id = scanner.nextInt();
        System.out.println("请输入要修改动物的名字");
        String name = scanner.next();
        System.out.println("请输入要修改动物的所有者");
        String holder = scanner.next();
        Animal animal = new Animal(id,name,holder);
        animalService.update(animal);
        query();
    }
}
