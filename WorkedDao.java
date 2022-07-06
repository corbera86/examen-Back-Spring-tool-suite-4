package com.mx.CrudEmpleadosManyTomany.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudEmpleadosManyTomany.dominio.WorkedHours;

public interface WorkedDao extends CrudRepository<WorkedHours, Integer> {

}
