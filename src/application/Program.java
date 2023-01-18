package application;

import module.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Wagner");
		
		obj.setName("Christos");
		System.out.println(obj);
		
	}
}
