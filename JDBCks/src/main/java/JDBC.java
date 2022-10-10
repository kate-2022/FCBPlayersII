import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class JDBC {
	
	String shirtNumber;   
	String lastName;      
	String firstName;     
    
	
	JDBC()throws Exception{		
		
	}

	public void jdbconnect ()  throws Exception{
		
		String url = "jdbc:mysql://localhost:3306/fcbayernplayers";
		String uname  = "root";
		String pass = "1234";
		
		
	//	String query = "select * from players";
	//	String query = "insert into players values ('Goretzka', 'Leon', 8)";
	  //	int shirtNumber = 4;
	  //	String lastName = "de Ligt";
	  //	String firstName = "Matthijs";
	
		
	/*	shirtNumber = wind1.getShirtNumberNW();
		lastName = wind1.getLastNameNW();
		firstName = wind1.getFirstNameNW();*/
			
		
	    String query = "insert into players values (" + "'" + lastName + "',"+ "'" + firstName + "'," + shirtNumber +  " )";
//		String query = "insert into players values (?,?,?)"; 
		Class.forName("com.mysql.cj.jdbc.Driver");                        // in detail: @ youtube "Class.forName" telusko
		Connection con = DriverManager.getConnection(url, uname,pass);
		PreparedStatement pst = con.prepareStatement(query);
	//	ResultSet rs = pst.executeQuery(query);
		
	   //  String lastName = textField1.getText();
	   //  String firsName = textField2.getText();
	
	//	pst.setString(1,wind1.getLastNameNW());  // index number is  referring to number of question mark (1 = first ? in String variable query)
	//	pst.setString(2,wind1.getFirstNameNW());
	//	pst.setString(3,wind1.getShirtNumberNW());
	
		
    //  Statement st = con.createStatement();   // use PreparedStatement instead for inserting/ changing of values!
	//	ResultSet rs = pst.executeQuery(query);  
		
		
		int count = pst.executeUpdate();    // count = number of rows that are effected                                     
	//	ResultSet rs = pst.executeQuery(query); 
		
		System.out.println(count + " row/s affected");
		
	/*	String userData ="";
		
		while(rs.next()) {                                               // rs.next() is responsible to take the cursor to the next element (next row)!
	//	String name = rs.getString("shirtNumber");                                // and rs.next() gives back a boolean value for if there is a next row or not
		userData = rs.getString(1) + ", " + rs.getString(2)+ " : " + rs.getInt(3); 
		System.out.println(userData);
		}*/
		
		new GetList();
		 
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



