package OOPConcepts;

public class Starting1 {

	public static void main(String[] args) {
		Person1 p1=new Person1();
		Person1 p2=new Person1();
		Person1 p3=new Person1();
		p1.setPname("Hulk");
		p1.setSalary(60000);
		p1.setJob("smash");

		p2.setPname("Thor");
		p2.setSalary(90000);
		p2.setJob("shock");
		
		p3.setPname("Spooderman");
		p3.setSalary(60000);
		p3.setJob("Impersonate");
		
		System.out.println("Name: "+p1.getPname());
		System.out.println("Salary: "+p1.getSalary());
		Person1.counter();
	}

}
