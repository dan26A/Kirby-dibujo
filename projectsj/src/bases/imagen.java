package bases;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class imagen extends JPanel implements Runnable, KeyListener {
    private static final long serialVersionUID = 1L;
	int px = 100, py = 100;
    int tecla;
    private Image imagen; 

    public imagen() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        imagen = new ImageIcon(getClass().getResource("/images/kirby.png")).getImage();

        Thread hilo = new Thread(this);
        hilo.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.drawImage(imagen, px, py,150 ,125, this);
    }

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
                Thread.sleep(10);
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
        JFrame frame = new JFrame("Moving Image");
        imagen image = new imagen();
        frame.add(image);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
