package Application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("----- TESTE 1: FIND BY ID ------");
		Seller seller = sellerDao.findbyId(3);
		System.out.println(seller);
		
		System.out.println("\n----- TESTE 2: FIND BY Department ------");
		Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        
        for (Seller obj : list) {
        	System.out.println(list);
        	
        }
        	System.out.println("\n----- TESTE 3: FIND ALL ------");
            List<Seller> lista = sellerDao.findAll();
            
            for (Seller obj : lista) {
            	System.out.println(lista);
        }

	}

}
