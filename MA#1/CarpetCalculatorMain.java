/*
Jocelyn Borovich
CptS 233: MicroAssignment #1
9/4/2020
gitRepo url: https://github.com/joceboro/CptS233/tree/master/MA%231
*/

import java.util.*;

public class CarpetCalculatorMain {

    public static void main(String[] args) {
    
      Scanner scanner = new Scanner(System.in);
  
      RoomCarpet carpet = new RoomCarpet();
      
      //get length of room
      System.out.println("Enter the length of the room");
      carpet.size.length = scanner.nextDouble();
      
      //get width of room
      System.out.println("Enter the width of the room");
      carpet.size.width = scanner.nextDouble();
      
      double area = carpet.size.getArea();
      
      //get the cost per square foot of carpet
      System.out.println("Enter the cost per square foot of of carpet");
      carpet.carpetCost = scanner.nextDouble();
      
      System.out.println("Your total cost of carpet is $" + carpet.totalCost());    
      
    }

}
