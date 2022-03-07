import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
	int x;

		System.out.println("Which service would you like to use?" + "\n" + "[1]: Basic week visualizer" + "\n" +
                                                                                 "[2]: Advanced week visualizer" + "\n"  +
									         "[3]: Basic calculator" + "\n" +
										 "[4]: Employee repertoire");
	x= scan.nextInt();

	if(x == 1) {
		BasicWeek week1 = new BasicWeek();
		week1.printDays();
	} else {
		if(x == 2) {
			AdvancedWeek week2 = new AdvancedWeek();
			week2.printDays();
			}
		}
    }
}