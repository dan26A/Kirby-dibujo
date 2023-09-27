package escuelajava;
import java.awt.*;
import javax.swing.*;

public class dibujo extends JPanel implements Runnable{
	Thread hilo;
	int px=100, py=500;
	int px0=0, py0=550;
	int px1=150, py1=475;
	int px2=175, py2=455;
	int px3=225, py3=405;
	int px4=100, py4=525;
	int px5=200, py5=525;
	int px6=300, py6=525;
	int px7=125, py7=550;
	int px8=225, py8=550;
	int px9=325, py9=550;
	int px10=125, py10=575;
	int px11=225, py11=575;
	int px12=325, py12=575;
	int px13=150, py13=700;
	int px14=100, py14=750;
	int px15=400, py15=750;
	int px16=350, py16=700;
	
	public dibujo() {
		hilo=new Thread(this);
		hilo.start();
	}
	public void nave(Graphics n) {
		n.setColor(Color.gray);
		n.fillOval(px, py, 300, 200);
		n.setColor(Color.black);
		n.fillOval(px0, py0, 500, 100);
		n.setColor(Color.gray);
		n.fillOval(px1, py1, 200, 25);
		n.setColor(Color.black);
		n.fillArc(px2, py2, 150, 50,0 ,180);
		n.setColor(Color.gray);
		n.fillOval(px3, py3, 50, 50);
		n.setColor(Color.black);
		n.fillArc(px4, py4, 100, 25,0 ,180);
		n.setColor(Color.black);
		n.fillArc(px5, py5, 100, 25,0 ,180);
		n.setColor(Color.black);
		n.fillArc(px6, py6, 100, 25,0 ,180);
		n.setColor(Color.white);
		n.fillRect(px7, py7, 50, 100);
		n.setColor(Color.white);
		n.fillRect(px8, py8, 50, 100);
		n.setColor(Color.white);
		n.fillRect(px9, py9, 50, 100);
		n.setColor(Color.black);
		n.fillOval(px10, py10, 50, 50);
		n.fillOval(px11, py11, 50, 50);
		n.fillOval(px12, py12, 50, 50);
		int[] px00= {px13,px14,px15,px16};
		int[] py00= {py13,py14,py15,py16};
		n.fillPolygon(px00,py00,4);
		
		if(py14 <0 ) {
			
			py=500;
			py0=550;
			py1=475;
			py2=455;
			py3=405;
			py4=525;
			py5=525;
			py6=525;
			py7=550;
			py8=550;
			py9=550;
			py10=575;
			py11=575;
			py12=575;
			py13=700;
			py14=750;
			py15=750;
			py16=700;
		}
		
	}
	public void paint (Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, 1000, 1080);
		nave(g);
	}
	public void mover() {
		py--;
		py0--;
		py1--;
		py2--;
		py3--;
		py4--;
		py5--;
		py6--;
		py7--;
		py8--;
		py9--;
		py10--;
		py11--;
		py12--;
		py13--;
		py14--;
		py15--;
		py16--;
		
	}

	@Override
	public void run(){
		while(true) {
			try {mover();
			Thread.sleep(12);
			repaint();
			
		}catch(Exception e) {
			System.out.println(e);
		}
			
		}
	}
		public static void main(String[] args) {
			JFrame v=new JFrame();
			dibujo e =new dibujo();
			v.add(e);
			v.setSize(1000,760);
			v.setVisible(true);
			v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
