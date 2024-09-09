import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class nameConverter{

	public static void main(String[] args){
	


	JFrame frame = new JFrame("Name Converter");
	

	JLabel lname = new JLabel("Full Name");
	JLabel lresult = new JLabel("Result");
	lname.setBounds(50,50, 100,30);
	lresult.setBounds(50,100, 100,30);

	JTextField name = new JTextField();
	JTextField res = new JTextField();
	name.setBounds(150,50, 200,30);
	res.setBounds(150,100, 200,30);
	
	JButton btn = new JButton("Convert");
	btn.setBounds(200,150, 100,30);
	
	btn.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent e){
		String result = "";
		StringTokenizer st = new StringTokenizer(name.getText());
		while(st.hasMoreTokens()){
			String a = st.nextToken();
			result += ""+Character.toUpperCase(a.charAt(0));
			for(int i = 1;i<a.length();i++){
				result += ""+Character.toLowerCase(a.charAt(i));
		}
			result += " ";
}	
		result.trim();
		res.setText(result);
		
}
});
	frame.add(btn);
	frame.add(lname);
	frame.add(lresult);
	frame.add(name);
	frame.add(res);
	frame.setSize(500,400);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	
	}
}
