import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class demo{
	public static void main(String[] args){
		JFrame frame = new JFrame("Word count");
		
		JLabel lbl = new JLabel("Data");
		lbl.setBounds(50,50, 50,50);
		JLabel lbl1 = new JLabel("Number of distinct word: ");
		lbl1.setBounds(50,400, 200,50);
		
		JTextArea data = new JTextArea();
		data.setBounds(100,75, 350,250);
		data.setLineWrap(true);
		data.setWrapStyleWord(true);
		
		JButton btn = new JButton("Count");
		btn.setBounds(50,350,100,30);
		
		JTextField res = new JTextField();
		res.setBounds(250,410, 200,30);
		
		
		
		btn.addActionListener(new ActionListener(){
		
			public void actionPerformed(ActionEvent e){
								HashSet<String> set1 = new HashSet<>();
								
								String s = data.getText();
								String[] arr = s.split("\\s+");
								for(String x : arr){
								set1.add(x);
								}
			res.setText(""+set1.size());
				
			}
		});
		
		frame.add(res);
		frame.add(btn);
		frame.add(data);
		frame.add(lbl);frame.add(lbl1);
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);


		}
}


