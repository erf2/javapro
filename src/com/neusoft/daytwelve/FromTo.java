package com.neusoft.daytwelve;

import java.io.*;

/**
 * Created by lan_jia_nao on 2020/2/13.
 */
public class FromTo {
    public static void main(String[] args) {
        File from = new File("d:/7 git.wmv");
        File parent = new File("d:/a/ab");
        if (!parent.exists()){
            parent.mkdirs();
        }
        File to = new File("d:/a/ab/"+from.getName());
        InputStream is = null;
        OutputStream os = null;
        byte[] b = new byte[1024];
        try {
            is = new FileInputStream(from);
            os = new FileOutputStream(to);
            int len = is.read(b);
            while (len!= -1){
                os.write(b,0,len);
                os.flush();
                len = is.read(b);
            }
            System.out.println("复制完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (os!= null);
                    os.close();
                if (is!= null);
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
