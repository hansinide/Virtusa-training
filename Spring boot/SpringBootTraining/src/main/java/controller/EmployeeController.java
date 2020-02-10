package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import modal.Employee;
import service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmpService empservice;
	
	@PostMapping("/add")
	public Employee save(@RequestBody Employee emp)
	{
		return empservice.save(emp) ;
		
	}
	

}
