
package p2p.messenger;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static p2p.messenger.P2PMessenger.mylocalIP;

public class Server {
    public static int port;
    public static String receiver_name;
    public static Socket socket;
    public static String FileName = "";
    
    public static ServerMessaging server = new ServerMessaging();
    
    public Server(){
        new Thread(new Receiver()).start();
        System.out.println("Receiver Server started");
    }
    
    public static void main(String[] args){
        new Thread(new Receiver()).start();
        System.out.println("Receiver Server started");
    }

    static class Receiver implements Runnable {

        private String host;

        public Receiver(){

        }
        @Override
        public void run() {
        
            JFrame frame = new JFrame();
            try
            {
                int port = 6543;
                System.out.println("******************LOGS*******************");
                System.out.println("Attempting to start a peer (server) on localhost:" + String.valueOf(port));
                ServerSocket serverSocket = new ServerSocket(port);
                System.out.println("SERVER STARTED");
                JOptionPane.showMessageDialog(frame, "now the other peer is required to provide the local ip address of your pc >> "+P2PMessenger.mylocalIP+" <<\n and press ok");
                System.out.println("Waiting for peers to be connected");
                while(true)
                {
                    socket = serverSocket.accept();
                    InputStream is;
                    System.out.println("CLIENT CONNECTED");
                    //InputStream is = socket.getInputStream();
                    is = socket.getInputStream();
                    InputStreamReader isr = new InputStreamReader(is);
                    BufferedReader buffer = new BufferedReader(isr);
                    System.out.println("Waiting for incoming message");
                    String message = buffer.readLine();
                    System.out.println("Incoming message from a client...");
                    System.out.println("Message received successfully... \"" + message + "\"");
                    server.setVisible(true);
                    server.serverchat(message+"\n");
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            finally
            {
                try
                {
                    socket.close();
                    System.exit(0);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }    
    }
}
