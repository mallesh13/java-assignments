import java.util.Scanner;

public class FindingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size;
		size = sc.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < size; ++i) {
			array[i] = sc.nextInt();
		}
		int number;
		number = sc.nextInt();
		for (int i = 0; i < size; ++i) {
			if (array[i] == number)
				System.out.println(number + " is foumd at index " + i);
		}
		sc.close();
	}

}
