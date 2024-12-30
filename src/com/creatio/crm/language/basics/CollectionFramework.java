package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFramework {

	public static void main(String[] args) {

		//array conecpts

		String [] empNames = new String [3];
		empNames[0] = "Mahendran";
		empNames[1] = "Akilan";
		empNames[2] = "Surendar";

		int [] empId = new int [3];
		empId[0] = 123;
		empId[1] = 456;
		empId[2] = 789;

		//to print array 
		System.out.println(empNames[0]);
		System.out.println(empId[0]);

		//to print the length of the value
		System.out.println(empNames.length);




		/********************** Array List*********/
		// syntax of initilize the Array lsit   -> List<Datatype> variable = new ArrayList<Datatype>
		//collection allow only non -premetive data type  to use primiive datatype we use wrapper class

		List<String> empnameArrayList= new ArrayList <String>();
		empnameArrayList.add("Mahendran");
		empnameArrayList.add("Kalai");
		empnameArrayList.add("Sarath");
		empnameArrayList.add("Ragavi"); 
		empnameArrayList.remove("Mahendran");
		int sizeAL=   empnameArrayList.size();
		System.out.println(sizeAL);
		System.out.println(empnameArrayList);
		
		
		/**********************  LinkedList*********/
		// syntax of initilize the LinkedList   -> List<Datatype> variable = new LinkedList<Datatype>
		//collection allow only non -premetive data type  to use primiive datatype we use wrapper class
		//first in first out 

		List<String> empnameLinkedList= new ArrayList <String>();
		empnameLinkedList.add("Mahendran");
		empnameLinkedList.add("Kalai");
		empnameLinkedList.add("Sarath");
		empnameLinkedList.add("Ragavi"); 
		empnameLinkedList.remove("Mahendran");
		int sizeLL=   empnameLinkedList.size();
		System.out.println(sizeLL);
		System.out.println(empnameLinkedList);
		
		
		/**********************  HashSet*********/
		// syntax of initilize the HashSet   -> List<Datatype> variable = new HashSet<Datatype>
		//collection allow only non -premetive data type  to use primiive datatype we use wrapper class
		//random base while execution
		//allow null value

		Set<String> empnameHashSet= new HashSet<String>();
		empnameHashSet.add("Mahendran");
		empnameHashSet.add("Kalai");
		empnameHashSet.add("Sarath");
		empnameHashSet.add("Ragavi"); 
		empnameHashSet.add("Kalai");
		empnameHashSet.remove("Mahendran");
		int sizeHS=   empnameHashSet.size();
		System.out.println(sizeHS);
		System.out.println(empnameHashSet);
		
		
		
		/**********************  LinkedHashSet*********/
		// syntax of initilize the LinkedHashSet   -> List<Datatype> variable = new LinkedHashSet<Datatype>
		//collection allow only non -premetive data type  to use primiive datatype we use wrapper class
		//Insertion  base while execution
		//allow null value

		Set<String> empnameLinkedHashSet= new HashSet<String>();
		empnameLinkedHashSet.add("Mahendran");
		empnameLinkedHashSet.add("Kalai");
		empnameLinkedHashSet.add("Sarath");
		empnameLinkedHashSet.add("Ragavi"); 
		empnameLinkedHashSet.add("Kalai");
		empnameLinkedHashSet.remove("Mahendran");
		int sizeLHS=   empnameHashSet.size();
		System.out.println(sizeLHS);
		System.out.println(empnameHashSet);
		
		
		
		/**********************  TreeSet  *********/
		// syntax of initilize the TreeSet   -> List<Datatype> variable = new TreeSet<Datatype>
		//collection allow only non -premetive data type  to use primiive datatype we use wrapper class
		//alphabetic order while execution
		//null value not allowed

		Set<String> empnameTreeSet= new HashSet<String>();
		empnameTreeSet.add("Mahendran");
		empnameTreeSet.add("Kalai");
		empnameTreeSet.add("Sarath");
		empnameTreeSet.add("Ragavi"); 
		empnameTreeSet.add("Kalai");
		empnameTreeSet.remove("Mahendran");
		int sizeTS=   empnameHashSet.size();
		System.out.println(sizeTS);
		System.out.println(empnameHashSet);

		
		
		
		

		/**********************  HashMap  *********/
		// syntax of initilize the HashMap   -> Map<Key, Value> variable = new HashMap<Key, Value>
		//collection allow only non -premetive data type  to use primiive datatype we use wrapper class
		// order while execution
		//null value not allowed

		Map<Integer,String> empnameHashMap= new HashMap<Integer, String>();
		empnameHashMap.put(1,"Mahendran");
		empnameHashMap.put(2,"Kalai");
		empnameHashMap.put(2,"Sarath");
		empnameHashMap.put(null,"Ragavi"); 
		empnameHashMap.put(3,"null");
		empnameHashMap.remove("Mahendran");
		int sizeHM=   empnameHashMap.size();
		System.out.println(sizeHM);
		System.out.println(empnameHashMap);
		
		

		/**********************  LinkedHashMap  *********/
		// syntax of initilize the LinkedHashMap   -> Map<Key, Value> variable = new LinkedHashMap<Key, Value>
		//collection allow only non -premetive data type  to use primiive datatype we use wrapper class
		// Insertion order while execution
		//null value not allowed

		Map<Integer,String> empnameLinkedHashMap= new HashMap<Integer, String>();
		empnameLinkedHashMap.put(1,"Mahendran");
		empnameLinkedHashMap.put(2,"Kalai");
		empnameLinkedHashMap.put(2,"Sarath");
		empnameLinkedHashMap.put(null,"Ragavi"); 
		empnameLinkedHashMap.put(3,"null");
		empnameLinkedHashMap.remove("Mahendran");
		int sizeLHM=   empnameLinkedHashMap.size();
		System.out.println(sizeLHM);
		System.out.println(empnameLinkedHashMap);

		
		
		/**********************  TreeMap  *********/
		// syntax of initilize the TreeMap   -> Map<Key, Value> variable = new TreeMap<Key, Value>
		//collection allow only non -premetive data type  to use primiive datatype we use wrapper class
		// assending  order ok key while execution
		//null key not allowed

		Map<Integer,String> empnameTreeMap= new HashMap<Integer, String>();
		empnameTreeMap.put(1,"Mahendran");
		empnameTreeMap.put(2,"Kalai");
		empnameTreeMap.put(2,"Sarath");
		empnameTreeMap.put(null,"Ragavi"); 
		empnameTreeMap.put(3,"null");
		empnameTreeMap.remove("Mahendran");
		int sizeTM=   empnameTreeMap.size();
		System.out.println(sizeTM);
		System.out.println(empnameTreeMap);





	}

}
