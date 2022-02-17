package hw5;
import java.util.Scanner;
public class Person implements PersonInterface{
	int age;
	String name;
	public Person(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter age and salary this empolyee :");
		int inputAge=scan.nextInt();
		int inputSalary=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter name of this empolyee :");
		String inputName=scan.nextLine();
		System.out.println("Enter position of this empolyee :");
		String inputJob=scan.nextLine();
		Employee emp1=new Employee(inputSalary,inputJob,inputAge,inputName);
		emp1.display();
		System.out.println("Enter age and cohort this Student :");
		inputAge=scan.nextInt();
		int inputCohort=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter name of this student :");
		inputName=scan.nextLine();
		Student stu1=new Student(inputAge,inputName,inputCohort);
		stu1.display();
		Person1 p1=new Person1(inputAge,inputName);
		System.out.println("Enter Height in cm and Weight in kg for this student :");
		int inputHeight=scan.nextInt();
		int inputWeight=scan.nextInt();
		scan.nextLine();
		p1.setHeight(inputHeight);
		p1.setWeight(inputWeight);
		System.out.println(p1.name+" is "+p1.getHeight()+" cm tall and "+p1.getWeight()+" kg heavy.");
		System.out.println("That is "+p1.calculate(p1.getWeight())+" in pounds");
		System.out.println("Employee 1 have a expected net worth of "+emp1.wealth(emp1.age,emp1.salary));
		System.out.println("All these people are from "+organization);
	}
	void display() 
	{
		System.out.println("This is the Person Class");
	}
	public double calculate(int value)
	{	
		double lbs=value*2.2046226218;
		return (double)(Math.round(lbs*100))/100;
	}
	public double wealth(int age,int salary)
	{	
		double wealth=(.25*salary)*Math.pow(1.07,65-age);
		return Math.round(wealth);
	}
}
