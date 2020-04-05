package in.co.bytehub.cal.service;

import java.util.HashMap;
import java.util.Map;

import in.co.bytehub.cal.exception.DataNotFoundException;


public class InMemoryStorage implements StorageService{

	private Map<String, String> storage;
	
	public InMemoryStorage() {
		storage = new HashMap<>();
	}
	
	@Override
	public String fetch(String key) {		
		String record = storage.get(key);
		if(record == null) {
			throw new DataNotFoundException("DATA NOT FOUND");
		}
		return record;
	}

	@Override
	public void store(String key, String value) {		
		storage.put(key, value);		
	}

}
