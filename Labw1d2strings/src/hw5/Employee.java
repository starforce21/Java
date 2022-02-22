package hw5;

public class Employee extends Person{
	int salary;
	String job;
	public Employee(int salary,String job,int age,String name) 
	{
		super(age,name);
		this.salary=salary;
		this.job=job;
	}
	void display()
	{
		System.out.println("This employee is "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Job: "+this.job);
		System.out.println("Salary: "+this.salary);
	}
}
