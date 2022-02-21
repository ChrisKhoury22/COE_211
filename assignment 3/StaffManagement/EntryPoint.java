import java.util.Scanner;
import java.util.Random;
	public class EntryPoint {
		public static void main(String[] args) {
			Random rnd = new Random();
			final int d = rnd.nextInt(10) + 1;
			System.out.println("number = " + d);
			for(int i=1; i<=d; i++) {

	Scanner scan = new Scanner(System.in); 
	System.out.println("Please input the employee's first name:");

	String firstName = scan.nextLine();
	System.out.println("Please input the employee's last name:");

	String lastName = scan.nextLine();
	System.out.println("Please input the employee's age:");

	int age = scan.nextInt();
	System.out.println("Please input the employee's monthly salary:");

	double monthlySalary = scan.nextDouble();

	System.out.println("Employee information:" + " " + firstName + " " + lastName + "," + " " + age + "," + " " + monthlySalary);

	Employee employee = new Employee(firstName, lastName, age, monthlySalary);
	System.out.println("You have " + (d-i) + " inserctions left.");
		}
	}
}