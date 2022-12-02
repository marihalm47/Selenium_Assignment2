package Employee_assignment;

import java.util.Scanner;

public class Employee_salary {
	
	
public static void main(String[] args) {
	
		// TODO Auto-generated method stub
Employee emp1=new Employee();
Employee emp2=new Employee();
Employee emp3=new Employee();
Employee emp4=new Employee();

Scanner input = new Scanner(System.in);

System.out.println("Enter Salary for employee1:");
emp1.Basic_pay =input.nextInt();
emp1.BOA =input.nextInt();
emp1.Bonus =input.nextInt();
emp1.monthly_take_home();

System.out.println("Enter Salary for employee2:");
emp2.Basic_pay =input.nextInt();
emp2.BOA =input.nextInt();
emp2.Bonus =input.nextInt();
emp2.monthly_take_home();

System.out.println("Enter Salary for employee3:");
emp3.Basic_pay =input.nextInt();
emp3.BOA =input.nextInt();
emp3.Bonus =input.nextInt();
emp3.monthly_take_home();

System.out.println("Enter Salary for employee4:");
emp4.Basic_pay =input.nextInt();
emp4.BOA =input.nextInt();
emp4.Bonus =input.nextInt();
emp4.monthly_take_home();

}
	
}


class Employee
{

	 int Basic_pay;
	 int BOA;
	 int Bonus;
	
	public void monthly_take_home()
	{
		double PF,monthly_gross,yearly_gross,yearly_tax = 0,monthly_tax,monthly_take_home;
		PF=Basic_pay*0.12;
		monthly_gross= (Basic_pay+BOA+Bonus)-PF;
		yearly_gross = monthly_gross*12;
		
		if (yearly_gross<250000)
		{
			yearly_tax=0;
		}
		else if (yearly_gross>250000 && yearly_gross<500000)
		{
			yearly_tax=yearly_gross*0.05;
		}
		else if (yearly_gross>500000 && yearly_gross<750000)
		{
			yearly_tax=yearly_gross*0.10;
		}
		else if (yearly_gross>750000 && yearly_gross<1000000)
			{
			yearly_tax=yearly_gross*0.15;
			}
		else if (yearly_gross>1000000 && yearly_gross<1250000)
			{
			yearly_tax=yearly_gross*0.20;
			}
		else if (yearly_gross>1250000 && yearly_gross<1500000)
			{
			yearly_tax=yearly_gross*0.25;
			}
		else if (yearly_gross>1500000)
			{
			yearly_tax=yearly_gross*0.30;
			}
		
		
		monthly_tax=yearly_tax/12;
		
		monthly_take_home = monthly_gross - monthly_tax;
		
				
		System.out.println("Monthly Gross = "+monthly_gross);
		System.out.println("yearly Gross = "+yearly_gross);
		System.out.println("Yearly Tax = "+yearly_tax);
		System.out.println("Montly Tax = "+monthly_tax);
		System.out.println("Montly Take Home Salary is = "+monthly_take_home);
		
		//return monthly_gross;
	}
	
	
	
}
