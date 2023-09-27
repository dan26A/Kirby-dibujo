package escuelajava;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class I_Operaciones extends JFrame implements ActionListener{
	JLabel l1=new JLabel ("NUMERO 1:");
	JLabel l2=new JLabel ("NUMERO 2:");
	JLabel l3=new JLabel ("RESULTADO:");
	JLabel l4=new JLabel ("OPERACIONES");
	
	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	JLabel t3=new JLabel();
	
	JButton b1=new JButton("CALCULAR");
	
	JPanel p1 =new JPanel();
	String []datos= {"SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "POTENCIA"};
	JComboBox cb1= new JComboBox(datos);
	
	public I_Operaciones() {
		setLayout(null);
		p1.setLayout(null);
		p1.setBackground(Color.gray);
		p1.setBounds(0, 0, 400, 400);
		l1.setBounds(50, 50, 100, 25);
		p1.add(l1); 
		l2.setBounds(50, 100, 100, 25);
		p1.add(l2); 
		l3.setBounds(50, 150, 100, 25);
		p1.add(l3); 
		l4.setBounds(100, 10, 100, 25);
		p1.add(l4); 
		cb1.setBounds(50, 200, 100, 25);
		p1.add(cb1); 
		b1.setBounds(50, 250, 100, 25);
		p1.add(b1); 
		t1.setBounds(120, 50, 100, 25);
		p1.add(t1); 
		t2.setBounds(120, 100, 100, 25);
		p1.add(t2); 
		t3.setBounds(140, 150, 100, 25);
		p1.add(t3); 
		b1.addActionListener(this);
		add(p1);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b1) {
			Operaciones o =new Operaciones ();
			o.setN1(Double.parseDouble(t1.getText()));
			o.setN2(Double.parseDouble(t2.getText()));
			t3.setText(""+o.getResultado(cb1.getSelectedIndex()));
			
		}
	
	}
	public static void main (String[]args) {
		I_Operaciones op=new I_Operaciones();
		op.setTitle("CALCULADORA");
		op.setVisible(true);
		op.setSize(300,350);
		op.setLocationRelativeTo(null);
		op.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
