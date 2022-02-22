package homework;
import java.util.Scanner;
public class Hw3 {
	static double userinput1,userinput2,output;
	static Scanner scan=new Scanner(System.in);
	static double addMethod()
	{	
		userinput1=scan.nextDouble();
		userinput2=scan.nextDouble();
		return userinput1+userinput2;
	}
	static double subtractMethod()
	{	
		userinput1=scan.nextDouble();
		userinput2=scan.nextDouble();
		return userinput1-userinput2;
	}
	static double multiplyMethod()
	{
		userinput1=scan.nextDouble();
		userinput2=scan.nextDouble();
		return userinput1*userinput2;
	}
	static double divideMethod()
	{
		userinput1=scan.nextDouble();
		userinput2=scan.nextDouble();
		return userinput1/userinput2;
	}	
	public static void main(String[] args) {
		System.out.println("Options");
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		System.out.println("5.Exit");
		System.out.println("enter your choice: ");
		int input=scan.nextInt();
		switch (input)
		{
		case 1:
			System.out.println("Addition: enter 2 numbers");
			output=addMethod();
			System.out.println(output);
			break;
		case 2:
			System.out.println("Subtract: enter 2 numbers");
			output=subtractMethod();
			System.out.println(output);
			break;
		case 3:
			System.out.println("Multiply: enter 2 numbers");
			output=multiplyMethod();
			System.out.println(output);
			break;
		case 4:
			System.out.println("Divide: enter 2 numbers");
			output=divideMethod();
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
