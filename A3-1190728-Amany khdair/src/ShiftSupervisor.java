import java.util.Date;

public class ShiftSupervisor extends Employee {
	// here are the information for this class
	private double monthlySalary;
	private double monthlyProductionPonus;
	private int numberOfDoneProducts;
	private int numberOfRequiredProducts;

	// because the shift supervisor extend from employee so we put here the
	// information from employee
	public ShiftSupervisor(String name, String Number, Address address, Date hireDate, double monthlySalary,
			double monthlyProductionPonus, int numberOfDoneProducts, int numberOfRequiredProducts) {
		super(name, Number, address, hireDate);
		this.monthlySalary = monthlySalary;
		this.monthlyProductionPonus = monthlyProductionPonus;
		this.numberOfDoneProducts = numberOfDoneProducts;
		this.numberOfRequiredProducts = numberOfRequiredProducts;

	}

	// as required in the assignment we put the setters and getters for all the
	// information we have in this class
	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public double getMonthlyProductionPonus() {
		return monthlyProductionPonus;
	}

	public void setMonthlyProductionPonus(double monthlyProductionPonus) {
		this.monthlyProductionPonus = monthlyProductionPonus;
	}

	public int getNumberOfDoneProducts() {
		return numberOfDoneProducts;
	}

	public void setNumberOfDoneProducts(int numberOfDoneProducts) {
		this.numberOfDoneProducts = numberOfDoneProducts;
	}

	public int getNumberOfRequiredProducts() {
		return numberOfRequiredProducts;
	}

	public void setNumberOfRequiredProducts(int numberOfRequiredProducts) {
		this.numberOfRequiredProducts = numberOfRequiredProducts;
	}

//the total salary for shift supervisor
	public double getTotalSalary() {
		double sum = 0;
		// if the number of the required product was greater than or equal to the number
		// of done product then this employee will get a bonus salary and if not he will
		// get the usual salary
		if (numberOfRequiredProducts >= numberOfDoneProducts) {
			sum += monthlySalary + monthlyProductionPonus;
		} else
			sum = monthlySalary;
		return sum;
	}

	@Override
	public String toString() {
		return super.toString() + "\n The monthly salary is:" + monthlySalary + "\n The  monthly Production Ponus is:"
				+ monthlyProductionPonus + "\n The number Of Done Products is:" + numberOfDoneProducts
				+ "\n The number Of Required Products is " + numberOfRequiredProducts + "\n The salary is:"
				+ getTotalSalary();
	}
}
