/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasikasir_ratma;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class MenuUtama extends javax.swing.JFrame {
    Connection konek;
    PreparedStatement pst;
    ResultSet rst;

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
this.setExtendedState(MAXIMIZED_BOTH);
         konek = Koneksi.koneksiDB();
         mulai();
         tampilWaktu();
    }
    
    public void mulai() {
        Register.setEnabled(false);
        Logout.setEnabled(false);
        Toko.setEnabled(false);
        Transaksi.setEnabled(false);
        Laporan.setEnabled(false);
        txtJam.setEnabled(false);
        txtTanggal.setEnabled(false);
        FormLogin.setVisible(false);
        btnRegister.setEnabled(false);
        btnproduk.setEnabled(false);
        btnpelanggan.setEnabled(false);
        btnpenjualan.setEnabled(false);
    }
    
public void tampilWaktu() {
        Thread clock = new Thread() {
            public void run() {
                for(;;) {
                    Calendar cal = Calendar.getInstance();
                    SimpleDateFormat Jam = new SimpleDateFormat("HH:mm:ss");
                    SimpleDateFormat Tanggal = new SimpleDateFormat("yyyy-MM-dd");
                    txtJam.setText(Jam.format(cal.getTime()));
                    txtTanggal.setText(Tanggal.format(cal.getTime()));
                    try { sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(aplikasikasir_ujikom.MenuUtama.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        clock.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FormLogin = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        cmbAkses = new javax.swing.JComboBox<>();
        btnBatal = new javax.swing.JButton();
        btnMasuk = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnproduk = new javax.swing.JButton();
        btnpenjualan = new javax.swing.JButton();
        btnpelanggan = new javax.swing.JButton();
        txtTanggal = new javax.swing.JTextField();
        txtJam = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        Beranda = new javax.swing.JMenu();
        Login = new javax.swing.JMenuItem();
        Register = new javax.swing.JMenuItem();
        Logout = new javax.swing.JMenuItem();
        Toko = new javax.swing.JMenu();
        Produk = new javax.swing.JMenuItem();
        Pelanggan = new javax.swing.JMenuItem();
        Transaksi = new javax.swing.JMenu();
        penjualan = new javax.swing.JMenuItem();
        Laporan = new javax.swing.JMenu();
        RkpLap = new javax.swing.JMenuItem();
        Tentang = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AplikasiKasir-Menu Utama");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FormLogin.setBackground(new java.awt.Color(255, 255, 255));
        FormLogin.setTitle("Form Login\n");
        FormLogin.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("LOGIN DISINI");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Hak Akses");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        cmbAkses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-pilih salah satu-", "Admin", "Petugas" }));

        btnBatal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBatal.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\batal-25.png")); // NOI18N
        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnMasuk.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMasuk.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\masuk-25.png")); // NOI18N
        btnMasuk.setText("MASUK");
        btnMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasukActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FormLoginLayout = new javax.swing.GroupLayout(FormLogin.getContentPane());
        FormLogin.getContentPane().setLayout(FormLoginLayout);
        FormLoginLayout.setHorizontalGroup(
            FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLoginLayout.createSequentialGroup()
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormLoginLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1))
                    .addGroup(FormLoginLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(FormLoginLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbAkses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3)
                            .addGroup(FormLoginLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(69, 69, 69)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(FormLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBatal)
                .addGap(66, 66, 66)
                .addComponent(btnMasuk)
                .addGap(82, 82, 82))
        );
        FormLoginLayout.setVerticalGroup(
            FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLoginLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAkses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMasuk)
                    .addComponent(btnBatal))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        getContentPane().add(FormLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        lblUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUser.setText("Silahkan login dulu!!");

        btnRegister.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\register-30 (1).png")); // NOI18N
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUser))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnRegister)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 616, Short.MAX_VALUE)
                .addComponent(btnRegister)
                .addGap(43, 43, 43))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        btnproduk.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnproduk.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\produk-30.png")); // NOI18N
        btnproduk.setText("PRODUK");
        btnproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprodukActionPerformed(evt);
            }
        });

        btnpenjualan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnpenjualan.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\penjualan-30.png")); // NOI18N
        btnpenjualan.setText("PENJUALAN");
        btnpenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpenjualanActionPerformed(evt);
            }
        });

        btnpelanggan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnpelanggan.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\pelanggan-30.png")); // NOI18N
        btnpelanggan.setText("PELANGGAN");
        btnpelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpelangganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btnpelanggan)
                .addGap(76, 76, 76)
                .addComponent(btnproduk)
                .addGap(67, 67, 67)
                .addComponent(btnpenjualan)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnproduk)
                    .addComponent(btnpenjualan)
                    .addComponent(btnpelanggan))
                .addGap(29, 29, 29))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 631, -1, -1));
        getContentPane().add(txtTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 20, 130, 35));
        getContentPane().add(txtJam, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 126, 35));

        Beranda.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\beranda-20 (1).png")); // NOI18N
        Beranda.setText("Beranda");

        Login.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\login-15.png")); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        Beranda.add(Login);

        Register.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\register-15.png")); // NOI18N
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        Beranda.add(Register);

        Logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\logout-15.png")); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        Beranda.add(Logout);

        jMenuBar1.add(Beranda);

        Toko.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\toko-20 (1).png")); // NOI18N
        Toko.setText("Toko");

        Produk.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\produk-15.png")); // NOI18N
        Produk.setText("Produk");
        Produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdukActionPerformed(evt);
            }
        });
        Toko.add(Produk);

        Pelanggan.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\pelanggan-15.png")); // NOI18N
        Pelanggan.setText("Pelanggan");
        Pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PelangganActionPerformed(evt);
            }
        });
        Toko.add(Pelanggan);

        jMenuBar1.add(Toko);

        Transaksi.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\transaksi-20 (2).png")); // NOI18N
        Transaksi.setText("Transaksi");

        penjualan.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\penjualan-15.png")); // NOI18N
        penjualan.setText("penjualan");
        penjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penjualanActionPerformed(evt);
            }
        });
        Transaksi.add(penjualan);

        jMenuBar1.add(Transaksi);

        Laporan.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\laporan-20 (1).png")); // NOI18N
        Laporan.setText("Laporan");

        RkpLap.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-agreement-15.png")); // NOI18N
        RkpLap.setText("Rekap Laporan");
        RkpLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RkpLapActionPerformed(evt);
            }
        });
        Laporan.add(RkpLap);

        jMenuBar1.add(Laporan);

        Tentang.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\tentang-20 (1).png")); // NOI18N
        Tentang.setText("Help");

        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\tentang-20 (1).png")); // NOI18N
        jMenuItem1.setText("Tentang");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Tentang.add(jMenuItem1);

        jMenuBar1.add(Tentang);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        new MenuUtama().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasukActionPerformed
        try{
            String sql = "select * from login where Username = '"+txtUsername.getText()+"' and Password='"+txtPassword.getText()+"' and HakAkses ='"+cmbAkses.getSelectedItem()+"'";
            pst = konek.prepareStatement(sql);
            rst = pst.executeQuery();
            if (rst.next()) {
                if(txtUsername.getText().equals(rst.getString("Username"))&& txtPassword.getText().equals(rst.getString("Password"))&& cmbAkses.getSelectedItem().equals(rst.getString("HakAkses")));
                if(cmbAkses.getSelectedItem().equals("Admin")) {
                    Register.setEnabled(true);
                    Logout.setEnabled(true);
                    Toko.setEnabled(true);
                    Transaksi.setEnabled(true);
                    Laporan.setEnabled(true);
                    btnRegister.setEnabled(true);
                    btnproduk.setEnabled(true);
                    btnpelanggan.setEnabled(true);
                    btnpenjualan.setEnabled(true);
                    txtJam.setEnabled(false);
                    txtTanggal.setEnabled(false);
                    FormLogin.setVisible(false);
                } else if (cmbAkses.getSelectedItem().equals("Petugas")) {
                    Register.setEnabled(false);
                    Logout.setEnabled(true);
                    Toko.setEnabled(true);
                    Transaksi.setEnabled(true);
                    Laporan.setEnabled(true);
                    btnRegister.setEnabled(false);
                    btnproduk.setEnabled(true);
                    btnpelanggan.setEnabled(true);
                    btnpenjualan.setEnabled(true);
                    txtJam.setEnabled(false);
                    txtTanggal.setEnabled(false);
                    FormLogin.setVisible(false);
                }
                {
                    JOptionPane.showMessageDialog(null, "Selamat Datang '"+txtUsername.getText()+"'");
                    String text = txtUsername.getText();
                    lblUser.setText(" Selamat Datang, " +text);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Gagal Masuk. Periksa Kembali Username/Password/Hak Akses");
                txtUsername.setText("");
                txtPassword.setText("");
                cmbAkses.setSelectedItem("-Pilih Salah Satu-");
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Koneksi");
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnMasukActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        new FormRegister().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
FormLogin.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_LoginActionPerformed

    private void PelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PelangganActionPerformed
new FormPenjualan().setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_PelangganActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
new FormRegister().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
new MenuUtama().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutActionPerformed

    private void ProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdukActionPerformed
new FormProduk().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_ProdukActionPerformed

    private void btnpelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpelangganActionPerformed
new FormPelanggan().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_btnpelangganActionPerformed

    private void btnprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprodukActionPerformed
new FormProduk().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_btnprodukActionPerformed

    private void btnpenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpenjualanActionPerformed
new FormPenjualan().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_btnpenjualanActionPerformed

    private void RkpLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RkpLapActionPerformed
new FormLaporanTransaksi().setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_RkpLapActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
new FormAbout().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void penjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penjualanActionPerformed
new FormPenjualan().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_penjualanActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Beranda;
    private javax.swing.JInternalFrame FormLogin;
    private javax.swing.JMenu Laporan;
    private javax.swing.JMenuItem Login;
    private javax.swing.JMenuItem Logout;
    private javax.swing.JMenuItem Pelanggan;
    private javax.swing.JMenuItem Produk;
    private javax.swing.JMenuItem Register;
    private javax.swing.JMenuItem RkpLap;
    private javax.swing.JMenu Tentang;
    private javax.swing.JMenu Toko;
    private javax.swing.JMenu Transaksi;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnMasuk;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnpelanggan;
    private javax.swing.JButton btnpenjualan;
    private javax.swing.JButton btnproduk;
    private javax.swing.JComboBox<String> cmbAkses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblUser;
    private javax.swing.JMenuItem penjualan;
    private javax.swing.JTextField txtJam;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
