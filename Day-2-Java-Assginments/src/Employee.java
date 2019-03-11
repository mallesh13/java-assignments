public class Employee{
		
		private int employeeId;
		private String employeeName;
		private double monthlyBasicSalary;
		private static int medicalAllowance=1250;
		private static int conveyanceAllowance=800;
		private static double hra=0.50;
		private static double esic=0.0475;
		private static double pf=0.10;
		
		public Employee(int employeeId,String employeeName,double monthlyBasicSalary){
			
			this.employeeId=employeeId;
			this.employeeName=employeeName;
			this.monthlyBasicSalary=monthlyBasicSalary;
					
		}
		
		public double getAnnualSalary(){
			
			return (12 * monthlyBasicSalary);
		}		
		
		public double getMonthlyGrossSalary(){
		
			return (monthlyBasicSalary+(hra*monthlyBasicSalary)+medicalAllowance+conveyanceAllowance);
		}
		
		public double getAnnualGrossSalary(){
		
			return (12*getMonthlyGrossSalary());
		}
		
		public double getMonthlyDeductions(){
			
			double monthlyDeductions = 0;
			if(getMonthlyGrossSalary()<=10000)
				monthlyDeductions = monthlyDeductions+50;
			else
				monthlyDeductions = monthlyDeductions+100;
			
			if(monthlyBasicSalary<=5000)
				monthlyDeductions = monthlyDeductions+(esic*monthlyBasicSalary);
			
			monthlyDeductions = monthlyDeductions+(pf * monthlyBasicSalary);
			return monthlyDeductions;
		}							
		
		public double getMonthlyTakeHome(){
			return ( getMonthlyGrossSalary() - getMonthlyDeductions());
		}
		
		public double getAnnualTakeHome(){
			return 12*getMonthlyTakeHome();
		}	

}