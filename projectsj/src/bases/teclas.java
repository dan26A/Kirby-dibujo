package bases;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class teclas extends JPanel implements Runnable, KeyListener {
    private static final long serialVersionUID = 1L;
	int px = 100, py = 100;
    int tecla;

    public teclas() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        Thread hilo = new Thread(this);
        hilo.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLUE);
        g.fillOval(px, py, 50, 50);     }

    public void mover() {
        switch (tecla) {
            case KeyEvent.VK_LEFT:
                px--;
                break;
            case KeyEvent.VK_RIGHT:
                px++;
                break;
            case KeyEvent.VK_UP:
                py--;
                break;
            case KeyEvent.VK_DOWN:
                py++;
                break;
            default:
                break;
        }
    }

    public void run() {
        while (true) {
            mover();
            repaint();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        tecla = e.getKeyCode();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        tecla = 0;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Circle");
        teclas t = new teclas();
        frame.add(t);
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    } 
}
