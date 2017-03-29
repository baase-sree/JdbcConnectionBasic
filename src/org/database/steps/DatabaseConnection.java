package org.database.steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseConnection {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded(We have a chrome)");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system",
					"system");
			System.out.println("Establised Database connection(We have"
					+ "entered url username and password to connect to gmail)");

			Statement statement = connection.createStatement();
			String sql = "create table reservationevent("
					+ "resId number(10),pnrNumber varchar2(20),subType varchar2(20))";
			statement.execute(sql);
			System.out.println("Table Created");
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
