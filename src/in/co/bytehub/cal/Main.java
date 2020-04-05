
package in.co.bytehub.cal;

import in.co.bytehub.cal.service.MySQLDBStorageService;

import java.util.List;

import in.co.bytehub.cal.model.Student;
import in.co.bytehub.cal.service.InMemoryStorage;
import in.co.bytehub.cal.service.StorageService;

/**
 * Run the application
 */
public class Main {

	public static void main(String[] args) {

		StorageService storageService = new InMemoryStorage();

		storageService.store("greeting1", "I'm Happy");
		storageService.store("greeting2", "Welcome");

		String fetchedRecord = storageService.fetch("greeting1");

		System.out.println(fetchedRecord);

		System.out.println("______________________________________________________");

		MySQLDBStorageService mySQLDBStorageService = new MySQLDBStorageService();
		List<Student> allStudent = mySQLDBStorageService.fetchAllStudent();
		System.out.println("Total Num of Students: " + allStudent.size());
		System.out.println(allStudent);
	}

}
