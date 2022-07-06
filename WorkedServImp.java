package com.mx.CrudEmpleadosManyTomany.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudEmpleadosManyTomany.dao.WorkedDao;
import com.mx.CrudEmpleadosManyTomany.dominio.WorkedHours;



@Service
public class WorkedServImp implements WorkedServ {
	
	@Autowired
	WorkedDao workedDao;

	@Override
	public void guardar(WorkedHours hours) {
		// TODO Auto-generated method stub
		workedDao.save(hours);
	}

	@Override
	public void editar(WorkedHours hours) {
		// TODO Auto-generated method stub
		workedDao.save(hours);
	}

	@Override
	public void eliminar(WorkedHours hours) {
		// TODO Auto-generated method stub
		workedDao.delete(hours);
	}

	@Override
	public WorkedHours buscar(WorkedHours hours) {
		// TODO Auto-generated method stub
		return workedDao.findById(hours.getId()).orElse(null);
	}

	@Override
	public List<WorkedHours> listar() {
		// TODO Auto-generated method stub
		return (List<WorkedHours>) workedDao.findAll();
	}
	
	

}
