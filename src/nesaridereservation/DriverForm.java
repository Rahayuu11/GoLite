
package nesaridereservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.io.File;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class DriverForm extends javax.swing.JFrame {
    
    public Connection con;
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel dtm;

    public DriverForm() {
        initComponents();
        
        setTitle("Driver Form");
        
        String[] header = {"Penumpang","No","Driver","Lokasi","Ride","Car","Tarif","Jumlah"};
        dtm = new DefaultTableModel(header, 0);
        dv_table.setModel(dtm);
        tampil();
    }
    
    public void tampil(){
    
    Database Database = new Database();
        
        try{
            
            con = Database.mycon();
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM pesanan");

            
            while(rs.next()){
                String[] row = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)};
                dtm.addRow(row);
            }
            dv_table.setModel(dtm);
            
        } catch(SQLException ex){
            System.out.println(ex);
        }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dv_table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_cetak = new javax.swing.JButton();
        bt_hapus = new javax.swing.JButton();
        bt_kembali = new javax.swing.JButton();
        bt_keluar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dv_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(dv_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 760, 190));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Driver Form");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GoLite Reservation");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/100.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 409, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 110));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Hai Driver! Hubungi penumpang Anda pada pesanan di bawah ini");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        bt_cetak.setBackground(new java.awt.Color(0, 153, 153));
        bt_cetak.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_cetak.setForeground(new java.awt.Color(255, 255, 255));
        bt_cetak.setText("Cetak");
        bt_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cetakActionPerformed(evt);
            }
        });
        jPanel1.add(bt_cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 120, -1));

        bt_hapus.setBackground(new java.awt.Color(0, 153, 153));
        bt_hapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_hapus.setForeground(new java.awt.Color(255, 255, 255));
        bt_hapus.setText("Hapus");
        bt_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hapusActionPerformed(evt);
            }
        });
        jPanel1.add(bt_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 120, -1));

        bt_kembali.setBackground(new java.awt.Color(0, 153, 153));
        bt_kembali.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_kembali.setForeground(new java.awt.Color(255, 255, 255));
        bt_kembali.setText("Kembali");
        bt_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_kembaliActionPerformed(evt);
            }
        });
        jPanel1.add(bt_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 120, -1));

        bt_keluar.setBackground(new java.awt.Color(0, 153, 153));
        bt_keluar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_keluar.setForeground(new java.awt.Color(255, 255, 255));
        bt_keluar.setText("Keluar");
        bt_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_keluarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 120, -1));

        jLabel4.setText("How to use this Form?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 130, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Help");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_keluarActionPerformed
    
        int answer = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin keluar?", "Keluar", JOptionPane.OK_OPTION);
        if(answer == JOptionPane.OK_OPTION){
            dispose();
        }
        
    }//GEN-LAST:event_bt_keluarActionPerformed

    private void bt_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_kembaliActionPerformed
        
        int answer = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin kembali ke menu Login?", "Kembali", JOptionPane.OK_OPTION);
        if(answer == JOptionPane.OK_OPTION){
            dispose();
        
        LoginForm lg = new LoginForm();
        DriverForm dv = new DriverForm();
        lg.setVisible(true);
        this.setVisible(false);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(DriverForm.EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_bt_kembaliActionPerformed

    private void bt_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hapusActionPerformed
        
        dv_table.setValueAt("", dv_table.getSelectedRow(), 0);
        dv_table.setValueAt("", dv_table.getSelectedRow(), 1);
        dv_table.setValueAt("", dv_table.getSelectedRow(), 2);
        dv_table.setValueAt("", dv_table.getSelectedRow(), 3);
        dv_table.setValueAt("", dv_table.getSelectedRow(), 4);
        dv_table.setValueAt("", dv_table.getSelectedRow(), 5);
        dv_table.setValueAt("", dv_table.getSelectedRow(), 6);
        dv_table.setValueAt("", dv_table.getSelectedRow(), 7);

        JOptionPane.showMessageDialog(rootPane, "Pesanan telah dihapus");
    }//GEN-LAST:event_bt_hapusActionPerformed

    private void bt_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cetakActionPerformed
        
        String jdbc_driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String pass = "";
        String url = "jdbc:mysql://127.0.0.1:3306/nesaridedb";
        File reportFile = new File(".");
        String dirr = "";
        
        try {
            
            Class.forName(jdbc_driver);
            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM pesanan";
            dirr = reportFile.getCanonicalPath() + "/src/Report/";
            JasperDesign design = JRXmlLoader.load(dirr + "ReportPesanan.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(design);
            ResultSet rs = st.executeQuery(sql);
            JRResultSetDataSource rsDataSource = new JRResultSetDataSource(rs);
            JasperPrint jp = JasperFillManager.fillReport(jr, new HashMap(), rsDataSource);
            JasperViewer.viewReport(jp);
            
        } catch(Exception e){ 
            JOptionPane.showMessageDialog(this, "Gagal menampilkan Report Pesanan " +e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_cetakActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        String pesan = "<html>"
        + "<b>Langkah-langkah Penggunaan</b><br><br>"
        + "1. Menu ini dibuat untuk user sebagai Driver yang akan<br>"
        + "   mengambil pesanan.<br><br>"
        + "2. Menu ini juga menampilkan hasil pemesanan dari Penumpang<br>"
        + "   yang telah membuat pesanan pada tabel.<br><br>"
        + "3. Driver dapat melihat hasil pemesanan, kemudian Driver dapat<br>"
        + "   menghubungi Nomor Telepon Penumpang dari data yang ditampilkan.<br><br>"
        + "4. Selain itu, Driver dapat mencetak pesanan pada kolom Cetak, <br>"
        + "   kemudian hasil cetak pesanan akan muncul berupa laporan pesanan.<br><br>"
        + "5. Apabila Driver telah menyelesaikan pesanan, Driver dapat menghapus<br>"
        + "   pesanan dengan menekan tombol hapus.";

        JOptionPane.showMessageDialog(this, pesan, "Panduan Penggunaan Menu Driver Form" , JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(DriverForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DriverForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DriverForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DriverForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DriverForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cetak;
    private javax.swing.JButton bt_hapus;
    private javax.swing.JButton bt_keluar;
    private javax.swing.JButton bt_kembali;
    private javax.swing.JTable dv_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private Connection getConnection() {
        throw new UnsupportedOperationException(""); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
