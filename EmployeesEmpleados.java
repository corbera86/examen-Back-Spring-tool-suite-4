package com.mx.CrudEmpleadosManyTomany.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEES")
public class EmployeesEmpleados {
	
	/*CREATE TABLE EMPLOYEES(
   ID NUMBER PRIMARY KEY,
NAME NVARCHAR2(255),
LAST_NAME NVARCHAR2(255),
BIRTHDATE DATE,
GENDER_ID NUMBER,
JOB_ID NUMBER,
FOREIGN KEY(GENDER_ID)REFERENCES GENDERS(ID),
FOREIGN KEY(JOB_ID)REFERENCES JOBS(ID)
);
	 * */
	
	@Id
	int id;
	String name;
	String last_name;
	String birthdate;
	
	@ManyToOne(fetch=FetchType.EAGER) // un empleado tiene un genero --> me creo un objeto --> GendersGeneros
	@JoinColumn(name = "GENDER_ID")
	GendersGeneros gendersGeneros ;
	
	@ManyToOne(fetch=FetchType.EAGER) // un empleado tiene un trabajo --> crear un objeto JobsTrabajo
	@JoinColumn(name = "JOB_ID")
	JobsTrabajo jobsTrabajo ;
	// un empleado hace ciertas horas de trabajo --> le pasamos una lista de horas de trabajo
	@OneToMany(mappedBy="employeesEmpleados", cascade=CascadeType.ALL)
	List<WorkedHours> lista2 = new ArrayList<WorkedHours>();
	
	//constructor vacio
	public EmployeesEmpleados() {
	
	}

	public EmployeesEmpleados(int id, String name, String last_name, String birthdate, GendersGeneros gendersGeneros,
			JobsTrabajo jobsTrabajo, List<WorkedHours> lista2) {
		
		this.id = id;
		this.name = name;
		this.last_name = last_name;
		this.birthdate = birthdate;
		this.gendersGeneros = gendersGeneros;
		this.jobsTrabajo = jobsTrabajo;
		this.lista2 = lista2;
	}

	@Override
	public String toString() {
		return "EmployeesEmpleados [id=" + id + ", name=" + name + ", last_name=" + last_name + ", birthdate="
				+ birthdate + ", gendersGeneros=" + gendersGeneros + ", jobsTrabajo=" + jobsTrabajo + "]\n";
	}

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

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public GendersGeneros getGendersGeneros() {
		return gendersGeneros;
	}

	public void setGendersGeneros(GendersGeneros gendersGeneros) {
		this.gendersGeneros = gendersGeneros;
	}

	public JobsTrabajo getJobsTrabajo() {
		return jobsTrabajo;
	}

	public void setJobsTrabajo(JobsTrabajo jobsTrabajo) {
		this.jobsTrabajo = jobsTrabajo;
	}
	

	
	

}
