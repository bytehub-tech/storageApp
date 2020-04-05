package in.co.bytehub.cal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import in.co.bytehub.cal.model.Student;
import in.co.bytehub.cal.util.MySQLDBConnection;

public class StudentDao {

	public List<Student> fetchAllStudents() {
		List<Student> fetchedList = new ArrayList<>();
		Connection connection = MySQLDBConnection.getConnection();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
			while (resultSet.next()) {
				int rollNo = resultSet.getInt(1);
				String name = resultSet.getString(2);
				System.out.println("Roll NO:  " + rollNo + "     Name:  " + name);
				fetchedList.add(new Student(rollNo, name));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fetchedList;
	}
}
