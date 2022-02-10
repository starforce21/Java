package OOPConcepts;
import java.util.Scanner;
public class Labw2d1 {
	String id,fname, lname,email;
	double score1,score2,score3;
	double avg;
	int length,width,area;

	public Labw2d1(String id, String fname, String lname, String email, double score1, double score2, double score3) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}
	
	public Labw2d1(int length, int width) {
		this.length = length;
		this.width = width;
	}
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		Labw2d1 s1= new Labw2d1("0001","Todd","Hopkins","Thop@gmail.org",90.5,80.0,70.0);
		Labw2d1 s2= new Labw2d1("0002","Mario","Wells","Wario@gmail.org",80.3,80.5,100.0);
		s1.display();
		System.out.println("The average score for this student is: "+s1.avg());
		s2.display();
		System.out.println("The average score for this student is: "+s2.avg());
		
		System.out.println("enter dimension of your 1st rectangle.");
		int userinput1=scan.nextInt();
		int userinput2=scan.nextInt();
		System.out.println("enter dimension of your 2nd rectangle.");
		int userinput3=scan.nextInt();
		int userinput4=scan.nextInt();
		Labw2d1 rec1= new Labw2d1(userinput1,userinput2);
		Labw2d1 rec2= new Labw2d1(userinput3,userinput4);
		System.out.println("The area of your 1st rectangle is: "+rec1.area());
		System.out.println("The area of your 2nd rectangle is: "+rec2.area());
		scan.close();
		
	}
	
	public void display() {
		System.out.println("Student ID: "+id);
		System.out.println("Student Name: "+fname+" "+lname);
		System.out.println("Student Email: "+email);
		System.out.println("Subject 1 Score: "+score1);
		System.out.println("Subject 2 Score: "+score2);
		System.out.println("Subject 3 Score: "+score3);
	}
	public double avg() 
	{
		return avg=(score1+score2+score3)/3;
	}
	public int area() {
		return area=length*width;
	}
	
}
