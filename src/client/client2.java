package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class client2 {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getByName("10.26.12.228");
            InetSocketAddress isa = new InetSocketAddress(ia,1234);
            Socket s = new Socket();
            s.connect(isa);
            System.out.println("client 2 Connected to server.");
            InputStream is = s.getInputStream();
            InputStreamReader isr= new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String msg = br.readLine();
            System.out.println(msg);

            // Rest of the client code here...
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
