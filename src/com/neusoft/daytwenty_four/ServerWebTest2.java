package com.neusoft.daytwenty_four;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lan_jia_nao on 2020/2/24.
 */
public class ServerWebTest2 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5555);
            Socket scoket = serverSocket.accept();
            InputStream is = scoket.getInputStream();
            byte[] b = new byte[1024];
            int a = is.read(b);
            String str = new String(b,0,a);
            System.out.println(str);
            OutputStream os = scoket.getOutputStream();
            StringBuilder sb = new StringBuilder();
            sb.append("HTTP/1.1 200 OK\n");
            sb.append("Content-type text/html\n");
            sb.append("\r\n");
            sb.append("<html>");
            sb.append("<head></head>");
            sb.append("<body><div class='yu' style='width:200px;height:200px;background:red;'>12312321</div></body>");
            sb.append("</html>");
            os.write(sb.toString().getBytes());
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
