package com.mx.CrudEmpleadosManyTomany.servicio;

import java.util.List;

import com.mx.CrudEmpleadosManyTomany.dominio.GendersGeneros;

public interface GendersServ {
	
	public void guardar(GendersGeneros gender);
	public void editar(GendersGeneros gender);
	public void eliminar(GendersGeneros gender);
	
	public GendersGeneros buscar(GendersGeneros gender);
	public List<GendersGeneros> listar();

}
