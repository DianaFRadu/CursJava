package Curs7;
//deer este un animal, deci este copil pentru clasa Animal
	
public class Deer extends Animal {

	
	@Override
	public void makeSound() {	
		System.out.println("Meee !!!");
	}
	
	public void eatGrass() {
		System.out.println("I like eating grass!");
	}
	
}
