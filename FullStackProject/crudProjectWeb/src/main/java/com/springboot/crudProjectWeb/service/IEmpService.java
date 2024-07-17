package com.springboot.crudProjectWeb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.crudProjectWeb.dao.EmpDao;
@Service
public interface IEmpService {
void insertEmp(EmpDao emp);
EmpDao getEmpById(int id);
List<EmpDao> getAllEmp();
EmpDao updateEmpById(EmpDao emp,int id);
void deleteById(int id);
}
