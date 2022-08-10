
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jayashankaha Deshan
 */
public class LOG_IN extends javax.swing.JFrame {

    /**
     * Creates new form LOG_IN
     */
    public LOG_IN() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        log = new javax.swing.JButton();
        un = new javax.swing.JTextField();
        uname = new javax.swing.JLabel();
        pword = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pw = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sltc.PNG"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 150));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/animated-library-image-0015.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 170, 240));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 255));
        jLabel4.setText("LIBRARY MANAGEMENT SYSTEM");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 440, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimalistic-wallpapers-collection-themefoxx (124).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 550));

        log.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        log.setText("LOG IN");
        log.setBorder(null);
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        getContentPane().add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 120, 30));
        getContentPane().add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 225, 39));

        uname.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        uname.setText("USER NAME :");
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, 39));

        pword.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        pword.setText("PASSWORD :");
        getContentPane().add(pword, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 173, 39));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("WELCOME");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 350, 90));
        getContentPane().add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 230, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        // TODO add your handling code here:
        String uname = un.getText();
        String pword = pw.getText();
        
        if(uname.equals("user") && pword.equals("sltc")){
           JOptionPane.showMessageDialog(rootPane, "Your Login attempt successfull."); 
           new HOME_PAGE().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Your Login attempt Unsuccessfull.Please check your pass word and user name again");
        }
    }//GEN-LAST:event_logActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LOG_IN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOG_IN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOG_IN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOG_IN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOG_IN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton log;
    private javax.swing.JPasswordField pw;
    private javax.swing.JLabel pword;
    private javax.swing.JTextField un;
    private javax.swing.JLabel uname;
    // End of variables declaration//GEN-END:variables
}
