package dibujos;
//codigodeyo
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cohete extends JPanel implements Runnable, KeyListener{
	
	//colores
	Color fondo =new Color(25,25,112);
	Color gris =new Color(128,128,128);
	Color oro =new Color(255,215,0);
	Color humo =new Color(245,245,245);
	Color naranja =new Color(255,140,0);
	Color carmesi =new Color(220,20,60);
	Color nieve =new Color(255,250,250);
	Color verde =new Color(0,255,127);
	int tecla=0;
	Thread hilo;
	 public cohete() {
	        hilo = new Thread(this);
	        hilo.start();
	        addKeyListener(this);
	        setFocusable(true);
   
	    }

	public void dibujof (Graphics f) {
		//fondo
		f.setColor(fondo);
		f.fillRect(0, 0, 750, 750);
		//estrella
		f.setColor(oro);
		int px[]= {200, 150, 37, 125, 100, 200, 300, 275, 362, 250};
		int py[]= {0, 100, 125, 200, 300, 250, 300, 200, 125, 100};
		f.fillPolygon(px,py,10);
		
	}
	int x=0, y=-0;
	public void dibujoc (Graphics c) {
        //cohete
		
		c.setColor(humo);
		c.fillRect(150, 400+y, 100, 225);
		c.setColor(Color.red);
		int[]px0= {150,150,250,250};
		int[]py0= {400+y, 450+y, 500+y, 450+y};
		c.fillPolygon(px0,py0,4);
		int[]px00= {150,150,250, 250};
		int[]py00= {500+y, 550+y, 600+y, 550+y};
		c.fillPolygon(px00,py00,4);
		int[]px000= {150,150,200};
		int[]py000= {600+y, 625+y, 625+y};
		c.fillPolygon(px000,py000,3);
		c.setColor(naranja);
		c.fillRect(275, 450+y, 50, 175);
		c.fillRect(75, 450+y, 50, 175);
		c.setColor(Color.yellow);
		c.fillRect(75, 500+y, 50, 50);
		c.fillRect(275, 500+y, 50, 50);
		c.setColor(Color.BLACK);
		int[]px= {100,75,125};
		int[]py= {400+y, 450+y, 450+y};
		c.fillPolygon(px,py,3);
		int[]px1= {300,275,325};
		int[]py1= {400+y, 450+y, 450+y};
		c.fillPolygon(px1,py1,3);
		c.setColor(Color.red);
		int[]px2= {200,125,275};
		int[]py2= {300+y, 400+y, 400+y};
		c.fillPolygon(px2,py2,3);
		c.setColor(carmesi);
		int[]px3= {150, 100,100,150};
		int[]py3= {550+y, 600+y, 675+y, 625+y};
		c.fillPolygon(px3,py3,4);
		int[]px4= {250, 250,300,300};
		int[]py4= {550+y, 625+y, 675+y, 600+y};
		c.fillPolygon(px4,py4,4);
		int[]px5= {150, 100,150};
		int[]py5= {425+y, 500+y, 500+y};
		c.fillPolygon(px5,py5,3);
		int[]px6= {250, 250,300};
		int[]py6= {425+y, 500+y, 500+y};
		c.fillPolygon(px6,py6,3);
		c.setColor(Color.gray);
		int[]px7= {150, 125,175,200};
		int[]py7= {625+y, 675+y, 675+y, 625+y};
		c.fillPolygon(px7,py7,4);
		int[]px8= {200, 220,275,250};
		int[]py8= {625+y, 675+y, 675+y, 625+y};
		c.fillPolygon(px8,py8,4);
		c.setColor(Color.cyan);
		c.fillOval(175, 475+y, 50, 75);
		c.setColor(Color.black);
		c.drawOval(175, 475+y, 50, 75);
		
	}
	
	public void dibujop (Graphics p) {
		//plataforma
		p.setColor(nieve);
		p.fillRect(375+x, 325, 75, 300);
		p.setColor(verde);
		int[]px= {375+x, 350+x,475+x,450+x};
		int[]py= {625, 675, 675, 625};
		p.fillPolygon(px,py,4);
		int[]px1= {325+x, 375+x,375+x};
		int[]py1= {375, 400, 375};
		p.fillPolygon(px1,py1,3);
		int[]px2= {350+x, 350+x,475+x,475+x};
		int[]py2= {300, 325, 325, 300};
		p.fillPolygon(px2,py2,4);
		p.setColor(oro);
		p.fillArc(375+x, 225, 75, 75, 58, 278);
		p.setColor(Color.cyan);
		p.fillOval(400+x, 350, 25, 50);
		p.fillOval(400+x, 425, 25, 50);
		p.fillOval(400+x, 500, 25, 50);
		p.setColor(Color.black);
		p.fillRect(400+x, 575, 25, 50);
		
	}
	public void paint (Graphics d) {
		dibujof(d);
		dibujoc(d);
		dibujop(d);
	}
	public void mover() {
	 y--;
	 
	 switch (tecla) {
     case KeyEvent.VK_LEFT:
     	x--;
         break;
     case KeyEvent.VK_RIGHT:
         x++;
         break;
     default:
         break;
 }
	    }
	@Override
	public void run() {
		 while (true) {
		        try {
		            mover();
		            repaint(); 
		            Thread.sleep(16); 
		        } catch (Exception e) {
		            System.out.println(e);
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
		JFrame v= new JFrame();
		cohete c= new cohete();
		v.add(c);
		v.setVisible(true);
		v.setSize(700,700);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	}


