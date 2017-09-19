
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

class movingobj extends JPanel implements ActionListener, KeyListener {

    Timer t = new Timer(10, this);
    double x = 60, y = 150, ax = 0, ay = 0,x1=150,y1=150;

    public movingobj() {
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D circle = new Ellipse2D.Double(x, y, 40, 40);
        g2.setPaint(Color.ORANGE);
        g2.fill(circle);
        Ellipse2D circle2 = new Ellipse2D.Double(x1, y1, 40, 40);
        g2.setPaint(Color.RED);
        g2.fill(circle2);
    }

    public void actionPerformed(ActionEvent e) {

        if (x < 0 || x > 340|| (x==x1-32&&y==y1) ) {
            ax = -ax;
        }
        if (y < 0 || y > 320 ) {
            ay = -ay;
        }
        x += ax;
        y += ay;
        repaint();

    }

    public void up() {
        ay = -2;
        ax = 0;
    }

    public void down() {
        ay = 2;
        ax = 0;
    }

    public void left() {
        ay = 0;
        ax = -2;
    }

    public void right() {
        ay = 0;
        ax = 2;
    }

    public void stop() {
        ay = 0;
        ax = 0;
    }

    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP) {
            up();
        }
        if (code == KeyEvent.VK_DOWN) {
            down();
        }
        if (code == KeyEvent.VK_RIGHT) {
            right();
        }
        if (code == KeyEvent.VK_LEFT) {
            left();
        }
        if (code == KeyEvent.VK_SPACE) {
            stop();
        }
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

}

public class animation_keylistener extends javax.swing.JFrame {

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
        movingobj img = new movingobj();
        frm.add(img);
        frm.setSize(400, 400);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setTitle("Java Graphic2d");
        frm.setResizable(true);
        frm.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
