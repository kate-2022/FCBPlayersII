import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindow extends JFrame implements ActionListener{

	
	JButton button10; 
	
	NewWindow() {
		
		JPanel panel10 = new JPanel();
		panel10.setBackground(new Color(255,0,0));
		panel10.setPreferredSize(new Dimension(300, 200));
		
		JPanel panel11 = new JPanel();
		panel11.setBackground(new Color(255,0,0));
		panel11.setPreferredSize(new Dimension(300, 250));
		
		JPanel panel12 = new JPanel();
		panel12.setBackground(new Color(0,0,255));
		panel12.setPreferredSize(new Dimension(300, 50)); 
		
		JLabel label2 = new JLabel("Players 2022/2023");
		label2.setForeground(Color.red);
		label2.setBackground(Color.blue);
		label2.setOpaque(true);
		label2.setFont(new Font("MV Boli",Font.BOLD, 30));
		label2.setBounds(50, 30, 100, 40);
		
		ImageIcon image2= new ImageIcon("C:\\Users\\Nutzer\\Katrin\\Programmieren_ks\\eclipse_everything\\SpringMavenImplKs\\JDBCks\\src\\main\\java\\FCB_ks._small.png");
		label2.setIcon(image2);
		
		JLabel label3 = new JLabel("Enter new players to the season's list:  ");
		label3.setForeground(Color.blue);
		label3.setFont(new Font("MV Boli",Font.BOLD, 20));
		label3.setBounds(50, 50, 300, 30);
		
		JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(300, 40));
		
		JButton button10 = new JButton("Insert into list!");
		button10.setBounds(100, 40, 200, 50);
		button10.setBackground (new Color(0, 0, 255));
		button10.setForeground(new Color(255,0,0));
		button10.setFont(new Font("MV Boli",Font.BOLD, 20));
		button10.setFocusable(false);
		button10.addActionListener(this);
		
		panel10.add(label2);   

		panel11.add(label3);   
		panel11.add(textField);
		panel11.add(button10);
		
		this.setSize(750,750);
		this.setBackground(new Color(255,0,0));
		this.setLayout(new BorderLayout());  
		this.add(panel10, BorderLayout.NORTH);
		this.add(panel11, BorderLayout.CENTER);
		this.add(panel12, BorderLayout.SOUTH);
		
		this.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		if (e.getSource()== button10) 
			System.out.println("Database entry works :) ");
			try {
				new JDBC();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		
		}
	}

