import java.io.*;
import java.net.*;
import java.util.*;

public class portscan {

    public static void scanPorts(String ip) {
        System.out.println("Scanning ports on: " + ip);
        for (int port = 1; port <= 1024; port++) {
            try (Socket socket = new Socket()) {
                socket.connect(new InetSocketAddress(ip, port),200);
                System.out.println("[+] Port open: " + port);
            } catch (IOException e) {

            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter IP or domain to scan (without http): ");
        String ip = scanner.nextLine();

        scanPorts(ip);
    }
}