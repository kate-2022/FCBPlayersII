import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;

public class NewWindow extends JFrame  implements ActionListener, SQLInput {

	JDBC react;
	JButton button10; 
	JTextField textField1;
	JTextField textField2;
	JTextField textField3;
	 
	NewWindow() {
		
		JPanel panel10 = new JPanel();
		panel10.setBackground(new Color(255,0,0));
		panel10.setPreferredSize(new Dimension(300, 200));
		
		JPanel panel11 = new JPanel();
		panel11.setBackground(new Color(255,0,0));
		panel11.setPreferredSize(new Dimension(300, 250));
		
		JPanel panel12 = new JPanel();
		panel12.setBackground(new Color(255,0,0));
		panel12.setPreferredSize(new Dimension(300, 250)); 
		
		JLabel label2 = new JLabel("Players 2022/2023");
		label2.setForeground(Color.red);
		label2.setBackground(Color.blue);
		label2.setOpaque(true);
		label2.setFont(new Font("MV Boli",Font.BOLD, 30));
		label2.setBounds(50, 30, 100, 40);
		
		ImageIcon image2= new ImageIcon("C:\\Users\\Nutzer\\Katrin\\Programmieren_ks\\eclipse_everything\\SpringMavenImplKs\\JDBCks\\src\\main\\java\\FCB_ks._small.png");
		label2.setIcon(image2);
		
		JLabel label3 = new JLabel("Please enter last name of player:       ");
		label3.setForeground(Color.black);
		label3.setFont(new Font("MV Boli",Font.BOLD, 20));
		label3.setBounds(50, 50, 350, 30);
		
		JLabel label4 = new JLabel("Please enter first name of player:      ");
		label4.setForeground(Color.black);
		label4.setFont(new Font("MV Boli",Font.BOLD, 20));
		label4.setBounds(50, 100, 350, 30);
		
		JLabel label5 = new JLabel("Please enter shirt number of player:   ");
		label5.setForeground(Color.black);
		label5.setFont(new Font("MV Boli",Font.BOLD, 20));
		label5.setBounds(50, 150, 350, 30);
		
		
	    textField1 = new JTextField();
		textField1.setPreferredSize(new Dimension(250, 40));
		textField1.setFont(new Font("Consolas", Font.PLAIN, 25));
		textField1.setForeground(Color.white);
		textField1.setBackground(Color.blue);
		textField1.setCaretColor(Color.white);	
		
		textField2 = new JTextField();
		textField2.setPreferredSize(new Dimension(250, 40));
		textField2.setFont(new Font("Consolas", Font.PLAIN, 25));
		textField2.setForeground(Color.white);
		textField2.setBackground(Color.blue);
		textField2.setCaretColor(Color.white);	
		
		textField3 = new JTextField();
		textField3.setPreferredSize(new Dimension(100, 40));
		textField3.setFont(new Font("Consolas", Font.PLAIN, 25));
		textField3.setForeground(Color.white);
		textField3.setBackground(Color.blue);
		textField3.setCaretColor(Color.white);	
		
		JButton button10 = new JButton("        Insert into list!        ");
		button10.setBounds(100, 200, 250, 50);
		button10.setBackground (new Color(0, 0, 255));
		button10.setForeground(new Color(255,0,0));
	//	button10.setFocusable(false);
		button10.setFont(new Font("MV Boli",Font.BOLD, 20));
		button10.setBorder(BorderFactory.createEtchedBorder());
		button10.addActionListener(this);
		
		panel10.add(label2);   
		//panel11.setLayout(new GridLayout(4,2));
		panel11.add(label3);
		panel11.add(textField1);		
		panel11.add(label4); 
		panel11.add(textField2);	
		panel11.add(label5); 
		panel11.add(textField3);	
		panel11.add(button10);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		    System.out.println("FCB forever_II");
			try {
				 String lastName = textField1.getText();
				//	react.setLastName(lastName); 
				String firstName = textField2.getText();
				//	react.setFirstName(firstName); 
				String shirtNumber =  textField3.getText();		 
				//	int i = Integer.parseInt(shirtNumber);			
				//	react.setShirtNumber(i); 	
				System.out.println("FCB forever III");
				
				 new JDBC();
				 
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		
		}
	
	
	
	@Override
	public String readString() throws SQLException {

		return null;
	}

	
	@Override
	public int readInt() throws SQLException {
	
		return 0;
	}
	

	@Override
	public boolean readBoolean() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public byte readByte() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public short readShort() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public long readLong() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float readFloat() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double readDouble() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BigDecimal readBigDecimal() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] readBytes() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date readDate() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Time readTime() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Timestamp readTimestamp() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reader readCharacterStream() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream readAsciiStream() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream readBinaryStream() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object readObject() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ref readRef() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Blob readBlob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clob readClob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Array readArray() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean wasNull() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public URL readURL() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NClob readNClob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String readNString() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SQLXML readSQLXML() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RowId readRowId() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	}

