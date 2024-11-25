package com.employee.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.employee.model.EmployeeDetailes;

public class EmployeeRowMapperImp implements RowMapper<EmployeeDetailes> {

	@Override
	public EmployeeDetailes mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		EmployeeDetailes empDetailes=new EmployeeDetailes();
		empDetailes.setEmployeeId(rs.getInt(1));
		empDetailes.setEmployeeName(rs.getString(2));
		empDetailes.setEmployeeSalary(rs.getDouble(3));
		empDetailes.setEmployeeDeptno(rs.getInt(4));
		return empDetailes;
	}
}
