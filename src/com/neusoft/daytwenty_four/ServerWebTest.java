package com.neusoft.daytwenty_four;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lan_jia_nao on 2020/2/24.
 */
public class ServerWebTest {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1111);
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
            byte[] b = new byte[1024];
            int a = is.read(b);
            String str = new String(b,0,a);
            System.out.println(str);
            OutputStream os = socket.getOutputStream();
            StringBuilder sb = new StringBuilder();
            sb.append("HTTP/1.1 200 OK\n");
            sb.append("Content-type: text/html\n");
            sb.append("\r\n");
            sb.append("<html>");
            sb.append("<head>");
            sb.append("<style>.re{width:200px;height:200px;background:#ff0000;}</style>");
            sb.append("</head>");
            sb.append("<body>");
            sb.append("<div class='re'>fkdjsfljsdkl</div>");
            sb.append("</body>");
            sb.append("</html>");
            os.write(sb.toString().getBytes());
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
