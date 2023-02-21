package org.ssglobal.training.codes.itemA;

public class TestCityEntry {

	public static void main(String[] args) {
		BusinessEntry busEntry = new BusinessEntry();
		GovernmentEntry govEntry = new GovernmentEntry();
		ResidentialEntry resEntry = new ResidentialEntry();
		
		busEntry.setCity("Malolos");
		System.out.println(busEntry.getCity());
		
		govEntry.setState("Bulacan");
		System.out.println(govEntry.getState());
		
		resEntry.setName("Leo Cruz");
		System.out.println(resEntry.getName());
	}

}
