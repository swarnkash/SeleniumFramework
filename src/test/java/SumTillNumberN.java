import java.util.Scanner;

public class SumTillNumberN {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		int number = Scan.nextInt();
		int num = number;
		int sum = 0;

		for(int i=0; i<=number; i++) {
			sum = sum +i;
		}
		
		System.out.println("Sum of numbers from 0 to " +num +" is = " +sum);
		System.out.println("WOW Man");
	}

}
