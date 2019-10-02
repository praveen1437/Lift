package org.ie.practice;

import java.util.TreeSet;

public class User {
	    public static void main(String[] args){
	    Building building= new Building(10);
	    Lift lift= building.getLift();
	  //  System.out.println(lift);
//	   TreeSet <Integer> t= new TreeSet();
//	   t.add(3);
//	   t.add(5);
//	   t.add(4);
//	   System.out.println(t);
//	   t.remove(4);
//	   System.out.println(t);
	   
		
          lift.pressButtonFromOutside(4);
		  lift.pressButtonFromInside(1);
		  lift.pressButtonFromInside(3);
		 lift.pressButtonFromOutside(0);
     	  lift.pressButtonFromOutside(2);
     	  lift.pressButtonFromInside(2);
     	  lift.pressButtonFromInside(3);
		  
		 
		 
		
//		  lift.pressButtonFromOutside(0); 
//		  lift.pressButtonFromOutside(5);
//		  lift.pressButtonFromInside(3); 
//		  lift.pressButtonFromOutside(5);
//		  lift.pressButtonFromOutside(4);
		 
	 }

}
