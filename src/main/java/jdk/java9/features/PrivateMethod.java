package jdk.java9.features;

public interface PrivateMethod {
	String getNameById(Long id);
	
	static String getPhoneWithPrefix(String prefix, String number) {
		return prefix + " " + number;
	}
	
	default String getOwner(String firstName, String secondName, String street, String city) {
		return getFirstNameWithSecondName(firstName, secondName) + " " + getAddress(street, city);
	}
	
	private String getFirstNameWithSecondName(String firstName, String secondName) {
		return firstName + " " + secondName;
	}
	
	private String getAddress(String street, String city) {
		return street + ", " + city;
	}
}
