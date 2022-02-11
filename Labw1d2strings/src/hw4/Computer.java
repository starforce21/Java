package hw4;

public class Computer {
	static int count=0,totalPrice=0;
	private String brand;
	private int year;
	private double price;
	public Computer(){
		count++;
	}
	public static void avgPrice() 
	{
		System.out.println(totalPrice/count);
	}
	public static void GPU() 
	{
		System.out.println("These computer all have Rtx 3050.");
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		totalPrice+=price;
	}
	
}
