package dibujo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class kirby extends JPanel implements Runnable, KeyListener{
	Color game =new Color(117, 29, 243 );
	Color cruz =new Color(184, 172, 202 );
	Color cielo =new Color (0, 10, 124);
	Color kirby =new Color (248, 93, 234);
	Color start =new Color (228, 229, 23 );
	Color rojo =new Color (223, 27, 27);
	Color sol =new Color (252, 129, 31);
	Color meto =new Color (50, 9, 2 );
	Color nara =new Color (249, 135, 29 );
	
	int tecla;
	int venAn = 1028;
    int vennaAl = 663;
    int[] planetX = new int[8];
    int[] planetY = new int[8];
    double[] angulo = new double[8];
    double[] radioOr = {25, 35, 48, 62, 82, 105, 130, 155}; 
	private Image imagen, image; 
	
	Thread hilo;
	 public kirby() {
		 imagen = new ImageIcon(getClass().getResource("/images/gba.png")).getImage();
		 image = new ImageIcon(getClass().getResource("/images/tux.png")).getImage();
	       
	        hilo = new Thread(this);
	        hilo.start();
	        addKeyListener(this);
	        setFocusable(true);
	        
	        
	    }

public void dibujo (Graphics k) {
	
	k.setColor(Color.WHITE);
    k.fillRect(0, 0, 1018, 643);
    
    k.setColor(game);
	k.fillRect(50, 50, 900, 500);
	
	k.setColor(Color.WHITE);
    k.fillArc(-176, 430, 350, 350, 0, 90);
    k.fillArc(828, 430, 350, 350, 90, 90);
    k.fillRect(130, 50, 742, 40);
    k.fillRect(150, 520, 702, 40);
    
    k.fillRect(50, 50, 40, 500);
	k.fillRect(910, 50, 40, 500);
    
	k.setColor(game);
	k.fillArc(140, 40, 722, 100, 0, 180);
	k.fillArc(150, 468, 702, 100, 180, 180);
	k.fillArc(70, 124, 40, 332, 90, 180);
	k.fillArc(890, 122, 40, 336, 270, 180);
	
	k.setColor(Color.WHITE);
	k.fillArc(778, -200, 400, 350, 180, 90);
	k.fillArc(-176, -200, 400, 350, 270, 90);
	
	k.setColor(Color.BLACK);
	k.fillRect(220, 110, 560, 380);
	k.fillArc(220, 460, 560, 60, 180, 180);

	k.setColor(cruz);
    k.fillOval(155, 350, 40, 40);
    k.fillOval(155, 400, 40, 40);
    k.fillRect(130, 170, 40, 125);
    k.fillRect(88, 215, 125, 40);
    k.fillOval(790, 320, 60, 60);
    k.fillOval(860, 260, 60, 60);
    
    k.setColor(Color.green);
    k.fillOval(790, 150, 20, 20);
    
    k.setColor(cielo);
    k.fillRect(250, 135, 500, 330);
    
    int x = 260;
    int ancho = 5;
    int alto = 5;
    int espacioX = 10;
    int espacioY = 10; 
    int limite = 21; 
    

    for (int fila = 0; fila < limite; fila++) {
        for (int i = 0; i < 33; i++) { 
            int xPos = x + i * (ancho + espacioX);
            int yPos = 145 + fila * (alto + espacioY);
            
            k.setColor(Color.white);
            k.fillRect(xPos, yPos, ancho, alto);
        }
        
        
    }
	k.drawImage(imagen, 355, 480,300 ,30, this);	
}

int px=0, py=0;

public void kirby1 (Graphics k) {

    k.setColor(start);
    k.fillRect(290+px, 380+py, 80, 30);
    k.fillRect(290+px, 390+py, 80, 20);
    k.fillRect(290+px, 410+py, 75, 20);
    k.fillRect(285+px, 410+py, 5, 20);
    k.fillRect(285+px, 370+py, 5, 25);
    k.fillRect(280+px, 370+py, 5, 25);
    k.fillRect(275+px, 365+py, 5, 20);
    k.fillRect(330+px, 370+py, 5, 20);
    k.fillRect(335+px, 370+py, 30, 20);
    k.fillRect(345+px, 360+py, 15, 20);
    k.fillRect(350+px, 340+py, 15, 20);
    k.fillRect(370+px, 385+py, 15, 20);
    k.fillRect(350+px, 430+py, 15, 20);
    k.fillRect(345+px, 430+py, 15, 20);
    k.fillRect(340+px, 430+py, 10, 15);
    k.fillRect(340+px, 430+py, 10, 15);
    k.fillRect(335+px, 430+py, 10, 15);
    k.fillRect(330+px, 430+py, 10, 5);
    k.fillRect(310+px, 430+py, 10, 5);
    k.fillRect(305+px, 430+py, 5, 10);
    k.fillRect(300+px, 430+py, 5, 10);
    k.fillRect(295+px, 430+py, 5, 10);
    k.fillRect(290+px, 430+py, 5, 15);
    k.fillRect(280+px, 430+py, 10, 15);
    
    k.setColor(kirby);
    k.fillRect(285+px, 335+py, 50, 40);
    k.fillRect(340+px, 345+py, 10, 20);
    k.fillRect(300+px, 330+py, 25, 10);
    k.fillRect(300+px, 330+py, 25, 10);
    k.fillRect(295+px, 375+py, 10, 5);
    
    //kirby
    k.setColor(Color.black);
    k.fillRect(280+px, 445+py, 15, 5);
    k.fillRect(275+px, 430+py, 5, 20);
    k.fillRect(280+px, 420+py, 5, 10);
    k.fillRect(285+px, 410+py, 5, 10);
    k.fillRect(290+px, 405+py, 5, 5);
    k.fillRect(285+px, 395+py, 5, 10);
    k.fillRect(280+px, 390+py, 5, 5);
    k.fillRect(275+px, 380+py, 5, 10);
    k.fillRect(270+px, 365+py, 5, 15);
    k.fillRect(275+px, 360+py, 5, 5);
    k.fillRect(280+px, 345+py, 5, 25);
    k.fillRect(285+px, 335+py, 5, 10);
    k.fillRect(290+px, 330+py, 10, 5);
    k.fillRect(300+px, 325+py, 25, 5);
    k.fillRect(325+px, 330+py, 10, 5);
    k.fillRect(335+px, 335+py, 5, 35);
    k.fillRect(340+px, 340+py, 5, 5);
    k.fillRect(345+px, 340+py, 5, 25);
    k.fillRect(350+px, 335+py, 10, 5);
    k.fillRect(360+px, 340+py, 5, 35);
    k.fillRect(365+px, 375+py, 5, 5);
    k.fillRect(370+px, 380+py, 10, 5);
    k.fillRect(380+px, 385+py, 5, 5);
    k.fillRect(385+px, 390+py, 5, 10);
    k.fillRect(380+px, 400+py, 5, 5);
    k.fillRect(370+px, 405+py, 10, 5);
    k.fillRect(365+px, 410+py, 5, 5);
    k.fillRect(360+px, 415+py, 5, 35);
    k.fillRect(350+px, 450+py, 10, 5);
    k.fillRect(345+px, 445+py, 5, 5);
    k.fillRect(335+px, 440+py, 10, 5);
    k.fillRect(330+px, 435+py, 5, 5);
    k.fillRect(315+px, 430+py, 15, 5);
    k.fillRect(305+px, 435+py, 10, 5);
    k.fillRect(295+px, 440+py, 10, 5);
    k.fillRect(285+px, 370+py, 5, 5);
    k.fillRect(290+px, 375+py, 5, 5);
    k.fillRect(295+px, 380+py, 10, 5);
    k.fillRect(305+px, 365+py, 5, 15);
    k.fillRect(300+px, 360+py, 5, 5);
    k.fillRect(310+px, 375+py, 20, 5);
    k.fillRect(330+px, 370+py, 5, 5);
    k.fillRect(340+px, 365+py, 5, 5);
    k.fillRect(325+px, 340+py, 5, 15);
    k.fillRect(315+px, 340+py, 5, 15);
    k.fillRect(320+px, 360+py, 5, 10);
    k.setColor(rojo);
    k.fillRect(305+px, 355+py, 8, 8);
    int xt1=600, yt1=315;
    k.drawImage(image,xt1+xt, yt1+yt,140 ,140, this);
    k.setColor(Color.BLACK);
    k.drawString("(KIRBY Y TUX)  -  GUSTAVO ADOLFO LÓPEZ ROMERO", 340, 30);
    
}
int ym1=140;
int ym2=140;
int ym3=140;

public void plane (Graphics p) {
	
int solX=510;
int solY=300;
   
    p.setColor(Color.yellow);
    p.fillOval(solX - 20, solY - 20, 40, 40);
    
    Color[] colores = {Color.gray, Color.orange, Color.blue, Color.red, Color.orange, Color.orange, Color.cyan, Color.blue};
    int radioPlan[] = {3, 5, 5, 7, 10, 12, 11, 11}; 

    for (int i = 0; i < 8; i++) {
        p.setColor(colores[i]);
        p.fillOval(planetX[i] - radioPlan[i], planetY[i] - radioPlan[i], 2 * radioPlan[i], 2 * radioPlan[i]);
    }
	for ( int i = 0; i < 8; i++) {
        angulo[i] += 0.0009; 
        planetX[i] = solX + (int) (radioOr[i] * Math.cos(angulo[i]));
        planetY[i] = solY + (int) (radioOr[i] * Math.sin(angulo[i]));
    }
    repaint();
  
    if (px1>730) {
		   px1= 260;
		   px3= 260;
		   px5= 260;
		   px7= 260;
		   px2= 725;
		   px4= 725;
		   px6= 726;
	   }
    if (ym1 >420) {
    	ym1= 140;
    	ym2= 140;
    	ym3= 140;
    }
   
    }
int px1=260;
int px2=725;
int px3=260;
int px4=725;
int px5=260;
int px6=725;
int px7=260;

public void meto (Graphics k) {
	k.fillOval(px1, 150, 15, 20);
    k.fillOval(px2, 200, 15, 20);
    k.fillOval(px3, 250, 15, 20);
    k.fillOval(px4, 300, 15, 20);
    k.fillOval(px5, 350, 15, 20);
    k.fillOval(px6, 400, 15, 20);
    k.fillOval(px7, 440, 15, 20);
    k.setColor(meto);
    k.fillOval(300, ym1, 50, 50);
    k.fillOval(480, ym2, 50, 50);
    k.fillOval(650, ym3, 50, 50);
}
int xt=0;
int yt=0;


public void paint (Graphics d) {

	for(int i =0;i<=1910;i+=50) {
	    d.setColor(Color.black);
		d.drawLine(i, 0, i, 1070);
		d.drawString(" "+i, 0, i);
	}

		for(int i=0;i<=1070;i+=50) {
	    d.setColor(Color.black);
		d.drawLine(0,i,1910,i);
		d.drawString(" "+i, i, 10);
	}
		
	dibujo(d);
	meto(d);
	plane(d);
	kirby1(d);
	
}
public void movert() {
	ym1++;
	ym2++;
	ym3++;
	
	px1++;
	px2--;
	px3++;
	px4--;
	px5++;
	px6--;
	px7++;
	
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
        case KeyEvent.VK_W:
        	yt--;
        	break;
        case KeyEvent.VK_S:
        	yt++;
        	break;
        case KeyEvent.VK_A:
        	xt--;
        	break;
        case KeyEvent.VK_D:
        	xt++;
        	break;
        default:
            break;
    }
}

@Override
public void run() {
    while (true) {
        try {
            movert();
            repaint(); 
            Thread.sleep(8); 
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
	kirby k= new kirby();
	v.add(k);
	v.setVisible(true);
	v.setSize(1018,643);
	
	v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
}

