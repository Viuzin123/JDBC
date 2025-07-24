package Application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
	
		Department dp = new Department(1, "Books");
		Seller s = new Seller(1, "Vitor", "vitaovitin@hotmail.com", new Date(), 30000.00, dp);
		
	
		System.out.println(dp);
		System.out.println(s);

	}

}
