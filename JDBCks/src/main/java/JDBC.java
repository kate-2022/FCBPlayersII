import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class JDBC {
	
	String shirtNumber;   // = "";
	String lastName;      // = "";
	String firstName;     // = "";
    NewWindow wind1 = new NewWindow();
    
	
	JDBC(String shirtNumber,String lastName, String firstName)throws Exception{		
		
		
		this.shirtNumber = shirtNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		
		new InputGUI();
		this.jdbconnect();
		
	}

	public void jdbconnect ()  throws Exception{
		
		String url = "jdbc:mysql://localhost:3306/fcbayernplayers";
		String uname  = "root";
		String pass = "1234";
		
		shirtNumber = wind1.getShirtNumberNW();
		lastName = wind1.getLastNameNW();
		firstName = wind1.getFirstNameNW();
			
		
	//  String query = "insert into players values (" + "'" + lastName + "',"+ "'" + firstName + "'," + shirtNumber +  " )";
		String query = "insert into players values (?,?,?)"; 
		Class.forName("com.mysql.cj.jdbc.Driver");                        // in detail: @ youtube "Class.forName" telusko
		Connection con = DriverManager.getConnection(url, uname,pass);
		PreparedStatement pst = con.prepareStatement(query);
		
	   //  String lastName = textField1.getText();
	   //  String firsName = textField2.getText();
	
		pst.setString(1,lastName);  // index number is  referring to number of question mark (1 = first ? in String variable query)
		pst.setString(2,firstName);
		pst.setString(3,shirtNumber);
	
				
		int count = pst.executeUpdate();    // count = number of rows that are effected                                     
		
		System.out.println(count + " row/s affected");
		
		
		pst.close();
		con.close();


	}
	
	public void setShirtNumber(String shirtNumber) {
		this.shirtNumber = shirtNumber;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}






