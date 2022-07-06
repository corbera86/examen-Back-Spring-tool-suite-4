package com.mx.CrudEmpleadosManyTomany.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudEmpleadosManyTomany.dao.GendersDao;
import com.mx.CrudEmpleadosManyTomany.dominio.GendersGeneros;

@Service
public class GendersServImp implements GendersServ{
	
	//inyeccion de independencias
	@Autowired
	GendersDao gendersDao;

	@Override
	public void guardar(GendersGeneros gender) {
		// TODO Auto-generated method stub
		gendersDao.save(gender);
		
	}

	@Override
	public void editar(GendersGeneros gender) {
		// TODO Auto-generated method stub
		gendersDao.save(gender);
	}

	@Override
	public void eliminar(GendersGeneros gender) {
		// TODO Auto-generated method stub
		gendersDao.delete(gender);
	}

	@Override
	public GendersGeneros buscar(GendersGeneros gender) {
		// TODO Auto-generated method stub
		return gendersDao.findById(gender.getId()).orElse(null);
	}

	@Override
	public List<GendersGeneros> listar() {
		// TODO Auto-generated method stub
		return (List<GendersGeneros>) gendersDao.findAll();
	}

}
