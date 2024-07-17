package com.springboot.crudProjectWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.crudProjectWeb.dao.EmpDao;
import com.springboot.crudProjectWeb.repository.EmpRepository;
@Component
public class EmpServiceImpl implements IEmpService {
@Autowired 
private EmpRepository empRepo;
	@Override
	public void insertEmp(EmpDao emp) {
		empRepo.save(emp);	
	}

	@Override
	public EmpDao getEmpById(int id) {
		return empRepo.findById(id).orElseThrow();
	}

	@Override
	public List<EmpDao> getAllEmp() {
		return empRepo.findAll();
	}

	@Override
	public EmpDao updateEmpById(EmpDao emp, int id) {
		EmpDao empFromDb=empRepo.findById(id).get();
		empFromDb.setEmpname(emp.getEmpname());
		empFromDb.setPassword(emp.getPassword());
		return empRepo.save(empFromDb);
	}

	@Override
	public void deleteById(int id) {
	empRepo.deleteById(id);
		
	}

}
