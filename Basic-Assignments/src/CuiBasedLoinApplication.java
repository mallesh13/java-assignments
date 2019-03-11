import java.util.Scanner;

public class CuiBasedLoinApplication {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String userName;
		String password;
		int count = 0;
		while (count < 3) {
			userName = s.nextLine();
			password = s.nextLine();
			if (userName.equals("mallesh") && password.equals("123abc")) {
				System.out.println("Welcome " + userName);
				break;
			}
			else {
				++count;
				System.out.println("attempts left " + (3 - count));
			}
		}
		if (count == 3) {
			System.out.println("Contact Admin");
		}
		s.close();
	}

}
