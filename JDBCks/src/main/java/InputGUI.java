import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class InputGUI extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	JButton button1;
	
    InputGUI(){
	
    Border border = BorderFactory.createLineBorder(Color.blue);
    	
    JPanel panel1 = new JPanel();
    panel1.setBackground(Color.red);
    panel1.setPreferredSize(new Dimension(300, 15));
    
    JPanel panel2 = new JPanel();
    panel2.setBackground(Color.red);
    panel2.setPreferredSize(new Dimension(300, 150));
    
    JPanel panel3 = new JPanel();
    panel3.setBackground(Color.red);
    panel3.setPreferredSize(new Dimension(300, 150));
    
	JLabel label1 = new JLabel();
	label1.setText("FCB Players 2022");
	ImageIcon image2= new ImageIcon("C:\\Users\\Nutzer\\Katrin\\Programmieren_ks\\eclipse_everything\\SpringMavenImplKs\\JDBCks\\src\\main\\java\\FCB_ks._small.png");
	label1.setIcon(image2);
	label1.setHorizontalTextPosition(JLabel.CENTER);
	label1.setVerticalTextPosition(JLabel.TOP);
        label1.setFont(new Font("MV Boli",Font.PLAIN, 30));
	label1.setForeground(new Color (255, 0, 0)); 
	label1.setBackground(Color.blue);            
	label1.setOpaque(true);	
	label1.setIconTextGap(5);
	label1.setVerticalAlignment(JLabel.TOP);
	label1.setHorizontalAlignment(JLabel.CENTER);
	label1.setBorder(border);

	button1 = new JButton();
	button1.setBounds(70, 280, 300, 50);
	button1.setBackground(new Color(255, 0, 0));
	button1.setForeground(Color.WHITE);
	button1.setText("Mia san mia - enter player here");
	button1.setFocusable(false);
	button1.setFont(new Font("MV Boli",Font.BOLD, 20));
	button1.setBorder(BorderFactory.createEtchedBorder());
	button1.setVerticalAlignment(JButton.TOP);
	button1.setHorizontalAlignment(JButton.CENTER);
	button1.addActionListener(this);
	
	this.setTitle("FCBayern Players List");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(750,400);
	this.setLayout(new BorderLayout());        
	this.setResizable(true);	
	ImageIcon image= new ImageIcon("C:\\Users\\Nutzer\\Katrin\\Programmieren_ks\\eclipse_everything\\SpringMavenImplKs\\JDBCks\\src\\main\\java\\Vektorgraphik_Immuno.png");
	this.setIconImage(image.getImage());
		
	this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER);
        this.add(panel3, BorderLayout.SOUTH);
        panel2.add(label1);
        panel3.add(button1);
	this.setVisible(true);
	
	
	}

public void actionPerformed(ActionEvent e) {
	if(e.getSource()== button1) 
		try {
			new NewWindow();
			System.out.println("FCB forever");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
	 }
		
	}
	
