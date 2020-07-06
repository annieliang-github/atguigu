package team.service;

import team.domain.Architect;
import team.domain.Designer;
import team.domain.Employee;
import team.domain.Equipment;
import team.domain.NoteBook;
import team.domain.PC;
import team.domain.Printer;
import team.domain.Programmer;

public class NameListService {
	
	private Employee[] employees;
	
	//给数组及数组元素初始化 长度取决于data里有多少人
	public NameListService() {
		employees = new Employee[Data.EMPLOYEES.length];
		//现在元素还是null 需要赋值（employee、programmer、designer等）
		
		for(int i = 0; i < employees.length; i++) {
			//获取员工类型
			int type = Integer.parseInt(Data.EMPLOYEES[i][0]);
			//获取employee的四个基本信息：
			int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
			String name = Data.EMPLOYEES[i][2];
			int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
			double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
			Equipment equipment;
			double bonus;
			int stock;
			
			switch(type) {
				case Data.EMPLOYEE: 
					employees[i] = new Employee(id, name, age, salary);
					break;
				case Data.PROGRAMMER:
					equipment = createEquipment(i);
					employees[i] = new Programmer(id, name, age, salary, equipment);
					break;
				case Data.DESIGNER:
					equipment = createEquipment(i);
					bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
					employees[i] = new Designer(id, name, age, salary, equipment, bonus);
					break;
				case Data.ARCHITECT:
					equipment = createEquipment(i);
					bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
					stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
					employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
					break;
			}
			
			
		}
		
	}
	
	//获取指定index位置上员工的设备
	private Equipment createEquipment(int index) {
		int type = Integer.parseInt(Data.EQUIPMENTS[index][0]);
		String model = Data.EQUIPMENTS[index][1];
		switch(type) {
			case Data.PC://21
				return new PC(model, Data.EQUIPMENTS[index][2]);
				
			case Data.NOTEBOOK://22
				double price = Double.parseDouble(Data.EQUIPMENTS[index][2]);
				return new NoteBook(model, price);
				
			case Data.PRINTER://23
				return new Printer(model, Data.EQUIPMENTS[index][2]);
				
		}
		
		return null;
	}

	
	//获取当前所有员工
	public Employee[] getAllEmployees( ) {
		return employees;
	}
	
	public Employee getEmployee(int id) throws TeamException {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getId()== id) {
				return employees[i];
			}
		}
		throw new TeamException("找不到指定员工");

	}
	
	
}
