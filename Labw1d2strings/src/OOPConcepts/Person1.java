package OOPConcepts;

public class Person1 {
	static int count=0;
	private String pname;
	private double salary;
	private String job;
	public Person1()
	{
		count++;
	}
	public static void counter() {
		System.out.println(count);
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
}
