package org.ssglobal.training.codes.itemC;

public class TestMammal {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Monkey monkey = new Monkey();
		Whale whale = new Whale();
		
		System.out.println("Does cat gives milk: %s".formatted(cat.givesMilk()));
		System.out.println("what sound does cat make: %s".formatted(cat.makeSound()));
		System.out.println("Does cat give birth: %s".formatted(cat.giveLiveBirth()));
		System.out.println("------------------------------------");
		System.out.println("Does monkey gives milk: %s".formatted(monkey.givesMilk()));
		System.out.println("what sound does monkey make: %s".formatted(monkey.makeSound()));
		System.out.println("Does monkey give birth: %s".formatted(monkey.giveLiveBirth()));
		System.out.println("------------------------------------");
		System.out.println("Does whale gives milk: %s".formatted(whale.givesMilk()));
		System.out.println("what sound does whale make: %s".formatted(whale.makeSound()));
		System.out.println("Does whale give birth: %s".formatted(whale.giveLiveBirth()));

	}

}
