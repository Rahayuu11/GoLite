/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nesaridereservation;

import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JOptionPane;


public class HomeForm extends javax.swing.JFrame {
    
    int handphone, ride, car, tarif, beli, total, bayar, kembalian, admin, biayaAdmin;
    
    
    public HomeForm() {
        initComponents();
        
        setTitle("Home Form");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btn_submit = new javax.swing.JButton();
        btn_input = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        bt_kembali = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbl_h_uname = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txt_penumpang = new javax.swing.JTextField();
        txt_notelepon = new javax.swing.JTextField();
        cb_driver = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rb_ride = new javax.swing.JRadioButton();
        rb_car = new javax.swing.JRadioButton();
        cb_lokasi = new javax.swing.JComboBox<>();
        txt_tarif = new javax.swing.JTextField();
        txt_jumlah = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_bayar = new javax.swing.JTextField();
        txt_kembalian = new javax.swing.JTextField();
        txt_admin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_submit.setBackground(new java.awt.Color(0, 153, 153));
        btn_submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_submit.setForeground(new java.awt.Color(255, 255, 255));
        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        btn_input.setBackground(new java.awt.Color(0, 153, 153));
        btn_input.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_input.setForeground(new java.awt.Color(255, 255, 255));
        btn_input.setText("Input Lagi");
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });

        btn_keluar.setBackground(new java.awt.Color(0, 153, 153));
        btn_keluar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_keluar.setForeground(new java.awt.Color(255, 255, 255));
        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        txt_area.setColumns(20);
        txt_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_area.setRows(5);
        txt_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255), 2));
        txt_area.setSelectionColor(new java.awt.Color(0, 204, 204));
        jScrollPane1.setViewportView(txt_area);

        bt_kembali.setBackground(new java.awt.Color(0, 153, 153));
        bt_kembali.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_kembali.setForeground(new java.awt.Color(255, 255, 255));
        bt_kembali.setText("Kembali");
        bt_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_kembaliActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        lbl_h_uname.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        lbl_h_uname.setForeground(new java.awt.Color(255, 255, 255));
        lbl_h_uname.setText("GOLITE RESERVATION");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/100.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dari Informatika, Untuk Warga Unesa");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_h_uname)
                        .addGap(89, 89, 89)))
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lbl_h_uname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        txt_penumpang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_penumpang.setForeground(new java.awt.Color(153, 153, 153));
        txt_penumpang.setText("Nama Penumpang");
        txt_penumpang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_penumpangActionPerformed(evt);
            }
        });

        txt_notelepon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_notelepon.setForeground(new java.awt.Color(153, 153, 153));
        txt_notelepon.setText("Nomor Telepon");

        cb_driver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Driver", "Putra", "Yusuf", "Indra", "Syamil", "Fazrin", "Alfian", "Fata", "Fandi" }));
        cb_driver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_driverActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data Penumpang");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("How to make order?");

        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Input data Anda di bawah ini");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Help");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(txt_notelepon)
                        .addComponent(txt_penumpang)
                        .addComponent(cb_driver, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel13)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txt_penumpang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_notelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cb_driver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel7))
                .addGap(17, 17, 17))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Tarif");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Jumlah Beli");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel12.setText("nesa car (max 7)");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Total");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Bayar");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Kembalian");

        rb_ride.setBackground(new java.awt.Color(255, 255, 255));
        rb_ride.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb_ride.setText("GoLite Ride");
        rb_ride.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_rideActionPerformed(evt);
            }
        });

        rb_car.setBackground(new java.awt.Color(255, 255, 255));
        rb_car.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb_car.setText("GoLite Car");
        rb_car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_carActionPerformed(evt);
            }
        });

        cb_lokasi.setBackground(new java.awt.Color(0, 102, 102));
        cb_lokasi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_lokasi.setForeground(new java.awt.Color(255, 255, 255));
        cb_lokasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Lokasi", "Ketintang - Kampus", "Ketintang - Karah", "Ketintang - Jemursari", "Ketintang - Royal, Cito", "Ketintang - Waru", "Ketintang - Kampus Lidah", "Ketintang - Stasiun Pasar Turi", "Ketintang - Stasiun Gubeng", "Ketintang - Wonokromo" }));
        cb_lokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_lokasiActionPerformed(evt);
            }
        });

        txt_tarif.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_tarif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tarifActionPerformed(evt);
            }
        });

        txt_jumlah.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlahActionPerformed(evt);
            }
        });
        txt_jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_jumlahKeyReleased(evt);
            }
        });

        txt_total.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });
        txt_total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_totalKeyReleased(evt);
            }
        });

        txt_bayar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bayarActionPerformed(evt);
            }
        });
        txt_bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bayarKeyReleased(evt);
            }
        });

        txt_kembalian.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kembalianActionPerformed(evt);
            }
        });

        txt_admin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_admin.setText("2500");
        txt_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_adminActionPerformed(evt);
            }
        });
        txt_admin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_adminKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Biaya Admin");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Selamat Datang, Selamat Membuat Pesanan, dan Nikmati Perjalanan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_lokasi, 0, 242, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_tarif)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12))
                                    .addComponent(txt_jumlah)
                                    .addComponent(jLabel8)
                                    .addComponent(txt_total))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_kembalian, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_bayar)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(rb_ride, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                        .addComponent(rb_car, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_admin)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_input, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 45, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cb_lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rb_ride)
                                    .addComponent(rb_car))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_tarif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_input, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bt_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        
        String penumpang = txt_penumpang.getText();
        String no = txt_notelepon.getText();
        Object driver = cb_driver.getSelectedItem();
        Object lokasi = cb_lokasi.getSelectedItem();
        boolean ride = rb_ride.isSelected();
        boolean car = rb_car.isSelected();
        String tarif = txt_tarif.getText();
        String jumlah = txt_jumlah.getText();
        String tax = txt_admin.getText();
        String totalBayar = txt_total.getText();
        
        try {
            
            Statement st = Database.mycon().createStatement();
            st.executeUpdate(" INSERT INTO pesanan (Penumpang,No,Driver,Lokasi,Ride,Car,Tarif,Jumlah,Admin,Total)"
                            + "VALUES ('"+penumpang+"','"+no+"','"+driver+"','"+lokasi+"','"+ride+"','"+car+"','"+tarif+"','"+jumlah+"','"+tax+"','"+totalBayar+"') ");
            
            JOptionPane.showMessageDialog(rootPane, "Berhasil membuat pesanan" +"\n"
                    + "Driver akan menghubungi Anda");
            
        } catch (Exception e) {
            
        }
                        
        btn_submit.setText((String)cb_lokasi.getSelectedItem());
        txt_area.setText(
                          "Nama Penumpang  : " +txt_penumpang.getText() +"\n"+
                          "Nama Driver     : " +cb_driver.getSelectedItem() +"\n"+
                          "Asal dan Tujuan : " +cb_lokasi.getSelectedItem() +"\n"+
                          "Jumlah Beli     : " +txt_jumlah.getText() +"\n"+
                          "Total           : " +txt_total.getText() +"\n"+
                          "Bayar           : " +txt_bayar.getText() +"\n"+
                          "Kembalian       : " +txt_kembalian.getText() +"\n");
    }//GEN-LAST:event_btn_submitActionPerformed

    private void txt_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bayarActionPerformed
        // TODO add your handling code here:
        bayar = Integer.parseInt(txt_bayar.getText());
        kembalian = Integer.parseInt(txt_total.getText());
        total = bayar-kembalian;
        txt_kembalian.setText(String.valueOf(total));
    }//GEN-LAST:event_txt_bayarActionPerformed

    private void cb_lokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_lokasiActionPerformed
        // Membuat kondisi untuk menentukan harga pada setiap lokasi
        if(cb_lokasi.getSelectedItem().equals("Pilih Lokasi")){
            buttonGroup1.clearSelection();
            txt_tarif.setText("");
        }
        else if(cb_lokasi.getSelectedItem().equals("Ketintang - Kampus")){
            ride = 5000;
            car = 10000;
        }
        else if(cb_lokasi.getSelectedItem().equals("Ketintang - Karah")){
            ride = 9000;
            car = 17000;
        }
        else if(cb_lokasi.getSelectedItem().equals("Ketintang - Jemursari")){
            ride = 9000;
            car = 17000;
        }
        else if(cb_lokasi.getSelectedItem().equals("Ketintang - Royal, Cito")){
            ride = 10000;
            car = 20000;
        }
        else if(cb_lokasi.getSelectedItem().equals("Ketintang - Waru")){
            ride = 15000;
            car = 30000;
        }
        else if(cb_lokasi.getSelectedItem().equals("Ketintang - Kampus Lidah")){
            ride = 20000;
            car = 40000;
        }
        else if(cb_lokasi.getSelectedItem().equals("Ketintang - Stasiun Pasar Turi")){
            ride = 20000;
            car = 40000;
        }
        else if(cb_lokasi.getSelectedItem().equals("Ketintang - Stasiun Gubeng")){
            ride = 18000;
            car = 35000;
        }
        else if(cb_lokasi.getSelectedItem().equals("Ketintang - Wonokromo")){
            ride = 14000;
            car = 28000;
        }
    }//GEN-LAST:event_cb_lokasiActionPerformed

    private void rb_carActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_carActionPerformed
        // Menampilkan harga setelah memilih orderan
        if(rb_car.isSelected()){
            txt_tarif.setText(String.valueOf(car));
        }
    }//GEN-LAST:event_rb_carActionPerformed

    private void rb_rideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_rideActionPerformed
        // Menampilkan harga setelah memilih orderan
        if(rb_ride.isSelected()){
            txt_tarif.setText(String.valueOf(ride));
        }
    }//GEN-LAST:event_rb_rideActionPerformed

    private void txt_tarifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tarifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tarifActionPerformed

    private void txt_jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlahActionPerformed
        // Memasukkan jumlah tiket dan mengetahui total bayar
        admin = 2500;
        beli = Integer.parseInt(txt_jumlah.getText());
        tarif = Integer.parseInt(txt_tarif.getText());
        total = bayar*tarif+admin;
        txt_total.setText(String.valueOf(total));
        txt_admin.setText("2500");
        
        if(rb_car.isSelected()){
            if(beli <= 4){
                total = tarif+admin;
                txt_total.setText(String.valueOf(total));
            }
        }
        
        if(rb_car.isSelected()){
            if(beli > 4){
                total = tarif*2+admin;
                txt_total.setText(String.valueOf(total));
            }
        }
    }//GEN-LAST:event_txt_jumlahActionPerformed

    private void txt_jumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_jumlahKeyReleased
        // TODO add your handling code here:
        int a, b, c, d;
        a = Integer.parseInt(txt_tarif.getText());
        b = Integer.parseInt(txt_jumlah.getText());
        d = 2500;
        c = (a*b)+d;
        txt_total.setText("" +c);
        txt_admin.setText("2500");
        
        if(rb_car.isSelected()){
            if(b <= 4){
                c = a+d;
                txt_total.setText("" +c);
            }
        }
        
        if(rb_car.isSelected()){
            if(b > 4){
                c = a*2+d;
                txt_total.setText("" +c);
            }
        }
    }//GEN-LAST:event_txt_jumlahKeyReleased

    private void txt_bayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bayarKeyReleased
        // TODO add your handling code here:
         int a, b, c;
        a = Integer.parseInt(txt_bayar.getText());
        b = Integer.parseInt(txt_total.getText());
        c = a-b;
        txt_kembalian.setText("" +c);
    }//GEN-LAST:event_txt_bayarKeyReleased

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        // TODO add your handling code here:
        buttonGroup1.clearSelection();
        txt_tarif.setText("");
        cb_lokasi.setSelectedItem("Pilih Lokasi");
        txt_penumpang.setText("");
        cb_driver.setSelectedItem("Pilih Driver");
        txt_total.setText("");
        txt_jumlah.setText("");
        txt_bayar.setText("");
        txt_kembalian.setText("");
        txt_admin.setText("");
        txt_notelepon.setText("");
    }//GEN-LAST:event_btn_inputActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // Memberi pilihan mau keluar atau tidak
        int answer = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin keluar?", "Keluar", JOptionPane.OK_OPTION);
        if(answer == JOptionPane.OK_OPTION){
            dispose();
        }
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void cb_driverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_driverActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cb_driverActionPerformed

    private void bt_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_kembaliActionPerformed
        
        int answer = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin kembali ke menu Login?", "Kembali", JOptionPane.OK_OPTION);
        if(answer == JOptionPane.OK_OPTION){
            dispose();
        
        LoginForm lg = new LoginForm();
        HomeForm hm = new HomeForm();
        lg.setVisible(true);
        this.setVisible(false);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(HomeForm.EXIT_ON_CLOSE);
        }
        
    }//GEN-LAST:event_bt_kembaliActionPerformed

    private void txt_penumpangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_penumpangActionPerformed
        
    }//GEN-LAST:event_txt_penumpangActionPerformed

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        
    }//GEN-LAST:event_txt_totalActionPerformed

    private void txt_kembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kembalianActionPerformed
        
    }//GEN-LAST:event_txt_kembalianActionPerformed

    private void txt_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_adminActionPerformed
        
    }//GEN-LAST:event_txt_adminActionPerformed

    private void txt_adminKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_adminKeyReleased
        
    }//GEN-LAST:event_txt_adminKeyReleased

    private void txt_totalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_totalKeyReleased
        
    }//GEN-LAST:event_txt_totalKeyReleased

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        
        String pesan = "<html>"
        + "<b>Langkah-langkah Penggunaan</b><br><br>"
        + "1. Menu ini dibuat untuk user sebagai Penumpang yang akan<br>"
        + "   melakukan pemesanan.<br><br>"
        + "2. Ketika Penumpang akan melakukan pemesanan , maka langkah<br>"
        + "   yang pertama adalah mengisi kolom data Penumpang yaitu<br>"
        + "   nama Penumpang, Kemudian Nomor Telepon, lalu memilih Driver.<br><br>"
        + "3. Setelah Anda memasukkan data Penumpang, Anda diminta memilih<br>"
        + "   lokasi yang akan dituju.<br><br>"
        + "4. Kemudian Anda diminta memilih moda transportasi yang akan<br>"
        + "   digunakan sesuai dengan kebutuhan Anda, lalu tarif<br>"
        + "   akan otomatis muncul sesuai dengan lokasi yang Anda pilih.<br><br>"
        + "5. Setelah memilih moda transportasi, kemudian Anda diminta<br>"
        + "   untuk memasukkan jumlah beli sesuai dengan kebutuhan Anda.<br>"
        + "   Maka otomatis akan muncul total harga.<br><br>"
        + "6. Setelah memasukkan jumlah beli, Anda diminta untuk memasukan<br>"
        + "   nominal bayar, maka otomatis akan muncul nominal kembalian.<br><br>"
        + "7. Setelah pembuatan pesanan selesai, Anda diminta untuk Submit<br>"
        + "   pesanan agar pesanan segera terkonfirmasi oleh Driver.<br><br>"
        + "8. Tunggu hingga Driver menghubungi Anda.";
        
        JOptionPane.showMessageDialog(this, pesan, "Panduan Penggunaan Menu Penumpang Home Form" , JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_kembali;
    private javax.swing.JButton btn_input;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_submit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cb_driver;
    private javax.swing.JComboBox<String> cb_lokasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_h_uname;
    private javax.swing.JRadioButton rb_car;
    private javax.swing.JRadioButton rb_ride;
    private javax.swing.JTextField txt_admin;
    private javax.swing.JTextArea txt_area;
    private javax.swing.JTextField txt_bayar;
    private javax.swing.JTextField txt_jumlah;
    private javax.swing.JTextField txt_kembalian;
    private javax.swing.JTextField txt_notelepon;
    private javax.swing.JTextField txt_penumpang;
    private javax.swing.JTextField txt_tarif;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
