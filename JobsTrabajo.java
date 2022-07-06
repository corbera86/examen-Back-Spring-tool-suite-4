package com.mx.CrudEmpleadosManyTomany.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="JOBS")
public class JobsTrabajo {
	
	/*
	 * CREATE TABLE JOBS(
  ID NUMBER PRIMARY KEY,
NAME NVARCHAR2(255),
SALARY NUMBER  
);
	 * */
	
	@Id
	int id;
	String name;
	int salary;
	
	@OneToMany(mappedBy="jobsTrabajo", cascade=CascadeType.ALL)
	List<EmployeesEmpleados> lista = new ArrayList<EmployeesEmpleados>();
	
	//constructor vacio
	public JobsTrabajo() {
	
	}

	//constructor con parametros
	public JobsTrabajo(int id, String name, int salary, List<EmployeesEmpleados> lista) {
	
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.lista = lista;
	}

	// metodos toString
	@Override
	public String toString() {
		return "JobsTrabajo [id=" + id + ", name=" + name + ", salary=" + salary + "]\n";
	}

	//encapsulamiento
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
	
	

}
