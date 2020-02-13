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
        System.out.println("是否存在"+file.exists());
    }
    public static void jianTieWenJian() {
        InputStream inputStream = null;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要查找的文件地址+文件名");
            String a = scanner.next();
            file = new File(a);
            if (!file.exists()){
                System.out.println("文件不存在");
                jianTieWenJian();
                return;
            }
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
    public static void zhanTieWenJian() {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要查找的文件地址+文件名");
            System.out.println("默认存放在d:盘");
            String a = scanner.next();
            file = new File(a);
            if (!file.exists()){
                System.out.println("文件不存在");
                jianTieWenJian();
                return;
            }
            inputStream = new FileInputStream(a);
            outputStream = new FileOutputStream("d:/a");
            byte[] bytes = new byte[1024];
            int b = inputStream.read(bytes);
            while (b!= -1){
                inputStream.read(bytes,0,b);
                outputStream.write(bytes);
                outputStream.flush();
                b = inputStream.read(bytes);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream!= null)
                    outputStream.close();
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
