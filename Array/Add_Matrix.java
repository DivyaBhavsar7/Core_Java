package array;
import java.util.*;
public class Add_Matrix {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		System.out.println("Enter the rows and columns of Matrix");
		int row=in.nextInt();
		int col=in.nextInt();
		
		int first[][]=new int[row][col];
		int second[][]=new int[row][col];
		int sum[][]=new int[row][col];
		
		System.out.println("Enter the elements of First Matrix");
		for(int c=0;c<row;c++)
		{
			for(int d=0;d<col;d++)
			{
				first[c][d]=in.nextInt();
			}
		}
		System.out.println("Enter the elements of Second Matrix");
		for(int c=0;c<row;c++)
		{
			for(int d=0;d<col;d++)
			{
				second[c][d]=in.nextInt();
			}
		}
		//adding of matrix
		for(int c=0;c<row;c++)
		{
			for(int d=0;d<col;d++)
			{
				sum[c][d]=first[c][d]+second[c][d];
			}
		}
		System.out.println("Sum of Entered Matrix");
		for(int c=0;c<row;c++)
		{
			for(int d=0;d<col;d++)
			{
				System.out.print(sum[c][d]+"\t"); 
			}
			System.out.println();
		}
	}
}
