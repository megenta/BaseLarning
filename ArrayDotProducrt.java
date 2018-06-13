//Asked at Avanade for GS.
/*Write a program to find the dot product of two array
a = [1,2,3]
b = [1,2,3]
output = 1*1+2*2+3*3 = 1+4+9 = 14
import java.lang.*;
import java.util.Scanner;

public class Solution{
  
  
  public static void main(String Args[]){
    
    
   System.out.println("Enter in the size of the array= "); 
   Scanner input = new Scanner(System.in);
    
   int size =  input.nextInt();
    
   int[] arr1 = new int[size]; 
   int[] arr2 = new int[size]; 
    
   System.out.println("Enter in the 1st array= ");  
   for(int index1 =0 ; index1<size ; index1++){
     
     arr1[index1] = input.nextInt();
      
   }
   System.out.println("Enter in the 2nd array= ");  
  for(int index2 =0 ; index2<size ; index2++){
     
     arr2[index2] = input.nextInt();
      
   }
   
   //int[] arr1 = {1,2,3};
   //int[] arr2 = {1,2,3};
