import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class InputGUI extends JFrame implements ActionListener {
	
	JButton button1;
	JLabel label2;
	
    InputGUI(){
	
    Border border = BorderFactory.createLineBorder(Color.blue);
    	
    JPanel mainPanel = new JPanel();
    mainPanel.setBackground(Color.red);
    mainPanel.setBounds(50,50,400,400);
 //   mainPanel.setLayout(new BorderLayout());
    
	JLabel label1 = new JLabel();
	label1.setText("FCB Players 2022");
	ImageIcon image2= new ImageIcon("C:\\Users\\Nutzer\\Katrin\\Programmieren_ks\\eclipse_everything\\SpringMavenImplKs\\JDBCks\\src\\main\\java\\FCB_ks._small.png");
	// label1.setBounds(50, 50, 450, 450);
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
	button1.addActionListener(this);
	// button1.addActionListener(e -> System.out.println("FCB forever"));   // lambda-expression replacing 
                                                                         // actionPerformed(ActionEvent e)
	this.setTitle("FCBayern Players List");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(450,350);
	// startFrame.setLayout(null);          // Achtung, "null" unterdrückt die Sichtbarkeit eines Labels komplett -> setBounds setzen!!
	                                        // Default-Layout-Manager: Border-Layout-Manager
	this.setResizable(false);	
	ImageIcon image= new ImageIcon("C:\\Users\\Nutzer\\Katrin\\Programmieren_ks\\eclipse_everything\\SpringMavenImplKs\\JDBCks\\src\\main\\java\\Vektorgraphik_Immuno.png");
	this.setIconImage(image.getImage());
		
    this.add(mainPanel);
    mainPanel.add(label1);
    mainPanel.add(button1);
	this.setVisible(true);
	// startFrame.pack();                 // justiert alle Komponenten entsprechend d. Grösse des Fensters 
	                                      // pack() immer zum Schluss einsetzen!
	
	}

public void actionPerformed(ActionEvent e) {
	if(e.getSource()== button1) {
		System.out.println("FCB forever");
		try {
			NewWindow fcbList = new NewWindow();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
	}
		
	}
	
}

