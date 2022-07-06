package com.mx.CrudEmpleadosManyTomany.servicio;

import com.mx.CrudEmpleadosManyTomany.dominio.EmployeesEmpleados;

import java.util.List;

public interface EmployeesServ {
	
	public void guardar(EmployeesEmpleados employee);
	public void editar(EmployeesEmpleados employee);
	public void eliminar(EmployeesEmpleados employee);
	
	public EmployeesEmpleados buscar(EmployeesEmpleados employee);
	public List<EmployeesEmpleados> listar();

}
