package no.kristiania.http;

import java.io.IOException;
import java.net.Socket;

public class HttpClient {
    public static void main(String[] args) throws IOException {

        String request = "GET /echo HTTP/1.1\r\n"
                + "Host: urlecho.appspot.com\r\n"
                + "\r\n";

        Socket socket = new Socket("urlecho.appspot.com", 80);

        socket.getOutputStream().write(request.getBytes());

        int c;
        while((c = socket.getInputStream().read()) != -1) {
            System.out.print((char) c);
        }
    }
}
