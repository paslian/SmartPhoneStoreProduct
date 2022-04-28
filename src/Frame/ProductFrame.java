/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import Controller.MainController;
import Helper.Helper;
import Model.ProductModel;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author hp
 */
public class ProductFrame extends javax.swing.JFrame {

    ProductModel model = new ProductModel();
    MainController controller = new MainController();
    DefaultTableModel defaultModel;



    Helper helper = new Helper();
    String product_id;
    ResultSet rs;



    /**
     * Creates new form product
     */
    public ProductFrame() {
        initComponents();
        this.clear();
    }

    public void clear() {
        cb_merk.setSelectedIndex(0);
        tf_series.setText("");
        tf_price.setText("");
        tf_stock.setText("");

        btn_update.setEnabled(false);
        btn_delete.setEnabled(false);
    }

    public void getAllData() {
        this.rs = controller.get();
        this.loadTable(this.rs);
    }
    
    public void loadTable(ResultSet rs) {
        tb_product.setModel(DbUtils.resultSetToTableModel(rs));
    }

    private void search(String type, String query) {
        try {
            if(query.isEmpty()) {
                this.rs = controller.get();
            } else if (type.equals("id") && !query.isEmpty()) {
                this.rs = controller.showById(query);
            } else if (type.equals("series") && !query.isEmpty()) {
                this.rs = controller.showBySeries(query);
            }
            
            this.loadTable(this.rs);
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_stock = new javax.swing.JTextField();
        tf_series = new javax.swing.JTextField();
        tf_price = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        btn_input = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        cb_merk = new javax.swing.JComboBox<>();
        btn_update = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tf_find = new javax.swing.JTextField();
        btn_searchname = new javax.swing.JButton();
        btn_searchid = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_product = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btn_refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SMARTPHONE STORE");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 80));

        jPanel3.setBackground(new java.awt.Color(0, 102, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Stock");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Series");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Unit Price");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jPanel3.add(tf_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 230, -1));

        tf_series.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_seriesActionPerformed(evt);
            }
        });
        jPanel3.add(tf_series, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 230, -1));
        jPanel3.add(tf_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 230, -1));

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Merk Product");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        btn_delete.setBackground(new java.awt.Color(0, 0, 0));
        btn_delete.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel3.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 110, -1));

        btn_input.setBackground(new java.awt.Color(0, 0, 0));
        btn_input.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btn_input.setForeground(new java.awt.Color(255, 255, 255));
        btn_input.setText("Input");
        btn_input.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });
        jPanel3.add(btn_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 240, -1));

        btn_clear.setBackground(new java.awt.Color(0, 0, 0));
        btn_clear.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel3.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 100, 80));

        cb_merk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Merk", "Iphone", "Samsung", "Xiaomi", " ", " " }));
        cb_merk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_merkActionPerformed(evt);
            }
        });
        jPanel3.add(cb_merk, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 230, -1));

        btn_update.setBackground(new java.awt.Color(0, 0, 0));
        btn_update.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel3.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 120, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 380, 500));

        jPanel4.setBackground(new java.awt.Color(0, 102, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Find Product");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanel4.add(tf_find, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 160, -1));

        btn_searchname.setBackground(new java.awt.Color(0, 0, 0));
        btn_searchname.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btn_searchname.setForeground(new java.awt.Color(255, 255, 255));
        btn_searchname.setText("Search by series");
        btn_searchname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchnameActionPerformed(evt);
            }
        });
        jPanel4.add(btn_searchname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 160, -1));

        btn_searchid.setBackground(new java.awt.Color(0, 0, 0));
        btn_searchid.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btn_searchid.setForeground(new java.awt.Color(255, 255, 255));
        btn_searchid.setText("Search by id");
        btn_searchid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchidActionPerformed(evt);
            }
        });
        jPanel4.add(btn_searchid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 120, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_product.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        tb_product.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_productMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_product);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 610, 340));

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel2.setText("TABLE PRODUCT");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 650, 390));

        btn_refresh.setBackground(new java.awt.Color(0, 0, 0));
        btn_refresh.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btn_refresh.setForeground(new java.awt.Color(255, 255, 255));
        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        jPanel4.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 120, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 690, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
            this.getAllData();
            tf_find.setText("");
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        // TODO add your handling code here:
        try {
            String merk = cb_merk.getSelectedItem().toString();
            String series = tf_series.getText();
            String price = tf_price.getText();
            String stock = tf_stock.getText();

            model.setMerk(merk);
            model.setSeries(series);
            model.setPrice(price);
            model.setStock(stock);

            Boolean empty = ((cb_merk.getSelectedItem().equals(0)
                            || (tf_series).getText().equals("")
                            || (tf_price).getText().equals("")
                            || (tf_stock).getText().equals(""))) ;
            

            String msg = "";

            this.rs = controller.duplikat(model);

            if(empty){
                msg = "Data tidak boleh ada yang kosong!";
            }

            if(rs.first()==true) {
                msg = "Data sudah ada!";
                this.clear();
            }

            else if (rs.first()==false && !empty){
                controller.create(model);
                msg = "Berhasil menambahkan data";
                this.clear();
            }
            
            JOptionPane.showMessageDialog(null, msg);
            this.getAllData();
        } catch (Exception e) {
            System.out.println(e.getMessage());
           }    
    }//GEN-LAST:event_btn_inputActionPerformed

    private void tb_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_productMouseClicked
        try{        
            // TODO add your handling code here:
            String id = helper.getValueRows(tb_product, 0);
            String merk = helper.getValueRows(tb_product, 1);
            String series = helper.getValueRows(tb_product, 2);
            String price = helper.getValueRows(tb_product, 3);
            String stock = helper.getValueRows(tb_product, 4);
            
            btn_update.setEnabled(true);
            btn_delete.setEnabled(true);
            
            
            this.product_id = id;
            cb_merk.setSelectedItem(merk);
            tf_series.setText(series);
            tf_price.setText(price);
            tf_stock.setText(stock);
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_tb_productMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
            this.getAllData();
    }//GEN-LAST:event_formWindowOpened

    private void btn_searchidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchidActionPerformed
        // TODO add your handling code here:
        this.search("id", tf_find.getText());
    }//GEN-LAST:event_btn_searchidActionPerformed

    private void btn_searchnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchnameActionPerformed
        // TODO add your handling code here:
        this.search("series", tf_find.getText());
    }//GEN-LAST:event_btn_searchnameActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        this.clear();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        try {
            String merk = cb_merk.getSelectedItem().toString();
            String series = tf_series.getText();
            String stock = tf_stock.getText();
            String price = tf_price.getText();

            model.setMerk(merk);
            model.setSeries(series);
            model.setStock(stock);
            model.setPrice(price);

            Boolean result = controller.update(this.product_id, model);
            
            String msg = "Gagal merubah data!";
            if(result) {
                msg = "Berhasil merubah data";
            }
            
            JOptionPane.showMessageDialog(null, msg);
            this.clear();
            this.getAllData();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void tf_seriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_seriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_seriesActionPerformed

    private void cb_merkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_merkActionPerformed
        // TODO add your handling code here:
        switch (cb_merk.getSelectedIndex()) {
            case 0:
                tf_series.setText("");
                tf_series.requestFocus();
                break;
            case 1:
                tf_series.setText("Iphone ");
                tf_series.requestFocus();
                break;
            case 2:
                tf_series.setText("Samsung ");
                tf_series.requestFocus();
                break;
            case 3:
                tf_series.setText("Xiaomi ");
                tf_series.requestFocus();
                break;
        }
    }//GEN-LAST:event_cb_merkActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
       try {
            
            Boolean result = controller.delete(this.product_id);
            
            String msg = "Gagal menghapus data!";
            if(result) {
                msg = "Berhasil menghapus data";
            }
            
            JOptionPane.showMessageDialog(null, msg);
            
            this.clear();
            this.getAllData();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_input;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_searchid;
    private javax.swing.JButton btn_searchname;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cb_merk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_product;
    private javax.swing.JTextField tf_find;
    private javax.swing.JTextField tf_price;
    private javax.swing.JTextField tf_series;
    private javax.swing.JTextField tf_stock;
    // End of variables declaration//GEN-END:variables
}