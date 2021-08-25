package arrays1Dand2D;
import java.util.Scanner;
public class MaximumElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows; 

		  int columns;

		  Scanner scanner = new Scanner (System.in);

		  rows = scanner.nextInt(); 

		  columns = scanner.nextInt(); 

		  int[][] matrix = new int [rows][columns];

		  for (int i = 0; i < rows; i++) 

		  {

		     for (int j = 0; j < columns; j++) 

		     {

		         matrix[i][j] = scanner.nextInt();

		     }

		  }

		  int maxNum = matrix[0][0];

		  for (int i = 0; i < matrix.length; i++) 

		  {

		   for (int j = 0; j < matrix[i].length; j++) 

		   {

		    if(maxNum < matrix[i][j])

		    {

		     maxNum = matrix[i][j];

		    }

		   }

		  }

		  System.out.println(maxNum);

		 }

		}