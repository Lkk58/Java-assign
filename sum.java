/*
sum of two numbers
Author:Lenah Kanana.
Reg no:CT101/G/20075/23
Date:22-Jan-2025
assignment 2
*/
 import java.util.Scanner; //import a scanner

 public class Sum{
     public static void main(String[]args){
         Scanner myOBJ= new Scanner(System.in);
         
         //request user to enter the value of num 1
         System.out.print("Enter first value: ");
         double number1 = myOBJ.nextDouble();
 
         //request user to enter value of num 2
         System.out.print("Enter second value: ");
         double number2 = myOBJ.nextDouble();
 
         //initialize sum to add the two numbers
         double sum;
         sum=number1+number2;
 
         //print out the sum of the two numbers
         System.out.println("The sum is: " + sum);
 
         //close scanner
         myOBJ.close();
     }
 }