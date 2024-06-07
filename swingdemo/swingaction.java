package swingdemo;

import java.awt.event.*;
import javax.swing.*;

public class swingaction implements ActionListener{
	JFrame jf;
	JButton b1;
	JButton b2;
	JTextField tf;
	swingaction()
	{
		jf = new JFrame("swing demo");
		jf.setSize(500,500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1=new JButton("CLICK");
		b2= new JButton("Clear");
		tf=new JTextField();
		b1.setBounds(10,70,95,30);
		b2.setBounds(120,70,95,30);
		tf.setBounds(10,10,150,30);
		jf.add(b1);
		jf.add(b2);
		jf.add(tf);
		jf.setLayout(null);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
	}
	public static void main(String args[])
	{
		new swingaction();
	}
	public void actionPerformed(ActionEvent e)
	{
		String s= e.getActionCommand();
		if(s.equals("Click"))
		{
			tf.setText("Hello");
		}
		if(s.equals("Clear"))
		{
			tf.setText("");
		}
	}
	
}
