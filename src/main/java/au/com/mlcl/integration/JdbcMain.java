package au.com.mlcl.integration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcMain {

	public static void main(String[] args) {
		String jdbc_url = args[0];
		String user = args[1];
		String password = args[2];
         System.out.println("Connecting to : "+jdbc_url);
		try {
			Connection conn = DriverManager.getConnection(jdbc_url, user, password);
          System.out.println(conn.getMetaData().getDriverName());
			if (conn != null) {
				System.out.println("Connected to the database!");
			} else {
				System.out.println("Failed to make connection!");
			}

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
