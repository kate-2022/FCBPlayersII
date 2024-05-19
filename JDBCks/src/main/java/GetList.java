import java.awt.Component;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JFileChooser;

/*Java Database Connectivity
*
* 1. import --> java.sql.*;
* 2. load and register the driver --> com.mysql.cj.jdbc.Driver
* 3. create connection
* 4. create a statement
* 5. execute the query
* 6. process the results
* 7. close
*/

public class GetList extends Component{
	
	private static final long serialVersionUID = 1L;


	GetList ()throws Exception{
		this.jdbconnectRead ();
		
	}
	
	
	public void jdbconnectRead ()  throws Exception{
		
		String url = "jdbc:mysql://localhost:3306/fcbayernplayers";
		String uname  = "root";
		String pass = "1234";
		
		String query2 = "select * from players order by shirtNumber ASC";
	//	String query3 = "order by shirtNumber ASC";
		
		Class.forName("com.mysql.cj.jdbc.Driver");                        // in detail: @ youtube "Class.forName" telusko
		Connection con2 = DriverManager.getConnection(url, uname,pass);
	
		Statement st = con2.createStatement();   
		ResultSet rs = st.executeQuery(query2);
		
		String userData ="";
		while(rs.next()) {                                               // rs.next() is responsible to take the cursor to the next element (next row)!
	//	String name = rs.getString("shirtNumber");                                // and rs.next() gives back a boolean value for if there is a next row or not
		userData = rs.getString(1) + ", " + rs.getString(2)+ " : " + rs.getInt(3); 
		System.out.println(userData);
		
		
		
		}
		
		st.close();
		con2.close();
		
	}

}
