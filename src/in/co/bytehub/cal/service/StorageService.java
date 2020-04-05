package in.co.bytehub.cal.service;

public interface StorageService {

	public String fetch(String key);

	public void store(String key, String value);

}
