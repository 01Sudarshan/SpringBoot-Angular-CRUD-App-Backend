package com.employee.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

import lombok.var;


@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/")
	private String gotoHomePage() {
		return "home.jsp";
	}
	
	@RequestMapping(value="add-employee",method = RequestMethod.POST)
	public String saveEmployee(HttpServletRequest request) {
		Employee employee=new Employee(Integer.parseInt(request.getParameter("empid")), request.getParameter("name"), request.getParameter("address"), Integer.parseInt(request.getParameter("age")));
		service.saveEmployee(employee);
		return "home.jsp";
	}
	
	@RequestMapping("/getEmployee")
	public ModelAndView getAllEmployees() {
		List<Employee> list=service.getAllEmployee();
		ModelAndView model=new ModelAndView();
		model.addObject("list",list);
		model.setViewName("getEmployee.jsp");
		return model;
	}
	
	@RequestMapping(value="delete/{empid}")
	public ModelAndView deleteEmployeeById(@PathVariable int empid) {
		service.deleteEmployee(empid);
		return new ModelAndView("redirect:/home.jsp");
	}
	
	@RequestMapping(value="update",method=RequestMethod.GET)
	public ModelAndView updateForm(HttpServletRequest request) {
		Employee employee=null;
		int empid=Integer.parseInt(request.getParameter("empid"));
		var val=service.findByID(empid);
		if(val.isPresent()) {
			employee=val.get();
		}
		else {
			System.out.println("Employee doesn not exist");
		}
		ModelAndView model=new ModelAndView();
		model.addObject("employee",employee);
		model.setViewName("updateEmployee.jsp");
		return model;
	}
	
	@RequestMapping(value="/updateEmployee",method=RequestMethod.POST)
	public String updateEmployee(HttpServletRequest request) {
		Employee employee=new Employee();
		employee.setEmpid(Integer.parseInt(request.getParameter("empid")));
		employee.setName(request.getParameter("name"));
		employee.setAddress(request.getParameter("address"));
		employee.setAge(Integer.parseInt(request.getParameter("age")));
		service.saveEmployee(employee);
		return "home.jsp";
	}
	
	
	
	
	
	

}
