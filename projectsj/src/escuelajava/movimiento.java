package escuelajava;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class movimiento extends JPanel implements Runnable, KeyListener {
	int tecla;

    Thread hilo;

    public movimiento() {
        hilo = new Thread(this);
        hilo.start();
    }
    int x=0;
    public void melody(Graphics g) {
    	 g.setColor(Color.white);
         g.fillRect(0, 0, 1000, 1000);
         g.setColor(Color.black);
        g.fillRect(50+x, 25, 50, 25);
    }

    public void paint(Graphics g) {
    	 melody(g);
       
       
    }

    public void mover() {
    	switch (tecla) {
        case KeyEvent.VK_LEFT:
        	x--;
            break;
        case KeyEvent.VK_RIGHT:
           
            break;
       
    	}
    }
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }

    public static void main(String[] args) {
        JFrame v = new JFrame();
        movimiento m = new movimiento();
        v.add(m);
        v.setVisible(true);
        v.setSize(1000, 1000);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.addKeyListener(m); 
    }
	public void keyTyped(KeyEvent e) {
	
		
	}
	public void keyPressed(KeyEvent e) {
		
		
	}
	public void keyReleased(KeyEvent e) {
	
		
	}
}