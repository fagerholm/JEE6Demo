package no.jaf.demo.demo.business;

import java.net.Socket;


public class PortScanner {

    public void scan(int startPort, int endPort) {
        int startPortRange = startPort;
        int stopPortRange = endPort;

        for (int i = startPortRange; i <= stopPortRange; i++) {
            try {
                Socket serverSocket = new Socket("127.0.0.1", i);
                System.out.println("Port in use: " + i);
                serverSocket.close();
            } catch (Exception e) {
                // Could not open connection. Port not in use
            }
        }
    }
}
