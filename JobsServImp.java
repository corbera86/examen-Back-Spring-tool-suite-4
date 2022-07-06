package com.mx.CrudEmpleadosManyTomany.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudEmpleadosManyTomany.dao.JobsDao;
import com.mx.CrudEmpleadosManyTomany.dominio.JobsTrabajo;

@Service
public class JobsServImp implements JobsServ {
	
	@Autowired
	JobsDao jobsDao;

	@Override
	public void guardar(JobsTrabajo jobs) {
		// TODO Auto-generated method stub
		jobsDao.save(jobs);
	}

	@Override
	public void editar(JobsTrabajo jobs) {
		// TODO Auto-generated method stub
		jobsDao.save(jobs);
	}

	@Override
	public void eliminar(JobsTrabajo jobs) {
		// TODO Auto-generated method stub
		jobsDao.delete(jobs);
	}

	@Override
	public JobsTrabajo buscar(JobsTrabajo jobs) {
		// TODO Auto-generated method stub
		return jobsDao.findById(jobs.getId()).orElse(null);
	}

	@Override
	public List<JobsTrabajo> listar() {
		// TODO Auto-generated method stub
		return (List<JobsTrabajo>) jobsDao.findAll();
	}

}
