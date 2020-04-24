package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//the code below was sourced from Amilcar Aponte 1 semester GUI


	// This class is in charge of connecting to the database 
	// to populate the combo box
	public class JDBConnection {

	    // This method calls the database, and then it returns the 
	    // array populated with the data from the database
	    public String[] callingDB( ) {

	        // Declaring the array that is going to be returned at the end of 
	        // the method
	        String[] result = null;
	        try{
	            // Load the database driver
	            Class.forName("com.mysql.jdbc.Driver").newInstance() ;

	            String dbServer = "jdbc:mysql://localhost:3306/Ultra Vision Server";
	            String user = "root";
	            String password = "Java2020Ste";

	            // Get a connection to the database
	            Connection conn = DriverManager.getConnection(dbServer, user, password) ;

	            // Get a statement from the connection
	            Statement stmt = conn.createStatement() ;

	            // The first query that we need to run is the number of entries
	            // in the data base, this will define the size of the array
	            // that will be returned
	            ResultSet rs = stmt.executeQuery("SELECT count(*) FROM customer") ;
	            rs.next();
	            int size = rs.getInt("count(*)");
	            
	            // With that size, we can instantiate the array 
	            result = new String[size];

	            // The second query we need to run is to obtained the data itself
	            rs = stmt.executeQuery("SELECT * FROM customer") ;
	            int i = 0;
	            
	            // Loop through the result set to populate the array
	            while(rs.next()) {
	                    result[i] = rs.getString("nickName") + " " + rs.getString("address");
	                    i++;
	            }

	            // Close the result set, statement and the connection
	            rs.close() ;
	            stmt.close() ;
	            conn.close() ;
	        }
	        catch( SQLException se ){
	            System.out.println( "SQL Exception:" ) ;

	            // Loop through the SQL Exceptions
	            while( se != null ){
	                    System.out.println( "State  : " + se.getSQLState()  ) ;
	                    System.out.println( "Message: " + se.getMessage()   ) ;
	                    System.out.println( "Error  : " + se.getErrorCode() ) ;

	                    se = se.getNextException() ;
	            }
	        }
	        catch( Exception e ){
	                System.out.println( e ) ;
	        }

	        // Return the array!!
	        return result;
	    }
	}


