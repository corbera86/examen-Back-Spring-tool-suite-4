package com.mx.CrudEmpleadosManyTomany.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudEmpleadosManyTomany.dominio.JobsTrabajo;

public interface JobsDao extends CrudRepository<JobsTrabajo, Integer> {

}
