
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

class CircleAnime extends JPanel implements ActionListener {

    Timer t = new Timer(10, this);
    double x = 60, y = 20, aX = 2, aY = 2;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D circle1 = new Ellipse2D.Double(x, y, 40, 40);
        
        g2.setPaint(Color.ORANGE);
        g2.fill(circle1);
       
        t.start();
    }

    public void actionPerformed(ActionEvent e) {
        if (x < 0 || x > 320) {
            aX = -aX;
        }
        if(y<0 || y>320){
            aY= -aY;
        }
        x += aX;
        y +=aY;
        repaint();
    }
}

public class animate extends javax.swing.JFrame {

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
        CircleAnime img = new CircleAnime();
        frm.add(img);
        frm.setSize(400, 400);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setTitle("Java Graph2D");
        frm.setResizable(true);
        frm.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
