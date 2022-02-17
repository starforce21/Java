package hw5;

public class Student extends Person{
	int cohort;
	public Student(int age,String name,int cohort)
	{
		super(age,name);
		this.cohort=cohort;
	}
	void display()
	{
		System.out.println("This student is "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Cohort: "+this.cohort);
	}
}
