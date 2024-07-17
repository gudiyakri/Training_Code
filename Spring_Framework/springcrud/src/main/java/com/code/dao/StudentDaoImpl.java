//package com.code.dao;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import com.code.model.StudentModel;
//@Repository("stdDao")
//public class StudentDaoImpl implements StudentDao {
//private static final String selectQuery="select id,name,email,sal from student";
//@Autowired
//private JdbcTemplate jt;
//	@Override
//	public List<StudentModel> getAllStudent() {
//		List<StudentModel> list=jt.query(selectQuery,rs->{
//		List<StudentModel> al=new ArrayList();
//		while(rs.next()) {
//			StudentModel s=new StudentModel();
//			s.setId(rs.getInt(1));
//			s.setName(rs.getString(2));
//			s.setEmail(rs.getString(3));
//			s.setPass(rs.getString(4));
//			al.add(s);
//		}
//		});
//		return list;
//	}
//
//}
