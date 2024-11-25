package com.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.employee.config.EmployeeConfig;
import com.employee.dao.EmployeeDao;
import com.employee.dao.EmployeeDaoImp;
import com.employee.model.EmployeeDetailes;

public class App 
{
    public static void main( String[] args )
    {
        EmployeeDetailes empDetailes=new EmployeeDetailes();
        empDetailes.setEmployeeName("sai");
        empDetailes.setEmployeeSalary(25000);
        empDetailes.setEmployeeDeptno(15);
        ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
        EmployeeDao emp=context.getBean(EmployeeDao.class);
//        emp.registration(empDetailes);
//        emp.updateSalary(30000, 24);
//        emp.updateSalaryByDeptno(5555,24);
//        emp.deleteEmployee("sai");
//        emp.deleteEmployeeByLastcharR("t");
        
//        emp.fingEmpDetailesByEmpId(6);
//        emp.fingEmpDetailesBydeptno(10);
        emp.findEmployeeWhoseDeptnoGreaterThanGivenDeptno(10);
        String[] a=context.getBeanDefinitionNames();
    	for(String i:a)
    	{
    		System.out.println(i);
    	}
    	emp.registration(empDetailes);
      
    }
}
