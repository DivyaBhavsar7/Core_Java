package array;
import java.util.*;
public class Multiply_Matrix {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int c,d,k, sum=0;
		//Scan the First Matrix
		System.out.println("Enter the rows and Columns of First Matrix");
		int row1=in.nextInt();
		int col1=in.nextInt();
		int first[][]=new int[row1][col1];
		System.out.println("Enter the elements of First Matrix");
		for(c=0;c<row1;c++)
			for(d=0;d<col1;d++)
				first[c][d]=in.nextInt();
			
		//Scan Second Matrix
		System.out.println("Enter the rows and Columns of Second Matrix");
		int row2=in.nextInt();
		int col2=in.nextInt();
		if(col1!=row2)
			System.out.println("Can't Multiply The matrix");
		else
		{
		int second[][]=new int[row2][col2];
		int multiple[][]=new int[row1][col2];
		//Scan the Second Matrix
		System.out.println("Enter the elements of Second Matrix");
		for(c=0;c<row2;c++)
			for(d=0;d<col2;d++)
				second[c][d]=in.nextInt();
			
		//Multiplication of Matrix
		for(c=0;c<row1;c++)
		{
			for(d=0;d<col2;d++)
			{
				for(k=0;k<col1;k++)
				{
					sum=sum+first[c][k]*second[k][d];
				}
				multiple[c][d]=sum;
				sum=0;
			}
		}
		System.out.println("Multiplied Matrix:");
		for(c=0;c<row1;c++)
		{
			for(d=0;d<col2;d++)
				System.out.print(multiple[c][d]+"\t");
		    System.out.println();
		}
		}
	}
}
