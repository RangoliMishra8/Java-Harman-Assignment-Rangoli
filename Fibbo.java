package question1;

import java.io.*;

public class Fibbo {
 public static void main (String[] args) {
  
  fibonacciSeriesAndAvg(20);
 }
 
 private static void fibonacciSeriesAndAvg(int n){
     
     int n1=1,n2=0,next;
     if(n<0)
     return ;
     int sum=0;
     
     for(int i=0;i<n;i++)
     {
         next=n1+n2;
         sum+=next;
         System.out.print(next+" ");
         n1=n2;
         n2=next;
     }
     System.out.println();
     System.out.println((float)sum/20);
   
 }
}
