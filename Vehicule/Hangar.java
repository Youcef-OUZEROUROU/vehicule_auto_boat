package Vehicule;

public class Hangar {

	public static void main(String[] args) {
		
		Car golf = new Car ("golf", 125);
		System.out.println(golf.doStuff());
		
		Boat royalnavy = new Boat ("royalnavy", 30);
		System.out.println(royalnavy.doStuff());
		
	}

}
