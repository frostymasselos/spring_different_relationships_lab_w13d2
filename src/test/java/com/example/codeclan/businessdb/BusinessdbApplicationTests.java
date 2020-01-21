package com.example.codeclan.businessdb;

import com.example.codeclan.businessdb.models.Department;
import com.example.codeclan.businessdb.models.Employee;
import com.example.codeclan.businessdb.models.Project;
import com.example.codeclan.businessdb.repositories.DepartmentRepository;
import com.example.codeclan.businessdb.repositories.EmployeeRepository;
import com.example.codeclan.businessdb.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BusinessdbApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Autowired
	DepartmentRepository departmentRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee () {

		Department department = new Department("D");
		Employee employee = new Employee("Ryan", "Frost", department);

		Project project = new Project("P", 56);

		projectRepository.save(project);
		departmentRepository.save(department);
		employeeRepository.save(employee);

	}

}
