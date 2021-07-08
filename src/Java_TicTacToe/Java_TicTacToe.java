/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java_TicTacToe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Java_TicTacToe extends javax.swing.JFrame {

   private String startGame = "X";
   private int xCount = 0;
   private int oCount = 0;
   boolean checker;
   
   public Java_TicTacToe() {
        initComponents();
    }

   private void gameScore()
   {
   jlblPlayerX.setText(String.valueOf(xCount));
   jlblPlayerO.setText(String.valueOf(oCount));
   }
   
   private void choose_a_player()
   {
    if(startGame.equalsIgnoreCase("X"))
    {
        startGame = "O"; 
    }
    else 
    {
        startGame = "X";  
    }
   }
   
   private void winningGame()
   {
       String b1 = jbtnTic1.getText(); 
       String b2 = jbtnTic2.getText();
       String b3 = jbtnTic3.getText();
       String b4 = jbtnTic4.getText();
       String b5 = jbtnTic5.getText();
       String b6 = jbtnTic6.getText();
       String b7 = jbtnTic7.getText();
       String b8 = jbtnTic8.getText();
       String b9 = jbtnTic9.getText();
       
       if(b1 == ("X") && b2 == ("X") && b3 ==("X"))
       {
           JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           jbtnTic1.setBackground(Color.ORANGE);
           jbtnTic2.setBackground(Color.ORANGE);
           jbtnTic3.setBackground(Color.ORANGE);
           xCount++;
           gameScore();
       }
       
       if(b4 == ("X") && b5 == ("X") && b6 ==("X"))
       {
           JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           jbtnTic4.setBackground(Color.CYAN);
           jbtnTic5.setBackground(Color.CYAN);
           jbtnTic6.setBackground(Color.CYAN);
           xCount++;
           gameScore();
       }
       
       if(b7 == ("X") && b8 == ("X") && b9 ==("X"))
       {
           JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           jbtnTic7.setBackground(Color.GREEN);
           jbtnTic8.setBackground(Color.GREEN);
           jbtnTic9.setBackground(Color.GREEN);
           xCount++;
           gameScore();
       }
       
       if(b1 == ("X") && b4 == ("X") && b7 ==("X"))
       {
           JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           jbtnTic1.setBackground(Color.MAGENTA);
           jbtnTic4.setBackground(Color.MAGENTA);
           jbtnTic7.setBackground(Color.MAGENTA);
           xCount++;
           gameScore();
       }
       
       if(b2 == ("X") && b5 == ("X") && b8 ==("X"))
       {
           JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           jbtnTic2.setBackground(Color.PINK);
           jbtnTic5.setBackground(Color.PINK);
           jbtnTic8.setBackground(Color.PINK);
           xCount++;
           gameScore();
       }
       
       if(b3 == ("X") && b6 == ("X") && b9 ==("X"))
       {
           JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           jbtnTic3.setBackground(Color.MAGENTA);
           jbtnTic6.setBackground(Color.MAGENTA);
           jbtnTic9.setBackground(Color.MAGENTA);
           xCount++;
           gameScore();
       }
       
       if(b1 == ("X") && b5 == ("X") && b9 ==("X"))
       {
           JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           jbtnTic1.setBackground(Color.PINK);
           jbtnTic5.setBackground(Color.PINK);
           jbtnTic9.setBackground(Color.PINK);
           xCount++;
           gameScore();
       }
       
       if(b3 == ("X") && b5 == ("X") && b7 ==("X"))
       {
           JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           jbtnTic3.setBackground(Color.CYAN);
           jbtnTic5.setBackground(Color.CYAN);
           jbtnTic7.setBackground(Color.CYAN);
           xCount++;
           gameScore();
       }
       
       
       
       
       
       if(b1 == ("O") && b2 == ("O") && b3 ==("O"))
       {
           JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           jbtnTic1.setBackground(Color.PINK);
           jbtnTic2.setBackground(Color.PINK);
           jbtnTic3.setBackground(Color.PINK);
           oCount++;
           gameScore();
       }
       
       if(b4 == ("O") && b5 == ("O") && b6 ==("O"))
       {
           JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           jbtnTic4.setBackground(Color.YELLOW);
           jbtnTic5.setBackground(Color.YELLOW);
           jbtnTic6.setBackground(Color.YELLOW);
           oCount++;
           gameScore();
       }
       
       if(b7 == ("O") && b8 == ("O") && b9 ==("O"))
       {
           JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           jbtnTic7.setBackground(Color.MAGENTA);
           jbtnTic8.setBackground(Color.MAGENTA);
           jbtnTic9.setBackground(Color.MAGENTA);
           oCount++;
           gameScore();
       }
       
       if(b1 == ("O") && b4 == ("O") && b7 ==("O"))
       {
           JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           jbtnTic1.setBackground(Color.MAGENTA);
           jbtnTic4.setBackground(Color.MAGENTA);
           jbtnTic7.setBackground(Color.MAGENTA);
           oCount++;
           gameScore();
       }
       
       if(b2 == ("O") && b5 == ("O") && b8 ==("O"))
       {
           JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           jbtnTic2.setBackground(Color.PINK);
           jbtnTic5.setBackground(Color.PINK);
           jbtnTic8.setBackground(Color.PINK);
           oCount++;
           gameScore();
       }
       
       if(b3 == ("O") && b6 == ("O") && b9 ==("O"))
       {
           JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           jbtnTic3.setBackground(Color.MAGENTA);
           jbtnTic6.setBackground(Color.MAGENTA);
           jbtnTic9.setBackground(Color.MAGENTA);
           oCount++;
           gameScore();
       }
       
       if(b1 == ("O") && b5 == ("O") && b9 ==("O"))
       {
           JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           jbtnTic1.setBackground(Color.PINK);
           jbtnTic5.setBackground(Color.PINK);
           jbtnTic9.setBackground(Color.PINK);
           oCount++;
           gameScore();
       }
       
       if(b3 == ("O") && b5 == ("O") && b7 ==("O"))
       {
           JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           jbtnTic3.setBackground(Color.PINK);
           jbtnTic5.setBackground(Color.PINK);
           jbtnTic7.setBackground(Color.PINK);
           oCount++;
           gameScore();
       }
       
}
   
   
   
   /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jlblPlayerX = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlblPlayerO = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jbtnNewGame = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbtnTic3 = new javax.swing.JButton();
        jbtnTic1 = new javax.swing.JButton();
        jbtnTic2 = new javax.swing.JButton();
        jbtnTic6 = new javax.swing.JButton();
        jbtnTic5 = new javax.swing.JButton();
        jbtnTic4 = new javax.swing.JButton();
        jbtnTic7 = new javax.swing.JButton();
        jbtnTic8 = new javax.swing.JButton();
        jbtnTic9 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(95, 158, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton10.setPreferredSize(new java.awt.Dimension(200, 158));
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 200, 170));

        jlblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jlblPlayerX.setOpaque(true);
        jPanel4.add(jlblPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 270, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel3.setText("Player X :");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel4.setText("Player O :");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jlblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jlblPlayerO.setOpaque(true);
        jPanel4.add(jlblPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 270, 80));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, 220));

        jPanel5.setBackground(new java.awt.Color(95, 158, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton11.setPreferredSize(new java.awt.Dimension(200, 158));
        jPanel5.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 200, 170));

        jbtnNewGame.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnNewGame.setText("New Game");
        jbtnNewGame.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNewGameActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 110));

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 310, 120));

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 270, 120));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 620, 260));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 640, 570));

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnTic3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic3.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic3ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 200, 170));

        jbtnTic1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic1.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic1ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 170));

        jbtnTic2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic2.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic2ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, 170));

        jbtnTic6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic6.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic6ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 200, 170));

        jbtnTic5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic5.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic5ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, 170));

        jbtnTic4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic4.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic4ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 190, 170));

        jbtnTic7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic7.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic7ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 190, 170));

        jbtnTic8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic8.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic8ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, 170));

        jbtnTic9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic9.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic9ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 200, 170));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 670, 570));

        jPanel6.setBackground(new java.awt.Color(95, 158, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Tic  Tac  Toe  Game");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 1320, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 1450, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNewGameActionPerformed
        jbtnTic1.setEnabled(true);
        jbtnTic2.setEnabled(true);
        jbtnTic3.setEnabled(true);
        jbtnTic4.setEnabled(true);
        jbtnTic5.setEnabled(true);
        jbtnTic6.setEnabled(true);
        jbtnTic7.setEnabled(true);
        jbtnTic8.setEnabled(true);
        jbtnTic9.setEnabled(true);
        
        jlblPlayerX.setText("0");
        jlblPlayerO.setText("0");
        
        jbtnTic1.setText("");
        jbtnTic2.setText("");
        jbtnTic3.setText("");
        jbtnTic4.setText("");
        jbtnTic5.setText("");
        jbtnTic6.setText("");
        jbtnTic7.setText("");
        jbtnTic8.setText("");
        jbtnTic9.setText("");
        
        jbtnTic1.setBackground(Color.LIGHT_GRAY);
        jbtnTic2.setBackground(Color.LIGHT_GRAY);
        jbtnTic3.setBackground(Color.LIGHT_GRAY);
        jbtnTic4.setBackground(Color.LIGHT_GRAY);
        jbtnTic5.setBackground(Color.LIGHT_GRAY);
        jbtnTic6.setBackground(Color.LIGHT_GRAY);
        jbtnTic7.setBackground(Color.LIGHT_GRAY);
        jbtnTic8.setBackground(Color.LIGHT_GRAY);
        jbtnTic9.setBackground(Color.LIGHT_GRAY);

    }//GEN-LAST:event_jbtnNewGameActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jbtnTic1.setEnabled(true);
        jbtnTic2.setEnabled(true);
        jbtnTic3.setEnabled(true);
        jbtnTic4.setEnabled(true);
        jbtnTic5.setEnabled(true);
        jbtnTic6.setEnabled(true);
        jbtnTic7.setEnabled(true);
        jbtnTic8.setEnabled(true);
        jbtnTic9.setEnabled(true);
        
        jbtnTic1.setText("");
        jbtnTic2.setText("");
        jbtnTic3.setText("");
        jbtnTic4.setText("");
        jbtnTic5.setText("");
        jbtnTic6.setText("");
        jbtnTic7.setText("");
        jbtnTic8.setText("");
        jbtnTic9.setText("");
        
        jbtnTic1.setBackground(Color.LIGHT_GRAY);
        jbtnTic2.setBackground(Color.LIGHT_GRAY);
        jbtnTic3.setBackground(Color.LIGHT_GRAY);
        jbtnTic4.setBackground(Color.LIGHT_GRAY);
        jbtnTic5.setBackground(Color.LIGHT_GRAY);
        jbtnTic6.setBackground(Color.LIGHT_GRAY);
        jbtnTic7.setBackground(Color.LIGHT_GRAY);
        jbtnTic8.setBackground(Color.LIGHT_GRAY);
        jbtnTic9.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_jbtnResetActionPerformed
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame ("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic1ActionPerformed
    jbtnTic1.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        checker = false;
    }
    else
    {
     checker = true;    
    }
    choose_a_player();
    winningGame();
    }//GEN-LAST:event_jbtnTic1ActionPerformed

    private void jbtnTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic2ActionPerformed
        jbtnTic2.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        checker = false;
    }
    else
    {
     checker = true;    
    }
    choose_a_player();
    winningGame();

    }//GEN-LAST:event_jbtnTic2ActionPerformed

    private void jbtnTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic3ActionPerformed
        jbtnTic3.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        checker = false;
    }
    else
    {
     checker = true;    
    }
    choose_a_player();
    winningGame();
    }//GEN-LAST:event_jbtnTic3ActionPerformed

    private void jbtnTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic4ActionPerformed
        jbtnTic4.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        checker = false;
    }
    else
    {
     checker = true;    
    }
    choose_a_player();
    winningGame();

    }//GEN-LAST:event_jbtnTic4ActionPerformed

    private void jbtnTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic5ActionPerformed
        jbtnTic5.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        checker = false;
    }
    else
    {
     checker = true;    
    }
    choose_a_player();
    winningGame();

    }//GEN-LAST:event_jbtnTic5ActionPerformed

    private void jbtnTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic6ActionPerformed
        jbtnTic6.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        checker = false;
    }
    else
    {
     checker = true;    
    }
    choose_a_player();
    winningGame();

    }//GEN-LAST:event_jbtnTic6ActionPerformed

    private void jbtnTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic7ActionPerformed
       jbtnTic7.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        checker = false;
    }
    else
    {
     checker = true;    
    }
    choose_a_player();
    winningGame();

    }//GEN-LAST:event_jbtnTic7ActionPerformed

    private void jbtnTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic8ActionPerformed
        jbtnTic8.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        checker = false;
    }
    else
    {
     checker = true;    
    }
    choose_a_player();
    winningGame();

    }//GEN-LAST:event_jbtnTic8ActionPerformed

    private void jbtnTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic9ActionPerformed
       jbtnTic9.setText(startGame);
    
    if(startGame.equalsIgnoreCase("X"))
    {
        checker = false;
    }
    else
    {
     checker = true;    
    }
    choose_a_player();
    winningGame();

    }//GEN-LAST:event_jbtnTic9ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnNewGame;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnTic1;
    private javax.swing.JButton jbtnTic2;
    private javax.swing.JButton jbtnTic3;
    private javax.swing.JButton jbtnTic4;
    private javax.swing.JButton jbtnTic5;
    private javax.swing.JButton jbtnTic6;
    private javax.swing.JButton jbtnTic7;
    private javax.swing.JButton jbtnTic8;
    private javax.swing.JButton jbtnTic9;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    // End of variables declaration//GEN-END:variables

}
