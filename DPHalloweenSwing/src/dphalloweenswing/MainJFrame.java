/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dphalloweenswing;

import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author faiya
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        lamp1 = new javax.swing.JLabel();
        lamp2 = new javax.swing.JLabel();
        lamp3 = new javax.swing.JLabel();
        lamp4 = new javax.swing.JLabel();
        lamp5 = new javax.swing.JLabel();
        lamp6 = new javax.swing.JLabel();
        lamp7 = new javax.swing.JLabel();
        candlelight1 = new javax.swing.JLabel();
        candlelight2 = new javax.swing.JLabel();
        candlelight3 = new javax.swing.JLabel();
        candlelight4 = new javax.swing.JLabel();
        candle1 = new javax.swing.JLabel();
        candle2 = new javax.swing.JLabel();
        candle3 = new javax.swing.JLabel();
        candle4 = new javax.swing.JLabel();
        bat = new javax.swing.JLabel();
        ghostimg = new javax.swing.JLabel();
        ghostimg2 = new javax.swing.JLabel();
        campfire = new javax.swing.JLabel();
        pumpkin1 = new javax.swing.JLabel();
        pumpkin2 = new javax.swing.JLabel();
        batbtn = new javax.swing.JButton();
        pumpkin3 = new javax.swing.JLabel();
        pumpkin4 = new javax.swing.JLabel();
        pumpkinbtn = new javax.swing.JButton();
        cfbtn = new javax.swing.JButton();
        catbtn = new javax.swing.JButton();
        Candlebtn1 = new javax.swing.JButton();
        ghostbtn = new javax.swing.JButton();
        lampbtn = new javax.swing.JButton();
        cat = new javax.swing.JLabel();
        treeimg = new javax.swing.JLabel();
        bgimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.add(lamp1);
        lamp1.setBounds(250, 130, 30, 50);
        jPanel1.add(lamp2);
        lamp2.setBounds(20, 170, 30, 50);
        jPanel1.add(lamp3);
        lamp3.setBounds(190, 30, 30, 50);
        jPanel1.add(lamp4);
        lamp4.setBounds(430, 110, 30, 50);
        jPanel1.add(lamp5);
        lamp5.setBounds(420, 310, 30, 50);
        jPanel1.add(lamp6);
        lamp6.setBounds(150, 280, 30, 50);
        jPanel1.add(lamp7);
        lamp7.setBounds(370, 230, 30, 50);
        jPanel1.add(candlelight1);
        candlelight1.setBounds(664, 300, 30, 21);
        jPanel1.add(candlelight2);
        candlelight2.setBounds(333, 360, 30, 21);
        jPanel1.add(candlelight3);
        candlelight3.setBounds(723, 450, 30, 21);
        jPanel1.add(candlelight4);
        candlelight4.setBounds(93, 330, 30, 21);

        candle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/candle.png"))); // NOI18N
        jPanel1.add(candle1);
        candle1.setBounds(660, 310, 40, 80);

        candle2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/candle.png"))); // NOI18N
        jPanel1.add(candle2);
        candle2.setBounds(90, 340, 40, 80);

        candle3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/candle.png"))); // NOI18N
        jPanel1.add(candle3);
        candle3.setBounds(330, 370, 40, 80);

        candle4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/candle.png"))); // NOI18N
        jPanel1.add(candle4);
        candle4.setBounds(720, 460, 40, 80);
        jPanel1.add(bat);
        bat.setBounds(40, 30, 150, 100);
        jPanel1.add(ghostimg);
        ghostimg.setBounds(450, 130, 140, 240);

        ghostimg2.setText("ghostimg2");
        jPanel1.add(ghostimg2);
        ghostimg2.setBounds(600, 190, 90, 100);
        jPanel1.add(campfire);
        campfire.setBounds(420, 310, 110, 150);
        jPanel1.add(pumpkin1);
        pumpkin1.setBounds(190, 440, 80, 86);
        jPanel1.add(pumpkin2);
        pumpkin2.setBounds(250, 430, 80, 80);

        batbtn.setBackground(new java.awt.Color(153, 153, 153));
        batbtn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        batbtn.setText("Bat");
        batbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        batbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batbtnActionPerformed(evt);
            }
        });
        jPanel1.add(batbtn);
        batbtn.setBounds(700, 560, 90, 30);
        jPanel1.add(pumpkin3);
        pumpkin3.setBounds(140, 450, 90, 60);
        jPanel1.add(pumpkin4);
        pumpkin4.setBounds(110, 470, 280, 20);

        pumpkinbtn.setBackground(new java.awt.Color(153, 153, 153));
        pumpkinbtn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        pumpkinbtn.setText("Pumpkin");
        pumpkinbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pumpkinbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pumpkinbtnActionPerformed(evt);
            }
        });
        jPanel1.add(pumpkinbtn);
        pumpkinbtn.setBounds(580, 560, 100, 30);

        cfbtn.setBackground(new java.awt.Color(153, 153, 153));
        cfbtn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        cfbtn.setText("Campfire");
        cfbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cfbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfbtnActionPerformed(evt);
            }
        });
        jPanel1.add(cfbtn);
        cfbtn.setBounds(120, 560, 110, 30);

        catbtn.setBackground(new java.awt.Color(153, 153, 153));
        catbtn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        catbtn.setText("Cat");
        catbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        catbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catbtnActionPerformed(evt);
            }
        });
        jPanel1.add(catbtn);
        catbtn.setBounds(10, 560, 90, 30);

        Candlebtn1.setBackground(new java.awt.Color(153, 153, 153));
        Candlebtn1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Candlebtn1.setText("Candle");
        Candlebtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Candlebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Candlebtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(Candlebtn1);
        Candlebtn1.setBounds(360, 560, 90, 30);

        ghostbtn.setBackground(new java.awt.Color(153, 153, 153));
        ghostbtn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ghostbtn.setText("Ghost");
        ghostbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ghostbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ghostbtnActionPerformed(evt);
            }
        });
        jPanel1.add(ghostbtn);
        ghostbtn.setBounds(250, 560, 90, 30);

        lampbtn.setBackground(new java.awt.Color(153, 153, 153));
        lampbtn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lampbtn.setText("Lights");
        lampbtn.setActionCommand("Lamp");
        lampbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lampbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lampbtnActionPerformed(evt);
            }
        });
        jPanel1.add(lampbtn);
        lampbtn.setBounds(470, 560, 90, 30);
        jPanel1.add(cat);
        cat.setBounds(490, 380, 150, 100);

        treeimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tr.png"))); // NOI18N
        jPanel1.add(treeimg);
        treeimg.setBounds(0, 0, 550, 500);

        bgimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        jPanel1.add(bgimg);
        bgimg.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int n = 0;
    private void ghostbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ghostbtnActionPerformed
        lamp1.setVisible(false);
        lamp2.setVisible(false);
        lamp3.setVisible(false);
        lamp4.setVisible(false);
        lamp5.setVisible(false);
        lamp6.setVisible(false);
        lamp7.setVisible(false);
        candlelight1.setVisible(false);
        candlelight2.setVisible(false);
        candlelight3.setVisible(false);
        candlelight4.setVisible(false);
        cat.setVisible(false);
        campfire.setVisible(false);
        pumpkin1.setVisible(false);
        pumpkin2.setVisible(false);
        pumpkin3.setVisible(false);
        pumpkin4.setVisible(false);
        bat.setVisible(false);
        BufferedImage ghimage;
        BufferedImage ghimage2;
        try {
            ghimage = ImageIO.read(getClass().getResource("/images/g.png"));
            URL url = getClass().getResource("/images/gx.gif");

            ImageIcon gicon = new ImageIcon(ghimage);
            ImageIcon gicon2 = new ImageIcon(url);
            ghostimg.setIcon(gicon);
            ghostimg2.setIcon(gicon2);

            if (ghostimg.isVisible() == false) {
                ghostimg.setVisible(true);
                ghostimg2.setVisible(true);
                n++;
            } else if (ghostimg.isVisible() == true && n == 0) {
                ghostimg.setVisible(true);
                ghostimg2.setVisible(true);
                n++;
            } else {
                ghostimg.setVisible(false);
                ghostimg2.setVisible(false);
            }
            ghostimg.revalidate();
            ghostimg2.revalidate();

        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        //ghostimg.setVisible(false);
    }//GEN-LAST:event_ghostbtnActionPerformed
    int m = 0;
    private void Candlebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Candlebtn1ActionPerformed
        lamp1.setVisible(false);
        lamp2.setVisible(false);
        lamp3.setVisible(false);
        lamp4.setVisible(false);
        lamp5.setVisible(false);
        lamp6.setVisible(false);
        lamp7.setVisible(false);
        ghostimg.setVisible(false);
        ghostimg2.setVisible(false);
        cat.setVisible(false);
        campfire.setVisible(false);
        pumpkin1.setVisible(false);
        pumpkin2.setVisible(false);
        pumpkin3.setVisible(false);
        pumpkin4.setVisible(false);
        bat.setVisible(false);
        BufferedImage frimage;
        try {
            frimage = ImageIO.read(getClass().getResource("/images/fire.png"));

            ImageIcon ficon = new ImageIcon(frimage);
            candlelight1.setIcon(ficon);
            candlelight2.setIcon(ficon);
            candlelight3.setIcon(ficon);
            candlelight4.setIcon(ficon);
            if (candlelight1.isVisible() == false) {
                candlelight1.setVisible(true);
                candlelight2.setVisible(true);
                candlelight3.setVisible(true);
                candlelight4.setVisible(true);
                m++;
            } else if (candlelight1.isVisible() == true && m == 0) {
                candlelight1.setVisible(true);
                candlelight2.setVisible(true);
                candlelight3.setVisible(true);
                candlelight4.setVisible(true);
                m++;
            } else {
                candlelight1.setVisible(false);
                candlelight2.setVisible(false);
                candlelight3.setVisible(false);
                candlelight4.setVisible(false);
            }
            candlelight1.revalidate();
            candlelight2.revalidate();
            candlelight3.revalidate();
            candlelight4.revalidate();
        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Candlebtn1ActionPerformed
    int o = 0;
    private void lampbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lampbtnActionPerformed
        ghostimg.setVisible(false);
        ghostimg2.setVisible(false);
        candlelight1.setVisible(false);
        candlelight2.setVisible(false);
        candlelight3.setVisible(false);
        candlelight4.setVisible(false);
        cat.setVisible(false);
        campfire.setVisible(false);
        pumpkin1.setVisible(false);
        pumpkin2.setVisible(false);
        pumpkin3.setVisible(false);
        pumpkin4.setVisible(false);
        bat.setVisible(false);
        BufferedImage lmimage;
        try {
            lmimage = ImageIO.read(getClass().getResource("/images/lamp.png"));

            ImageIcon licon = new ImageIcon(lmimage);
            lamp1.setIcon(licon);
            lamp2.setIcon(licon);
            lamp3.setIcon(licon);
            lamp4.setIcon(licon);
            lamp5.setIcon(licon);
            lamp6.setIcon(licon);
            lamp7.setIcon(licon);
            if (lamp1.isVisible() == false) {
                lamp1.setVisible(true);
                lamp2.setVisible(true);
                lamp3.setVisible(true);
                lamp4.setVisible(true);
                lamp5.setVisible(true);
                lamp6.setVisible(true);
                lamp7.setVisible(true);
                o++;
            } else if (lamp1.isVisible() == true && o == 0) {
                lamp1.setVisible(true);
                lamp2.setVisible(true);
                lamp3.setVisible(true);
                lamp4.setVisible(true);
                lamp5.setVisible(true);
                lamp6.setVisible(true);
                lamp7.setVisible(true);
                o++;
            } else {
                lamp1.setVisible(false);
                lamp2.setVisible(false);
                lamp3.setVisible(false);
                lamp4.setVisible(false);
                lamp5.setVisible(false);
                lamp6.setVisible(false);
                lamp7.setVisible(false);
            }
            lamp1.revalidate();
            lamp2.revalidate();
            lamp3.revalidate();
            lamp4.revalidate();
            lamp5.revalidate();
            lamp6.revalidate();
            lamp7.revalidate();
        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lampbtnActionPerformed
    int p = 0;
    private void catbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catbtnActionPerformed
        lamp1.setVisible(false);
        lamp2.setVisible(false);
        lamp3.setVisible(false);
        lamp4.setVisible(false);
        lamp5.setVisible(false);
        lamp6.setVisible(false);
        lamp7.setVisible(false);
        bat.setVisible(false);
        candlelight1.setVisible(false);
        candlelight2.setVisible(false);
        candlelight3.setVisible(false);
        candlelight4.setVisible(false);
        ghostimg.setVisible(false);
        ghostimg2.setVisible(false);
        campfire.setVisible(false);
        pumpkin1.setVisible(false);
        pumpkin2.setVisible(false);
        pumpkin3.setVisible(false);
        pumpkin4.setVisible(false);
        URL url = getClass().getResource("/images/cat.gif");
        ImageIcon cicon = new ImageIcon(url);
        cat.setIcon(cicon);
        if (cat.isVisible() == false) {
            cat.setVisible(true);
            p++;
        } else if (cat.isVisible() == true && p == 0) {
            cat.setVisible(true);
            p++;
        } else {
            cat.setVisible(false);
        }
        cat.revalidate();
    }//GEN-LAST:event_catbtnActionPerformed

    int q = 0;
    private void cfbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfbtnActionPerformed
        lamp1.setVisible(false);
        lamp2.setVisible(false);
        lamp3.setVisible(false);
        lamp4.setVisible(false);
        lamp5.setVisible(false);
        lamp6.setVisible(false);
        lamp7.setVisible(false);
        bat.setVisible(false);
        candlelight1.setVisible(false);
        candlelight2.setVisible(false);
        candlelight3.setVisible(false);
        candlelight4.setVisible(false);
        ghostimg.setVisible(false);
        ghostimg2.setVisible(false);
        cat.setVisible(false);
        pumpkin1.setVisible(false);
        pumpkin2.setVisible(false);
        pumpkin3.setVisible(false);
        pumpkin4.setVisible(false);
        URL url = getClass().getResource("/images/campfire.gif");
        ImageIcon cficon = new ImageIcon(url);
        campfire.setIcon(cficon);
        if (campfire.isVisible() == false) {
            campfire.setVisible(true);
            q++;
        } else if (campfire.isVisible() == true && q == 0) {
            campfire.setVisible(true);
            q++;
        } else {
            campfire.setVisible(false);
        }
        campfire.revalidate();
    }//GEN-LAST:event_cfbtnActionPerformed

    int r = 0;
    private void pumpkinbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pumpkinbtnActionPerformed
        lamp1.setVisible(false);
        lamp2.setVisible(false);
        lamp3.setVisible(false);
        lamp4.setVisible(false);
        lamp5.setVisible(false);
        lamp6.setVisible(false);
        lamp7.setVisible(false);
        candlelight1.setVisible(false);
        candlelight2.setVisible(false);
        candlelight3.setVisible(false);
        candlelight4.setVisible(false);
        ghostimg.setVisible(false);
        ghostimg2.setVisible(false);
        cat.setVisible(false);
        campfire.setVisible(false);
        bat.setVisible(false);
        URL url = getClass().getResource("/images/pumpkin.gif");
        URL url2 = getClass().getResource("/images/pumpkinx.gif");
        URL url3 = getClass().getResource("/images/pumpkiny.gif");
        URL url4 = getClass().getResource("/images/pumpkinz.gif");
        ImageIcon pficon = new ImageIcon(url);
        ImageIcon pficon2 = new ImageIcon(url2);
        ImageIcon pficon3 = new ImageIcon(url3);
        ImageIcon pficon4 = new ImageIcon(url4);
        pumpkin1.setIcon(pficon);
        pumpkin2.setIcon(pficon2);
        pumpkin3.setIcon(pficon3);
        pumpkin4.setIcon(pficon4);
        if (pumpkin1.isVisible() == false) {
            pumpkin1.setVisible(true);
            pumpkin2.setVisible(true);
            pumpkin3.setVisible(true);
            pumpkin4.setVisible(true);
            r++;
        } else if (pumpkin1.isVisible() == true && r == 0) {
            pumpkin1.setVisible(true);
            pumpkin2.setVisible(true);
            pumpkin3.setVisible(true);
            pumpkin4.setVisible(true);
            r++;
        } else {
            pumpkin1.setVisible(false);
            pumpkin2.setVisible(false);
            pumpkin3.setVisible(false);
            pumpkin4.setVisible(false);
        }
        pumpkin1.revalidate();
        pumpkin2.revalidate();
        pumpkin3.revalidate();
        pumpkin4.revalidate();
    }//GEN-LAST:event_pumpkinbtnActionPerformed
    
    int s=0;
    private void batbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batbtnActionPerformed
        lamp1.setVisible(false);
        lamp2.setVisible(false);
        lamp3.setVisible(false);
        lamp4.setVisible(false);
        lamp5.setVisible(false);
        lamp6.setVisible(false);
        lamp7.setVisible(false);
        candlelight1.setVisible(false);
        candlelight2.setVisible(false);
        candlelight3.setVisible(false);
        candlelight4.setVisible(false);
        ghostimg.setVisible(false);
        ghostimg2.setVisible(false);
        campfire.setVisible(false);
        pumpkin1.setVisible(false);
        pumpkin2.setVisible(false);
        pumpkin3.setVisible(false);
        pumpkin4.setVisible(false);
        cat.setVisible(false);
        URL url = getClass().getResource("/images/bats.gif");
        ImageIcon bicon = new ImageIcon(url);
        bat.setIcon(bicon);
        if (bat.isVisible() == false) {
            bat.setVisible(true);
            s++;
        } else if (bat.isVisible() == true && s == 0) {
            bat.setVisible(true);
            s++;
        } else {
            bat.setVisible(false);
        }
        bat.revalidate();    }//GEN-LAST:event_batbtnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Candlebtn1;
    private javax.swing.JLabel bat;
    private javax.swing.JButton batbtn;
    private javax.swing.JLabel bgimg;
    private javax.swing.JLabel campfire;
    private javax.swing.JLabel candle1;
    private javax.swing.JLabel candle2;
    private javax.swing.JLabel candle3;
    private javax.swing.JLabel candle4;
    private javax.swing.JLabel candlelight1;
    private javax.swing.JLabel candlelight2;
    private javax.swing.JLabel candlelight3;
    private javax.swing.JLabel candlelight4;
    private javax.swing.JLabel cat;
    private javax.swing.JButton catbtn;
    private javax.swing.JButton cfbtn;
    private javax.swing.JButton ghostbtn;
    private javax.swing.JLabel ghostimg;
    private javax.swing.JLabel ghostimg2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lamp1;
    private javax.swing.JLabel lamp2;
    private javax.swing.JLabel lamp3;
    private javax.swing.JLabel lamp4;
    private javax.swing.JLabel lamp5;
    private javax.swing.JLabel lamp6;
    private javax.swing.JLabel lamp7;
    private javax.swing.JButton lampbtn;
    private javax.swing.JLabel pumpkin1;
    private javax.swing.JLabel pumpkin2;
    private javax.swing.JLabel pumpkin3;
    private javax.swing.JLabel pumpkin4;
    private javax.swing.JButton pumpkinbtn;
    private javax.swing.JLabel treeimg;
    // End of variables declaration//GEN-END:variables

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);

            }

        });
    }
}
