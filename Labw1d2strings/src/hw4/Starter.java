package hw4;

public class Starter {

	public static void main(String[] args) {
		Computer c1=new Computer();
		Computer c2=new Computer();
		Computer c3=new Computer();
		c1.setBrand("IBUYPOWER");
		c1.setYear(2021);
		c1.setPrice(1500);
		c2.setBrand("CyberPowerPC");
		c2.setYear(2021);
		c2.setPrice(1000);
		c3.setBrand("Digital Storm");
		c3.setYear(2021);
		c3.setPrice(500);
		System.out.println("Brand: "+c1.getBrand());
		System.out.println("Year: "+c1.getYear());
		System.out.println("Price: "+c1.getPrice());
		System.out.println();
		System.out.println("Brand: "+c1.getBrand());
		System.out.println("Year: "+c1.getYear());
		System.out.println("Price: "+c1.getPrice());
		System.out.println();
		System.out.println("Brand: "+c1.getBrand());
		System.out.println("Year: "+c1.getYear());
		System.out.println("Price: "+c1.getPrice());
		Computer.avgPrice();
		Computer.GPU();
	}

}
