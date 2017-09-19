/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardy
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ballanime extends JPanel implements ActionListener {

    private Timer animator;
    private ImageIcon ImageArray[];
    private int delay = 100, totalFrame = 5, currentFrame = 0;

    public ballanime() {
        ImageArray = new ImageIcon[totalFrame];
        for (int i = 0; i < ImageArray.length; i++) {
            ImageArray[i] = new ImageIcon("D:\\tugas\\frame" + i + ".png");
        }
        animator = new Timer(delay, this);
        animator.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (currentFrame >= ImageArray.length) {
            currentFrame = 0;
        }
        currentFrame++;
        ImageArray[currentFrame].paintIcon(this, g, 0, 0);
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}

public class animation extends javax.swing.JFrame {

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        JFrame frm = new JFrame();
        ballanime img = new ballanime();
        frm.add(img);
        frm.setSize(400,400);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setTitle("java ball anime");
        frm.setResizable(true);
        frm.setVisible(true);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
}
