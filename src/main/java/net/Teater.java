package net;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Teater {

    public static void main(String[] args) {
        try{
            Socket socket1 = new Socket("www.google.com", 80);
            Socket socket2 = new Socket("www.netflix.com", 80);
            Socket socket3 = new Socket("www.youtube.com", 80);
            InputStream is = socket1.getInputStream();
            for (int i = 0; i < 5; i++) {
                int data = is.read();
                System.out.println((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }







    }

}
