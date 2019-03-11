import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long anualSalary;
		anualSalary = sc.nextLong();
		if (anualSalary >= 0 && anualSalary <= 180000)
			System.out.println("tax amount is Nill");
		else if (anualSalary >= 180001 && anualSalary <= 300000)
			System.out.println("tax amount is " + anualSalary * 0.10);
		else if (anualSalary >= 300001 && anualSalary <= 500000)
			System.out.println("tax amount is " + anualSalary * 0.20);
		else if (anualSalary >= 500001 && anualSalary <= 1000000)
			System.out.println("tax amount is " + anualSalary * 0.30);
		sc.close();

	}

}
