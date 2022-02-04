import java.util.Scanner;
public class Hw2{
    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in);
        int n,fZero,fOne,result;
        fZero=0;
        fOne=1;
        System.out.println("enter your n value :");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            result=fZero+fOne;
            fZero=fOne;
            fOne=result;
            System.out.print(result);
            if(i!=n)
            {
                System.out.print(',');
            }
        }
        System.out.println();
        scan.nextLine();
        String input,newStr;
        System.out.println("enter your word to check :");
        input=scan.nextLine();
        newStr=input.toLowerCase();
        int j=input.length()-1;
        int counter=0;
        for(int i=0;i<j;i++)
        {   
            if(newStr.charAt(i)!=newStr.charAt(j))
            {
                counter++;
            }
            j--;
        }
        System.out.println(input+(counter==0? " is a palindrome": " is not a palindrome"));
        System.out.println("enter your number to check :");
        int sum,num;
        String str;
        sum=0;
        str=scan.nextLine();
        num=Integer.parseInt(str);
        for(int i=0;i<=str.length()-1;i++)
        {
            sum+=Math.pow(Character.getNumericValue(str.charAt(i)),str.length());
        }
        System.out.println(num+(num==sum? " is armstrong number":" is not armstrong number"));
    }
}