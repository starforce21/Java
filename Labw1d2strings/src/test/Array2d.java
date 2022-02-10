package test;
import java.util.Scanner;
public class Array2d{

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
//	int[][] num1=new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	int[][] num2=new int[3][3];
	System.out.println("start entering values: ");
	for(int row=0;row<num2.length;row++)
	{
		for(int col=0;col<num2[row].length;col++)
		{
			num2[row][col]=scan.nextInt();
		}
	}
	// displaying array values
	for(int row=0;row<num2.length;row++)
	{
		for(int col=0;col<num2[row].length;col++)
		{
			System.out.print(num2[row][col]);
		}
		System.out.println();
	}
//	for(int[] num:num2)
//	{
//		for(int innerNum:num)
//		{
//			System.out.print(innerNum+" ");
//		}
//		System.out.println();
//		}
	scan.close();
	}
}
