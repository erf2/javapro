package com.neusoft.dayten;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lan_jia_nao on 2020/2/10.
 */
public class Mybooktest {
    public static Mybook[] array = new Mybook[200];
    public static List<Mybook> books = new ArrayList<>();
    public static void main(String[] args) {
        inputData(books);
        menu();

    }
    public static void menu(){
        System.out.println("输出菜单项请选择你要进行的操作（请输入1-4中的任一个数字）：");
        System.out.println("1：添加图书");
        System.out.println("2：删除图书");
        System.out.println("3：查找图书（根据书名）");
        System.out.println("4：查找全部图书");
        System.out.println("5：退出");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1 :{
                addBook(books);
                break;
            }
            case 2 :{
                Scanner scanner1 = new Scanner(System.in);
                String name = scanner.next();
                deleteName(books,name);
                break;
            }
            case 3 :{
                Scanner scanner1 = new Scanner(System.in);
                String mybook = scanner.next();
                searchName(books,mybook);
                break;
            }
            case 4 :{
                print(books);
                break;
            }
            case 5 :{
                Scanner scanner1 = new Scanner(System.in);
                System.exit(1);
                break;
            }
        }
    }
    public static void inputData(List<Mybook> books){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=1;i<=n;i++){
            Mybook mybook = new Mybook("书名"+i,Double.valueOf(String.valueOf(i)),"出版社"+i,"作者"+i,"书的ISBN号"+i);
            books.add(mybook);
        }
        menu();
    }
    public static void print(List<Mybook> books){
        for (int i=0;i<books.size();i++){
            System.out.println(books.get(i));
        }
        menu();
    }
    public static void searchName(List<Mybook> books,String name){
        for (int i=0;i<books.size();i++){
            if (books.get(i).getName().equals(name)){
                Mybook mybook = books.get(i);
                System.out.println(mybook);
                menu();
                return;
            }
        }
        System.out.println("此书不存在");
        menu();
    }
    public static void deleteName(List<Mybook> books,String name){
        for (int i=0;i<books.size();i++){
            if (books.get(i).getName().equals(name)){
                System.out.println(books.get(i));
                books.remove(i);
                System.out.println("此书删除成功");
                menu();
                return;
            }
        }
        System.out.println("没有此书，删除失败");
        menu();
    }
    public static void addBook(List<Mybook> books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名");
        String name = scanner.next();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入价格");
        Double price = scanner.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("请输入出版社");
        String press = scanner.next();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("请输入作者");
        String author = scanner.next();
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("请输入书的ISBN号");
        String bookISBN = scanner.next();
        Mybook mybook = new Mybook(name,price,press,author,bookISBN);
        books.add(mybook);
        menu();
    }
}
