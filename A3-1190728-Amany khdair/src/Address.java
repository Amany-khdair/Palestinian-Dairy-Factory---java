
public class Address {
	// here are the information for this class
	private String street;
	private String state;
	private String city;
	private int zipCode;

	public Address(String street, String state, String city, int zipCode) {
		this.street = street;
		this.state = state;
		this.city = city;
		this.zipCode = zipCode;
	}

	// as required in the assignment we put the setters and getters for all the
	// information we have in this class
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	// as required to String method should be implemented in appropriate way in all
	// Employee sub classes displaying all the information including.

	public String toString() {
		return "\n ........................................" + "\n THE ADDRESS:::" + "\n street is:" + street
				+ "\n state is:" + state + "\n city is:" + city + "\n zip code is:" + zipCode;
	}
}
