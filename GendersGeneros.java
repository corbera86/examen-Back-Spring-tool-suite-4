package com.mx.CrudEmpleadosManyTomany.dominio;



import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;


@Entity
@Table(name="GENDERS")
public class GendersGeneros {

	/*
	 * CREATE TABLE GENDERS(
    ID NUMBER PRIMARY KEY,
NAME NVARCHAR2(255)    
);
	 * */
	@Id
	int id;
	String name;
	@OneToMany(mappedBy="gendersGeneros", cascade=CascadeType.ALL)
	List<EmployeesEmpleados> lista = new ArrayList<EmployeesEmpleados>();
	
	//constructor vacio
	public GendersGeneros() { 

	}

	//constructor con parametros
	public GendersGeneros(int id, String name, List<EmployeesEmpleados> lista) {
	
		this.id = id;
		this.name = name;
		this.lista = lista;
	}

	// metodos toString
	@Override
	public String toString() {
		return "GendersGeneros [id=" + id + ", name=" + name + "]\n";
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
	
	
	
	
	
	
	
}
