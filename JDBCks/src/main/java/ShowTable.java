import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
//import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Color;


public class ShowTable extends JFrame {

	private JPanel contentPane;
	private JTable table;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowTable frame = new ShowTable();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ShowTable() {
		setTitle("FCBayern Players 2022/2023");
		setForeground(new Color(255, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 898, 539);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	/*	JLabel label1 = new JLabel();
		label1.setText("FCB Players 2022");
		ImageIcon image2= new ImageIcon ("C:\\Users\\Nutzer\\git\\LocalRepository\\PlayersJDBCks\\src\\main\\java\\FCB_ks._small.png");
		label1.setIcon(image2);
		
		JPanel panel1 = new JPanel();
		panel1.add(label1); */
		
		JButton btnShow = new JButton("Display Data");
		btnShow.setBackground(Color.RED);
		btnShow.setForeground(Color.WHITE);
		
	
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fcbayernplayers","root","1234");
					Statement st=con.createStatement();
					String query="select * from players order by shirtNumber ASC";
					ResultSet rs=st.executeQuery(query);
					ResultSetMetaData rsmd=rs.getMetaData();
					DefaultTableModel model=(DefaultTableModel) table.getModel();
					
					int cols=rsmd.getColumnCount();
					String[] colName=new String[cols];  // alternatively vector instead!
					for(int i=0;i<cols;i++)
						colName[i]=rsmd.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
					String lastName,firstName,shirtNumber;
					while(rs.next()) {
						lastName=rs.getString(1);
						firstName=rs.getString(2);
						shirtNumber=rs.getString(3);
						String[] fcb= {lastName,firstName,shirtNumber};
						model.addRow(fcb);
					}
					
					st.close();
					con.close();
					
				
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
				
			}
	
		});
		
		
		btnShow.setFont(new Font("MV Boli", Font.BOLD, 20));
		btnShow.setBounds(73, 76, 203, 50);
		contentPane.add(btnShow);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(355, 36, 467, 357);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		ImageIcon image= new ImageIcon("C:\\Users\\Nutzer\\git\\LocalRepository\\PlayersJDBCks\\src\\main\\java\\Vektorgraphik_Immuno.png");
		this.setIconImage(image.getImage());
	//	contentPane.add(panel1);
		
		JButton btnReset = new JButton("Clear");
		btnReset.setBackground(Color.RED);
		btnReset.setForeground(Color.WHITE);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table.setModel(new DefaultTableModel());
				
			}
			
		});
		btnReset.setFont(new Font("MV Boli", Font.BOLD, 20));
		btnReset.setBounds(115, 198, 126, 50);
		contentPane.add(btnReset);
	}

	private Color newColor(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}
}
