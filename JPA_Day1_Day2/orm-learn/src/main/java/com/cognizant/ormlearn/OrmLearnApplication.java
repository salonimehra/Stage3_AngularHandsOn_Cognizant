package com.cognizant.ormlearn;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

/*
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);
	}

}
*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;

@SpringBootApplication
public class OrmLearnApplication {

private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
private static CountryService countryService;
private static EmployeeService employeeService;
private static DepartmentService departmentService;
private static SkillService skillService;

public static void main(String[] args) {

LOGGER.info("Inside main");
ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

countryService = context.getBean(CountryService.class);
employeeService = context.getBean(EmployeeService.class);
departmentService = context.getBean(DepartmentService.class);
skillService = context.getBean(SkillService.class);

testGetAllCountries();
testGetEmployee();
testAddEmployee();
testUpdateEmployee();
testGetDepartment();
testGetEmployee1();
}
private static void testGetAllCountries() {

LOGGER.info("Start");

List<Country> countries = countryService.getAllCountries();

LOGGER.debug("countries={}", countries);

LOGGER.info("End");

}

private static void testGetEmployee() {

LOGGER.info("Start");

Employee employee = employeeService.get(1);

LOGGER.debug("Employee:{}", employee);

LOGGER.debug("Department:{}", employee.getDepartment());

LOGGER.info("End");

}

private static void testAddEmployee() {
	Employee employee=new Employee();
	employee.setId(50);
	employee.setDateOfBirth(new Date());
	employee.setName("Cognizant");
	employee.setPermanent(true);
	employee.setSalary(new BigDecimal(10000));
	
	Department department = departmentService.get(1);
	employee.setDepartment(department);
	employeeService.save(employee);
	
	LOGGER.info("Start");
	LOGGER.debug("Employee:{}", employee);
	LOGGER.info("End");

}

private static void testUpdateEmployee() {
	
	Employee employee =employeeService.get(5);
	Department department = departmentService.get(2);
	employee.setDepartment(department);
	employeeService.save(employee);
	
	LOGGER.info("Start");
	LOGGER.debug("Employee:{}", employee);
	LOGGER.info("End");
}

private static void testGetDepartment() {
	Department department = departmentService.get(2);
	Set<Employee> employeeList=department.getEmployeeList();
	LOGGER.info("Start");
	LOGGER.debug("EmployeeList:{}", employeeList);
	LOGGER.info("End");
}
private static void testGetEmployee1() {
	Employee employee =employeeService.get(1);
	
	LOGGER.info("Start");
	LOGGER.debug("Skills:{}", employee.getSkillList());
	LOGGER.info("End");
}
}