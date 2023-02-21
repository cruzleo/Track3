package org.ssglobal.training.codes.itemB;

import java.time.LocalDate;

public class TestSportVisionShoppe {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		CyclingGlass cg = new CyclingGlass();
		
		String date = now.toString();
		cg.setCustOrderNo("Or1234");
		cg.setCustOrderDate(date);
		cg.setDepositPymt(500.00F);
		cg.setType_glass('T');
		cg.setUvProtection(true);
		System.out.println(cg.toString());
		System.out.println("Deposit: RM %.2f".formatted(cg.getDepositPymt()));
		System.out.println("Total Charge: RM %.2f".formatted(cg.calCharges()));
		
		System.out.println("------Swimming glass---------");
		SwimmingGlass sg = new SwimmingGlass();
		sg.setCustOrderDate(date);
		sg.setDepositPymt(600.00F);
		sg.setCustOrderNo("or94245");
		sg.setType('S');
		sg.setStyle("warrior");
		System.out.println(sg.toString());
		System.out.println("Deposit: RM %.2f".formatted(sg.getDepositPymt()));
		System.out.println("Total charge: RM %.2f".formatted(sg.calCharges()));
		
		
	}

}
