package com.mx.CrudEmpleadosManyTomany.servicio;

import java.util.List;

import com.mx.CrudEmpleadosManyTomany.dominio.JobsTrabajo;

public interface JobsServ {

	public void guardar(JobsTrabajo jobs);

	public void editar(JobsTrabajo jobs);

	public void eliminar(JobsTrabajo jobs);

	public JobsTrabajo buscar(JobsTrabajo jobs);

	public List<JobsTrabajo> listar();

}
