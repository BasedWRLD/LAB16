// Kevin Lynch
// LAB 16
// November 17th, 2020

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ArrayPractice
{
    public static void main(String[] args)
  {

  String filename = "numbers.txt";
  Scanner fileIn = null;
  
  try
  {
   fileIn = new Scanner (new FileInputStream(filename));
  }
  catch (FileNotFoundException e)
  {
   System.out.println("Cannot open file " + filename);
   System.exit(0);
  }
  
  int rows = fileIn.nextInt();
  int columns = fileIn.nextInt();
  int lowest = 0;
  int[] rowmax = new int [rows];
  int[] columnmax = new int [columns];
  
  int[][] number = new int [rows][columns];
  
   for (int row = 1; row <= rows; row++)
   {
     System.out.println();
          
            
      for (int column = 1; column <= columns; column++)
      {
      number[row-1][column-1] = fileIn.nextInt();
        
         if (number[row-1][column-1] < lowest){
            lowest = (number[row-1][column-1]);}
         
         if (number[row-1][column-1] > rowmax[row-1]){
            rowmax[row-1] = (number[row-1][column-1]);}
         
         if (number[row-1][column-1] > columnmax[column-1]){
            columnmax[column-1] = (number[row-1][column-1]);}
    
      System.out.print(" "+(number[row-1][column-1])+" ");
      }
   }
  System.out.println();
  System.out.println(" The lowest number is " + lowest);
  System.out.println();
  for (int row = 1; row <= rows; row++){
   System.out.println(" Maximum of row " + row + ": " + rowmax[row-1]);}
  System.out.println();
  for (int column = 1; column <= columns; column++){
   System.out.println(" Maximum of column " + column + ": " + columnmax[column-1]);}
  
  
  }
  
}