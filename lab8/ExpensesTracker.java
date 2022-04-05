import java.io.*;  		
import java.util.Scanner;

public class ExpensesTracker{
	public static void main(String[] args){
  
	try {
		FileWriter fw = new FileWriter(new File("expenses.txt"));
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outToFile = new PrintWriter(bw);

		String repeat = "y";
		String crypto = "y";
		String name = "";
		String item = "";
		String log;
		double cost = 0;
		
		Scanner fileScan = new Scanner(new File("expenses.txt"));
		Scanner scan = new Scanner(System.in);

	do {

		System.out.println("Input your name: ");
		name = scan.nextLine();

		System.out.println("What did you purchase?");
		item = scan.nextLine();

		System.out.println("How much did you pay? (in USD)");
		cost = scan.nextDouble();
		scan.nextLine();

		outToFile.println(name + " purchased " + item + " for " + cost + " US Dollars.");
		System.out.println("Would you like to log another purchase? (y/n)");

		repeat = scan.nextLine();

	} while (repeat.equalsIgnoreCase("y"));

	System.out.println("Would you like to read a summary of your purchase? (y/n)");
	crypto = scan.nextLine();
	outToFile.close();
	scan.close();

		if(crypto.equalsIgnoreCase("y")) {
			while(fileScan.hasNext()) {
				log = fileScan.nextLine();
				System.out.println(log);

			}
		}

      // Create FileWriter & Scanner objects & y/n string

      // Start gathering information inside the loop you will start

      // Close ClassWriter & Scanner objects
        
        
      // If you have already have a expenses.txt file, you need to delete it
      // before you compile your code again

    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}