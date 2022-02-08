package homework;
import java.util.Scanner;
public class Hw3 {
	static double addMethod(double x,double y)
	{
		return x+y;
	}
	static double subtractMethod(double x,double y)
	{
		return x-y;
	}
	static double multiplyMethod(double x,double y)
	{
		return x*y;
	}
	static double divideMethod(double x,double y)
	{
		return x/y;
	}	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Options");
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		System.out.println("5.Exit");
		System.out.println("enter your choice: ");
		int input=scan.nextInt();
		double userinput1,userinput2,output;
		switch (input)
		{
		case 1:
			System.out.println("Addition: enter 2 numbers");
			userinput1=scan.nextDouble();
			userinput2=scan.nextDouble();
			output=addMethod(userinput1,userinput2);
			System.out.println(output);
			break;
		case 2:
			System.out.println("Subtract: enter 2 numbers");
			userinput1=scan.nextDouble();
			userinput2=scan.nextDouble();
			output=subtractMethod(userinput1,userinput2);
			System.out.println(output);
			break;
		case 3:
			System.out.println("Multiply: enter 2 numbers");
			userinput1=scan.nextDouble();
			userinput2=scan.nextDouble();
			output=multiplyMethod(userinput1,userinput2);
			System.out.println(output);
			break;
		case 4:
			System.out.println("Divide: enter 2 numbers");
			userinput1=scan.nextDouble();
			userinput2=scan.nextDouble();
			output=divideMethod(userinput1,userinput2);
			System.out.println(output);
			break;
		case 5:
			System.out.println("Exiting Program");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Entry, Try Again, Exiting Program");
			System.exit(0);
			break;
		}

	}

}
