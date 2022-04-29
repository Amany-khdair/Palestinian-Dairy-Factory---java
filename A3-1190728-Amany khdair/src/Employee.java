import java.util.Date;

public class Employee {
	// here are the information for this class
	private String name;
	private String Number;
	private Date hireDate = new Date();
	private Address address;

	public Employee(String name, String Number, Address address, Date hireDate) {
		super();
		this.hireDate = hireDate;
		this.name = name;
		this.Number = Number;

		this.address = address;
	}

	// as required in the assignment we put the setters and getters for all the
	// information we have in this class
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public boolean NumberValid() {
//Number.length =5 because it is the number of letter in (XXX-L)
		if (Number.length() == 5) {
			for (int h = 0; h < Number.length(); h++) {
				// the character should be involved in the worker number is (-)so if it not =
				// (-) then break the statement and return false
				if (Number.charAt(h) != '-') {
					break;
					// the numbers are required from 0 to 9
				} else if (h < 3 && Number.charAt(h) < '0' && Number.charAt(h) > '9') {
					break;
					// the letters are required from A to M
				} else if (h == 4 && Number.charAt(h) >= 'A' && Number.charAt(h) <= 'M') {
					return false;
				}
			}
		}
		return true;
		
	}

	// as required to String method should be implemented in appropriate way in all
	// Employee sub classes displaying all the information including.
	@Override
	public String toString() {
		return "\n The Employee:::" + "\n The name is: " + name + "\n The number is: " + Number
				+ "\n The date of hire is: " + hireDate + "\n The number Valid is: " + NumberValid()
				+ address.toString();
	}
}
