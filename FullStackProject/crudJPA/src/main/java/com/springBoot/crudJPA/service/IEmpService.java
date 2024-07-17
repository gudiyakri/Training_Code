package com.springBoot.crudJPA.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springBoot.crudJPA.dao.EmpDao;
@Service
public interface IEmpService {
void insertEmp(EmpDao emp);
EmpDao getEmpById(int id);
List<EmpDao> getAllEmp();
EmpDao updateEmpById(EmpDao emp,int id);
void deleteById(int id);

}
