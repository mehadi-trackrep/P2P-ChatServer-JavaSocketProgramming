
package p2p.messenger;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Client {
    public static int port, sender_file_ck = 0;
    public static String chats_from_client_gui,sender_name;
    public static File sender_file = null;  // INITIALLY null
    public static InetAddress destination_ip_address;
    
    public Client(){
    }
    
    public static Socket socket;
    InputStream is;
    
    public void startClient(String host) {
        try{
            port = 6543;  // =======================================
            InetAddress address = InetAddress.getByName(host);
            this.destination_ip_address = address;   /// ..................
            socket = new Socket(address, port);
            is = socket.getInputStream();
            new Thread(new Receiver(is)).start();
        }
        catch (Exception ex){
            ex.printStackTrace();
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Could not establish a connection to " + host);
            System.exit(0);
        }
        
    }
    
    public void sendMessage(String message){
            OutputStream os = null;
        try {
            os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter buffer = new BufferedWriter(osw);
            buffer.write(message);
            buffer.flush();
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Receiver implements Runnable{
    
    InputStream is;
    public Receiver(InputStream is){
        this.is = is;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("Inside client receiver thread");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String message = null;
            try {
                System.out.println("Inside client receiver thread before readline");
                message = br.readLine();
                System.out.println("Recieved message is :- " + message);
            }catch (IOException ex) {
                Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(message != null){
                first_gui_options.m.serverchat(message + "\n");
                System.out.println("Message received from the server : " +message);
            }
        }
    }
    
}
