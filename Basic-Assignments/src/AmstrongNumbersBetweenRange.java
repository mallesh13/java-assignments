
public class AmstrongNumbersBetweenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 100;
		int number2 = 999;
		for (int i = number1; i <= number2; ++i) {
			int temp = i;
			int result1;
			int result2 = 0;
			while (temp > 0) {
				result1 = temp % 10;
				result2 = result2 + (result1 * result1 * result1);
				temp /= 10;
			}
			if (i == result2)
				System.out.println(i);
		}

	}

}
