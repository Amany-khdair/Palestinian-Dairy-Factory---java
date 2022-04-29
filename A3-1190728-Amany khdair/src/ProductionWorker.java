import java.util.Date;

public class ProductionWorker extends Employee {
	// here are the information for this class
	private int shift;
	private double HourlyPayRate;
	private int NumberOfHoursPerMonth;

	public ProductionWorker(String name, String Number, Address address, Date hireDate, int shift, double HourlypayRate,
			int NumberOfHoursPerMonth) {
		super(name, Number, address, hireDate);
		this.setShift(shift);
		this.HourlyPayRate = HourlypayRate;
		this.NumberOfHoursPerMonth = NumberOfHoursPerMonth;
	}

//as required in the assignment we put the setters and getters for all the information we have in this class
	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}

	public double getHourlyPayRate() {
		return HourlyPayRate;
	}

	public void setHourlyPayRate(double hourlyPayRate) {
		HourlyPayRate = hourlyPayRate;
	}

	public int getNumberOfHoursPerMonth() {
		return NumberOfHoursPerMonth;
	}

	public void setNumberOfHoursPerMonth(int numberOfHoursPerMonth) {
		NumberOfHoursPerMonth = numberOfHoursPerMonth;
	}

	public double getTotalSalary() {
		double sum = 0;
		// we mean by shift =1 that the employee works in day shift
		if (shift == 1) {
			// why we put 208 because we multiply the minimum number of hours allowed for a
			// worker which is 8 by 1.25
			if (NumberOfHoursPerMonth > 208) {
				sum += HourlyPayRate * 208;
				int extraHours = NumberOfHoursPerMonth - 208;
				// when the worker work for any extra hours he/she will get 1.25 hours so
				sum += extraHours * HourlyPayRate * 1.25;
			}
			// else here mean that if the Number of hours per month less than 208 will do
			// the following
			else {
				sum += NumberOfHoursPerMonth * HourlyPayRate;
			}
		}
		// we mean by shift =2 that the employee works in night shift
		if (shift == 2) {
			// why we put 182 because we multiply the minimum number of hours allowed for a
			// worker which is 7 by 1.5
			if (NumberOfHoursPerMonth > 182) {
				sum += HourlyPayRate * 182;
				int extraHours = NumberOfHoursPerMonth - 182;
				// when the worker work for any extra hours he/she will get 1.5 hours so
				sum += extraHours * HourlyPayRate * 1.5;
			}
			// else here mean that if the Number of hours per month less than 182 will do
			// the following operation
			else {
				sum += NumberOfHoursPerMonth * HourlyPayRate;
			}
		}
		if (shift != 1 && shift != 2) {
			System.out.println("shift is not valid");
		}
		return sum;
	}

	@Override
	public String toString() {
//super.toString = 	
		return super.toString() + "\n ........................................" + "\n Production worker:::"
				+ "\n the shift is:" + shift + "\n Hourly pay rate:" + HourlyPayRate + "\n Number of hours per month:"
				+ NumberOfHoursPerMonth + "\n The salary is:" + getTotalSalary();
	}
}
