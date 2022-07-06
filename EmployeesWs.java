package com.mx.CrudEmpleadosManyTomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudEmpleadosManyTomany.dominio.EmployeesEmpleados;
import com.mx.CrudEmpleadosManyTomany.servicio.EmployeesServ;

@RestController
@RequestMapping("EmployeesWs")
@CrossOrigin
public class EmployeesWs {
	
	//inyeccion de independencias
	
	@Autowired
	EmployeesServ employeesServ;
	
	//url http://localhost:9000/EmployeesWs/listar
	@GetMapping("listar")
	public List<EmployeesEmpleados> listar(){
		List<EmployeesEmpleados> lista = employeesServ.listar();
		
		return lista;
	}
	
	//url http://localhost:9000/EmployeesWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody EmployeesEmpleados employee) {
		employeesServ.guardar(employee);
		
	}
	
	//url http://localhost:9000/EmployeesWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody EmployeesEmpleados employee) {
		employeesServ.editar(employee);
		
	}
	
	//url http://localhost:9000/EmployeesWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody EmployeesEmpleados employee) {
		employeesServ.eliminar(employee);
		
	}
	
	//url http://localhost:9000/EmployeesWs/buscar
	@PostMapping("buscar")
	public EmployeesEmpleados buscar(@RequestBody EmployeesEmpleados employee) {
		return employeesServ.buscar(employee);
		
	}

}
