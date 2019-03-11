import java.util.*;

public class EmployeeDetails{
	
	public static void main(String arg[]){
		
		int employeeId;
		String employeeName;
		double monthlyBasicSalary;	
		Scanner s=new Scanner(System.in);
		employeeId=s.nextInt();
		employeeName=s.next();
		monthlyBasicSalary=s.nextDouble();
		Employee employee1 = new Employee(employeeId,employeeName,monthlyBasicSalary);
		double annualSalary = employee1.getAnnualSalary();
		System.out.println("AnnualSalary " + annualSalary);
		double monthlyGrossSalary = employee1.getMonthlyGrossSalary();
		System.out.println("monthlyGrossSalary "+ monthlyGrossSalary);
		double annualGrossSalary = employee1.getAnnualGrossSalary();
		System.out.println("annualGrossSalary "+ annualGrossSalary);
		double monthlyDeductions = employee1.getMonthlyDeductions();		
		System.out.println("monthlyDeductions "+monthlyDeductions);
		double monthlyTakeHome = employee1.getMonthlyTakeHome();
		System.out.println("monthlyTakeHome "+ monthlyTakeHome);
		double annualTakeHome = employee1.getAnnualTakeHome();
		System.out.println("annualTakeHome "+ annualTakeHome);


	}
}	