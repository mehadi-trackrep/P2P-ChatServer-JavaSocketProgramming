
package p2p.messenger;

/**
 *
 * @author Mehadi_49
 */
public class Check1 {
    public static void main(String[] args){
        String str = "ADMINRG-TF8PIAQ/192.168.0.107: 123";
        String remainder = str.substring(str.indexOf(":")+1, str.length());
        System.out.println("reminder==> " + remainder);
    }
}
