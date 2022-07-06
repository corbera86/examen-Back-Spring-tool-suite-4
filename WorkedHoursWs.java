package com.mx.CrudEmpleadosManyTomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudEmpleadosManyTomany.dominio.WorkedHours;
import com.mx.CrudEmpleadosManyTomany.servicio.WorkedServ;

@RestController
@RequestMapping("WorkedHoursWs")
@CrossOrigin
public class WorkedHoursWs {
	
	@Autowired
	WorkedServ workedServ;
	//url:http://localhost:9000/WorkedHoursWs/listar
	@GetMapping("listar")
	public List<WorkedHours> listar() {
		List<WorkedHours> lista = workedServ.listar();
		return lista;
	}
	
	//url: http://localhost:9000/WorkedHoursWs/guardar
		@PostMapping("guardar")
		public void guardar(@RequestBody WorkedHours hours) {
			workedServ.guardar(hours);
		}
		
		//url: http://localhost:9000/WorkedHoursWs/editar
		@PostMapping("editar")
		public void editar(@RequestBody WorkedHours hours) {
			workedServ.editar(hours);
		}
		
		//url: http://localhost:9000/WorkedHoursWs/eliminar
		@PostMapping("eliminar")
		public void eliminar(WorkedHours hours) {
			workedServ.eliminar(hours);
		}
		
		//url: http://localhost:9000/WorkedHoursWs/buscar
		@PostMapping("buscar")
		public WorkedHours buscar(WorkedHours hours) {
			return workedServ.buscar(hours);
		}

}
