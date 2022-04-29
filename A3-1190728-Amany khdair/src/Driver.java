import java.util.ArrayList;
import java.util.Date;

public class Driver {

	public static void main(String[] args) {
		// we need to create a list to employee
		ArrayList<Employee> work = new ArrayList<>();
		Date h = new Date();
		// fill the information of the employees
		work.add(new ProductionWorker(" Amany", "123-A", new Address("hettien_1", "al-tera_1", "Ramallah_1", 10000), h,
				1, 37.7, 964));
		work.add(new ProductionWorker(" Lames", "111-B", new Address("hettien_2", "al-tera_2", "Ramallah_1", 20000), h,
				2, 33.0, 600));
		work.add(new ProductionWorker(" Tala", "222-L", new Address("hettien_3", "al-tera_3", "Ramallah_1", 30000), h,
				1, 35.9, 770));
		work.add(new ShiftSupervisor(" Aseel", "333-C", new Address("hittien_4", "masyon_1", "Ramallah_2", 40000), h,
				4040.4, 8505.0, 360, 470));
		work.add(new ShiftSupervisor(" Faten", "323-D", new Address("hittien_5", "masyon_2", "Ramallah_2", 50000), h,
				5003.0, 8606.0, 370, 800));
		work.add(new ShiftSupervisor(" Masa", "353-E", new Address("hittien_6", "masyon_3", "Ramallah_2", 60000), h,
				6038.0, 8980.0, 395, 640));
		work.add(new TeamLeader(" Hanan", "425_G", new Address("hitten_7", "betonia_1", "Ramallah_3", 30000), h, 2,
				26.5, 69, 7540.0, 59, 40));
		work.add(new TeamLeader(" Hanen", "125_G", new Address("hitten_8", "betonia_2", "Ramallah_4", 40000), h, 1,
				52.0, 70, 7062.0, 65, 20));
		work.add(new TeamLeader(" Sara", "825_I", new Address("hitten_9", "betonia_3", "Ramallah_4", 50000), h, 2, 25.5,
				90, 5900.0, 85, 45));
		System.out.println();
		// this sentence is to print the information of the employees and compare them
		// with the (list greater than average)
		ListGreaterThanAverage(work);
	}

	public static void ListGreaterThanAverage(ArrayList<Employee> array) {
		System.out.println("The information of employees whose salary is greater than the other:-");
		// I set the initial value for the summation and the average to zero
		double sum = 0.0;
		double average = 0.0;
		// for loop to compare z with the array size (list size)
		for (int z = 0; z < array.size(); z++) {
			// if this condition satisfies then the program will not do the next conditions
			if (array.get(z) instanceof ProductionWorker)
				// to get the total salary and add it
				sum += ((ProductionWorker) array.get(z)).getTotalSalary();
			// if the last condition does not satisfies then the program will do the
			// following one
			else if (array.get(z) instanceof ShiftSupervisor)
				// to get the total salary and add it
				sum += ((ShiftSupervisor) array.get(z)).getTotalSalary();
			// and if the last 2 conditions do not satisfies the program will do the last
			// one
			else if (array.get(z) instanceof TeamLeader)
				// to get the total salary and add it
				sum += ((TeamLeader) array.get(z)).getTotalSalary();

		}
		// to get the total salary we use object casting
		// and to calculate the average we divide the summation which i means the sum
		// over their number
		average = sum / array.size();
		// for loop to compare z with the array size (list size)
		for (int z = 0; z < array.size(); z++) {
			// if this condition for production worker satisfies then the program will not
			// do the next conditions
			if (array.get(z) instanceof ProductionWorker)
				// if get total salary for the production worker greater than the average then
				// it will print the following
				if (((ProductionWorker) array.get(z)).getTotalSalary() > average)
					System.out.println(((ProductionWorker) array.get(z)).toString());
				// if the last condition does not satisfies then the program will do the
				// following one for the shift supervisor
				else if (array.get(z) instanceof ShiftSupervisor)
					// if get total salary for the shift supervisor greater than the average then it
					// will print the following
					if (((ShiftSupervisor) array.get(z)).getTotalSalary() > average)
						System.out.println(((ShiftSupervisor) array.get(z)).toString());
					// and if the last 2 conditions do not satisfies the program will do the last
					// one for team leader
					else if (array.get(z) instanceof TeamLeader)
						// if get total salary for the team leader greater than the average then it will
						// print the following
						if (((TeamLeader) array.get(z)).getTotalSalary() > average)
							System.out.println(((TeamLeader) array.get(z)).toString());
		}

	}
}
// THE END :)