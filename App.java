package ustbatchnumber3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try{  
    		Class.forName("com.mysql.jdbc.Driver");  
    		Connection con=DriverManager.getConnection(  
    		"jdbc:mysql://localhost:3306/Mydatabase","root","pass@word1");  
    		//here sonoo is database name, root is username and password  
    		Statement stmt=con.createStatement();  
    		
    		// opening existing mysql in eclipse
//    		ResultSet rs=stmt.executeQuery("select * from cars");  
//    		while(rs.next())  
//    		System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
    		
    		
    		
    		// creating database
//    		String sql = "CREATE database Mydatabase";
//            stmt.executeUpdate(sql);
//            System.out.println("database created successfully...");
    		
//    		// creating table 
//    		String sql = "CREATE table employee( name Varchar(10), age INT)";
//            stmt.executeUpdate(sql);
//            System.out.println("table created successfully...");
    		
    		// Inserting 
    		String sql = "insert into employee values('ram', 19),('raju',24),('annu',29)";
            stmt.executeUpdate(sql);
            System.out.println("inserted  successfully...");
    		
//    		
    		con.close();  
    		}catch(Exception e){ System.out.println(e);}  
    }
}
