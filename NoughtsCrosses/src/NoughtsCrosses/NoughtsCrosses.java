/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NoughtsCrosses;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author bhakt
 */
public class NoughtsCrosses extends javax.swing.JFrame {

    private String startGame = "X";
    private int XCount = 0;
    private int OCount = 0;
    boolean checker;
    
    
    public NoughtsCrosses() {
        initComponents();
    }

    
    private void gameScore(){
        jblPlayerX.setText(String.valueOf(XCount));
        jblPlayerO.setText(String.valueOf(OCount));
    }
    
    private void choose_player(){
        if(startGame.equalsIgnoreCase("X")){
            startGame = "O";
           
        }
        else{
            startGame = "X";
        }
    }
    
    private void winningGame(){
        String b1  =  jbtnTic1.getText();
        String b2 =   jbtnTic2.getText();
        String b3 =   jbtnTic3.getText();
        String b4 =   jbtnTic4.getText();
        String b5 =   jbtnTic5.getText();
        String b6 =   jbtnTic6.getText();
        String b7 =   jbtnTic7.getText();
        String b8 =   jbtnTic8.getText();
        String b9 =   jbtnTic9.getText();
        
       //for horizontal win of X :1
       if(b1 == ("X") && b2 == ("X") && b3 == ("X")){
           JOptionPane.showMessageDialog(this,"Player X wins","noughts And Crosses",JOptionPane.INFORMATION_MESSAGE);
           
           jbtnTic1.setBackground(Color.MAGENTA);
           jbtnTic2.setBackground(Color.MAGENTA);
           jbtnTic3.setBackground(Color.MAGENTA);
           XCount++;
           gameScore();
       }
       
       //for horizontal win of X :2
       if(b7 == ("X") && b8 == ("X") && b9 == ("X")){
           JOptionPane.showMessageDialog(this,"Player X wins","noughts And Crosses",JOptionPane.INFORMATION_MESSAGE);
           
           jbtnTic1.setBackground(Color.BLUE);
           jbtnTic5.setBackground(Color.BLUE);
           jbtnTic3.setBackground(Color.BLUE);
           XCount++;
           gameScore();
       }
       
       //for horizontal win of X:3
       if(b4 == ("X") && b5 == ("X") && b6 == ("X")){
           JOptionPane.showMessageDialog(this,"Player X wins","noughts And Crosses",JOptionPane.INFORMATION_MESSAGE);
           
           jbtnTic4.setBackground(Color.GREEN);
           jbtnTic5.setBackground(Color.GREEN);
           jbtnTic6.setBackground(Color.GREEN);
           XCount++;
           gameScore();
           
       }
       
       //for horizontal win of o :1
       if(b4 == ("O") && b5 == ("O") && b6 == ("O")){
           JOptionPane.showMessageDialog(this,"Player O wins","noughts And Crosses",JOptionPane.INFORMATION_MESSAGE);
           
           jbtnTic4.setBackground(Color.CYAN);
           jbtnTic5.setBackground(Color.CYAN);
           jbtnTic6.setBackground(Color.CYAN);
           OCount++;
           gameScore();
           
       }
       
       //for horizontal win of O:2
       if(b7 == ("O") && b8 == ("O") && b9 == ("O")){
           JOptionPane.showMessageDialog(this,"Player O wins","noughts And Crosses",JOptionPane.INFORMATION_MESSAGE);
           
           jbtnTic7.setBackground(Color.MAGENTA);
           jbtnTic8.setBackground(Color.MAGENTA);
           jbtnTic9.setBackground(Color.MAGENTA);
           OCount++;
           gameScore();
           
       }
       
       //for horizontal win of O:3
        if(b1 == ("O") && b2 == ("O") && b3 == ("O")){
           JOptionPane.showMessageDialog(this,"Player O wins","noughts And Crosses",JOptionPane.INFORMATION_MESSAGE);
           
           jbtnTic1.setBackground(Color.YELLOW);
           jbtnTic2.setBackground(Color.YELLOW);
           jbtnTic3.setBackground(Color.YELLOW);
           OCount++;
           gameScore();
           
       }
       
       //for diagonal win of  X:1
       if(b3 == ("X") && b5 == ("X") && b7 == ("X")){
           JOptionPane.showMessageDialog(this,"Player X wins","noughts And Crosses",JOptionPane.INFORMATION_MESSAGE);
           
           jbtnTic3.setBackground(Color.BLUE);
           jbtnTic5.setBackground(Color.BLUE);
           jbtnTic7.setBackground(Color.BLUE);
           XCount++;
           gameScore();
       }
       
       //for diagonal win of X:2
        if(b1 == ("X") && b5 == ("X") && b9 == ("X")){
           JOptionPane.showMessageDialog(this,"Player X wins","noughts And Crosses",JOptionPane.INFORMATION_MESSAGE);
           
           jbtnTic1.setBackground(Color.YELLOW);
           jbtnTic5.setBackground(Color.YELLOW);
           jbtnTic9.setBackground(Color.YELLOW);
           XCount++;
           gameScore();
           
       }
        
       //for diagonal win of O:1
       if(b3 == ("O") && b5 == ("O") && b7 == ("O")){
           JOptionPane.showMessageDialog(this,"Player O wins","noughts And Crosses",JOptionPane.INFORMATION_MESSAGE);
           
           jbtnTic3.setBackground(Color.BLUE);
           jbtnTic5.setBackground(Color.BLUE);
           jbtnTic7.setBackground(Color.BLUE);
           OCount++;
           gameScore();
       }
       
        
        //for diagonal win of O:2
        if(b1 == ("O") && b5 == ("O") && b9 == ("O")){
           JOptionPane.showMessageDialog(this,"Player O wins","noughts And Crosses",JOptionPane.INFORMATION_MESSAGE);
           
           jbtnTic1.setBackground(Color.YELLOW);
           jbtnTic5.setBackground(Color.YELLOW);
           jbtnTic9.setBackground(Color.YELLOW);
           OCount++;
           gameScore();
           
       }
        
        
        //for vertical win of X :1
        if(b1 == ("X") && b4 == ("X") && b7 == ("X")){
           JOptionPane.showMessageDialog(this,"Player X wins","noughts And Crosses",JOptionPane.INFORMATION_MESSAGE);
           
           jbtnTic1.setBackground(Color.MAGENTA);
           jbtnTic4.setBackground(Color.MAGENTA);
           jbtnTic7.setBackground(Color.MAGENTA);
           XCount++;
           gameScore();
       }
       
       //for vertical win of X:2
       if(b2 == ("X") && b5 == ("X") && b8 == ("X")){
           JOptionPane.showMessageDialog(this,"Player X wins","noughts And Crosses",JOptionPane.INFORMATION_MESSAGE);
           
           jbtnTic2.setBackground(Color.MAGENTA);
           jbtnTic5.setBackground(Color.MAGENTA);
           jbtnTic8.setBackground(Color.MAGENTA);
           XCount++;
           gameScore();
       }
       
       //for vertical win of X:3
       if(b3 == ("X") && b6 == ("X") && b9 == ("X")){
           JOptionPane.showMessageDialog(this,"Player X wins","noughts And Crosses",JOptionPane.INFORMATION_MESSAGE);
           
           jbtnTic3.setBackground(Color.MAGENTA);
           jbtnTic6.setBackground(Color.MAGENTA);
           jbtnTic9.setBackground(Color.MAGENTA);
           XCount++;
           gameScore();
       }
       
       //for vertical win of O:1
       if(b1 == ("O") && b4 == ("O") && b7 == ("O")){
           JOptionPane.showMessageDialog(this,"Player O wins","noughts And Crosses",JOptionPane.INFORMATION_MESSAGE);
           
           jbtnTic1.setBackground(Color.MAGENTA);
           jbtnTic4.setBackground(Color.MAGENTA);
           jbtnTic7.setBackground(Color.MAGENTA);
           OCount++;
           gameScore();
       }
       
       //for vertical win of O:2
       if(b2 == ("O") && b5 == ("O") && b8 == ("O")){
           JOptionPane.showMessageDialog(this,"Player O wins","noughts And Crosses",JOptionPane.INFORMATION_MESSAGE);
           
           jbtnTic2.setBackground(Color.MAGENTA);
           jbtnTic5.setBackground(Color.MAGENTA);
           jbtnTic8.setBackground(Color.MAGENTA);
           OCount++;
           gameScore();
       }
       
       //for vertical win of O:3
        if(b3 == ("O") && b6 == ("O") && b9 == ("O")){
           JOptionPane.showMessageDialog(this,"Player O wins","noughts And Crosses",JOptionPane.INFORMATION_MESSAGE);
           
           jbtnTic3.setBackground(Color.MAGENTA);
           jbtnTic6.setBackground(Color.MAGENTA);
           jbtnTic9.setBackground(Color.MAGENTA);
           OCount++;
           gameScore();
       }
    }
    
