import java.util.Scanner;

public class StudentSupplyResults {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int maths;
		int physics;
		int chemistry;
		maths=s.nextInt();
		physics=s.nextInt();
		chemistry=s.nextInt();
		if(maths>60 && physics>60&&chemistry>60)
			System.out.println("Passed");
		else if((maths>60 && physics>60)||(physics>60&&chemistry>60)||(maths>60&&chemistry>60))
			System.out.println("Promoted");
		else if(((maths>60)||(maths<60 && physics<60&&chemistry<60))||((physics>60)||(maths<60 && physics<60&&chemistry<60))||((chemistry>60)||(maths<60 && physics<60&&chemistry<60)))
			System.out.println("Failed");
		s.close();
	}

}
