package com.springboot.crudProjectWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.crudProjectWeb.dao.EmpDao;

public interface EmpRepository extends JpaRepository<EmpDao,Integer> {

}
