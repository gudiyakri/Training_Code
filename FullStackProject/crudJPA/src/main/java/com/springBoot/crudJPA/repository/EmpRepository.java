package com.springBoot.crudJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.crudJPA.dao.EmpDao;

public interface EmpRepository extends JpaRepository<EmpDao,Integer> {

}
