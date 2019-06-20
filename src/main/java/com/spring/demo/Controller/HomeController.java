package com.spring.demo.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.demo.Entity.Student;
import com.spring.demo.Service4.StudentService;

@Controller
public class HomeController {
	
	@Autowired
	@Qualifier("studentServiceimpl")
	StudentService studentService;


	@RequestMapping(value="/")
	public ModelAndView listStudent(ModelAndView model) throws IOException {
		List<Student> listStudent = studentService.getAllStudent();
		model.addObject("listStudent", listStudent);
	
		model.setViewName("index");
		return model;
	}

	
	
	
	@RequestMapping(value = "/newStudent", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Student student = new Student();
		model.addObject("student", student);
		model.setViewName("StudentForm");
		return model;
	}

	
	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		if (student.getId() == 0) { // if student id is 0 then creating the
			// student other updating the student
			studentService.addStudent(student);
		} else {
			studentService.updateStudent(student);
		}
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/deleteStudent", method = RequestMethod.GET)
	public ModelAndView deleteStudent(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		studentService.deleteStudent(id);
		return new ModelAndView("redirect:/");
	}
	@RequestMapping(value = "/editStudent", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int studentId = Integer.parseInt(request.getParameter("id"));
		Student student = studentService.getStudent(studentId);
		ModelAndView model = new ModelAndView("StudentForm");
		model.addObject("student", student);

		return model;
	}
	
}