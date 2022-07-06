package com.mx.CrudEmpleadosManyTomany.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudEmpleadosManyTomany.dominio.GendersGeneros;

public interface GendersDao extends CrudRepository<GendersGeneros , Integer> { // este es el que hace la herencia

}
