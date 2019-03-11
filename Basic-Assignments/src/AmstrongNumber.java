import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number;
		number = sc.nextInt();
		int temporaryVariable;
		temporaryVariable = number;
		int result2 = 0;
		int result1;
		while (number > 0) {
			result1 = number % 10;
			result2 = result2 + (result1 * result1 * result1);
			number = number / 10;
		}
		if (temporaryVariable == result2) {
			System.out.println("Given number is Amstrong");
		} else
			System.out.println("Given number is Not Amstrong");
	}

}
