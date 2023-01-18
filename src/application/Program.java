package application;



import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Wagner");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Seller seller = new Seller(21, "Wagner", "wagner@email", new Date(), 1000.0, obj);
				
		System.out.println(seller);
		System.out.println(obj);
		
	}
}
 