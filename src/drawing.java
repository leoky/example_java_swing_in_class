
import javax.swing.*;
import java.awt.*;

public class drawing extends javax.swing.JFrame {

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
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Image javacup = new ImageIcon("D:\\image.jpg").getImage();
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.fillOval(10, 400, 80, 50);
                g.setColor(Color.RED);
                g.drawString("hell0", 100, 200);
                g.drawImage(javacup, 10, 10, this);
            }
        };
        pane.setBounds(10, 10, 600, 450);
        frame.add(pane);
        

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
