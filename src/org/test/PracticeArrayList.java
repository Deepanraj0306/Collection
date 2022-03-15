package org.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PracticeArrayList {
	public static void main(String[] args) {
		
		List<String> l=new ArrayList<>();
		l.add("BMW");
		l.add("Benz");
		l.add("Beneley");
		l.add("Jaguar");
		l.add("RollsRoyce");
		l.add("Honda");
		l.add("Null");
		l.add("Null");
		l.add("BMW");

		l.add("Hyundai");
		l.add("Volvo");

		
		System.out.println(l);
		int size = l.size();
		System.out.println(size);
		
		System.out.println("====for loop====");
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("====Enhanced loop====");
		
		for (String string : l) {
			System.out.println(string);
		}
		
		System.out.println("====Using ListIterator forward====");
		
		ListIterator<String> listIterator = l.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("====Using ListIterator previous====");
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		System.out.println("====Using Iterator====");
		
		Iterator<String> iterator = l.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("====Using Addall====");
		
		List<String> li=new ArrayList<>();
		li.addAll(l);
		System.out.println(li);
		
		l.add(7,"Kia");
		System.out.println(l);
		System.out.println(l.get(1));
		
		l.set(2,"Volvo");
		System.out.println(l);
		
		
	
	}
	
}
