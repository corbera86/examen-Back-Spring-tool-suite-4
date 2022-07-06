package com.mx.CrudEmpleadosManyTomany.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudEmpleadosManyTomany.dao.EmployeesDao;
import com.mx.CrudEmpleadosManyTomany.dominio.EmployeesEmpleados;
@Service
public class EmployeesServImp implements EmployeesServ {
	
	//inyeccion de independencias
	@Autowired
	EmployeesDao employeesDao;

	@Override
	public void guardar(EmployeesEmpleados employee) {
		// TODO Auto-generated method stub
		employeesDao.save(employee);
	}

	@Override
	public void editar(EmployeesEmpleados employee) {
		// TODO Auto-generated method stub
		employeesDao.save(employee);
	}

	@Override
	public void eliminar(EmployeesEmpleados employee) {
		// TODO Auto-generated method stub
		employeesDao.delete(employee);
	}

	@Override
	public EmployeesEmpleados buscar(EmployeesEmpleados employee) {
		// TODO Auto-generated method stub
		return employeesDao.findById(employee.getId()).orElse(null);
	}

	@Override
	public List<EmployeesEmpleados> listar() {
		// TODO Auto-generated method stub
		return (List<EmployeesEmpleados>) employeesDao.findAll();
	}

}
