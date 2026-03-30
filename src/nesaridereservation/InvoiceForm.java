
package nesaridereservation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class InvoiceForm extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public InvoiceForm() {
        initComponents();
        setTitle("Invoice Form");
        
        con = Database.mycon();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl_penumpang = new javax.swing.JLabel();
        lbl_telepon = new javax.swing.JLabel();
        lbl_driver = new javax.swing.JLabel();
        lbl_lokasi = new javax.swing.JLabel();
        lbl_tarif = new javax.swing.JLabel();
        lbl_jumlah = new javax.swing.JLabel();
        lbl_bayar = new javax.swing.JLabel();
        lbl_kembalian = new javax.swing.JLabel();
        lbl_admin = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/200.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 120, 180, 180));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Invoice Form");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("GoLite Reservation");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(110, 110, 110))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 27, 446, 160));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 300));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Detail Pesanan Anda");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        lbl_penumpang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_penumpang.setText("jLabel5");
        jPanel4.add(lbl_penumpang, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 140, -1));

        lbl_telepon.setText("jLabel5");
        jPanel4.add(lbl_telepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 140, -1));

        lbl_driver.setForeground(new java.awt.Color(102, 102, 102));
        lbl_driver.setText("jLabel5");
        jPanel4.add(lbl_driver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 140, -1));

        lbl_lokasi.setForeground(new java.awt.Color(102, 102, 102));
        lbl_lokasi.setText("jLabel5");
        jPanel4.add(lbl_lokasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, -1));

        lbl_tarif.setForeground(new java.awt.Color(102, 102, 102));
        lbl_tarif.setText("jLabel5");
        jPanel4.add(lbl_tarif, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, -1));

        lbl_jumlah.setForeground(new java.awt.Color(102, 102, 102));
        lbl_jumlah.setText("jLabel5");
        jPanel4.add(lbl_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, -1));

        lbl_bayar.setForeground(new java.awt.Color(102, 102, 102));
        lbl_bayar.setText("jLabel5");
        jPanel4.add(lbl_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, -1));

        lbl_kembalian.setForeground(new java.awt.Color(102, 102, 102));
        lbl_kembalian.setText("jLabel5");
        jPanel4.add(lbl_kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 150, -1));

        lbl_admin.setText("jLabel5");
        jPanel4.add(lbl_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 140, -1));

        lbl_total.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_total.setText("jLabel5");
        jPanel4.add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 140, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 440, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(InvoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_admin;
    private javax.swing.JLabel lbl_bayar;
    private javax.swing.JLabel lbl_driver;
    private javax.swing.JLabel lbl_jumlah;
    private javax.swing.JLabel lbl_kembalian;
    private javax.swing.JLabel lbl_lokasi;
    private javax.swing.JLabel lbl_penumpang;
    private javax.swing.JLabel lbl_tarif;
    private javax.swing.JLabel lbl_telepon;
    private javax.swing.JLabel lbl_total;
    // End of variables declaration//GEN-END:variables
}
