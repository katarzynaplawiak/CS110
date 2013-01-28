package assignment.chap2;

import java.util.Scanner;

public class PE225 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String EmployeeName = s.next();
		System.out.print("Enter number of hours worked in a week: ");
	    double hoursWorked = s.nextDouble();
	    System.out.print("Enter hourly pay rate: ");
	    double hourPay = s.nextDouble();
	    double grossPay = hoursWorked * hourPay;
	    System.out.print("Enter federal tax withholding rate: ");
	    double fedTaxWithholdRate = s.nextDouble();
	    double fedTaxPercent = fedTaxWithholdRate * 100;
	    double fedTaxAmount = grossPay * fedTaxWithholdRate;
	    System.out.print("Enter state tax withholding rate: ");
	    double stateTaxWithholdRate = s.nextDouble();
	    double stateTaxPercent = stateTaxWithholdRate * 100; 
	    double stateTaxAmount = grossPay * stateTaxWithholdRate;
	    double totalTax = fedTaxAmount + stateTaxAmount;
	    double netPay = grossPay - totalTax;
	    System.out.println("Employee Name:  " + EmployeeName);
	    System.out.println("Hours Worked:  " + hoursWorked);
	    System.out.println("Pay Rate:  $" + hourPay );
	    System.out.println("Gross Pay:  $" + grossPay);
	    System.out.println("Deductions: \n"+
	    "  Federal Withholding (" + fedTaxPercent + "%):  $" + (int)(fedTaxAmount * 100) / 100.0  + "\n"+
	    "  State Withholding (" + stateTaxPercent+ "%):  $" + (int)(stateTaxAmount * 100) / 100.0 + "\n" +
	    "  Total Deduction:  $" + (int)(totalTax * 100) / 100.0 + "\n" + 
	    "Net Pay:  $" + (int)(netPay * 100) / 100.0 );

	    
	}

}
