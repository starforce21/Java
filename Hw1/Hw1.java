public class Hw1{
    public static void main(String args[]){
        int grade,switchInt,num;
        grade=50;
        switchInt=7;
        num=1;
        if(grade>89)
        {
            System.out.println('A');
        }
        else if(grade>79)
        {
            System.out.println('B');
        }
        else if(grade>69)
        {
            System.out.println('C');
        }
        else if(grade>54)
        {
            System.out.println('D');
        }
        else
        {
            System.out.println('F');
        }
        switch(switchInt){
            case 1:System.out.println("Monday");
            break;
                case 2:System.out.println("Tuesday");
            break;
                case 3:System.out.println("Wednesday");
            break;
                case 4:System.out.println("Thursday");
            break;
                case 5:System.out.println("Friday");
            break;
                case 6:System.out.println("Saturday");
            break;
                case 7:System.out.println("Sunday");
            break;
            default:System.out.println("Invalid Input");
            break;
        }
        if(num%2==0)
        {
            if(num<6)
            {
                System.out.println("Not cool");
            }
            else if(num<21)
            {
                System.out.println("Cool");
            }
            else
            {
                System.out.println("Not cool");
            }
        }
        else
        {
            System.out.println("Cool");
        }
    }
}