package bases;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class movimiento extends JPanel implements Runnable, KeyListener {
    int tecla;
    Thread hilo;

    int x = 0;

    public void melody(Graphics g) {
    	int px=25,py=50; 
    	int px1=50,py1=50; 
    	int px2=25,py2=75;
    	int px3=25,py3=100;
    	int px4=25,py4=125;
    	int px5=50,py5=150;
    	int px6=75,py6=175;
    	int px7=75,py7=200;
    	int px8=75,py8=225;
    	int px9=75,py9=250;
    	int px10=50,py10=250;
    	int px11=25,py11=250;
    	int px12=25,py12=275;
    	int px13=25,py13=300;
    	int px14=25,py14=325;
    	int px15=25,py15=350;
    	int px16=25,py16=375;
    	int px17=25,py17=400;
    	int px18=50,py18=450;
    	int px19=75,py19=475;
    	int px20=100,py20=500;
    	int px21=75,py21=500;
    	int px22=115,py22=500;
    	int px23=125,py23=500;
    	int px24=150,py24=500;
    	int px25=175,py25=500;
    	int px26=200,py26=500;
    	int px27=225,py27=500;
    	int px28=250,py28=500;
    	int px29=275,py29=500;
    	int px30=300,py30=500;
    	int px31=325,py31=500;
    	int px32=350,py32=500;
    	int px33=375,py33=500;
    	int px34=400,py34=500;
    	int px35=425,py35=500;
    	int px36=475,py36=450;
    	int px37=500,py37=425;
    	int px38=500,py38=400;
    	int px39=500,py39=375;
    	int px40=500,py40=350;
    	int px41=500,py41=325;
    	int px42=500,py42=300;
        int px43=500,py43=275;
    int px44=500,py44=250;
    int px45=475,py45=225;
    int px46=450,py46=200;
    int px47=425,py47=175;
    int px48=425,py48=150;
    int px49=425,py49=125;
    int px50=425,py50=100;
    int px51=425,py51=75;
    int px52=425,py52=50;
    int px53=400,py53=50;
    int px54=375,py54=25;
    int px55=350,py55=25;
    int px56=325,py56=25;
    int px57=300,py57=25;
    int px58=275,py58=25;
    int px59=250,py59=50;
    int px60=225,py60=75;
    int px61=200,py61=100;
    int px62=175,py62=100;
    int px63=150,py63=75;
    int px64=125,py64=50;
    int px65=100,py65=50;
    int px66=100,py66=25;
    int px67=200,py67=125;
    int px68=200,py68=150;
    int px69=200,py69=175;
    int px70=225,py70=200;
    int px71=250,py71=225;
    int px72=275,py72=225;
    int px73=300,py73=225;
    int px74=325,py74=200;
    int px75=350,py75=175;
    int px76=100,py76=475;
    int px77=75,py77=450;
    int px78=75,py78=425;
    int px79=75,py79=400;
    int px80=75,py80=375;
    int px81=75,py81=350;
    int px82=75,py82=325;
    int px83=100,py83=325;
    int px84=125,py84=300;
    int px85=150,py85=275;
    int px86=175,py86=275;
    int px87=200,py87=275;
    int px88=225,py88=275;
    int px89=250,py89=275;
    int px90=275,py90=275;
    int px91=300,py91=275;
    int px92=325,py92=275;
    int px93=350,py93=275;
    int px94=375,py94=275;
    int px95=400,py95=300;
    int px96=425,py96=325;
    int px97=450,py97=350;
    int px98=450,py98=375;
    int px99=450,py99=400;
    int px100=450,py100=450;
    int px101=75,py101=50;
    int px102=450,py102=425;
    int px103=475,py103=450;
    int px104=450,py104=475;
    int px105=25,py105=425;
    int px106=250,py106=425;
    int px107=275,py107=425;
    int px108=125,py108=450;
    int px109=150,py109=450;
    int px110=350,py110=450;
    int px111=375,py111=450;
    int px112=100,py112=350;
    int px113=150,py113=300;
    int px114=125,py114=325;
    int px115=100,py115=375;
    int px116=100,py116=400;
    int px117=100,py117=425;
    int px118=100,py118=450;
    int px119=100,py119=475;
    int px120=150,py120=325;
    int px121=325,py121=325;
    int px122=275,py122=475;



    g.setColor(Color.BLACK);
    g.fillRect(px, py, 25, 25);
    g.fillRect(px1, py1, 25, 25);
    g.fillRect(px2, py2, 25, 25);
    g.fillRect(px3, py3, 25, 25);
    g.fillRect(px4, py4, 25, 25);
    g.fillRect(px5, py5, 25, 25);
    g.fillRect(px6, py6, 25, 25);
    g.fillRect(px7, py7, 25, 25);
    g.fillRect(px8, py8, 25, 25);
    g.fillRect(px9, py9, 25, 25);
    g.fillRect(px10, py10, 25, 25);
    g.fillRect(px11, py11, 25, 25);
    g.fillRect(px12, py12, 25, 25);
    g.fillRect(px13, py13, 25, 25);
    g.fillRect(px14, py14, 25, 25);
    g.fillRect(px15, py15, 25, 25);
    g.fillRect(px16, py16, 25, 25);
    g.fillRect(px17, py17, 25, 25);
    g.fillRect(px18, py18, 25, 25);
    g.fillRect(px19, py19, 25, 25);
    g.fillRect(px20, py20, 25, 25);
    g.fillRect(px21, py21, 25, 25);
    g.fillRect(px22, py22, 25, 25);
    g.fillRect(px23, py23, 25, 25);
    g.fillRect(px24, py24, 25, 25);
    g.fillRect(px25, py25, 25, 25);
    g.fillRect(px26, py26, 25, 25);
    g.fillRect(px27, py27, 25, 25);
    g.fillRect(px28, py28, 25, 25);
    g.fillRect(px29, py29, 25, 25);
    g.fillRect(px30, py30, 25, 25);
    g.fillRect(px31, py31, 25, 25);
    g.fillRect(px32, py32, 25, 25);
    g.fillRect(px33, py33, 25, 25);
    g.fillRect(px34, py34, 25, 25);
    g.fillRect(px35, py35, 25, 25);
    g.fillRect(px36, py36, 25, 25);
    g.fillRect(px37, py37, 25, 25);
    g.fillRect(px38, py38, 25, 25);
    g.fillRect(px39, py39, 25, 25);
    g.fillRect(px40, py40, 25, 25);
    g.fillRect(px41, py41, 25, 25);
    g.fillRect(px42, py42, 25, 25);
    g.fillRect(px43, py43, 25, 25);
    g.fillRect(px44, py44, 25, 25);
    g.fillRect(px45, py45, 25, 25);
    g.fillRect(px46, py46, 25, 25);
    g.fillRect(px47, py47, 25, 25);
    g.fillRect(px48, py48, 25, 25);
    g.fillRect(px49, py49, 25, 25);
    g.fillRect(px50, py50, 25, 25);
    g.fillRect(px51, py51, 25, 25);
    g.fillRect(px52, py52, 25, 25);
    g.fillRect(px53, py53, 25, 25);
    g.fillRect(px54, py54, 25, 25);
    g.fillRect(px55, py55, 25, 25);
    g.fillRect(px56, py56, 25, 25);
    g.fillRect(px57, py57, 25, 25);
    g.fillRect(px58, py58, 25, 25);
    g.fillRect(px59, py59, 25, 25);
    g.fillRect(px60, py60, 25, 25);
    g.fillRect(px61, py61, 25, 25);
    g.fillRect(px62, py62, 25, 25);
    g.fillRect(px63, py63, 25, 25);
    g.fillRect(px64, py64, 25, 25);
    g.fillRect(px65, py65, 25, 25);
    g.fillRect(px66, py66, 25, 25);
    g.fillRect(px67, py67, 25, 25);
    g.fillRect(px68, py68, 25, 25);
    g.fillRect(px69, py69, 25, 25);
    g.fillRect(px70, py70, 25, 25);
    g.fillRect(px71, py71, 25, 25);
    g.fillRect(px72, py72, 25, 25);
    g.fillRect(px73, py73, 25, 25);
    g.fillRect(px74, py74, 25, 25);
    g.fillRect(px75, py75, 25, 25);
    g.fillRect(px76, py76, 25, 25);
    g.fillRect(px77, py77, 25, 25);
    g.fillRect(px78, py78, 25, 25);
    g.fillRect(px79, py79, 25, 25);
    g.fillRect(px80, py80, 25, 25);
    g.fillRect(px81, py81, 25, 25);
    g.fillRect(px82, py82, 25, 25);
    g.fillRect(px83, py83, 25, 25);
    g.fillRect(px84, py84, 25, 25);
    g.fillRect(px85, py85, 25, 25);
    g.fillRect(px86, py86, 25, 25);
    g.fillRect(px87, py87, 25, 25);
    g.fillRect(px88, py88, 25, 25);
    g.fillRect(px89, py89, 25, 25);
    g.fillRect(px90, py90, 25, 25);
    g.fillRect(px91, py91, 25, 25);
    g.fillRect(px92, py92, 25, 25);
    g.fillRect(px93, py93, 25, 25);
    g.fillRect(px94, py94, 25, 25);
    g.fillRect(px95, py95, 25, 25);
    g.fillRect(px96, py96, 25, 25);
    g.fillRect(px97, py97, 25, 25);
    g.fillRect(px98, py98, 25, 25);
    g.fillRect(px99, py99, 25, 25);
    g.fillRect(px100, py100, 25, 25);
    g.fillRect(px101, py101, 25, 25);
    g.fillRect(px102, py102, 25, 25);
    g.fillRect(px103, py103, 25, 25);
    g.fillRect(px104, py104, 25, 25);
    g.fillRect(px105, py105, 25, 25);

    g.setColor(Color.white);
    g.fillRect(px112, py112, 350, 25);
    g.fillRect(px113, py113, 250, 25);
    g.fillRect(px114, py114, 300, 25);
    g.fillRect(px115, py115, 350, 25);
    g.fillRect(px116, py116, 350, 25);
    g.fillRect(px117, py117, 350, 25);
    g.fillRect(px118, py118, 350, 25);
    g.fillRect(px119, py119, 350, 25);

    g.setColor(Color.yellow);
    g.fillRect(px106, py106, 25, 25);
    g.fillRect(px107, py107, 25, 25);


    g.setColor(Color.red);
    g.fillRect(px108, py108, 25, 25);
    g.fillRect(px109, py109, 25, 25);
    g.fillRect(px110, py110, 25, 25);
    g.fillRect(px111, py111, 25, 25);

    g.setColor(Color.gray);
    g.fillRect(px120, py120, 50, 75);
    g.fillRect(px121, py121, 50, 75);
    g.fillRect(px122, py122, 25, 25);

    }

    public movimiento() {
        hilo = new Thread(this);
        hilo.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void paint(Graphics g) {
    	g.setColor(Color.pink);
   	 g.fillRect(0, 0, 1000, 1000);

        melody(g);
    }

    public void mover() {
        switch (tecla) {
            case KeyEvent.VK_LEFT:
                x--;
                break;
            case KeyEvent.VK_RIGHT:
                x++;
                break;
        }
    }

    public void run() {
        while (true) {
            mover();
            try {
                Thread.sleep(8);
                repaint();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame v = new JFrame();
        movimiento m = new movimiento();
        v.add(m);
        v.setVisible(true);
        v.setSize(1000, 700);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        tecla = e.getKeyCode();

    }

    public void keyReleased(KeyEvent e) {
        tecla = 0;

    }
}
