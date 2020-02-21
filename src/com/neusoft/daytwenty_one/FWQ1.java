package com.neusoft.daytwenty_one;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by lan_jia_nao on 2020/2/21.
 */
public class FWQ1 implements Runnable {

    @Override
    public void run() {
        try {
            Socket socket = new Socket("localhost",8888);
            System.out.println("服务器已接通");
            Scanner scanner = new Scanner(System.in);
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            while (true){
                String str = scanner.nextLine();
                ps.println(str);
                ps.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
