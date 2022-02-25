package VerifyTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmployee {
	 EmployeesJob empJOB = new EmployeesJob();
	   EmployeeDetails employee = new EmployeeDetails();

	   @Test
	   public void testCalculateAppriasal() {

	      employee.setName("Rajeev");
	      employee.setAge(25);
	      employee.setMonthlySalary(8000);

	      double appraisal = empJOB.calculateAppraisal(employee);
	      Assert.assertEquals(500, appraisal, 0.0, "500");
	   }

	   // Test to check yearly salary
	   @Test
	   public void testCalculateYearlySalary() {

	      employee.setName("Rajeev");
	      employee.setAge(25);
	      employee.setMonthlySalary(8000);

	      double salary = empJOB.calculateYearlySalary(employee);
	      Assert.assertEquals(96000, salary, 0.0, "8000");
	   }
	}