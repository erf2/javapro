package com.zsgc.web;

import com.zsgc.pojo.Student;
import com.zsgc.service.IstudentService;
import com.zsgc.service.StudentService;

import java.util.List;
import java.util.Scanner;

/**
 * Created by lan_jia_nao on 2020/2/18.
 */
public class StudentWeb {
    IstudentService istudentService = new StudentService();
    public void showmain(){
        System.out.println("------------------------------");
        System.out.println("1 ------------------------查询");
        System.out.println("2 ------------------------添加");
        System.out.println("3 ------------------------修改");
        System.out.println("4 ------------------------删除");
        System.out.println("其他 ---------------------退出");
        System.out.println("------------------------------");
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i==1){
            query();
        }else if (i==2){
            add(scanner);
        }else if (i==3){
            update(scanner);
        }else if (i==4){
            del(scanner);
        }else{
            System.exit(0);
        }
    }
    public void query(){
        List<Student> list = istudentService.query();
        for (Student student : list){
            System.out.println(student);
        }
    }
    public void add(Scanner scanner){
        System.out.println("请输入要添加的名字");
        String name = scanner.next();
        System.out.println("请输入要添加的年龄");
        int age = scanner.nextInt();
        System.out.println("请输入性别 1-男 0-女");
        int gender = scanner.nextInt();
        Student student = new Student(name,age,gender);
        istudentService.add(student);
        query();
    }
    public void update(Scanner scanner){
        System.out.println("请输入要修改的id");
        int id = scanner.nextInt();
        System.out.println("请输入要修改的名字");
        String name = scanner.next();
        System.out.println("请输入要修改的年龄");
        int age = scanner.nextInt();
        System.out.println("请输入性别 1-男 0-女");
        int gender = scanner.nextInt();
        Student student = new Student(id,name,age,gender);
        istudentService.update(student);
        query();
    }
    public void del(Scanner scanner){
        System.out.println("请输入要删除的id");
        int id = scanner.nextInt();
        istudentService.del(id);
        query();
    }
}
