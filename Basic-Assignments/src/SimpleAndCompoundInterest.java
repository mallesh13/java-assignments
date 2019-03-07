import java.util.Scanner;

public class SimpleAndCompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int principalAmount;
		float anualRate;
		int time;
		principalAmount = sc.nextInt();
		anualRate = sc.nextFloat();
		time = sc.nextInt();
		float simpleInterest = principalAmount * anualRate * time;
		System.out.println(simpleInterest);
		int compoundPerYear;
		compoundPerYear = sc.nextInt();
		float compoundInterest = (float) (principalAmount
				* Math.pow((1 + (anualRate / compoundPerYear)), (compoundPerYear * time)));
		System.out.println(compoundInterest);
		sc.close();
	}

}
