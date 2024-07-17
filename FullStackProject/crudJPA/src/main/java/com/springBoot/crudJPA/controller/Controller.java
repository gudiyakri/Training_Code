package com.springBoot.crudJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.crudJPA.dao.EmpDao;
import com.springBoot.crudJPA.service.IEmpService;

@RestController
@RequestMapping("/empApi")
public class Controller {
@Autowired
private IEmpService iempService;
@PostMapping("/insert")
public void insertEmp(@RequestBody EmpDao emp) {
	iempService.insertEmp(emp)	;	
}
@GetMapping("/get/{id}")
public EmpDao getEmpById(@PathVariable int id) {
	return iempService.getEmpById(id);	
}
@GetMapping("/findAll")
public List<EmpDao> getAllEmp(){
return iempService.getAllEmp();
}
@PutMapping("/update/{id}")
public EmpDao updateEmpById(@RequestBody EmpDao emp,@PathVariable int id) {
	return iempService.updateEmpById(emp, id);	
}
@DeleteMapping("/delete/{id}")
public void deleteById(@PathVariable int id) {
	iempService.deleteById(id);
}
}

