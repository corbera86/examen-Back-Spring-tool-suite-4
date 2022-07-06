package com.mx.CrudEmpleadosManyTomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudEmpleadosManyTomany.dominio.JobsTrabajo;
import com.mx.CrudEmpleadosManyTomany.servicio.JobsServ;

@RestController
@RequestMapping("JobsTrabajoWs")
@CrossOrigin
public class JobsTrabajoWs {
	
	@Autowired
	JobsServ jobsServ;
	//url:http://localhost:9000/JobsTrabajoWs/listar
	@GetMapping("listar")
	public List<JobsTrabajo> listar(){
		List<JobsTrabajo> lista = jobsServ.listar();
		
		return lista;
	}
	
	//url:http://localhost:9000/JobsTrabajoWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody JobsTrabajo jobs) {
		jobsServ.guardar(jobs);
		
	}
	
	//url:http://localhost:9000/JobsTrabajoWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody JobsTrabajo jobs) {
		jobsServ.editar(jobs);
	}
	
	//url:http://localhost:9000/JobsTrabajoWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody JobsTrabajo jobs) {
		jobsServ.eliminar(jobs);
	}
	
	//url:http://localhost:9000/JobsTrabajoWs/buscar
	@PostMapping("buscar")
	public JobsTrabajo buscar(@RequestBody JobsTrabajo jobs) {
		return jobsServ.buscar(jobs);
	}

}
