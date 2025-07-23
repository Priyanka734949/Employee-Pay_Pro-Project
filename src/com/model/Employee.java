package com.model;

public class Employee {
	
	    private String empName;
	    private int empId;
	    private String designation;
	    private String department;
	    private String payPeriod;
	    private int workingDays;
	    private int leaveDays;
	    
		public Employee(String empName, int empId, String designation, String department, String payPeriod,int workingDays, int leaveDays) {
			super();
			this.empName = empName;
			this.empId = empId;
			this.designation = designation;
			this.department = department;
			this.payPeriod = payPeriod;
			this.workingDays = workingDays;
	        this.leaveDays = leaveDays;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getPayPeriod() {
			return payPeriod;
		}

		public void setPayPeriod(String payPeriod) {
			this.payPeriod = payPeriod;
		}
	    
		public int getWorkingDays() {
	        return workingDays;
	    }

	    public void setWorkingDays(int workingDays) {
	        this.workingDays = workingDays;
	    }

	    public int getLeaveDays() {
	        return leaveDays;
	    }

	    public void setLeaveDays(int leaveDays) {
	        this.leaveDays = leaveDays;
	    }
}
