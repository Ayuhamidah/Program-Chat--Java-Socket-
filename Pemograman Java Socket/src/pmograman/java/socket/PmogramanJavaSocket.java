package pmograman.java.socket;

import ChatClient.ChatClient;
import ChatClient2.ChatClient2;
import ChatServer.ChatServer;

public class PmogramanJavaSocket {
    public static void main(String[] args) {
        ChatClient Cc = new ChatClient();
        Cc.setVisible(true);
        ChatClient2 D = new ChatClient2();
        D.setVisible(true);
        ChatServer C = new ChatServer();
        C.start();        
    }
    
}