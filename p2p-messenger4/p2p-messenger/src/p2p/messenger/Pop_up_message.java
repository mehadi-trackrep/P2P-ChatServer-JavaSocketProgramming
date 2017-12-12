
package p2p.messenger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mehadi_49
 */

public class Pop_up_message
{

    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}