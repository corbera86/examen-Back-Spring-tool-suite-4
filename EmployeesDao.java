package com.mx.CrudEmpleadosManyTomany.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudEmpleadosManyTomany.dominio.EmployeesEmpleados;

public interface EmployeesDao extends CrudRepository<EmployeesEmpleados, Integer>{ // este es el que hace la herencia

}
