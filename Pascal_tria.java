package question4;

/*JAVA PROGRAM TO GENERATE PASCAL TRIANGLE IN 1D ARRAY */
import java.util.*;

public class Pascal_tria
{
     public static void main(String []args)
     {
         Scanner sc=new Scanner(System.in);   //Take input from the user
         int i, j, k, l, r;            //Declarig Variabless 
          int a[]=new int[30];     //Declare a 1d array
         
         System.out.println("Enter the number of rows ");
         r=sc.nextInt();      //Initialize the number of rows
    
         //For Pascal Triangle
         for(i=0;i<r;i++)   //Iterate through all the rows
		 {
			for(k=r; k>i; k--)    //Print the number of spaces
			{
				System.out.print(" ");
			}
            a[i] = 1;   //Initialize the first element of each row as 1
			for(j=0;j<=i;j++)    //To find the Pascal triangle element
			{
				 System.out.print(a[i]+ " ");    //Print the array elements
                 a[i] = a[i] * (i - j) / (j + 1);   //Store the pascal triangle elements in an array
			}
			System.out.println();   //To move to the next line
		 }
        
     }
}