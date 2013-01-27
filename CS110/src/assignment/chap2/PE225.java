package assignment.chap2;

import java.util.Scanner;

public class PE225 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = s.next();
		System.out.print("Enter number of hours worked in a week: ");
	    double hoursWorked = s.nextDouble();
	    System.out.print("Enter hourly pay rate: ");
	    double hourPay = s.nextDouble();
	    double grossPay = hoursWorked * hourPay;
	    System.out.print("Enter federal tax withholding rate: ");
	    double fedTaxWithholdRate = s.nextDouble();
	    double fedTaxPercent = fedTaxWithholdRate * 100;
	    double fedTaxAmount = (int)((grossPay * fedTaxWithholdRate) * 100) / 100.0 ;
	    System.out.print("Enter state tax withholding rate: ");
	    double stateTaxWithholdRate = s.nextDouble();
	    double stateTaxPercent = stateTaxWithholdRate * 100; 
	    double stateTaxAmount = (int)((grossPay * stateTaxWithholdRate) * 100 )/ 100.0;
	    double totalTax = (int)((fedTaxAmount + stateTaxAmount)*100) / 100.0;
	    double netPay = (int)((grossPay - totalTax) * 100) / 100.0;
	    System.out.println("Employee Name: \t" + name);
	    System.out.println("Hours Worked: \t" + hoursWorked);
	    System.out.println("Pay Rate: \t $" + hourPay );
	    System.out.println("Gross Pay: \t $" + grossPay);
	    System.out.println("Deductions: \n"+
	    "\t Federal Withholding (" + fedTaxPercent + "%): \t $" + fedTaxAmount  + "\n"+
	    "\t State Withholding (" + stateTaxPercent+ "%): \t $" + stateTaxAmount + "\n" +
	    "\t Total Deduction: \t $" + totalTax + "\n" + 
	    "Net Pay: \t $" + netPay);

	    
	}

}
