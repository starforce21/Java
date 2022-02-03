import java.util.Scanner;
class Userinput{
    public static void main(String agrs[]){
        int inum;
        long lnum;
        float fnum;
        double dnum;
        char onechar;
        String name;
        String address;
        String zip;
        boolean choice;

        Scanner scan= new Scanner(System.in);
        System.out.println("enter any integer number : ");
        inum=scan.nextInt();
        System.out.println("enter any long number : ");
        lnum=scan.nextLong();
        System.out.println("enter any decimal number : ");
        fnum=scan.nextFloat();
        System.out.println("enter any long decimal number : ");
        dnum=scan.nextDouble();
        System.out.println("enter true or false number : ");
        choice=scan.nextBoolean();
        System.out.println("enter your name : ");
        name = scan.next();
        scan.nextLine();
        System.out.println("enter your address : ");
        address= scan.nextLine();
        System.out.println("enter your zip code : ");
        zip= scan.nextLine();

        System.out.println(inum);
        System.out.println(lnum);
        System.out.println(fnum);
        System.out.println(dnum);
        System.out.println(choice);
        System.out.println(name);
        System.out.println(address);
        System.out.println(zip);
    }
}