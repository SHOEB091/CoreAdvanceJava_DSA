package swingdemo;

import javax.swing.*;
import java.awt.event.*;

public class swing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JButton b1,b2;
		JFrame l;
		JTextField t;
		l = new JFrame("Swing Demo");
		l.setSize(500,600);
		l.setVisible(true);
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1=new JButton("click");
		b2=new JButton("Clear");
		t=new JTextField();
		b1.setBounds(10, 70, 95, 30);
		b2.setBounds(120,70,95,30);
		t.setBounds(10,10,150,30);
		l.add(b1);
		l.add(b2);
		l.add(t);
		l.setLayout(null);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText("hello");
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText("");
			}
		});
		
		
		
		
		
		

	}

}
