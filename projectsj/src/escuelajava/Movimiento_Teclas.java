package escuelajava;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Movimiento_Teclas  extends JPanel  implements Runnable, KeyListener{
int py1= 0, py2= 0 , py3= 50, py4= 75,py5=100 ,py6=125 ,py7=175,py8= 225,py9= 275,tecla;
int px1=700,px2=750,px3=675,px4=700,px5=725,px6=625,px7=675,px8=825,px9=775;
Thread hilo;
public Movimiento_Teclas () {
	hilo=new Thread(this);
	hilo.start();
	addKeyListener(this);
}
int px=0;

public void spider (Graphics g) {
	g.setColor(Color.cyan);
	g.fillRect(px1,py1,25,50);
	g.fillRect(px2,py2,25,50);
	g.fillRect(px3,py3,125,25);
	g.fillRect(px4,py4,75,25);


	g.setColor(Color.GREEN);
	g.fillRect(px5,py5,50,250);
	g.fillRect(px6,py6,50,50);
	g.fillRect(px7,py7,50,50);
	g.fillRect(px8,py8,50,50);
	g.fillRect(px9,py9,50,50);

	g.setColor(Color.MAGENTA);
	g.fillRect(700,600,100,125);
	g.setColor(Color.BLACK);
	g.fillRect(275+px,50,175,25);
	g.fillRect(225+px,75,50,25);
	g.fillRect(200+px,100,25,100);
	g.fillRect(500+px,100,25,100);
	g.fillRect(175+px,150,25,150);
	g.fillRect(525+px,150,25,150);
	g.fillRect(200+px,300,50,25);
	g.fillRect(200+px,325,25,25);
	g.fillRect(475+px,300,50,26);
	g.fillRect(500+px,325,25,25);
	g.fillRect(225+px,150,50,25);
	g.fillRect(450+px,150,50,25);
	g.fillRect(275+px,175,25,25);
	g.fillRect(425+px,175,25,25);
	g.fillRect(300+px,200,25,25);
	g.fillRect(400+px,200,25,25);
	g.fillRect(325+px,225,25,25);
	g.fillRect(375+px,225,25,25);
	g.fillRect(350+px,250,25,50);
	g.fillRect(325+px,300,25,25);
	g.fillRect(375+px,300,25,25);
	g.fillRect(250+px,325,75,25);
	g.fillRect(400+px,325,75,25);
	g.fillRect(225+px,350,25,25);
	g.fillRect(475+px,350,25,25);
	g.fillRect(200+px,375,25,25);
	g.fillRect(500+px,375,25,25);
	g.fillRect(175+px,400,25,25);
	g.fillRect(525+px,400,25,25);
	g.fillRect(250+px,375,50,25);
	g.fillRect(425+px,375,50,25);
	g.fillRect(300+px,400,125,25);
	g.fillRect(350+px,425,25,25);
	g.fillRect(300+px,450,25,25);
	g.fillRect(400+px,450,25,25);
	g.fillRect(250+px,425,25,100);
	g.fillRect(450+px,425,25,100);
	g.fillRect(225+px,475,25,25);
	g.fillRect(475+px,475,25,25);
	g.fillRect(150+px,425,25,75);
	g.fillRect(175+px,500,50,25);
	g.fillRect(500+px,500,50,25);
	g.fillRect(225+px,525,25,50);
	g.fillRect(475+px,525,25,50);
 g.fillRect(475+px,575,50,25);
g.fillRect(200+px,600,25,50);
g.fillRect(500+px,600,25,50);
g.fillRect(225+px,625,75,25);
g.fillRect(425+px,625,75,25);
g.fillRect(300+px,575,25,75);
g.fillRect(400+px,575,25,75);
g.fillRect(325+px,550,75,25);
g.fillRect(550+px,425,25,75);
g.fillRect(450+px,75,50,25);
g.fillRect(200+px, 575, 50, 25);
g.drawString("SPIDERMAN", 330+px, 30);

g.setColor(Color.RED);
g.fillRect(275+px,75,175,25);
g.fillRect(225+px,100,275,25);
g.fillRect(225+px,125,275,25);
g.fillRect(275+px,150,175,25);
g.fillRect(300+px,175,125,25);

g.fillRect(325+px,200,75,25);
g.fillRect(350+px,225,25,25);
g.fillRect(350+px,300,25,25);
g.fillRect(325+px,325,75,25);
g.fillRect(250+px,350,225,25);

g.fillRect(300+px,325,125,25);
g.fillRect(200+px,400,100,25);
g.fillRect(425+px,400,100,25);
g.fillRect(225+px,375,25,25);


g.fillRect(175+px,425,50,25);
g.fillRect(500+px,425,50,25);
g.fillRect(175+px,450,35,50);
g.fillRect(525+px,450,25,50);
g.fillRect(200+px,475,25,25);
g.fillRect(500+px,475,25,25);
g.fillRect(300+px,425,50,25);
g.fillRect(375+px,425,50,25);
g.fillRect(325+px,450,75,25);

g.fillRect(275+px,475,175,25);
g.fillRect(250+px,575,50,50);
g.fillRect(425+px,575,50,50);
g.fillRect(225+px,600,25,25);
g.fillRect(475+px,600,25,25);
g.fillRect(475+px,375,25,25);
g.fillRect(300+px,375,125,25);

g.setColor(Color.blue);
g.fillRect(225+px,425,25,50);
g.fillRect(200+px,450,25,25);
g.fillRect(425+px,425,25,50);
g.fillRect(475+px,425,25,50);
g.fillRect(275+px,425,25,50);
g.fillRect(500+px,450,25,25);

g.fillRect(275+px,500,175,50);
g.fillRect(250+px,525,25,50);
g.fillRect(450+px,525,35,50);
g.fillRect(275+px,550,50,25);
g.fillRect(400+px,550,50,25);

g.setColor(Color.PINK);
g.fillRect(225+px,375,25,25);
g.fillRect(475+px,375,25,25);
g.fillRect(225+px,500,25,25);
g.fillRect(475+px,500,25,25);


}
public void paint(Graphics g) {
	g.setColor(Color.WHITE);
	g.fillRect(0,0,1000,1000);
	spider(g);
}
public void mover() {
	py1++;
	py2++;
	py3++;
	py4++;
	py5++;
	py6++;
	py7++;
	py8++;
	py9++;
	
	if (py5 > 350) {
		py1--;
		py2--;
		py3--;
		py4--;
		py5--;
		py6--;
		py7--;
		py8--;
		py9--;
	
	}
		
	
	 switch (tecla) {
     case KeyEvent.VK_LEFT:
     	px--;
         break;
     case KeyEvent.VK_RIGHT:
         px++;
         break;
     default:
         break;
	}
	}
public void run() {
	
	    while (true) {
	        try {
	            mover();
	            repaint(); 
	            Thread.sleep(15); 
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}


public void keyPressed(KeyEvent e) {
    tecla = e.getKeyCode();
}

public void keyTyped(KeyEvent e) {
}

public void keyReleased(KeyEvent e) {
    tecla = 0;
}

	public static void main(String[] args) {
		JFrame v=new JFrame();
		Movimiento_Teclas e =new Movimiento_Teclas();
		v.add(e);
		v.addKeyListener(e);
		v.setSize(1000,1000);
		v.setVisible(true);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
}