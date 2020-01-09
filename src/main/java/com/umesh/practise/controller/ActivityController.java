package com.umesh.practise.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.umesh.practise.model.Employee;

@RestController("ActivityController")
@RequestMapping("/api/employee")
public class ActivityController {

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public Employee getEmpDetails() {
		Employee employee = new Employee("umesh", "rt", 1);
		return employee;
	}

}
