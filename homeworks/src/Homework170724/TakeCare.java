package Homework170724;

import java.util.List;

import java.util.Arrays;

public class TakeCare {

	public static void main(String[] args) {
		
		List<Pet> pets = Arrays.asList(new Cat(), new Rat());
		
		for (Pet pet : pets) {
			pet.play();
			System.out.println("---");
			pet.feed();
			System.out.println("---");
			pet.feed();
			System.out.println("---");
			pet.play();
			System.out.println("---");
			pet.comb();
			System.out.println("---");
			pet.comb();
			System.out.println("---");
			pet.feed();
			System.out.println("---");
			pet.wash();
			System.out.println("---");
		}
		
		
	}

}
