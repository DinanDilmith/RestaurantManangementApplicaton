
//import com.sun.jdi.connect.spi.Connection;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Billing extends javax.swing.JFrame {

    /**
     * Creates new form Billing
     */
    public Billing() {
        initComponents();
    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bItemID = new javax.swing.JTextField();
        bItemName = new javax.swing.JTextField();
        bPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bBill = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bPaidAmount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bBalance = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaBill = new javax.swing.JTextArea();
        btnView1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        bTotal = new javax.swing.JTextField();
        bQuantity = new javax.swing.JSpinner();
        btnPrint = new javax.swing.JButton();
        btnCalBill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("Item ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Item Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Quantity");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Price");

        bItemID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        bItemID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bItemIDActionPerformed(evt);
            }
        });

        bItemName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        bItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bItemNameActionPerformed(evt);
            }
        });

        bPrice.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        bPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPriceActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Bill");

        bBill.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Paid Amount");

        bPaidAmount.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("Balance");

        bBalance.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        btnAdd.setBackground(new java.awt.Color(0, 102, 102));
        btnAdd.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemID", "ItemName", "Quantity", "Price", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jTextAreaBill.setColumns(20);
        jTextAreaBill.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextAreaBill.setRows(5);
        jScrollPane2.setViewportView(jTextAreaBill);

        btnView1.setBackground(new java.awt.Color(0, 102, 102));
        btnView1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnView1.setText("View");
        btnView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Total");

        bTotal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        bQuantity.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        bQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bQuantityStateChanged(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(0, 102, 102));
        btnPrint.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnCalBill.setBackground(new java.awt.Color(0, 102, 102));
        btnCalBill.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCalBill.setText("Cal Bill");
        btnCalBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnView1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnCalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bItemID, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bBalance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(bPaidAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bBill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(bTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bItemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnView1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bPaidAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        CustomizeData cd = new CustomizeData();
        cd.show();
    }//GEN-LAST:event_btnBackActionPerformed

    private void bItemIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bItemIDActionPerformed
     
    }//GEN-LAST:event_bItemIDActionPerformed

    private void bPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bPriceActionPerformed

    private void btnView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView1ActionPerformed
        String Iid = bItemID.getText();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/cafe","webuser","1234");
            pst = con.prepareStatement("select * from items where ItemID = ?");
            pst.setString(1,Iid);
            rs = pst.executeQuery();
            
            if(rs.next() == false)
            {
                JOptionPane.showMessageDialog(this, "Item Not Found !!!");
            }
            else
            {
                String ItemName = rs.getString("ItemName");
                String Price = rs.getString("Price");
                
                bItemName.setText(ItemName.trim());
                bPrice.setText(Price.trim());
            }
            
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Something Went Wrong !!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Something Went Wrong !!!");
        }
    }//GEN-LAST:event_btnView1ActionPerformed

    private void bQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bQuantityStateChanged
        try {
            int quantity = Integer.parseInt(bQuantity.getValue().toString());
            int price = Integer.parseInt(bPrice.getText());
            int total = quantity * price;
            bTotal.setText(String.valueOf(total));
            
        } catch (NumberFormatException ex) 
        {
             JOptionPane.showMessageDialog(null,"Error Reading Quantity !!!");
        }
    }//GEN-LAST:event_bQuantityStateChanged

    public void balance()
    {
        int bill = Integer.parseInt(bBill.getText());
        int paidAmount = Integer.parseInt(bPaidAmount.getText());
        int balance = paidAmount - bill;
        bBalance.setText(String.valueOf(balance));
    }
    
    public void calBill()
    {
        String bill = bBill.getText();
        String pa = bPaidAmount.getText();
        String bal = bBalance.getText();
        
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel)jTable2.getModel();
        
        jTextAreaBill.setText(jTextAreaBill.getText() + "**********************************************\n");
        jTextAreaBill.setText(jTextAreaBill.getText() + "                        CAFE DELIGHT          \n");
        jTextAreaBill.setText(jTextAreaBill.getText() + "**********************************************\n");
        
        jTextAreaBill.setText(jTextAreaBill.getText() + "Item" + "\t"   + "Price" + "\t" + "Total" + "\n");
        
        for(int i=0; i<model.getRowCount(); i++)
        {
            String In = (String)model.getValueAt(i,1);
            String p = (String)model.getValueAt(i,3);
            String t = (String)model.getValueAt(i,4);
            
            jTextAreaBill.setText(jTextAreaBill.getText() + In + "\t" + p + "\t" + t + "\n");
        }
            jTextAreaBill.setText(jTextAreaBill.getText() + "\n");
            jTextAreaBill.setText(jTextAreaBill.getText() + "\n");
            
            jTextAreaBill.setText(jTextAreaBill.getText() + "**********************************************\n");
            
            jTextAreaBill.setText(jTextAreaBill.getText() + "Bill Amount :" + bill + "\n");
            jTextAreaBill.setText(jTextAreaBill.getText() + "Paid Amount : :" + pa + "\n");
            jTextAreaBill.setText(jTextAreaBill.getText() + "Balance Amount : :" + bal + "\n");
            jTextAreaBill.setText(jTextAreaBill.getText() + "\n");
            
            jTextAreaBill.setText(jTextAreaBill.getText() + "**********************************************\n");
            jTextAreaBill.setText(jTextAreaBill.getText() + "          THANK YOU !!! COME AGAIN !!!        \n");
            jTextAreaBill.setText(jTextAreaBill.getText() + "**********************************************\n");
            
          
    }
    
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            DefaultTableModel model = new DefaultTableModel();
            model = (DefaultTableModel) jTable2.getModel();
            model.addRow(new Object[]{bItemID.getText(),
                bItemName.getText(),
                bQuantity.getValue(),
                bPrice.getText(),
                bTotal.getText(),});
            
            int sum = 0;
            
            for (int i = 0; i < jTable2.getRowCount(); i++) {
                sum = sum + Integer.parseInt(jTable2.getValueAt(i, 4).toString());
            }
            
            bBill.setText(Integer.toString(sum));
            bItemID.setText("");
            bItemName.setText("");
            bPrice.setText("");
            bTotal.setText("");
            bItemID.requestFocus();
            
        } catch (NumberFormatException ex) 
        {
             JOptionPane.showMessageDialog(null,"Error Adding to Bill !!!");
        }
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void bItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bItemNameActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        
        try 
        {
         jTextAreaBill.print();
        } 
        catch (PrinterException ex) 
        {
          JOptionPane.showMessageDialog(null,"Error Occured While Printing !!!");
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnCalBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalBillActionPerformed
        balance();
        calBill();
    }//GEN-LAST:event_btnCalBillActionPerformed

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bBalance;
    private javax.swing.JTextField bBill;
    private javax.swing.JTextField bItemID;
    private javax.swing.JTextField bItemName;
    private javax.swing.JTextField bPaidAmount;
    private javax.swing.JTextField bPrice;
    private javax.swing.JSpinner bQuantity;
    private javax.swing.JTextField bTotal;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCalBill;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnView1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextAreaBill;
    // End of variables declaration//GEN-END:variables
}
