import java.util.Date;

public class TeamLeader extends ProductionWorker {
	// here are the information for this class
	private double monthlyBonus;
	private int requiredTrainingHours;
	private int hoursAttended;

//because the team leader extend from production worker and production worker from employee so we put here the information from both production and employee
	public TeamLeader(String name, String Number, Address address, Date hireDate, int shift, double HourlyPayRate,
			int NumberOfHoursPerMonth, double monthlyBonus, int requiredTrainingHours, int hoursAttended) {
		super(name, Number, address, hireDate, shift, HourlyPayRate, NumberOfHoursPerMonth);
		this.monthlyBonus = monthlyBonus;
		this.requiredTrainingHours = requiredTrainingHours;
		this.hoursAttended = hoursAttended;
	}

	// as required in the assignment we put the setters and getters for all the
	// information we have in this class
	public double getMonthlyBonus() {
		return monthlyBonus;
	}

	public void setMonthlyBonus(double monthlyBonus) {
		this.monthlyBonus = monthlyBonus;
	}

	public int getRequiredTrainingHours() {
		return requiredTrainingHours;
	}

	public void setRequiredTrainingHours(int trainingHours) {
		this.requiredTrainingHours = trainingHours;
	}

	public int getHoursAttended() {
		return hoursAttended;
	}

	public void setHoursAttended(int hoursAttended) {
		this.hoursAttended = hoursAttended;
	}

	// as required from the assignment we add get total salary
	@Override
	public double getTotalSalary() {
		// we did this operation to get the total salary from production worker
		double sum = super.getTotalSalary();
		// if the hours attend was greater than required hours so do the following
		// equation
		if (hoursAttended >= requiredTrainingHours) {
			// the equation that will do the operation
			double bonusAchieved = (monthlyBonus * requiredTrainingHours) / hoursAttended;
			sum = bonusAchieved + bonusAchieved;
		}
		return sum;
	}

	// as required to String method should be implemented in appropriate way in all
	// Employee sub classes displaying all the information including.
	@Override
	public String toString() {
		return super.toString() + "\n the monthlyBonus is:" + monthlyBonus + "\n the required training Hours is"
				+ requiredTrainingHours + "\n the hours Attended is" + hoursAttended;
	}
}
