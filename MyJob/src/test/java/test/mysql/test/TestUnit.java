package test.mysql.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.job.config.ConnectionFactory;
import org.junit.Test;

public class TestUnit {
	@Test
	public void testJDBC(){
		Connection conn = ConnectionFactory.getConection();
		System.out.println(conn);
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new TestUnit().testJDBC();
	}
}
