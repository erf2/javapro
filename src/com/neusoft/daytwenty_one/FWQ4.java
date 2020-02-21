package com.neusoft.daytwenty_one;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by lan_jia_nao on 2020/2/21.
 */
public class FWQ4 implements Runnable {
    @Override
    public void run() {
        try {
            Socket socket = new Socket("localhost",6666);
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
