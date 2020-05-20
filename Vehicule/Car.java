package Vehicule;

public class Car extends Vehicule {

	public Car(String brand, int kilometers) {
		super(brand, kilometers);
		
	}

	@Override
	public String doStuff() {
		
		return "Je suis" +" "+ getBrand() + " "+"et je fait vroom vroom";
	}
	
	

}
