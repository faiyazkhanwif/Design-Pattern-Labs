/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dpfacade.AllFacade;
import dpsingleton.Cat;
import dpsingleton.Bat;
import dpsingleton.Animal;
import dpcommand.SoundOnCommand;
import dpcommand.SoundOffCommand;
import dpcommand.SoundManager;
import dpcommand.SoundClipSetup;
import dpcommand.Sound;
import dpfactorymethod.ScaryAndBigGhostsCaller;
import dpfactorymethod.KidGhostCaller;
import dpfactorymethod.GhostCaller;
import dpfactorymethod.Ghost;
import dpstrategy.Banner;
import dpstrategy.Lamps;
import dpstrategy.TreeAccessories;
import dpstrategy.RemoveLamps;
import dpstrategy.RemoveBanner;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import other.CampFire;
import other.CandleLights;
import other.GroundAccessories;
import dpstrategy.Pumpkin;
import dpstrategy.RemovePumpkins;

//-------------------------Strategy Pattern: Banner and Lamps.
//-------------------------Factory Method: Kid Ghost, Scary Ghost and Big Ghost.
//-------------------------Singleton Factory: Cat and Bats.
//-------------------------Command Pattern: Background Sound.
//-------------------------Facade Pattern: The "All" Button.
/**
 *
 * @author faiya
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    static MainJFrame mj;

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
        kid = new javax.swing.JLabel();
        pumpkinbtn = new javax.swing.JButton();
        cfbtn = new javax.swing.JButton();
        soundbtn = new javax.swing.JButton();
        catbtn = new javax.swing.JButton();
        Candlebtn1 = new javax.swing.JButton();
        bannerbtn1 = new javax.swing.JButton();
        all = new javax.swing.JButton();
        kidbtn = new javax.swing.JButton();
        ghostbtn = new javax.swing.JButton();
        lampbtn = new javax.swing.JButton();
        cat = new javax.swing.JLabel();
        banner = new javax.swing.JLabel();
        treeimg = new javax.swing.JLabel();
        bgimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.add(lamp1);
        lamp1.setBounds(130, 140, 30, 50);
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
        candlelight1.setBounds(653, 283, 50, 50);
        jPanel1.add(candlelight2);
        candlelight2.setBounds(323, 344, 50, 50);
        jPanel1.add(candlelight3);
        candlelight3.setBounds(713, 434, 50, 50);
        jPanel1.add(candlelight4);
        candlelight4.setBounds(144, 345, 50, 50);

        candle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/candle.png"))); // NOI18N
        jPanel1.add(candle1);
        candle1.setBounds(660, 310, 40, 80);

        candle2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/candle.png"))); // NOI18N
        jPanel1.add(candle2);
        candle2.setBounds(150, 370, 40, 80);

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
        jPanel1.add(kid);
        kid.setBounds(-10, 340, 140, 150);

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
        pumpkinbtn.setBounds(590, 560, 100, 30);

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
        cfbtn.setBounds(110, 560, 110, 30);

        soundbtn.setBackground(new java.awt.Color(153, 153, 153));
        soundbtn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        soundbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/soundoff.png"))); // NOI18N
        soundbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        soundbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soundbtnActionPerformed(evt);
            }
        });
        jPanel1.add(soundbtn);
        soundbtn.setBounds(750, 10, 40, 33);

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
        Candlebtn1.setText("Candle Light");
        Candlebtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Candlebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Candlebtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(Candlebtn1);
        Candlebtn1.setBounds(330, 560, 150, 30);

        bannerbtn1.setBackground(new java.awt.Color(153, 153, 153));
        bannerbtn1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bannerbtn1.setText("Banner");
        bannerbtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bannerbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bannerbtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(bannerbtn1);
        bannerbtn1.setBounds(230, 560, 90, 30);

        all.setBackground(new java.awt.Color(153, 153, 153));
        all.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        all.setText("All");
        all.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allActionPerformed(evt);
            }
        });
        jPanel1.add(all);
        all.setBounds(360, 520, 90, 30);

        kidbtn.setBackground(new java.awt.Color(153, 153, 153));
        kidbtn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        kidbtn.setText("Happy Kid Ghost");
        kidbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kidbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kidbtnActionPerformed(evt);
            }
        });
        jPanel1.add(kidbtn);
        kidbtn.setBounds(130, 520, 220, 30);

        ghostbtn.setBackground(new java.awt.Color(153, 153, 153));
        ghostbtn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ghostbtn.setText("Big & Scary Ghosts");
        ghostbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ghostbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ghostbtnActionPerformed(evt);
            }
        });
        jPanel1.add(ghostbtn);
        ghostbtn.setBounds(460, 520, 210, 30);

        lampbtn.setBackground(new java.awt.Color(153, 153, 153));
        lampbtn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lampbtn.setText("Lamps");
        lampbtn.setActionCommand("Lamp");
        lampbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lampbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lampbtnActionPerformed(evt);
            }
        });
        jPanel1.add(lampbtn);
        lampbtn.setBounds(490, 560, 90, 30);
        jPanel1.add(cat);
        cat.setBounds(490, 380, 150, 100);
        jPanel1.add(banner);
        banner.setBounds(180, 90, 200, 96);

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

    //Applied Factory Method for big ghost and scary ghost.
    int n = 0;
    private void ghostbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ghostbtnActionPerformed
        //Setting other decorations off when it is clicked
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
        kid.setVisible(false);
        bat.setVisible(false);
        banner.setVisible(false);
        m = 0;
        o = 0;
        p = 0;
        q = 0;
        r = 0;
        s = 0;
        t = 0;
        u = 0;
        v = 0;

        // ----------------------------------Factory Method pattern--------------------------------------------
        GhostCaller bigscarygcaller = new ScaryAndBigGhostsCaller(mj);
        Ghost bigghost = bigscarygcaller.getGhost("big");
        Ghost scaryghost = bigscarygcaller.getGhost("scary");

        if (n == 0) {
            bigghost.appear();
            scaryghost.appear();
            n = 1;

        } else if (n == 1) {
            bigghost.disappear();
            scaryghost.disappear();
            n = 0;
        }
    }//GEN-LAST:event_ghostbtnActionPerformed

    int m = 0;
    private void Candlebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Candlebtn1ActionPerformed
        //Setting other decorations off when it is clicked
        lamp1.setVisible(false);
        lamp2.setVisible(false);
        lamp3.setVisible(false);
        lamp4.setVisible(false);
        lamp5.setVisible(false);
        lamp6.setVisible(false);
        lamp7.setVisible(false);
        kid.setVisible(false);
        ghostimg.setVisible(false);
        ghostimg2.setVisible(false);
        cat.setVisible(false);
        campfire.setVisible(false);
        pumpkin1.setVisible(false);
        pumpkin2.setVisible(false);
        pumpkin3.setVisible(false);
        pumpkin4.setVisible(false);
        bat.setVisible(false);
        banner.setVisible(false);
        o = 0;
        n = 0;
        p = 0;
        q = 0;
        r = 0;
        s = 0;
        t = 0;
        u = 0;
        v = 0;

        GroundAccessories candleLights = new CandleLights(mj);
        if (m == 0) {
            candleLights.set();
            m = 1;

        } else if (m == 1) {
            candleLights.remove();
            m = 0;
        }

    }//GEN-LAST:event_Candlebtn1ActionPerformed

    //Applied Strategy pattern for lamps.
    int o = 0;
    private void lampbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lampbtnActionPerformed
        //Setting other decorations off when it is clicked
        ghostimg.setVisible(false);
        ghostimg2.setVisible(false);
        candlelight1.setVisible(false);
        candlelight2.setVisible(false);
        candlelight3.setVisible(false);
        candlelight4.setVisible(false);
        cat.setVisible(false);
        kid.setVisible(false);
        campfire.setVisible(false);
        pumpkin1.setVisible(false);
        pumpkin2.setVisible(false);
        pumpkin3.setVisible(false);
        pumpkin4.setVisible(false);
        banner.setVisible(false);
        bat.setVisible(false);
        m = 0;
        n = 0;
        p = 0;
        q = 0;
        r = 0;
        s = 0;
        t = 0;
        u = 0;
        v = 0;

        //------------------------------------------------Strategy Pattern--------------------------------------------------------
        TreeAccessories mylamps = new Lamps(mj);

        if (o == 0) {
            mylamps.performAccessorize();
            o = 1;
        } else if (o == 1) {
            mylamps.setAccBehavior(new RemoveLamps(mj));
            mylamps.performAccessorize();
            o = 0;
        }
    }//GEN-LAST:event_lampbtnActionPerformed

    //Applied Singleton pattern for Cat.
    int p = 0;
    private void catbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catbtnActionPerformed
        //Setting other decorations off when it is clicked
        lamp1.setVisible(false);
        lamp2.setVisible(false);
        lamp3.setVisible(false);
        lamp4.setVisible(false);
        lamp5.setVisible(false);
        lamp6.setVisible(false);
        lamp7.setVisible(false);
        bat.setVisible(false);
        kid.setVisible(false);
        banner.setVisible(false);
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
        m = 0;
        n = 0;
        o = 0;
        q = 0;
        r = 0;
        s = 0;
        t = 0;
        u = 0;
        v = 0;

        //-----------------------------------Singleton Pattern-----------------------------
        Animal blackcat = Cat.getCatInstance();
        if (p == 0) {
            cat.setIcon(blackcat.appear());
            cat.setVisible(true);
            p = 1;

        } else if (p == 1) {
            cat.setIcon(blackcat.disappear());
            cat.setVisible(false);
            p = 0;
        }
        cat.revalidate();
    }//GEN-LAST:event_catbtnActionPerformed

    int q = 0;
    private void cfbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfbtnActionPerformed
        //Setting other decorations off when it is clicked
        lamp1.setVisible(false);
        lamp2.setVisible(false);
        lamp3.setVisible(false);
        lamp4.setVisible(false);
        lamp5.setVisible(false);
        lamp6.setVisible(false);
        lamp7.setVisible(false);
        bat.setVisible(false);
        kid.setVisible(false);
        banner.setVisible(false);
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
        m = 0;
        n = 0;
        o = 0;
        p = 0;
        r = 0;
        s = 0;
        t = 0;
        u = 0;
        v = 0;
        GroundAccessories cfire = new CampFire(mj);

        if (q == 0) {
            cfire.set();
            q = 1;

        } else if (q == 1) {
            cfire.remove();
            q = 0;
        }
        campfire.revalidate();
    }//GEN-LAST:event_cfbtnActionPerformed

    int r = 0;
    
    //Applied Strategy pattern for Pumpkins.
    private void pumpkinbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pumpkinbtnActionPerformed
        //Setting other decorations off when it is clicked
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
        kid.setVisible(false);
        banner.setVisible(false);
        m = 0;
        n = 0;
        o = 0;
        p = 0;
        q = 0;
        s = 0;
        t = 0;
        u = 0;
        v = 0;
        
        //------------------------------------------------Strategy Pattern--------------------------------------------------------
        TreeAccessories mypumpkins = new Pumpkin(mj);

        if (r == 0) {
            mypumpkins.performAccessorize();
            r = 1;

        } else if (r == 1) {
            mypumpkins.setAccBehavior(new RemovePumpkins(mj));
            mypumpkins.performAccessorize();
            r = 0;
        }
    }//GEN-LAST:event_pumpkinbtnActionPerformed

    // Applied Singleton pattern for bats.
    int s = 0;
    private void batbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batbtnActionPerformed
        //Setting other decorations off when it is clicked
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
        kid.setVisible(false);
        banner.setVisible(false);
        m = 0;
        n = 0;
        o = 0;
        p = 0;
        q = 0;
        r = 0;
        t = 0;
        u = 0;
        v = 0;

        //---------------------------------------------Singleton Pattern-----------------------------------
        Animal bats = Bat.getBatInstance();
        if (s == 0) {
            bat.setIcon(bats.appear());
            bat.setVisible(true);
            s = 1;
        } else if (s == 1) {
            bat.setIcon(bats.disappear());
            bat.setVisible(true);
            s = 0;
        }
        bat.revalidate();    }//GEN-LAST:event_batbtnActionPerformed

    //Applied Factory Method for kidghost.
    int t = 0;
    private void kidbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kidbtnActionPerformed
        //Setting other decorations off when it is clicked
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
        bat.setVisible(false);
        banner.setVisible(false);
        m = 0;
        n = 0;
        o = 0;
        p = 0;
        q = 0;
        r = 0;
        s = 0;
        u = 0;
        v = 0;

        // ----------------------------------Factory Method pattern--------------------------------------------
        GhostCaller kidgcaller = new KidGhostCaller(mj);
        Ghost kidghost = kidgcaller.getGhost("kid");

        if (t == 0) {
            kidghost.appear();
            t = 1;
        } else if (t == 1) {
            kidghost.disappear();
            t = 0;
        }
        kid.revalidate();    }//GEN-LAST:event_kidbtnActionPerformed

    // Applied Strategy pattern for banner.
    int u = 0;
    private void bannerbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bannerbtn1ActionPerformed
        //Setting other decorations off when it is clicked
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
        bat.setVisible(false);
        kid.setVisible(false);
        m = 0;
        n = 0;
        o = 0;
        p = 0;
        q = 0;
        r = 0;
        s = 0;
        t = 0;
        v = 0;

        //-----------------------------------------------Strategy Pattern------------------------------------------------
        TreeAccessories mybanner = new Banner(mj);

        if (u == 0) {
            mybanner.performAccessorize();
            u = 1;
        } else if (u == 1) {
            mybanner.setAccBehavior(new RemoveBanner(mj));
            mybanner.performAccessorize();
            u = 0;
        }
        banner.revalidate();    }//GEN-LAST:event_bannerbtn1ActionPerformed

    int v = 0;
    private void allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allActionPerformed
        //Setting other decorations off when it is clicked
        banner.setVisible(false);
        kid.setVisible(false);
        bat.setVisible(false);
        pumpkin1.setVisible(false);
        pumpkin2.setVisible(false);
        pumpkin3.setVisible(false);
        pumpkin4.setVisible(false);
        campfire.setVisible(false);
        cat.setVisible(false);
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
        m = 0;
        n = 0;
        o = 0;
        p = 0;
        q = 0;
        r = 0;
        s = 0;
        t = 0;
        u = 0;
        GhostCaller kidgcaller = new KidGhostCaller(mj);
        GhostCaller bigscarygcaller = new ScaryAndBigGhostsCaller(mj); 
        GroundAccessories candleLights = new CandleLights(mj);
        TreeAccessories mylamps = new Lamps(mj);
        TreeAccessories mybanner = new Banner(mj);
        Animal blackcat = Cat.getCatInstance();
        Animal bats = Bat.getBatInstance();
        GroundAccessories cfire = new CampFire(mj);
        Pumpkin pumpkin = new Pumpkin(mj);
        //-------------------------------------------Facade Pattern----------------------------------------------

        AllFacade halloweenParty = new AllFacade(mj, kidgcaller, bigscarygcaller, 
                candleLights, mylamps, blackcat,cfire, pumpkin, bats, mybanner);

        if (v == 0) {
            halloweenParty.turnAllOn();
            v = 1;

        } else if (v == 1) {
            halloweenParty.turnAllOff();
            v = 0;
        }
    }//GEN-LAST:event_allActionPerformed

    //Applied Command pattern for sound.
    int switchs = 0;
    SoundClipSetup scs = new SoundClipSetup();
    Clip backgroundSound = scs.createClip();
    private void soundbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soundbtnActionPerformed
        SoundManager sm = new SoundManager();
        Sound sound = new Sound(backgroundSound, mj);
        if (switchs == 0) {

            //----------------------------------------Command Pattern-------------------------------------------
            SoundOnCommand soc = new SoundOnCommand(sound);
            sm.setCommand(soc);
            sm.buttonWasPressed();
            switchs++;
        } else if (switchs == 1) {

            //----------------------------------------Command Pattern-------------------------------------------
            SoundOffCommand sfc = new SoundOffCommand(sound);
            sm.setCommand(sfc);
            sm.buttonWasPressed();
            switchs--;
        }
    }//GEN-LAST:event_soundbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public JLabel getBanner() {
        return banner;
    }

    public void setBanner(JLabel banner) {
        this.banner = banner;
    }

    public JLabel getBat() {
        return bat;
    }

    public void setBat(JLabel bat) {
        this.bat = bat;
    }

    public JLabel getCampfire() {
        return campfire;
    }

    public void setCampfire(JLabel campfire) {
        this.campfire = campfire;
    }

    public JLabel getCandlelight1() {
        return candlelight1;
    }

    public void setCandlelight1(JLabel candlelight1) {
        this.candlelight1 = candlelight1;
    }

    public JLabel getCandlelight2() {
        return candlelight2;
    }

    public void setCandlelight2(JLabel candlelight2) {
        this.candlelight2 = candlelight2;
    }

    public JLabel getCandlelight3() {
        return candlelight3;
    }

    public void setCandlelight3(JLabel candlelight3) {
        this.candlelight3 = candlelight3;
    }

    public JLabel getCandlelight4() {
        return candlelight4;
    }

    public void setCandlelight4(JLabel candlelight4) {
        this.candlelight4 = candlelight4;
    }

    public JLabel getCat() {
        return cat;
    }

    public void setCat(JLabel cat) {
        this.cat = cat;
    }

    public JLabel getGhostimg() {
        return ghostimg;
    }

    public void setGhostimg(JLabel ghostimg) {
        this.ghostimg = ghostimg;
    }

    public JLabel getGhostimg2() {
        return ghostimg2;
    }

    public void setGhostimg2(JLabel ghostimg2) {
        this.ghostimg2 = ghostimg2;
    }

    public JLabel getKid() {
        return kid;
    }

    public void setKid(JLabel kid) {
        this.kid = kid;
    }

    public JLabel getLamp1() {
        return lamp1;
    }

    public void setLamp1(JLabel lamp1) {
        this.lamp1 = lamp1;
    }

    public JLabel getLamp2() {
        return lamp2;
    }

    public void setLamp2(JLabel lamp2) {
        this.lamp2 = lamp2;
    }

    public JLabel getLamp3() {
        return lamp3;
    }

    public void setLamp3(JLabel lamp3) {
        this.lamp3 = lamp3;
    }

    public JLabel getLamp4() {
        return lamp4;
    }

    public void setLamp4(JLabel lamp4) {
        this.lamp4 = lamp4;
    }

    public JLabel getLamp5() {
        return lamp5;
    }

    public void setLamp5(JLabel lamp5) {
        this.lamp5 = lamp5;
    }

    public JLabel getLamp6() {
        return lamp6;
    }

    public void setLamp6(JLabel lamp6) {
        this.lamp6 = lamp6;
    }

    public JLabel getLamp7() {
        return lamp7;
    }

    public void setLamp7(JLabel lamp7) {
        this.lamp7 = lamp7;
    }

    public JButton getSoundbtn() {
        return soundbtn;
    }

    public void setSoundbtn(JButton soundbtn) {
        this.soundbtn = soundbtn;
    }

    public JLabel getPumpkin1() {
        return pumpkin1;
    }

    public JLabel getPumpkin2() {
        return pumpkin2;
    }

    public JLabel getPumpkin3() {
        return pumpkin3;
    }

    public JLabel getPumpkin4() {
        return pumpkin4;
    }

    public void setPumpkin1(JLabel pumpkin1) {
        this.pumpkin1 = pumpkin1;
    }

    public void setPumpkin2(JLabel pumpkin2) {
        this.pumpkin2 = pumpkin2;
    }

    public void setPumpkin3(JLabel pumpkin3) {
        this.pumpkin3 = pumpkin3;
    }

    public void setPumpkin4(JLabel pumpkin4) {
        this.pumpkin4 = pumpkin4;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Candlebtn1;
    private javax.swing.JButton all;
    private javax.swing.JLabel banner;
    private javax.swing.JButton bannerbtn1;
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
    private javax.swing.JLabel kid;
    private javax.swing.JButton kidbtn;
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
    private javax.swing.JButton soundbtn;
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
            @Override
            public void run() {
                mj = new MainJFrame();
                mj.setVisible(true);

            }

        });
    }
}
