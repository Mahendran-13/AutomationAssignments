package com.assessment.java;

public class Assesment3EmpGroup {



	public static void main(String[] args) {
		
		Assesment3Employee obj = new Assesment3Employee();
		
		String [] ename = new String [3];
		int [] eid= new int [3];
		
		ename[0]= obj.empname[0];
		ename[1]= obj.empname[1];
		ename[2]= obj.empname[2];
		eid[0]= obj.empid[0];
		eid[1]= obj.empid[1];
		eid[2]= obj.empid[2];
		System.out.println("Employee name :"+ename[0]+" Employee id :"+eid[0]);
		System.out.println("Employee name :"+ename[1]+" Employee id :"+eid[1]);	
		System.out.println("Employee name :"+ename[2]+" Employee id :"+eid[2]);
		
	}




}
