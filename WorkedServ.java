package com.mx.CrudEmpleadosManyTomany.servicio;

import java.util.List;

import com.mx.CrudEmpleadosManyTomany.dominio.WorkedHours;

public interface WorkedServ {
	
	public void guardar(WorkedHours hours);
	public void editar(WorkedHours hours);
	public void eliminar(WorkedHours hours);
	
	public WorkedHours buscar(WorkedHours hours);
	public List<WorkedHours> listar();

}
