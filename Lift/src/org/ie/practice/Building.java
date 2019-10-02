package org.ie.practice;

public class Building {
	     Lift lift;
	     long numberOfFloors;
	     Building(long numberOfFloors){
	         this.numberOfFloors=numberOfFloors;
	     }
	   
	    public  Lift getLift(){
	        lift=new Lift(numberOfFloors);
	        return lift;
	    }
	}
