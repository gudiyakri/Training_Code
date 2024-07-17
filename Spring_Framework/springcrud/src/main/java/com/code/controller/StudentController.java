package com.code.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.code.model.StudentModel;
import com.code.service.IStudentService;

@Controller
public class StudentController {
//	@Autowired
//	private IStudentService service;

    @GetMapping("/")
    public String getIndexPage() {
        return "index";
    }
    
  @GetMapping("/regi")
    public String getRegisterPage() {
        return "Student";
    }
//    @GetMapping("/regi")
//    public String getRegisterPage(Model model) {
//        model.addAttribute("stud", new StudentModel());
//        return "Student";
//    }

  @PostMapping("/regi")
  public String studentForm(@ModelAttribute("stud") StudentModel st, Model model) {
      System.out.println("Form data: " + st);
      model.addAttribute("stud", st);
      return "display_result";
  }
    
    
//   @GetMapping("/stu_data") 
//   public String showData(Map<String,Object>map) {
//	//use service
//	   List<StudentModel> list=service.fetchAllStu();
//	   map.put("listStu", list);
//	   return "show_data";   
//   }

//    @RequestMapping("/data")
//    public String showData(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("pass") String pass, Model model) {
//        System.out.println(name + "," + email + "," + pass);
//        model.addAttribute("name", name);
//        model.addAttribute("email", email);
//        model.addAttribute("pass", pass);
//        return "display_result";
//    }
}
