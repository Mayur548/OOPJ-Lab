import java.awt.*;
import java.awt.event.*;

class KEHandling extends Frame implements KeyListener {
    String msg = "", msg2 = "";

    KEHandling() {
        addKeyListener(this);
        setFocusable(true);
        requestFocus();
    }

    public void keyPressed(KeyEvent ke) {
        msg += " Key Pressed";
        repaint();
    }

    public void keyTyped(KeyEvent ke) {
        msg2 += ke.getKeyChar();
        msg += " Key Typed";
        repaint();
    }

    public void keyReleased(KeyEvent ke) {}

    public static void main(String args[]) {
        KEHandling kh = new KEHandling();
        kh.setTitle("My First Window");
        kh.setSize(300, 200);
        kh.setVisible(true);

        kh.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 50);
        g.drawString(msg2, 50, 100);
    }
}