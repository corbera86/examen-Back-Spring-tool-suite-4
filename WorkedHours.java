package com.mx.CrudEmpleadosManyTomany.dominio;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_WORKED_HOURS")
public class WorkedHours {
	
	/*CREATE TABLE EMPLOYEE_WORKED_HOURS(
  ID NUMBER PRIMARY KEY,
WORKED_HOURS NUMBER,
WORKED_DATE DATE,
EMPLOYEE_ID NUMBER,
FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEES(ID)
);
     * */
	
	@Id
	int id;
	int worked_hour;
	String worked_date;
	
	@ManyToOne(fetch=FetchType.EAGER) // 
	@JoinColumn(name = "EMPLOYEE_ID")
	EmployeesEmpleados employeesEmpleados;

	//constructor vacio
	public WorkedHours() {
		
	}

	//constructor con parametros
	public WorkedHours(int id, int worked_hour, String worked_date, EmployeesEmpleados employeesEmpleados) {
		
		this.id = id;
		this.worked_hour = worked_hour;
		this.worked_date = worked_date;
		this.employeesEmpleados = employeesEmpleados;
	}

	// metodos toString
	@Override
	public String toString() {
		return "WorkedHours [id=" + id + ", worked_hour=" + worked_hour + ", worked_date=" + worked_date
				+ ", employeesEmpleados=" + employeesEmpleados + "]\n";
	}

	//encapsulamiento
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWorked_hour() {
		return worked_hour;
	}

	public void setWorked_hour(int worked_hour) {
		this.worked_hour = worked_hour;
	}

	public String getWorked_date() {
		return worked_date;
	}

	public void setWorked_date(String worked_date) {
		this.worked_date = worked_date;
	}

	public EmployeesEmpleados getEmployeesEmpleados() {
		return employeesEmpleados;
	}

	public void setEmployeesEmpleados(EmployeesEmpleados employeesEmpleados) {
		this.employeesEmpleados = employeesEmpleados;
	}
	
	
	
	

}
