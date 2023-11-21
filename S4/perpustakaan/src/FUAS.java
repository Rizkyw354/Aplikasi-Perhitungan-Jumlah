/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ariff
 */
public class FUAS extends javax.swing.JFrame {

    /**
     * Creates new form FUAS
     */
    public FUAS() {
        initComponents();
        load_data();
    }
    
    public void load_data() {
    Connection kon = koneksi.koneksiDb();
    Object header[] = {"NAMA", "NPM", "JENIS KELAMIN", "PROGRAM STUDI", "KELAS"};
    DefaultTableModel data = new DefaultTableModel(null, header);
    TabelUAS.setModel(data);
    String sql_data = "SELECT nama, npm, jenis_kelamin, program_studi, kelas FROM tb_uas";

    try {
        Statement st = kon.createStatement();
        ResultSet rs = st.executeQuery(sql_data);
        while (rs.next()) {
            String d1 = rs.getString(1);
            String d2 = rs.getString(2);
            String d3 = rs.getString(3);
            String d4 = rs.getString(4);
            String d5 = rs.getString(5);

            String d[] = {d1, d2, d3, d4, d5};
            data.addRow(d);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KELAS = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelUAS = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        NPM = new javax.swing.JTextField();
        NAMA = new javax.swing.JTextField();
        JKP = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JKL = new javax.swing.JRadioButton();
        PS = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        KELAS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4A REG", "4B REG", "4C REG", "4D REG" }));

        jButton2.setText("SIMPAN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("EDIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("HAPUS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        TabelUAS.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TabelUAS);

        jLabel8.setText("KELAS");

        NAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMAActionPerformed(evt);
            }
        });

        JKP.setText("Wanita");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("UAS-RIZKY WAHYUDIN-2110010570");

        jButton1.setText("KELUAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("NAMA");

        jLabel3.setText("NPM");

        jLabel5.setText("JENIS KELAMIN");

        jLabel6.setText("PROGRAM STUDI");

        JKL.setText("Pria");
        JKL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JKLActionPerformed(evt);
            }
        });

        PS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEKNIK INFORMATIKA", "SISTEM INFORMASI" }));
        PS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NAMA, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NPM, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JKL)
                                .addGap(31, 31, 31)
                                .addComponent(JKP))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel8)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PS, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KELAS, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NAMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JKL)
                                .addComponent(JKP)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(PS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KELAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton2))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    String nama = NAMA.getText();
    String npm = NPM.getText();
    String jenisKelamin = JKL.isSelected() ? "Pria" : "Wanita";
    String programStudi = PS.getSelectedItem().toString();
    String kelas = KELAS.getSelectedItem().toString();

    // Memeriksa apakah ada field yang kosong
    if (nama.isEmpty() || npm.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Harap isi semua field!", "Peringatan", JOptionPane.WARNING_MESSAGE);
    } else {
        try {
            Connection kon = koneksi.koneksiDb();
            Statement st = kon.createStatement();

            // Query untuk menyimpan data ke tabel tb_uas
            String sql = "INSERT INTO tb_uas (nama, npm, jenis_kelamin, program_studi, kelas) "
                    + "VALUES ('" + nama + "', '" + npm + "', '" + jenisKelamin + "', '" + programStudi + "', '" + kelas + "')";

            int hasil = st.executeUpdate(sql);
            if (hasil > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
                // Memuat ulang data
                load_data();
                // Mengosongkan field input
                NAMA.setText("");
                NPM.setText("");
                JKL.setSelected(true);
                PS.setSelectedIndex(0);
                KELAS.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(null, "Data gagal disimpan!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
}
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        // Mendapatkan baris terpilih dari tabel
    int selectedRow = TabelUAS.getSelectedRow();
    
    // Memeriksa apakah ada baris yang dipilih
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Harap pilih data yang akan dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
    } else {
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                Connection kon = koneksi.koneksiDb();
                Statement st = kon.createStatement();
    
                String npm = TabelUAS.getValueAt(selectedRow, 1).toString();
    
                // Query untuk menghapus data dari tabel tb_uas
                String sql = "DELETE FROM tb_uas WHERE npm = '" + npm + "'";
    
                int hasil = st.executeUpdate(sql);
                if (hasil > 0) {
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
                    // Memuat ulang data
                    load_data();
                } else {
                    JOptionPane.showMessageDialog(null, "Data gagal dihapus!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void NAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMAActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new FUtamaadmin().show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JKLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JKLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JKLActionPerformed

    private void PSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PSActionPerformed

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
            java.util.logging.Logger.getLogger(FUAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FUAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FUAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FUAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FUAS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JKL;
    private javax.swing.JRadioButton JKP;
    private javax.swing.JComboBox<String> KELAS;
    private javax.swing.JTextField NAMA;
    private javax.swing.JTextField NPM;
    private javax.swing.JComboBox<String> PS;
    private javax.swing.JTable TabelUAS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}