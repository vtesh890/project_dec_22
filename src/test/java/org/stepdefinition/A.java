package org.stepdefinition;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class A {

	public static void main(String[] args) {
//		// ID List or ID without Header
//		List<String>li=new LinkedList<String>();
//		li.add("venkatesh");
//		li.add("Raj");
//		li.add("Hari");
//		
//		String us = li.get(0);
//		System.out.println(us);
//		System.out.println(li.get(2));
		
// 2D List or 2D without Header
//		List<String>l1=new LinkedList<String>();
//		l1.add("venkatesh");
//		l1.add("902489");
//		List<String>l2=new LinkedList<String>();
//		l2.add("raj");
//		l2.add("6709210");
//		
//		List<String>l3=new LinkedList<String>();
//		l3.add("yuvaraj");
//		l3.add("789023");
//		
//       List<List<String>> list=new LinkedList<List<String>>();
//       list.add(l1); //0
//       list.add(l2); //1
//       list.add(l3); //2
//
//       // to get particular list
//       List<String>raj=list.get(1);
//       
//       // get particular value
//       String user = raj.get(0);
//       System.out.println(user);
//       System.out.println(raj.get(1));
	// 1D map or 1D with Header
		Map<String, String>mp=new LinkedHashMap<String, String>();
		mp.put("username", "venkatesh");
		mp.put("password", "90675");
		
		String user = mp.get("username");
		System.out.println(user);
		
		System.out.println(mp.get("password"));
//	 2D map or 2D with Header
		Map<String, String>mp1=new LinkedHashMap<String, String>();
		mp1.put("username", "venkatesh");
		mp1.put("password", "789023");
		
		Map<String, String>mp2=new LinkedHashMap<String, String>();
		mp2.put("username", "Raj");
		mp2.put("password", "569027");
		
		Map<String, String>mp3=new LinkedHashMap<String, String>();
		mp3.put("username","vikram");
		mp3.put("password", "073207");
		
		List<Map<String,String>>list=new LinkedList<Map<String,String>>();
		list.add(mp1);
		list.add(mp2);
		list.add(mp3);
		
		// to get particular user data or map from the list using index
          Map<String, String> vikram=list.get(2);
          
        // to get particular value by using map with key
          String user1 = vikram.get("username");
          System.out.println(user1);
          System.out.println(list.get(2).get("password"));
          
//		
		
		
			}

}
