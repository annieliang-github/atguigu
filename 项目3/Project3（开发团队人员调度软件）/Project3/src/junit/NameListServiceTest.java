package junit;

import org.junit.Test;

import team.domain.Employee;
import team.service.NameListService;

//test

public class NameListServiceTest {
	
	@Test
	public void testGetAllEmployees() {
		NameListService service = new NameListService();
		Employee[] employees = service.getAllEmployees();
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
	}
	
	@Test
	public void testGetEmployee() {
		NameListService service = new NameListService();
		int id = 1;
		
		try {
			Employee employee = service.getEmployee(id);
			System.out.println(employee);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
	
}
