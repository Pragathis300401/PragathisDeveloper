/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package voting_blockchain;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author ELCOT
 */
public class add_parties extends javax.swing.JFrame {
    public static String PARTY_IMAGE;
String s;
    /**
     * Creates new form add_parties
     */
    public add_parties() {
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

        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        a5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        a1 = new javax.swing.JTextField();
        a2 = new javax.swing.JTextField();
        a4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cp = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153,153,200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Sitka Heading", 1, 13)); // NOI18N
        jButton1.setText("SAVE  ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 240, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 910, 70));

        jPanel2.setBackground(new java.awt.Color(153, 153,153,220));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a5.setFont(new java.awt.Font("Sitka Heading", 1, 15)); // NOI18N
        a5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel2.add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 180, 180));

        jLabel9.setFont(new java.awt.Font("Sitka Heading", 1, 15)); // NOI18N
        jLabel9.setText("PARTY NAME");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 130, 25));

        a3.setFont(new java.awt.Font("Sitka Heading", 1, 15)); // NOI18N
        a3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel2.add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 180, 180));

        jLabel11.setFont(new java.awt.Font("Sitka Heading", 1, 15)); // NOI18N
        jLabel11.setText("CONDITATE NAME");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 160, 25));

        a1.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N
        jPanel2.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 240, 25));

        a2.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N
        jPanel2.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 240, 25));

        a4.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N
        jPanel2.add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 240, 25));

        jLabel12.setFont(new java.awt.Font("Sitka Heading", 1, 15)); // NOI18N
        jLabel12.setText("PARTY ID");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 130, 25));

        cp.setBackground(new java.awt.Color(0, 51, 153));
        cp.setFont(new java.awt.Font("Sitka Heading", 1, 13)); // NOI18N
        cp.setText("Browse");
        cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpActionPerformed(evt);
            }
        });
        jPanel2.add(cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 100, 25));

        pi.setBackground(new java.awt.Color(0, 51, 153));
        pi.setFont(new java.awt.Font("Sitka Heading", 1, 13)); // NOI18N
        pi.setText("Browse");
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });
        jPanel2.add(pi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 100, 25));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 910, 280));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255,80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voting_blockchain/topborder.png"))); // NOI18N
        jLabel2.setText("Blockchain voting");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 45));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voting_blockchain/perfect_party.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 740));

        setSize(new java.awt.Dimension(1370, 740));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    String PARTY_ID = a1.getText().toString().trim();
     String PARTY_NAME = a2.getText().toString().trim();
      String PARTY_IMAGE = a3.getText().toString().trim();
       String CONDITATE_NAME = a4.getText().toString().trim();
        String  CONDITATE_PROFILE= a5.getText().toString().trim();
        
           
              if((PARTY_ID.isEmpty())||(PARTY_NAME.isEmpty())||(PARTY_IMAGE.isEmpty())||(CONDITATE_NAME.isEmpty())||(CONDITATE_PROFILE.isEmpty()))                 
                  {
                      JOptionPane.showMessageDialog(null,"Enter the 12 digit adhar number !");
                  }
               
             else
                  {
    try
        {
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost/voting_blockchain","root","");
                  PreparedStatement ps = con.prepareStatement("insert into add_partys(PARTY_ID,PARTY_NAME,PARTY_IMAGE,CONDITATE_NAME,CONDITATE_PROFILE) values(?,?,?,?,?)");
                  InputStream is = new FileInputStream(new File(s));
                  ps.setString(1,a1.getText());
                  ps.setString(2,a2.getText());
                  ps.setBlob(3,is);
                  ps.setString(4,a4.getText());
                  ps.setBlob(5,is);
                     
                      ps.executeUpdate();
                     JOptionPane.showMessageDialog(null,"Success");
                  
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }    

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpActionPerformed
        // TODO add your handling code here:
       JFileChooser fileChooser =new JFileChooser();
       fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
      FileNameExtensionFilter filter =new FileNameExtensionFilter("Image Files","jpg","png","gif","jpeg");
      fileChooser.addChoosableFileFilter(filter);
      
      
      int result =fileChooser.showSaveDialog(null);
       
      if(result == JFileChooser.APPROVE_OPTION) {
              
              File selectedFile = fileChooser.getSelectedFile();
              String fname=selectedFile.getAbsolutePath();
              System.out.print(fname);
              a5.setIcon(ResizeImagee(fname));
             s = fname;
      }
      else if(result == JFileChooser.CANCEL_OPTION){
          System.out.println("no data");
      } 
  
    }//GEN-LAST:event_cpActionPerformed
    public ImageIcon ResizeImagee (String imgPath){
    ImageIcon MyImage = new ImageIcon(imgPath);
    Image img = MyImage.getImage();
    Image newImage = img.getScaledInstance(a5.getWidth(),a5.getHeight(),Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImage);
        return image;
}
    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        // TODO add your handling code here:
       JFileChooser fileChooser =new JFileChooser();
       fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
      FileNameExtensionFilter filter =new FileNameExtensionFilter("Image Files","jpg","png","gif","jpeg");
      fileChooser.addChoosableFileFilter(filter);
      
      
      int result =fileChooser.showSaveDialog(null);
       
      if(result == JFileChooser.APPROVE_OPTION) {
              
              File selectedFile = fileChooser.getSelectedFile();
              String fname=selectedFile.getAbsolutePath();
              System.out.print(fname);
              a3.setIcon(ResizeImage(fname));
              s = fname;
      }
      else if(result == JFileChooser.CANCEL_OPTION){
          System.out.println("no data");
      } 
  
    }//GEN-LAST:event_piActionPerformed
public ImageIcon ResizeImage (String imgPath){
    ImageIcon MyImage = new ImageIcon(imgPath);
    Image img = MyImage.getImage();
    Image newImage = img.getScaledInstance(a3.getWidth(),a3.getHeight(),Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImage);
        return image;
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_parties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new add_parties().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1;
    private javax.swing.JTextField a2;
    private javax.swing.JLabel a3;
    private javax.swing.JTextField a4;
    private javax.swing.JLabel a5;
    private javax.swing.JButton cp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton pi;
    // End of variables declaration//GEN-END:variables
}
