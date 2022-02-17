package hw5;

public class Person1 extends Person{
	private int height;
	private int weight;
	public Person1(int age,String name)
	{
		super(age,name);
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
