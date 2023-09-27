package bases;
import javax.swing.*;
import java.awt.*;

public class based extends JPanel{

private static final long serialVersionUID = 1L;
public void dibujo (Graphics k) {
	
}
public void paint (Graphics d) {
	dibujo(d);
}
public static void main(String[] args) {
	JFrame v= new JFrame();
	based b= new based();
	v.add(b);
	v.setVisible(true);
	v.setSize(750,750);
	v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
