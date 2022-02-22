package strings;
import java.util.Scanner;
public class Lab {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input,str="Hello World";
		System.out.println("enter a string: ");
		input=scan.nextLine();
		System.out.println(input.length());
		int i=0;
		while(i<=str.length()-1)
		{
			System.out.print(str.charAt(i));
			i++;
		}
		System.out.println();
		String input2,input3;
		System.out.println("enter a string: ");
		input2=scan.nextLine();
		System.out.println("enter another string: ");
		input3=scan.nextLine();
		boolean result=input2.equalsIgnoreCase(input3);
		System.out.println("The 2 string is equal :"+result);
		for(int j=input.length()-1;j>=0;j--)
		{
			System.out.print(input.charAt(j));
		}
		System.out.println();
		String vowels="aeiou",newStr=input.toLowerCase();
		int cVows=0,cCons = 0;
		for(int j=0;j<=newStr.length()-1;j++)
		{
			if(vowels.indexOf(newStr.charAt(j))>-1)
			{
				cVows++;
			}
			else
			{
				cCons++;
			}
		}
		System.out.println("Number of Vowels: "+ cVows);
		System.out.println("Number of Consonants: "+ cCons);
		scan.close();
	}

}
