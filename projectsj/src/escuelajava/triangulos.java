package escuelajava;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class triangulos extends JPanel implements Runnable{
	
	int px=175, py=200, px0=200, py0=275, px1=250, py1=225;
	int px2=175, py2=450, px3=250, py3=425, px4=200, py4=375;
	int px5=350, py5=425, px6=425, py6=450, px7=400, py7=375;
	int px8=350, py8=225, px9=400, py9=275, px10=425, py10=200;
	int px11=300, py11=200, px12=250, py12=275, px13=350, py13=275;
	int px14=175, py14=325, px15=250, py15=375, px16=250, py16=275;
	int px17=250, py17=375, px18=300, py18=450, px19=350, py19=375;
	int px20=350, py20=275, px21=350, py21=375, px22=425, py22=325;
	
	Thread hilo;
	public triangulos() {
		hilo =new Thread (this);
		hilo.start();
	}
	public void datos(Graphics t) {
		t.setColor(Color.black);
		int[]tx={px,px0,px1};
		int[]ty={py,py0,py1};
		t.fillPolygon(tx, ty, 3);
		int[]tx0={px2,px3,px4};
		int[]ty0={py2,py3,py4};
		t.fillPolygon(tx0, ty0, 3);
		int[]tx1={px5,px6,px7};
		int[]ty1={py5,py6,py7};
		t.fillPolygon(tx1, ty1, 3);
		int[]tx2={px8,px9,px10};
		int[]ty2={py8,py9,py10};
		t.fillPolygon(tx2, ty2, 3);
		int[]tx3={px11,px12,px13};
		int[]ty3={py11,py12,py13};
		t.fillPolygon(tx3, ty3, 3);
		int[]tx4={px14,px15,px16};
		int[]ty4={py14,py15,py16};
		t.fillPolygon(tx4, ty4, 3);
		int[]tx5={px17,px18,px19};
		int[]ty5={py17,py18,py19};
		t.fillPolygon(tx5, ty5, 3);
		int[]tx6={px20,px21,px22};
		int[]ty6={py20,py21,py22};
		t.fillPolygon(tx6, ty6, 3);
	}
	public void paint (Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, 1000, 1000);
		datos(g);
	}
	public void mover() {
		px--;
		py--;
		px0--;
		py0--;
		px1--;
		py1--;
		
		px2--;
		py2++;
		px3--;
		py3++;
		px4--;
		py4++;
		
		px5++;
		py5++;
		px6++;
		py6++;
		px7++;
		py7++;
		
		px8++;
		py8--;
		px9++;
		py9--;
		px10++;
		py10--;
		
		py11--;
		py12--;
	    py13--;
	    
	    px14--; 
	    px15--;
	    px16--;
	    
	    py17++;
	    py18++;
	    py19++;
	    
	    px20++;
	    px21++;
	    px22++;
	    
	
	}

	@Override
	public void run() {
		while (true) {
	        try {
	            mover();
	            repaint(); 
	            Thread.sleep(25); 
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
		
	}
	
	public static void main(String[] args) {
		JFrame v= new JFrame();
		triangulos t= new triangulos();
		v.add(t);
		v.setVisible(true);
		v.setSize(1000,1000);
		
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
}
