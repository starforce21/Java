package OOPConcepts;

public class Player2 {
	static String country="USA";
	String name;
	String sport;
	int keynum;
	String rank;
	boolean active;
	char gender;
	
	 //empty constructor
	public Player2() {}
	
	// parameterised constructor here
	public Player2(String name ,String sport, int keynum, String rank, boolean active, char gender)
	{
		this.name=name;
		this.sport=sport;
		this.keynum=keynum;
		this.rank=rank;
		this.active=active;
		this.gender=gender;
	}
	
	// defining object methods
	public void display(Player2 p)
	{
	   System.out.println("player name :"+p.name);
	   System.out.println("player rank :"+p.rank);
	   System.out.println("Is the player active :"+p.active);
	   System.out.println();
	  // System.out.println("player country :"+ country); 
	   
	}
	
	
	
	public void display()
	{
		   System.out.println("player name :"+name);
		   System.out.println("player rank :"+rank);
		   System.out.println("Is the player active :"+active);
		   System.out.println();
	}
	
	
	 public static void country()
	 {
		 System.out.println("Displaying  all the players from :"+ country);
		 System.out.println();
		 
	 }
	
	
	public static void main(String[] args) {
		 
		Player2 p1 = new Player2();
		Player2 p2 = new Player2();
		
		Player2 p3 = new Player2("Robert","Baseball",99,"first base",true,'M');
		
		p1.name = "Jack";
		p1.sport ="Football";
		p1.keynum = 99;
		p1.rank = "Ex team leader";
		p1.active = false;
		p1.gender = 'M';
		
		p2.name = "Sophie";
		p2.sport ="Soccer";
		p2.keynum = 99;
		p2.rank = "Attacker";
		p2.active = true;
		p2.gender = 'F';
		
		country();
		
       p1.display(p1);
       p2.display(p2);
       p3.display();
       
     
		
	}
	
	

}
