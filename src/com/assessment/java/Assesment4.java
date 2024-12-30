package com.assessment.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assesment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//student 1 details 
				Map<String, String> Student1Map = new HashMap<String,String>();
				Student1Map .put("Name", "john");
				Student1Map .put("Age", "20");
				Student1Map .put("Gender", "Male");
				Student1Map .put("Roll no ", "S12345");
				Student1Map .put("Grade ", "A");
				Student1Map .put("Major", "Computer science");
				Student1Map .put("GPA", "3.8");
				Student1Map .put("Email", "john@example.com");
				Student1Map .put("Contact number", "9999988888");
				Student1Map .put("Address", "123 Elm");
				System.out.println("Member1 details "+Student1Map );


				//student  2 details 
				Map<String, String> Student2Map = new HashMap<String,String>();
				Student2Map.put("Name", "jane");
				Student2Map.put("Age", "21");
				Student2Map.put("Gender", "Female");
				Student2Map.put("Roll no ", "S12346");
				Student2Map.put("Grade ", "B");
				Student2Map.put("Major", "Maths");
				Student2Map.put("GPA", "3.5");
				Student2Map.put("Email", "jane@example.com");
				Student2Map.put("Contact number", "9876665666");
				Student2Map.put("Address", "456 Oak st");
				System.out.println("Member2 details "+Student2Map);

				//student 3 details 
				Map<String, String> Student3Map = new HashMap<String,String>();
				Student3Map.put("Name", "Mike");
				Student3Map.put("Age", "2");
				Student3Map.put("Gender", "Male");
				Student3Map.put("Roll no ", "S12347");
				Student3Map.put("Grade ", "A");
				Student3Map.put("Major", "Physics");
				Student3Map.put("GPA", "3.9");
				Student3Map.put("Email", "mike@example.com");
				Student3Map.put("Contact number", "8787876546");
				Student3Map.put("Address", "789 pine st");
				System.out.println("Member1 details "+Student3Map);

				//Employee 1 details 
				Map<String, String> Emp1Map = new HashMap<String,String>();
				Emp1Map.put("Empid", "E001");
				Emp1Map.put("Name", "Alice Green");
				Emp1Map.put("Age", "30");
				Emp1Map.put("Gender", "Female");
				Emp1Map.put("Department", "Engineering");
				Emp1Map.put("position", "Software Engineer");
				Emp1Map.put("Salary", "75000");
				Emp1Map.put("Email", "Alice@example.com");
				Emp1Map.put("Contact no", "9876543213");
				System.out.println("Employee1 details "+Emp1Map);


				//Employee 2 details 
				Map<String, String> Emp2Map = new HashMap<String,String>();
				Emp2Map.put("Empid", "E002");
				Emp2Map.put("Name", "Bob Johnson");
				Emp2Map.put("Age", "35");
				Emp2Map.put("Gender", "Male");
				Emp2Map.put("Department", "Markating");
				Emp2Map.put("position", "Markating manager");
				Emp2Map.put("Salary", "85000");
				Emp2Map.put("Email", "bob@example.com");
				Emp2Map.put("Contact no", "9876543214");
				System.out.println("Employee2 details "+Emp2Map);

				//Employee 3 details 
				Map<String, String> Emp3Map = new HashMap<String,String>();
				Emp3Map.put("Empid", "E003");
				Emp3Map.put("Name", "Carol White");
				Emp3Map.put("Age", "28");
				Emp3Map.put("Gender", "Female");
				Emp3Map.put("Department", "Sales");
				Emp3Map.put("position", "Sales Execuitive");
				Emp3Map.put("Salary", "65000");
				Emp3Map.put("Email", "carol@example.com");
				Emp3Map.put("Contact no", "9876543215");
				System.out.println("Employee2 details "+Emp3Map);


				//Product 1 details 
				Map<String, String> Product1Map = new HashMap<String,String>();
				Product1Map.put("Product id","P001");
				Product1Map.put("Name","Laptop");
				Product1Map.put("Category","Electornic");
				Product1Map.put("Price","$1,200");
				Product1Map.put("stock","50");
				Product1Map.put("supplier","Tech ");
				Product1Map.put("Warranty","2 years");
				Product1Map.put("Rating","4.5");
				Product1Map.put("Manufacturing date ","15-01-2023");
				Product1Map.put("Expiry date","15-01-2025");
				System.out.println("Product1 details "+Product1Map);


				//Product 2 details 
				Map<String, String> Product2Map = new HashMap<String,String>();
				Product2Map.put("Product id","P002");
				Product2Map.put("Name","Desk chair");
				Product2Map.put("Category","Furniture");
				Product2Map.put("Price","$150");
				Product2Map.put("stock","200");
				Product2Map.put("supplier","Office Depot");
				Product2Map.put("Warranty","1 years");
				Product2Map.put("Rating","4");
				Product2Map.put("Manufacturing date ","10-0-2023");
				Product2Map.put("Expiry date","N/A");
				System.out.println("Product1 details "+Product2Map);


				//Product 3 details 
				Map<String, String> Product3Map = new HashMap<String,String>();
				Product3Map.put("Product id","P003");
				Product3Map.put("Name","Cofee maker");
				Product3Map.put("Category","Kitchen");
				Product3Map.put("Price","$75");
				Product3Map.put("stock","100");
				Product3Map.put("supplier","Kitchen ");
				Product3Map.put("Warranty","6 months");
				Product3Map.put("Rating","4.2");
				Product3Map.put("Manufacturing date ","20-03-2023");
				Product3Map.put("Expiry date","20-03-2024");
				System.out.println("Product1 details "+Product3Map);


				//adding student details in list 
				List<Map<String, String>> Studentlist = new ArrayList<Map<String,String>>();
				Studentlist.add(Student1Map);
				Studentlist.add(Student2Map);
				Studentlist.add(Student3Map);

				//adding Employee details in list 
				List<Map<String, String>> Employeelist = new ArrayList<Map<String,String>>();
				Employeelist.add(Emp1Map);
				Employeelist.add(Emp2Map);
				Employeelist.add(Emp3Map);
				
				//adding product details in list 
				List<Map<String, String>> Productlist = new ArrayList<Map<String,String>>();
				Productlist.add(Product1Map);
				Productlist.add(Product2Map);
				Productlist.add(Product2Map);
				
				
				Map<String,List<Map<String,String>>> output = new HashMap<String,List<Map<String, String>>>();
				output.put("Student", Studentlist);
				output.put("Employee", Employeelist);
				output.put("Product", Productlist);
				System.out.println(output.get("Product").get(1).get("supplier"));

	}

}
