/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package voting_blockchain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ELCOT
 */
public class view_voters extends javax.swing.JFrame {
public static String ur1="jdbc:mysql://localhost:3306/voting_blockchain";

    /**
     * Creates new form view_voters
     */
    public view_voters() {
        initComponents();
          try
        {
         this.setLocationRelativeTo(null);
        this.setResizable(false);
        String userid="root";
        String password="";
        String sql="SELECT * FROM add_voters";
        Connection connection=DriverManager.getConnection(ur1,userid,password);
        Statement stmt=connection.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        Vector vhead=new Vector();
       
        vhead.add("Aadhar_number");
         vhead.add("voter_ID");
        vhead.add("Name");
        vhead.add("Mobile_number");
        vhead.add("DOB");
        vhead.add("Pincode");
        vhead.add("Region");
         vhead.add("Fingerprint");
         vhead.add("Profile");
         
        
        
        
        Vector vdata=new Vector();
        while(rs.next())
        {
            Vector d=new Vector();
       
        d.add(rs.getString("Aadhar_number"));
         d.add(rs.getString("voter_ID"));
        d.add(rs.getString("Name"));
        d.add(rs.getString("Mobile_number"));
        d.add(rs.getString("DOB"));
        d.add(rs.getString("Pincode"));
        d.add(rs.getString("region"));
         d.add(rs.getString("Fingerprint"));
          d.add(rs.getBlob("Profile"));
        vdata.add(d);
        }
        table.setModel(new DefaultTableModel(vdata,vhead));
    }
    catch(SQLException ex)
    {
        Logger.getLogger(view_voters.class.getName()).log(Level.SEVERE,null,ex);
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

        jPanel3 = new javax.swing.JPanel();
        ad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153,153,200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 850, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("     s e a r c h");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 100, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("     s e a r c h");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 1180, 50));

        jPanel2.setBackground(new java.awt.Color(153, 153,153,100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setBackground(new java.awt.Color(0, 0, 102));
        table.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setGridColor(new java.awt.Color(0, 0, 102));
        table.setRowHeight(35);
        table.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(table);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 530));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 1180, 530));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153,80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voting_blockchain/topborder.png"))); // NOI18N
        jLabel4.setText("Blockchain voting");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 45));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voting_blockchain/perfect_party.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 740));

        setSize(new java.awt.Dimension(1370, 740));
        setLocationRelativeTo(null);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_voters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new view_voters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
