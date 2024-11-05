package Name1;
import java.util.Scanner;
public class CarPool
{
   public static void main(String args[])
   {
      Scanner keyboard = new Scanner(System.in);
      double totalMiles;
      double costPer;
      double averageMiles;
      double parking;
      double tolls;
      double total;
      
      // ask user to input daily costs of driving 
      System.out.print("Enter total miles driven per day: ");
      totalMiles = keyboard.nextDouble();
      System.out.print("Enter cost per gallon of gasoline: ");
      costPer = keyboard.nextDouble();
      System.out.print("Enter average miles per gallon: ");
      averageMiles = keyboard.nextDouble();
      System.out.print("Enter parking fees per day: ");
      parking = keyboard.nextDouble();
      System.out.print("Enter tolls per day: ");
      tolls = keyboard.nextDouble();
      
      // calculate the total cost of driving per day and prints the totals 
      total = (totalMiles / averageMiles) * costPer + parking + tolls;
       System.out.printf("Cost per day of driving to work: %.2f", total);
   }
}