import java.util.Scanner;
public class Skeleton {
    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	double midterm, attendance, ass=0;
	int[] assignments = new int[5];

	for(int idx=0; idx<assignments.length; idx++){

		System.out.println("Input the grade of assignment " + (idx+1) + "");
		assignments[idx] = scan.nextInt();
		ass+=assignments[idx];
	}

	System.out.println("Input the number of attended labs ");
	attendance = scan.nextDouble();

	System.out.println("Input the midterm grade ");
	midterm = scan.nextDouble();

	ass =(ass/5)*0.3;
	attendance = ((attendance*100)*0.05)/7;
	midterm = midterm*0.3;

	System.out.print("Assignments (30%): " + ass + "\nAttendance (5%): " + attendance + "\nMidterm (30%): " + midterm);	
        // Initialize array of integers

        // for loop to get user input & store in array

        // for loop to iterate over the array & perform calculations

        // display output to user
    }
}