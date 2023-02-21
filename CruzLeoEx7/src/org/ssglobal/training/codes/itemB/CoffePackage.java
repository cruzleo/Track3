package org.ssglobal.training.codes.itemB;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CoffePackage {
	final BigDecimal pricePerBag = new BigDecimal("5.5");
	final BigDecimal LARGE_BOX =  new BigDecimal("1.2");
	final BigDecimal MEDIUM_BOX =  new BigDecimal("1.0");
	final BigDecimal SMALL_BOX =  new BigDecimal("0.6");
	
	public void computeBox() {
		Scanner scan = new Scanner(System.in);
		boolean isTrue = true;
		
		while (isTrue) {
			DecimalFormat format2 = new DecimalFormat("\u0024 ###,##0.00");
			
			System.out.print("Enter number of bags to order: ");
			BigDecimal numBox = scan.nextBigDecimal();
		
			BigDecimal orderPrice = numBox.multiply(pricePerBag);
			String orderPrcStr = format2.format(orderPrice);
			System.out.println("Number of Bags Ordered: %s - %s".formatted(numBox, orderPrcStr));
		
			BigDecimal largeBags = new BigDecimal("20");
			BigDecimal largeBox = numBox.divide(largeBags, RoundingMode.DOWN);
			
			// (numbox - largebox * largeBags ) / mediumbags 
			BigDecimal mediumBags = new BigDecimal("10");
			BigDecimal mulLrg = largeBox.multiply(largeBags);
			BigDecimal subMed = numBox.subtract(mulLrg);
			BigDecimal mediumBox = subMed.divide(mediumBags, RoundingMode.DOWN);
			
			// (numbox - largebox * largeBags ) - (mediumbox * mediumBags) 
			BigDecimal mulMed = mediumBox.multiply(mediumBags);
			BigDecimal subSml = numBox.subtract(mulLrg);
			BigDecimal smallBox = subSml.subtract(mulMed);
			
			int x = smallBox.intValue();	
			if (x > 5 && x < 10) {
				smallBox = new BigDecimal("2");
			} else if (x != 0 && x <= 5) {
				smallBox = new BigDecimal("1");
			} else if (x == 0) {
				 smallBox = new BigDecimal("0");
			}
			
			BigDecimal priceLrg = largeBox.multiply(LARGE_BOX);
			BigDecimal priceMed = mediumBox.multiply(MEDIUM_BOX);
			BigDecimal priceSml = smallBox.multiply(SMALL_BOX);
			BigDecimal total = orderPrice.add(priceLrg).add(priceMed).add(priceSml);
			
			DecimalFormat format1 = new DecimalFormat("###,###");
			String largeBxStr = format1.format(largeBox);
			String medBxStr = format1.format(mediumBox);
			String smlBxStr = format1.format(smallBox);

			String lprice = format2.format(priceLrg);
			String mPrice = format2.format(priceMed);
			String sPrice = format2.format(priceSml);
			String TotalPrice = format2.format(total);
			
			System.out.println("Boxes Used:");
			System.out.println("\t\t%s Large  - %2s".formatted(largeBxStr, lprice));
			System.out.println("\t\t%s Medium - %2s".formatted(medBxStr, mPrice));
			System.out.println("\t\t%s Small  - %2s".formatted(smlBxStr, sPrice));
			System.out.println();
			System.out.println("Your total cost is: %s".formatted(TotalPrice));
			
			LocalDate now = LocalDate.now();
			String nowStr = now.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy"));
			System.out.println("Date of Order: \t\t\t%s".formatted(nowStr));
			
			now = now.plusWeeks(2);
			String expectedStr = now.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy"));
			System.out.println("Expected Date of Arrival: \t%s".formatted(expectedStr));
			
			System.out.print("Input more?[Y/N]: ");
			String choice = scan.next();
			System.out.println();
			if (choice.equalsIgnoreCase("Y")) {
				computeBox();
				break;
			} else {
				isTrue = false;
				break;
			}
		}
		scan.close();
	}
}
