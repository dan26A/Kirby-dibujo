package escuelajava;

import java.awt.*;
import javax.swing.*;

public class ejemplo extends JPanel implements Runnable{
	
	Thread hilo;
	int px=250, py=250;
	
	public ejemplo() {
		hilo=new Thread(this);
		hilo.start();
	}
	public void circulo (Graphics c) {
		c.setColor(Color.black);
		c.fillOval(px, py, 100, 100);
		
		if(px> 1000 ) {
			px=0;
			py=250;
		}
	}
	public void paint (Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(0, 0, 1000, 760);
		circulo(g);
	}
	public void mover() {
		px++;
	}

	@Override
	public void run() {
		while(true) {
			try {mover();
			Thread.sleep(3);
			repaint();
			
		}catch(Exception e) {
			System.out.println(e);
		}
			
		}
	}
	public static void main(String[] args) {
		JFrame v=new JFrame();
		ejemplo e =new ejemplo();
		v.add(e);
		v.setSize(1000,760);
		v.setVisible(true);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
