package com.neusoft.daytest;

import java.io.*;

/**
 * Created by lan_jia_nao on 2020/2/12.
 */
public class U888 {
    public static File file = new File("d:b/");

    public static void main(String[] args) {
        /*if (!file.exists()){
            rrr();
            ddd();
        }else{
            ddd();
        }*/
        /*if (!file.exists()){
            rrr();
            fff();
        }else{
            fff();
        }*/
        if (!file.exists()){
            sss();
            fff();
        }else{
            fff();
        }
    }
    public static void sss(){
        Writer writer = null;
        try {
            writer = new FileWriter(file);
            writer.write("dklsjflksjlfjsdoifwjeofjdklsaj");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (writer!=null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void fff(){
        Reader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader(file);
            br = new BufferedReader(reader);
            String str= br.readLine();
            while (str!=null){
                System.out.println(str);
                str = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (br!=null)
                    br.close();
                if (reader!=null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void ddd(){
        char[] a = new char[10];
        Reader reader = null;
        try {
            reader = new FileReader(file);
            int b = reader.read(a);
            while (b!= -1){
                System.out.println("读取字符数："+b);
                System.out.println(new String(a,0,b));
                b = reader.read(a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader!=null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void rrr(){
        OutputStream os = null;
        try {
            os = new FileOutputStream(file);
            String a ="fjdlaskjflsdjflkjsklfjsdijf'\ndsafhuisdfh\nsdffsdfasd";
            os.write(a.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os!=null)
                    os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
