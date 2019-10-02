package org.ie.practice;

import java.util.*;
//LiftObject
class Lift{
  static int PREV_FLOOR=0;
  long floors;
  Set<Integer> liftButtonFromOutside;
  Set<Integer> liftButtonFromInside;
  Lift(long numberOfFloors){
      floors=numberOfFloors;
      liftButtonFromOutside= new TreeSet();
      liftButtonFromInside= new TreeSet();
      
  }
  //lift movement logic
   private String liftMovementForOutsideButtonPress(int floor){
       
       String arrival="";
//       if(liftButtonFromOutside.size()==0/*liftButtonFromOutside.size()==1*/){
//            PREV_FLOOR=floor;
//           return "lift will come directly to  "+floor;
//         
//       }
      
//else{
       //if lift is already in use
       //  prevfloor is above requested floor  
       if(PREV_FLOOR>floor){
           for(int i=PREV_FLOOR;i>=floor;i--){
               if(i==floor){
            	   liftButtonFromInside.remove(i);
             	   liftButtonFromOutside.remove(i);
                   arrival=arrival+"Reached "+floor+" floor, Doors opening";
                   System.out.println();
                   PREV_FLOOR=floor;
                   break;
               }
               else if(liftButtonFromInside.contains(i)&& PREV_FLOOR!=i) {
            	  // liftButtonFromOutside.remove(i);
            	   //System.out.println(liftButtonFromInside);
            	   arrival=arrival+"lift reached to "+i+" floor, Doors opening." +System.lineSeparator();
               }
               else{arrival=arrival+"lift is on "+i+" floor"+System.lineSeparator();}
           }
       }
       
      // prevfloor is below the requested floor
      else if(PREV_FLOOR<floor){
           for(int i=PREV_FLOOR;i<=floor;i++){
               if(i==floor){
            	   liftButtonFromInside.remove(i);
             	   liftButtonFromOutside.remove(i);
                   arrival=arrival+"Reached "+floor+" floor, , Doors opening"+System.lineSeparator();
                   System.out.println();
                   PREV_FLOOR=floor;
                   break;
               }
               else if(liftButtonFromInside.contains(i)&& PREV_FLOOR!=i) {
            	  // System.out.println(liftButtonFromInside);
            	   //liftButtonFromOutside.remove(i);
            	  // System.out.println(liftButtonFromInside);
            	   arrival=arrival+"lift reached to "+i+" floor, Doors opening." +System.lineSeparator();
               }
               else { arrival=arrival+"lift is on "+i+" floor"+System.lineSeparator();}
           }
      }
       
      //lift is already on requested floor
      else if(PREV_FLOOR==floor){
          System.out.println();
       arrival=arrival+"lift is already on "+floor+" DOORS OPENING";
      }
   return arrival;
    }

   public void pressButtonFromOutside(int floor){
       liftButtonFromOutside.add(floor);
       System.out.println(liftMovementForOutsideButtonPress(floor));
   }
   public void pressButtonFromInside(int floor) {
	   liftButtonFromInside.add(floor);
	   System.out.println(liftMovementForInsideButtonPress(floor));
   }
   
   //Lift movement when button pressed from inside lift
  private String liftMovementForInsideButtonPress(int floor) {
	  String arrival="";
//      if(liftButtonFromInside.size()==0/*liftButtonFromOutside.size()==1*/){
//           PREV_FLOOR=floor;
//          return "lift will come directly to  "+floor;
//        
//      }
      //if lift is already in use
//else{
     //  prevfloor is above requested floor  
      if(PREV_FLOOR>floor){
          for(int i=PREV_FLOOR;i>=floor;i--){
              if(i==floor){
            	  liftButtonFromInside.remove(i);
            	  liftButtonFromOutside.remove(i);
                  arrival=arrival+"Reached "+floor+" floor, Doors opening";
                  System.out.println();
                  PREV_FLOOR=floor;
                  break;
              }
              else if(liftButtonFromOutside.contains(i)&& PREV_FLOOR!=i) {
              // liftButtonFromInside.remove(i);
           	   arrival=arrival+"lift reached to "+i+" floor, Doors opening." +System.lineSeparator();
              }
              else{arrival=arrival+"lift is on "+i+" floor"+System.lineSeparator();}
          }
      }
     // prevfloor is below the requested floor
     else if(PREV_FLOOR<floor){
          for(int i=PREV_FLOOR;i<=floor;i++){
              if(i==floor){
            	  liftButtonFromInside.remove(i);
            	  liftButtonFromOutside.remove(i);
                  arrival=arrival+"Reached "+floor+" floor, , Doors opening"+System.lineSeparator();
                  System.out.println();
                  PREV_FLOOR=floor;
                  break;
              }
              else if(liftButtonFromOutside.contains(i)&& PREV_FLOOR!=i) {
            	 // liftButtonFromInside.remove(i);
           	   arrival=arrival+"lift reached to "+i+" floor, Doors opening." +System.lineSeparator();
              }
              else { arrival=arrival+"lift is on "+i+" floor"+System.lineSeparator();}
          }
     }
     //lift is already on requested floor
     else if(PREV_FLOOR==floor){
         System.out.println();
      arrival=arrival+"U r not allowed to press Same floor from inside";
     }
  return arrival;
      //}
  }
}
   

