
import java.awt.Toolkit;
import java.awt.event.WindowEvent;


public class HOME_PAGE extends javax.swing.JFrame {


    public HOME_PAGE() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        return_books = new javax.swing.JButton();
        view_update_members = new javax.swing.JButton();
        add_Remove_books = new javax.swing.JButton();
        lend_books = new javax.swing.JButton();
        add_remove_member = new javax.swing.JButton();
        view_books = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pay_window = new javax.swing.JButton();
        l_records = new javax.swing.JButton();
        us = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sltc.PNG"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 140));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("LIBRARY MANAGEMENT SYSTEM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 480, 50));

        return_books.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        return_books.setText("RETURN BOOKS");
        return_books.setBorder(null);
        return_books.setPreferredSize(new java.awt.Dimension(111, 41));
        return_books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_booksActionPerformed(evt);
            }
        });
        getContentPane().add(return_books, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, 250, 70));

        view_update_members.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        view_update_members.setText("VIEW & UPDATE MEMBERS");
        view_update_members.setPreferredSize(new java.awt.Dimension(111, 41));
        view_update_members.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_update_membersActionPerformed(evt);
            }
        });
        getContentPane().add(view_update_members, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 260, 70));

        add_Remove_books.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        add_Remove_books.setText("ADD & REMOVE BOOKS");
        add_Remove_books.setPreferredSize(new java.awt.Dimension(111, 41));
        add_Remove_books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_Remove_booksActionPerformed(evt);
            }
        });
        getContentPane().add(add_Remove_books, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 270, 70));

        lend_books.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        lend_books.setText("LEND BOOKS");
        lend_books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lend_booksActionPerformed(evt);
            }
        });
        getContentPane().add(lend_books, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 250, 70));

        add_remove_member.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        add_remove_member.setText("ADD & REMOVE MEMBERS");
        add_remove_member.setPreferredSize(new java.awt.Dimension(111, 41));
        add_remove_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_remove_memberActionPerformed(evt);
            }
        });
        getContentPane().add(add_remove_member, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 270, 70));

        view_books.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        view_books.setText("VIEW BOOKS");
        view_books.setPreferredSize(new java.awt.Dimension(111, 41));
        view_books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_booksActionPerformed(evt);
            }
        });
        getContentPane().add(view_books, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 260, 70));

        exit.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 260, 60));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1200, 410));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/librarian.PNG"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 370, 300));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chuttersnap-r_NZdQKV-LI-unsplash.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 310, 460));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new.PNG"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 510, 410));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimalistic-wallpapers-collection-themefoxx (124).jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1360, 110));

        pay_window.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        pay_window.setText("PAYMENT WINDOW");
        pay_window.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_windowActionPerformed(evt);
            }
        });
        getContentPane().add(pay_window, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 260, 60));

        l_records.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        l_records.setText("LENDING RECORDS");
        l_records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_recordsActionPerformed(evt);
            }
        });
        getContentPane().add(l_records, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 260, 60));

        us.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        us.setText("ABOUT US");
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        getContentPane().add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 250, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void return_booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_booksActionPerformed
        
        new RETURN_BOOKS().setVisible(true);    
    }//GEN-LAST:event_return_booksActionPerformed

    private void view_update_membersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_update_membersActionPerformed
        
        new VIEW_UPDATE_MEMBERS().setVisible(true);
    }//GEN-LAST:event_view_update_membersActionPerformed

    private void add_Remove_booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_Remove_booksActionPerformed
        
         new ADD_REMOVE_BOOKS().setVisible(true);
    }//GEN-LAST:event_add_Remove_booksActionPerformed

    private void lend_booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lend_booksActionPerformed
       
        new LEND_BOOKS().setVisible(true);
    }//GEN-LAST:event_lend_booksActionPerformed

    private void add_remove_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_remove_memberActionPerformed
        
        new ADD_REMOVE_MEMBERS().setVisible(true);
    }//GEN-LAST:event_add_remove_memberActionPerformed

    private void view_booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_booksActionPerformed
       
        new VIEW_BOOKS().setVisible(true);
    }//GEN-LAST:event_view_booksActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        
        close_window();
    }//GEN-LAST:event_exitActionPerformed

    private void pay_windowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_windowActionPerformed
      
        new PAYMENT_WINDOW().setVisible(true);
    }//GEN-LAST:event_pay_windowActionPerformed

    private void l_recordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_recordsActionPerformed
        // TODO add your handling code here:
         new LEND_RECORDS().setVisible(true);
    }//GEN-LAST:event_l_recordsActionPerformed

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
        new about().setVisible(true);
    }//GEN-LAST:event_usActionPerformed

    public void close_window()
    {
        WindowEvent new_event;
        
        new_event = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(new_event);
    }
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
            java.util.logging.Logger.getLogger(HOME_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HOME_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HOME_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HOME_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOME_PAGE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_Remove_books;
    private javax.swing.JButton add_remove_member;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton l_records;
    private javax.swing.JButton lend_books;
    private javax.swing.JButton pay_window;
    private javax.swing.JButton return_books;
    private javax.swing.JButton us;
    private javax.swing.JButton view_books;
    private javax.swing.JButton view_update_members;
    // End of variables declaration//GEN-END:variables
}
