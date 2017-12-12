
package p2p.messenger;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Calendar;
import javax.swing.JFileChooser;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;

public class Messaging extends javax.swing.JFrame {
    
    public void serverchat(String message){
        Client.chats_from_client_gui = chatarea.getText() + message;  // ================GET all messages
        System.out.println("\n\n----------------------------CHECK messages----------------------------\n\n"+Client.chats_from_client_gui+"\nOOOO\n ");
        chatarea.setText(chatarea.getText() + message);
    }    
    Client c;
    public Messaging() {
        c = new Client();
        initComponents();
        setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        chatarea = new javax.swing.JTextArea();
        messagefield = new javax.swing.JTextField();
        sendbutton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chat_colorBtn = new javax.swing.JButton();
        reset_colorBtn = new javax.swing.JButton();
        save_messagesBtn = new javax.swing.JButton();
        show_messagesBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chatarea.setEditable(false);
        chatarea.setColumns(20);
        chatarea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        chatarea.setRows(5);
        jScrollPane1.setViewportView(chatarea);

        messagefield.setBackground(new java.awt.Color(237, 187, 153));
        messagefield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                messagefieldFocusGained(evt);
            }
        });

        sendbutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sendbutton.setText("SEND");
        sendbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbuttonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(57, 126, 219));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("P2P Messenger");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(272, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        chat_colorBtn.setText("Set Chat Color");
        chat_colorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chat_colorBtnActionPerformed(evt);
            }
        });

        reset_colorBtn.setText("Reset Chat Color");
        reset_colorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_colorBtnActionPerformed(evt);
            }
        });

        save_messagesBtn.setText("Save messages");
        save_messagesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_messagesBtnActionPerformed(evt);
            }
        });

        show_messagesBtn.setText("Show messages");
        show_messagesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_messagesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chat_colorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(reset_colorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(save_messagesBtn)
                        .addGap(18, 18, 18)
                        .addComponent(show_messagesBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(messagefield, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sendbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messagefield, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(show_messagesBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(save_messagesBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reset_colorBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chat_colorBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendbuttonActionPerformed
        // TODO add your handling code here:
        
         //Time getting
        int minute, hour, second;
        String zone = "am";
        String time = "";

        Calendar calendar = Calendar.getInstance();
        minute = calendar.get(Calendar.MINUTE);
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        if (hour >= 12) {
            zone = "pm";
        }
        if (hour > 12) {
            hour = hour % 12;
        }
        second = calendar.get(Calendar.SECOND);

        time = hour + ":" + minute + ":" + second + " " + zone;

//Time getting ends
        String message = messagefield.getText();
        //String chat = P2PMessenger.myIP + " >> " + message + "\n";
        String chat = first_gui_options.UserName + "    ==>>    " + message+"  ["+time+"]\n";  // ==============
        c.startClient(P2PMessenger.hostIP);
        c.sendMessage(chat);

        Client.chats_from_client_gui = chatarea.getText() + chat;
        System.out.println("\n\n----------------------------CHECK messages----------------------------\n\n"+Client.chats_from_client_gui+"\nOOOO\n ");
        
        chatarea.setText(chatarea.getText() + chat);
        messagefield.setText(null);
    }//GEN-LAST:event_sendbuttonActionPerformed

    private void messagefieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_messagefieldFocusGained
        // TODO add your handling code here:
        JRootPane rootPane = SwingUtilities.getRootPane(sendbutton); 
        rootPane.setDefaultButton(sendbutton);
    }//GEN-LAST:event_messagefieldFocusGained

    private void chat_colorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chat_colorBtnActionPerformed
        // TODO add your handling code here:
        //public void actionPerformed(ActionEvent e) {
        chatarea.setBackground(new Color(245, 176, 65));
        chatarea.repaint();
        //}
    }//GEN-LAST:event_chat_colorBtnActionPerformed

    private void reset_colorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_colorBtnActionPerformed
        // TODO add your handling code here:
        chatarea.setBackground(new Color(255, 255, 255));
        chatarea.repaint();
    }//GEN-LAST:event_reset_colorBtnActionPerformed

    private void save_messagesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_messagesBtnActionPerformed
        // TODO add your handling code here:
        BufferedWriter bufferedWriter = null;
        String s = first_gui_options.UserName;//"name2";   ///user name
        String filename = s+".txt";
        String filepath = "src/"+filename;
        File file = new File(filepath);
        
        try {
            //Construct the BufferedWriter object
            bufferedWriter = new BufferedWriter(new FileWriter(filepath));
            //Start writing to the output stream
            bufferedWriter.write(Client.chats_from_client_gui);  /// string

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
             //Close the BufferedWriter
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.flush();
                    bufferedWriter.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_save_messagesBtnActionPerformed

    private void show_messagesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_messagesBtnActionPerformed
        // TODO add your handling code here:
        String s = first_gui_options.UserName;
        String outstr=""; ///outstr is the string to be put in new pop up window
        
        try {
            String filetoread="src/"+s+".txt"; ///string s=user name
            File file2;
            file2 = new File(filetoread);
            BufferedReader br = new BufferedReader(new FileReader(file2));

            String st;
            while ((st = br.readLine()) != null) {
                System.out.println(st);
                outstr=outstr+st+"\n";
            }
            br.close();
       }
       catch(Exception e){
       }
       
       ShowMessage obj = new ShowMessage();
       obj.set_chats(outstr);
       obj.setVisible(true);
       obj.setResizable(false);
    }//GEN-LAST:event_show_messagesBtnActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Messaging().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chat_colorBtn;
    private javax.swing.JTextArea chatarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField messagefield;
    private javax.swing.JButton reset_colorBtn;
    private javax.swing.JButton save_messagesBtn;
    private javax.swing.JButton sendbutton;
    private javax.swing.JButton show_messagesBtn;
    // End of variables declaration//GEN-END:variables
}
