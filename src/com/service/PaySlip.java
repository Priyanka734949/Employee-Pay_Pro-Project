package com.service;

import com.model.Employee;

public class PaySlip {
	
	    private float basic_Pay;
	    private float incentive_Pay;
	    private float house_Rent_Allowance;
	    private float meal_Allowance;
	    private float provident_Fund;
	    private float professional_Tax;
	    private float loan;
	    
	    
		public PaySlip(float basic_Pay, float incentive_Pay, float house_Rent_Allowance, float meal_Allowance,
				float provident_Fund, float professional_Tax, float loan) {
			
			this.basic_Pay = basic_Pay;
			this.incentive_Pay = incentive_Pay;
			this.house_Rent_Allowance = house_Rent_Allowance;
			this.meal_Allowance = meal_Allowance;
			this.provident_Fund = provident_Fund;
			this.professional_Tax = professional_Tax;
			this.loan = loan;
	        

		}

		public void calculatePayslip(Employee employee) {
	        float totalEarnings = basic_Pay + incentive_Pay + house_Rent_Allowance + meal_Allowance;
	        float totalDeductions = provident_Fund + professional_Tax + loan;
	        float netPay = totalEarnings - totalDeductions;
	        
	        System.out.println("===============================PAY SLIP================================");
	        System.out.println();
	        System.out.println("Employee Name: " + employee.getEmpName()+ "          \t Employee ID:"+ employee.getEmpId());
	        System.out.println("Designation: " + employee.getDesignation()+"          \tDepartment: " + employee.getDepartment());
	        System.out.println("Pay Period: " + employee.getPayPeriod()+"          \t Working Days: " + employee.getWorkingDays());
	        System.out.println("Leave Days: " + employee.getLeaveDays());
	        System.out.println("--------------------------------------------------------------------");

	        System.out.println("Earnings:" +  "                          \t Deductions: " );
	      
	        System.out.println("--------------------------------------------------------------------");
	        System.out.println("Basic Pay: " + basic_Pay+ "                 \tProvident Fund: " + provident_Fund);
	        System.out.println("Incentive Pay: " + incentive_Pay+"                 \tProfessional Tax: " + professional_Tax);
	        System.out.println("House Rent Allowance: " + house_Rent_Allowance+"        \t Loan: " + loan);
	        System.out.println("Meal Allowance: " + meal_Allowance);
	        System.out.println();
	        System.out.println("Total Earnings: " + totalEarnings+"          \t Total Deductions"+totalDeductions);
	       
	        System.out.println("--------------------------------------------------------------------");

	        System.out.println("                    Net Pay: " + netPay);
	    }
	


	    
}

