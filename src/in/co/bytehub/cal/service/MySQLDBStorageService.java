package in.co.bytehub.cal.service;

import java.util.List;

import in.co.bytehub.cal.dao.StudentDao;
import in.co.bytehub.cal.model.Student;

public class MySQLDBStorageService implements StorageService {

	

	@Override
	public String fetch(String key) {
		
		return "Value From H2";
	}

	@Override
	public void store(String key, String value) {
		
		
	}

	
	public List<Student> fetchAllStudent() {		
		StudentDao studentDao = new StudentDao();		
		return studentDao.fetchAllStudents();
	}
}
