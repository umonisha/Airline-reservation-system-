/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import static mypack.paymentdetails.passengerid2;

/**
 *
 * @author cskl
 */
public class airportdetails extends javax.swing.JFrame {

   
    public airportdetails() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        airportcode = new javax.swing.JTextField();
        airportname = new javax.swing.JTextField();
        backap = new javax.swing.JButton();
        saveap = new javax.swing.JButton();
        nextap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel1.setText("                                                                    FLIGHT RESERVATION");

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel2.setText("AIRPORT DETAILS");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel3.setText("AIPORT CODE");

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel4.setText("AIRPORT NAME");

        airportcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airportcodeActionPerformed(evt);
            }
        });

        backap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backap.setText("BACK");
        backap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backapActionPerformed(evt);
            }
        });

        saveap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        saveap.setText("SAVE");
        saveap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveapActionPerformed(evt);
            }
        });

        nextap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nextap.setText("NEXT");
        nextap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(airportcode, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                                    .addComponent(airportname)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(backap)
                                    .addComponent(jLabel2))
                                .addGap(167, 167, 167)
                                .addComponent(saveap)
                                .addGap(161, 161, 161)
                                .addComponent(nextap)))
                        .addGap(0, 450, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(airportcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(airportname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backap)
                    .addComponent(saveap)
                    .addComponent(nextap))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void airportcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airportcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airportcodeActionPerformed

    private void backapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backapActionPerformed
dispose();
paymentdetails pd=new paymentdetails();
pd.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_backapActionPerformed

    private void saveapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveapActionPerformed
                    String airport_code= airportcode.getText();
                    String airport_name = airportname.getText();
                try{ 
                  Class.forName("com.mysql.cj.jdbc.Driver");
                  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "akmonlav1980");
                  Statement pst=con.createStatement(); 
            PreparedStatement pst1;
            pst1 = con.prepareStatement("insert into airportdetails (airport_code, airport_name) values (?,?)");
            pst1.setString(1,airport_code);
            pst1.setString(2,airport_name);
           
 pst1.executeUpdate() ;
             System.out.println("Driver Loaded");
  }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
        catch(SQLException e){
            System.out.println(e);
        }          // TODO add your handling code here:
    }//GEN-LAST:event_saveapActionPerformed

    private void nextapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextapActionPerformed
dispose();
 flightdetails fd=new flightdetails();
 flightdetails.airportcode2.setText(this.airportcode.getText());
fd.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_nextapActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(airportdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(airportdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(airportdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(airportdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new airportdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airportcode;
    private javax.swing.JTextField airportname;
    private javax.swing.JButton backap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton nextap;
    private javax.swing.JButton saveap;
    // End of variables declaration//GEN-END:variables
}
