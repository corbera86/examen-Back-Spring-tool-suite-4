package com.mx.CrudEmpleadosManyTomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudEmpleadosManyTomany.dominio.GendersGeneros;
import com.mx.CrudEmpleadosManyTomany.servicio.GendersServ;

@RestController
@RequestMapping("GendersGenerosWs")
@CrossOrigin
public class GendersGenerosWs {
	
  @Autowired
  GendersServ gendersServ;
  //url:http://localhost:9000/GendersGenerosWs/listar
  @GetMapping("listar")
  public List<GendersGeneros> listar(){
	  List<GendersGeneros> lista = gendersServ.listar();
	  
	  return lista;  
  }
  
  //url:http://localhost:9000/GendersGenerosWs/guardar
  @PostMapping("guardar")
  public void guardar(@RequestBody GendersGeneros gender) {
	  gendersServ.guardar(gender);
  }
  
//url:http://localhost:9000/GendersGenerosWs/editar
  @PostMapping("editar")
  public void editar(@RequestBody GendersGeneros gender) {
	  gendersServ.editar(gender);
  }
  
//url:http://localhost:9000/GendersGenerosWs/eliminar
  @PostMapping("eliminar")
  public void eliminar(@RequestBody GendersGeneros gender) {
	  gendersServ.eliminar(gender);
	  
  }
  
//url:http://localhost:9000/GendersGenerosWs/buscar
  @PostMapping("buscar")
  public GendersGeneros buscar(@RequestBody GendersGeneros gender) {
	  return gendersServ.buscar(gender);
  }
  

}
