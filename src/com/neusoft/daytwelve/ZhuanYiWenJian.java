package com.neusoft.daytwelve;

import java.io.*;
import java.util.Scanner;

/**
 * Created by lan_jia_nao on 2020/2/12.
 */
public class ZhuanYiWenJian {
    public static File file = null;
    public static void zhaoWenJian() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找的文件地址+文件名");
        String a = scanner.next();
        File file = new File(a);
        System.out.println("是否存在"+file.isDirectory());
    }
    public static void jianTieWenJian() {
        InputStream inputStream = null;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要查找的文件地址+文件名");
            String a = scanner.next();
            file = new File(a);
            System.out.println("是否存在"+file.isDirectory());
            if (!file.exists())
                jianTieWenJian();
            inputStream = new FileInputStream(a);
            byte[] bytes = new byte[1024];
            int b = inputStream.read(bytes);
            while (b!= -1){
                inputStream.read(bytes);
                b = inputStream.read(bytes);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /*public static void zhanTieWenJian() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要粘贴的到的地址");
        String o = scanner.next();
        file = new File(o);
        OutputStream outputStream = null;
        InputStream inputStream = null;
        try {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("请输入要查找的文件地址+文件名");
            String a = scanner1.next();
            file = new File(a);
            System.out.println("是否存在"+file.canRead());
            if (!file.isDirectory()==true)
                jianTieWenJian();
            inputStream = new FileInputStream(a);
            byte[] bytes = new byte[1024];
            int b = inputStream.read(bytes);
            while (b!= -1){
                inputStream.read(bytes);
                b = inputStream.read(bytes);
            }
            outputStream = new FileOutputStream(file, true);
            outputStream.write(bytes);
            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null)
                    inputStream.close();
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }*/
}