    private void DeclareWinner(){
        String str = jblPlayerX.getText();
       int ScoreOfX = Integer.parseInt(str);
       String str2 = jblPlayerO.getText();
       int ScoreOfO = Integer.parseInt(str2);
       
       if(ScoreOfX>ScoreOfO){
           JOptionPane.showMessageDialog(this,"Player X is Final Winner!!🎉🎉Congratulations!!","noughts And Crosses",JOptionPane.INFORMATION_MESSAGE);
       }
       else if(ScoreOfX<ScoreOfO){
           JOptionPane.showMessageDialog(this,"Player O is Final Winner!!🎉🎉Congratulations!!","noughts And Crosses",JOptionPane.INFORMATION_MESSAGE);
       }
       else{
           JOptionPane.showMessageDialog(this,"Congratulations Both of you!!🎉🎉You both are the winners!!","noughts And Crosses",JOptionPane.INFORMATION_MESSAGE);
       }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private JFrame frame;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        JblReset = new javax.swing.JButton();
        JblExit = new javax.swing.JButton();
        NewGame = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lblPlayerX = new javax.swing.JLabel();
        lblPlayerO = new javax.swing.JLabel();
        jblPlayerO = new javax.swing.JLabel();
        jblPlayerX = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbtnTic9 = new javax.swing.JButton();
        jbtnTic1 = new javax.swing.JButton();
        jbtnTic2 = new javax.swing.JButton();
        jbtnTic3 = new javax.swing.JButton();
        jbtnTic4 = new javax.swing.JButton();
        jbtnTic5 = new javax.swing.JButton();
        jbtnTic6 = new javax.swing.JButton();
        jbtnTic7 = new javax.swing.JButton();
        jbtnTic8 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 670, 660));

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        JblReset.setBackground(new java.awt.Color(255, 153, 153));
        JblReset.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        JblReset.setText("Reset");
        JblReset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JblReset.setMaximumSize(new java.awt.Dimension(200, 158));
        JblReset.setMinimumSize(new java.awt.Dimension(200, 158));
        JblReset.setOpaque(true);
        JblReset.setPreferredSize(new java.awt.Dimension(200, 158));
        JblReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JblResetActionPerformed(evt);
            }
        });

        JblExit.setBackground(new java.awt.Color(255, 153, 153));
        JblExit.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        JblExit.setText("Exit");
        JblExit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JblExit.setMaximumSize(new java.awt.Dimension(200, 158));
        JblExit.setMinimumSize(new java.awt.Dimension(200, 158));
        JblExit.setOpaque(true);
        JblExit.setPreferredSize(new java.awt.Dimension(200, 158));
        JblExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JblExitActionPerformed(evt);
            }
        });

        NewGame.setBackground(new java.awt.Color(255, 153, 153));
        NewGame.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        NewGame.setText("New Game");
        NewGame.setActionCommand("New Game\n");
        NewGame.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NewGame.setMaximumSize(new java.awt.Dimension(200, 158));
        NewGame.setMinimumSize(new java.awt.Dimension(200, 158));
        NewGame.setOpaque(true);
        NewGame.setPreferredSize(new java.awt.Dimension(200, 158));
        NewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NewGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(JblReset, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(NewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JblReset, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 630, 310));

        jPanel6.setBackground(new java.awt.Color(153, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        lblPlayerX.setText("Player X :");

        lblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        lblPlayerO.setText("Player O :");

        jblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        jblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerO.setText("0");
        jblPlayerO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jblPlayerO.setOpaque(true);

        jblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        jblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerX.setText("0");
        jblPlayerX.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jblPlayerX.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlayerO)
                    .addComponent(lblPlayerX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jblPlayerX, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(jblPlayerO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 630, 180));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 670, 570));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnTic9.setBackground(new java.awt.Color(255, 153, 153));
        jbtnTic9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnTic9.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic9.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic9.setOpaque(true);
        jbtnTic9.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic9ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 190, 160));

        jbtnTic1.setBackground(new java.awt.Color(255, 153, 153));
        jbtnTic1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnTic1.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic1.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic1.setOpaque(true);
        jbtnTic1.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic1ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 170));

        jbtnTic2.setBackground(new java.awt.Color(255, 153, 153));
        jbtnTic2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnTic2.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic2.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic2.setOpaque(true);
        jbtnTic2.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic2ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 200, 170));

        jbtnTic3.setBackground(new java.awt.Color(255, 153, 153));
        jbtnTic3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnTic3.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic3.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic3.setOpaque(true);
        jbtnTic3.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic3ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 190, 170));

        jbtnTic4.setBackground(new java.awt.Color(255, 153, 153));
        jbtnTic4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnTic4.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic4.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic4.setOpaque(true);
        jbtnTic4.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic4ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 200, 180));

        jbtnTic5.setBackground(new java.awt.Color(255, 153, 153));
        jbtnTic5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnTic5.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic5.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic5.setOpaque(true);
        jbtnTic5.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic5ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 200, 180));

        jbtnTic6.setBackground(new java.awt.Color(255, 153, 153));
        jbtnTic6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnTic6.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic6.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic6.setOpaque(true);
        jbtnTic6.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic6ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 190, 180));

        jbtnTic7.setBackground(new java.awt.Color(255, 153, 153));
        jbtnTic7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnTic7.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic7.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic7.setOpaque(true);
        jbtnTic7.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic7ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 200, 160));

        jbtnTic8.setBackground(new java.awt.Color(255, 153, 153));
        jbtnTic8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnTic8.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic8.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic8.setOpaque(true);
        jbtnTic8.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic8ActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnTic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 200, 160));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 650, 570));

        jPanel7.setBackground(new java.awt.Color(153, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("Advanced Java Noughts And Crosses");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 1050, 67));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1340, 110));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic9ActionPerformed
        // TODO add your handling code here:
        jbtnTic9.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        choose_player();
        winningGame();
    }//GEN-LAST:event_jbtnTic9ActionPerformed

    private void jbtnTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic1ActionPerformed
        jbtnTic1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        choose_player();
        winningGame();
    }//GEN-LAST:event_jbtnTic1ActionPerformed

    private void jbtnTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic2ActionPerformed
        // TODO add your handling code here:
        jbtnTic2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        choose_player();
        winningGame();
    }//GEN-LAST:event_jbtnTic2ActionPerformed

    private void jbtnTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic3ActionPerformed
        // TODO add your handling code here:
        jbtnTic3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        choose_player();
        winningGame();
    }//GEN-LAST:event_jbtnTic3ActionPerformed

    private void jbtnTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic4ActionPerformed
        // TODO add your handling code here:
        jbtnTic4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        choose_player();
        winningGame();
    }//GEN-LAST:event_jbtnTic4ActionPerformed

    private void jbtnTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic5ActionPerformed
        // TODO add your handling code here:
        jbtnTic5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        choose_player();
        winningGame();
    }//GEN-LAST:event_jbtnTic5ActionPerformed

    private void jbtnTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic6ActionPerformed
        // TODO add your handling code here:
        jbtnTic6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        choose_player();
        winningGame();
    }//GEN-LAST:event_jbtnTic6ActionPerformed

    private void jbtnTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic7ActionPerformed
        // TODO add your handling code here:
        jbtnTic7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        choose_player();
        winningGame();
    }//GEN-LAST:event_jbtnTic7ActionPerformed

    private void jbtnTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic8ActionPerformed
        // TODO add your handling code here:
        jbtnTic8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        choose_player();
        winningGame();
    }//GEN-LAST:event_jbtnTic8ActionPerformed

    private void JblResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JblResetActionPerformed
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
        
        
        
    }//GEN-LAST:event_JblResetActionPerformed

    private void JblExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JblExitActionPerformed
        // TODO add your handling code here:
        DeclareWinner();
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit!","Noughts And Crosses",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
                {
                    System.exit(0);
                }
    }//GEN-LAST:event_JblExitActionPerformed

    private void NewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameActionPerformed
        jbtnTic1.setEnabled(true);
        jbtnTic2.setEnabled(true);
        jbtnTic3.setEnabled(true);
        jbtnTic4.setEnabled(true);
        jbtnTic5.setEnabled(true);
        jbtnTic6.setEnabled(true);
        jbtnTic7.setEnabled(true);
        jbtnTic8.setEnabled(true);
        jbtnTic9.setEnabled(true);
        
        jblPlayerX.setText("0");
        jblPlayerO.setText("0");
        
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
    }//GEN-LAST:event_NewGameActionPerformed

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
            java.util.logging.Logger.getLogger(NoughtsCrosses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NoughtsCrosses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NoughtsCrosses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoughtsCrosses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NoughtsCrosses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JblExit;
    private javax.swing.JButton JblReset;
    private javax.swing.JButton NewGame;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel jblPlayerO;
    private javax.swing.JLabel jblPlayerX;
    private javax.swing.JButton jbtnTic1;
    private javax.swing.JButton jbtnTic2;
    private javax.swing.JButton jbtnTic3;
    private javax.swing.JButton jbtnTic4;
    private javax.swing.JButton jbtnTic5;
    private javax.swing.JButton jbtnTic6;
    private javax.swing.JButton jbtnTic7;
    private javax.swing.JButton jbtnTic8;
    private javax.swing.JButton jbtnTic9;
    private javax.swing.JLabel lblPlayerO;
    private javax.swing.JLabel lblPlayerX;
    // End of variables declaration//GEN-END:variables
}
