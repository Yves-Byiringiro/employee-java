package co.employee;
import java.util.Scanner;
 class Employee{
	 
	 int employeeid;
	 String employeename;
	 String empType;
	 int salary;
	 double netsalary;
	 
 }
 class WeekEmployee extends Employee{
	 int salaryPerHour;
	 int hours;
	 double rate=0.05;
	 double bonus;
	 
	 
	
 }
 class MonthEmployee extends Employee{ 	
	 double tax=0.3                                                                          ;
	 double rssb=0.03;
	 double deductions;
 }
public class EmployeeApp {

	public static void main(String[] args) 
   {

		
		Employee Emp=new Employee();
		Scanner input = new Scanner(System.in);
		Employee employee = new MonthEmployee();
		
		System.out.println("Enter an EmployeeID");
		Emp.employeeid=input.nextInt();
		System.out.println("Enter an EmployeeName");
		Emp.employeename=input.next();
		
		
		System.out.println("Insert an Employee Type between Monthly or Weekly");
		Emp.empType=input.next();
		
		if(Emp.empType.equalsIgnoreCase("Monthly"))
		{
			System.out.println("Enter the Gross salary");
			Emp.salary=input.nextInt();
			
			MonthEmployee MonthEmp = new MonthEmployee();
			
			MonthEmp.salary=Emp.salary;
			MonthEmp.deductions=(MonthEmp.tax*MonthEmp.salary)+(MonthEmp.rssb*MonthEmp.salary);
			MonthEmp.netsalary = MonthEmp.salary-MonthEmp.deductions;
			
			
			System.out.println("Employee ID is :" +Emp.employeeid+  "Employee NAME is :"+ Emp.employeename+" and The Net Salary of employee is:" +MonthEmp.netsalary);
			
			
		}
		else if(Emp.empType.equalsIgnoreCase("Weekly")) 
		{
			WeekEmployee WeekEmp = new WeekEmployee();
			System.out.println("Enter the hours Worked by Employee ");
			WeekEmp.hours = input.nextInt();
			if(WeekEmp.hours<=40)
			    {
				System.out.println("Enter the price per hour");
				WeekEmp.salaryPerHour = input.nextInt();
				WeekEmp.netsalary = WeekEmp.salaryPerHour*WeekEmp.hours;
				
				System.out.println("Employee ID is :" +Emp.employeeid+  "Employee NAME is :"+ Emp.employeename+"The Salary Net of employee is"+WeekEmp.netsalary);
		        }
	      else if(WeekEmp.hours>40){
	    	  
	    	  System.out.println("Enter the price per hour");
				WeekEmp.salaryPerHour = input.nextInt();
	    	  
	    	  System.out.println("Employee ID is :" +Emp.employeeid+  "Employee NAME is :"+ Emp.employeename+"The Salary Net  of employee is"+((WeekEmp.salaryPerHour*40)+((WeekEmp.hours-40)*WeekEmp.salaryPerHour)*WeekEmp.rate));
				
			}
	   }

	}
	
}
