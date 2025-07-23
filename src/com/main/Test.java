package com.main;

import java.util.Scanner;


import com.model.Employee;
import com.service.PaySlip;

public class Test {

	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	        System.out.print("Enter Employee Name: ");
	        String employeeName = s.nextLine();

	        System.out.print("Enter Employee ID: ");
	        int employeeId = s.nextInt();
	        s.nextLine();


	        System.out.print("Enter Designation: ");
	        String designation = s.nextLine();
	       

	        System.out.print("Enter Department: ");
	        String department = s.nextLine();

	        System.out.print("Enter Pay Period: ");
	        String payPeriod = s.nextLine();
	        
	        System.out.print("Enter Working Days: ");
	        int workingDays = s.nextInt();
	        
	        System.out.print("Enter Leave Days: ");
	        int leaveDays = s.nextInt();

	        System.out.print("Enter Basic Pay: ");
	        float basicPay=s.nextFloat();

	        System.out.print("Enter Incentive Pay: ");
	        float incentivePay = s.nextFloat();

	        System.out.print("Enter House Rent Allowance: ");
	        float houseRentAllowance = s.nextFloat();

	        System.out.print("Enter Meal Allowance: ");
	        float mealAllowance = s.nextFloat();

	        System.out.print("Enter Provident Fund: ");
	        float providentFund = s.nextFloat();

	        System.out.print("Enter Professional Tax: ");
	        float professionalTax = s.nextFloat();

	        System.out.print("Enter Loan: ");
	        float loan = s.nextFloat();

	        System.out.println();
	        s.close();

	        Employee employee = new Employee(employeeName, employeeId, designation, department, payPeriod, workingDays, leaveDays);
	        
	        PaySlip payslipService = new PaySlip( basicPay, incentivePay, houseRentAllowance,mealAllowance,
					providentFund, professionalTax,loan);
	        payslipService.calculatePayslip(employee);
	    }
	}

