package arrays;
import java.util.Scanner;
public class ArrayLab {
	public static void main(String[] args) {
	int arr[]=new int[] {1,2,3,4,1,6,7,1,9,10};
	double sum=0,avg;
	for(int i=0;i<arr.length;i++)
	{
		sum+=arr[i];
	}
	avg=sum/arr.length;
	System.out.println(avg);
	Scanner scan=new Scanner(System.in);
	String arr1[]=new String[] {"aa","ab","aa","aa","ad","ae","az","zz"};
	System.out.println("enter what you want to search :");
	String input=scan.nextLine();
	int count=0;
	for(String x:arr1)
	{
		if(x.equals(input))
		{
			count++;
		}
	}
	System.out.println("input is listed "+count+" times.");
	System.out.println("enter what number you want to search :");
	int input1=scan.nextInt();
	String result="";
	int start=0;
	for(int i=0;i<arr.length;i++)
	{
		if(input1==arr[i])
		{	
			start++;
			if(start!=1)
			{
			result+=",";	
			}
			result+=i;
		}
	}
	System.out.println("The input appears at index location "+result);
	scan.close();
}
}
