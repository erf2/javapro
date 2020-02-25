package com.neusoft.daytwenty_five;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lan_jia_nao on 2020/2/25.
 */
public class KU8 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(2222);
            Socket socket = ss.accept();
            InputStream is = socket.getInputStream();
            /*InputStreamReader isr = new InputStreamReader(is);
            char[] c = new char[1024];
            int read = isr.read(c);
            String str = new String(c,0,read);*/
            byte[] b = new byte[1024];
            int a = is.read(b);
            String str = new String(b,0,a);
            System.out.println(str);
            OutputStream os = socket.getOutputStream();
            StringBuilder sb = new StringBuilder();
            sb.append("dklsjfklsjfklsdjklfjs");
            os.write(sb.toString().getBytes());
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
