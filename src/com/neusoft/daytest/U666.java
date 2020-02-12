package com.neusoft.daytest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lan_jia_nao on 2020/2/12.
 */
public class U666 {
    public static List<Teacher> thr = new ArrayList<>();
    public static File file = new File("d:/b");
    public static void main(String[] args) {
       /*aaa();*/
       bbb();
    }
    public static void aaa(){
        U777 u777 = new U777();
        u777.setAge(23);
        u777.setGrade("卓越1班");
        u777.setId(1998);
        u777.setName("二飞");
        thr.add(u777);
        if (!file.exists()){
            yaRu();
            read();
        }else{
            read();
        }
    }
    public static void yaRu(){
        OutputStream os = null;
        ObjectOutputStream oos = null;
        try {
            os = new FileOutputStream(file);
            oos = new ObjectOutputStream(os);
            oos.writeObject(thr);
            oos.flush();
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (oos!=null);
                    oos.close();
                if (os!=null);
                    os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void read(){
        InputStream is = null;
        ObjectInputStream ois = null;
        try {
            is = new FileInputStream(file);
            ois = new ObjectInputStream(is);
            thr = (List<Teacher>)ois.readObject();
            System.out.println(thr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void bbb(){
        File file = null;
        file = new File("d:/a.tet");
        try {
            if (!file.exists()){
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        OutputStream os = null;
        try {
            os = new FileOutputStream(file);
            String a = "faskldfsdafgf\nadfdsafsd\nfasdg\nfuywegfuygsdufgan\nsd\nfasdfasdgkfgsdhfhsdfhsdfs";
            os.write(a.getBytes());
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        InputStream is = null;
        try {
            is = new FileInputStream(file);
            byte[] a = new byte[10];
            int b = is.read(a);
            while (b != -1) {
                is.read(a);
                new String(a, 0, b);
                System.out.println(new String(a, 0, b));
                b = is.read(a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
