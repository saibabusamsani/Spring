package com.employee.dao;

import com.employee.model.EmployeeDetailes;

public interface EmployeeDao {
	public void registration(EmployeeDetailes emp);
	public void updateSalary(double salary,int empid);
	public void updateSalaryByDeptno(double sal,int deptno);
	public void deleteEmployee(String name);
	public void deleteEmployeeByLastcharR(String t);
	public void fingEmpDetailesByEmpId(int empId);
	public void fingEmpDetailesBydeptno(int deptno);
	void findEmployeeWhoseDeptnoGreaterThanGivenDeptno(int deptno);
	

}
