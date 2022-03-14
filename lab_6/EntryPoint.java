import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
	String YesorNo = "";
	int x;
	do {

		System.out.println("Which service would you like to use?" + "\n" + "[1]: Basic week visualizer" + "\n" +
                                                                                 "[2]: Advanced week visualizer" + "\n"  +
									         "[3]: Basic calculator" + "\n" +
										 "[4]: Employee repertoire");
	x= scan.nextInt();
	while (x>4 || x<1){
		System.out.println("Please make sure you pick a number between 1 and 4");
		x= scan.nextInt();
	}

		scan.nextLine();
		
		switch (x){
			case 1:
			BasicWeek basicWeek = new BasicWeek();
			basicWeek.printDays();
			break;
			
			case 2:
			AdvancedWeek advancedWeek = new AdvancedWeek();
			advancedWeek.printDays();
			break;
		
			case 3:
			Calculator calculator = new Calculator();
			break;

			case 4:
			Employee employee = new Employee();
			System.out.println(employee);
			break;
		}
		
		

		System.out.println("Would you like to perform another operation? (y/n)");
		YesorNo = scan.nextLine();


	}

	while (YesorNo.equalsIgnoreCase("y"));
    }
}
