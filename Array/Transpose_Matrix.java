package array;
import java.util.*;
public class Transpose_Matrix {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int row,col, c,d;
		System.out.println("Enter the number of rows and columns");
		row=in.nextInt();
		col=in.nextInt();
		int matrix[][]=new int[row][col];
		System.out.println("Enter the Elements of matrix");
		for(c=0;c<row;c++)
			for(d=0;d<col;d++)
				matrix[c][d]=in.nextInt();

		int transpose[][]=new int[col][row];
		for(c=0;c<row;c++)
		{
			for(d=0;d<col;d++)
			{
				transpose[c][d]=matrix[d][c];
			}
		}
		//Printing transpose matrix
		for(c=0;c<row;c++)
		{
			for(d=0;d<col;d++)
			{
				System.out.print(transpose[c][d]+"\t");
			}
			System.out.println();
		}
	}
}
