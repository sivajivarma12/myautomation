package com.tutorial.Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5 {

	public static void main(String[] args) {

		Map<String,String> productRow1= new HashMap<String, String>();
		productRow1.put("ProductID","P001");
		productRow1.put("Name","Laptop");
		productRow1.put("Category","Electronics");
		productRow1.put("Price","$1,200");
		productRow1.put("Stock Quantity","50");
		productRow1.put("Supplier","Tech Supplies");
		productRow1.put("Warranty","2 years");
		productRow1.put("Rating","4.5");
		productRow1.put("Manufacturing Date","1/15/2023");
		productRow1.put("Expiry Date","1/15/2025");
		
		Map<String,String> productRow2= new HashMap<String, String>();
		productRow2.put("ProductID","P002");
		productRow2.put("Name","Desk Chair");
		productRow2.put("Category","Furniture");
		productRow2.put("Price","$150");
		productRow2.put("Stock Quantity","100");
		productRow2.put("Supplier","Office Depot");
		productRow2.put("Warranty","1 years");
		productRow2.put("Rating","4");
		productRow2.put("Manufacturing Date","2/10/2023");
		productRow2.put("Expiry Date","N/A");
		
		Map<String,String> productRow3= new HashMap<String, String>();
		productRow3.put("ProductID","P003");
		productRow3.put("Name","Coffee Maker");
		productRow3.put("Category","Kitchen");
		productRow3.put("Price","$75");
		productRow3.put("Stock Quantity","200");
		productRow3.put("Supplier","KitchenWorld");
		productRow3.put("Warranty","6 months");
		productRow3.put("Rating","4.2");
		productRow3.put("Manufacturing Date","3/20/2023");
		productRow3.put("Expiry Date","3/20/2024");
		
		List<Map<String,String>> productDetails = new ArrayList<Map<String,String>>();
          productDetails.add(productRow1);
          productDetails.add(productRow2);
          productDetails.add(productRow3);
          
          System.out.println(productDetails.get(1).get("Supplier"));
          
       

	}

}
