
package p2p.messenger;

import java.io.File;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static p2p.messenger.P2PMessenger.mylocalIP;

public class P2PMessenger {
    public static String hostIP,mylocalIP =null;
    public static InetAddress myIP;

    public static void main(String[] args) {
        try {
            myIP = InetAddress.getLocalHost(); //InetAddress.getLocalHost()
            mylocalIP = myIP.getHostAddress();
        }catch (UnknownHostException ex) {
            Logger.getLogger(P2PMessenger.class.getName()).log(Level.SEVERE, null, ex);
        }
        new first_gui_options().setVisible(true);
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
