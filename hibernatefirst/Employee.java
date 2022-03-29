package com.te.hibernatefirst;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
import lombok.Data;
@Data*/
@Entity
@Table(name="employee_details")
public class Employee {
	@Id
	@Column(name="emp_id")
private Integer empId;
	@Column(name="emp_name")
private String ename;
	@Column(name="address")
private String address;
	@Column(name="password")
private String password;
public Integer getEmpId() {
	return empId;
}
public void setEmpId(Integer empId) {
	this.empId = empId;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
