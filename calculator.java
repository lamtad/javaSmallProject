import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.math.*;
public class calculator{
	public static void main(String[] args){
	JFrame frame = new JFrame("CALCULATOR");
	
	JLabel first = new JLabel("First number");
	JLabel second = new JLabel("Second number");
	JLabel result = new JLabel("Result");
	
	first.setBounds(50, 50, 150,40);
	second.setBounds(50, 100, 150,40);
	result.setBounds(50, 150, 150,40);
	
	JTextField f1 = new JTextField("");
	JTextField f2 = new JTextField("");
	JTextField fres = new JTextField("");
	
	f1.setBounds(200, 50, 150,40);
	f2.setBounds(200, 100, 150,40);
	fres.setBounds(200, 150, 150,40);
	
	JButton clear = new JButton("CLEAR");
	clear.setBounds(60, 200, 90, 40);
	
	JButton add = new JButton("ADD");
	add.setBounds(60, 250,  90, 40);
	
	JButton sub = new JButton("SUB");
	sub.setBounds(160, 250, 90, 40);
	
	JButton mul = new JButton("MUL");
	mul.setBounds(260, 250,  90, 40);
	
	JButton div = new JButton("DIV");
	div.setBounds(360, 250,  90, 40);
	
	clear.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e){
			f1.setText("");
			f2.setText("");
		}
	});
	
	
	add.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		BigInteger num1 = new BigInteger(f1.getText());
		BigInteger num2 = new BigInteger(f2.getText());
		fres.setText(num1.add(num2).toString());
	
	}
	});
	
	mul.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		BigInteger num1 = new BigInteger(f1.getText());
		BigInteger num2 = new BigInteger(f2.getText());
		fres.setText(num1.multiply(num2).toString());
	
	}
	});
	
	sub.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		BigInteger num1 = new BigInteger(f1.getText());
		BigInteger num2 = new BigInteger(f2.getText());
		fres.setText(num1.subtract(num2).toString());
	
	}
	});
	
	div.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		BigInteger num1 = new BigInteger(f1.getText());
		BigInteger num2 = new BigInteger(f2.getText());
		;
		fres.setText(num1.divide(num2).toString());
	
	}
	});
	
	frame.add(first);frame.add(second);frame.add(result);
	frame.add(f1);frame.add(f2);frame.add(fres);
	frame.add(add);
	frame.add(clear);
	frame.add(sub);
	frame.add(mul);
	frame.add(div);
	
	frame.setLayout(null);
	frame.setSize(500,400);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
	}
}
