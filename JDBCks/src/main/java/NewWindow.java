import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindow extends JFrame implements ActionListener{

	
	JPanel panel2;
	JLabel label2;
	
	NewWindow() {
		
		panel2 = new JPanel();
		panel2.setBackground(new Color(255,0,0));
		panel2.setBounds(0,0,300,300);
		
		label2 = new JLabel("Players 2022/2023");
		label2.setForeground(Color.red);
		label2.setBackground(Color.blue);
		label2.setOpaque(true);
		label2.setFont(new Font("MV Boli",Font.BOLD, 30));
		label2.setBounds(50, 30, 100, 40);
		
		ImageIcon image2= new ImageIcon("C:\\Users\\Nutzer\\Katrin\\Programmieren_ks\\eclipse_everything\\SpringMavenImplKs\\JDBCks\\src\\main\\java\\FCB_ks._small.png");
		label2.setIcon(image2);
		
	//	JTextField textField = new JTextField();
	//	textField.setPreferredSize(new Dimension(200, 40));
		
		panel2.add(label2);
		
		this.setSize(750,750);
		this.setBackground(new Color(255,0,0));
		this.add(panel2);
	//	this.add(textField);
		this.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			JDBC con = new JDBC();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
	}
}
