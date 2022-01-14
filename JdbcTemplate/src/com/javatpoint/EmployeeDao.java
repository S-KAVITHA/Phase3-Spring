package com.javatpoint;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
private JdbcTemplate jdbcTemplate;

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

public int saveEmployee(Employee e){
	String query="insert into emp values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
	return jdbcTemplate.update(query);
}
public int updateEmployee(Employee e){
	String query="update emp set empname='"+e.getName()+"',salary='"+e.getSalary()+"' where empid='"+e.getId()+"' ";
	return jdbcTemplate.update(query);
}
public int deleteEmployee(Employee e){
	String query="delete from emp where empid='"+e.getId()+"' ";
	return jdbcTemplate.update(query);
}

}
