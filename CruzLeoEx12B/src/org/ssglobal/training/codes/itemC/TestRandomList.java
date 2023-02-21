package org.ssglobal.training.codes.itemC;

public class TestRandomList {

	public static void main(String[] args) {
		RandomList<Integer> randomList1 = new RandomList<>();
		randomList1.add(12);
		randomList1.add(3);
		randomList1.add(100);
		randomList1.add(10);
		randomList1.add(10);
		randomList1.add(30);
		randomList1.add(100);
		System.out.println(randomList1.toString());
		
		System.out.println("---------removing occurence--------");
		randomList1.remove(Integer.valueOf(10));
		randomList1.remove(Integer.valueOf(100));
		System.out.println(randomList1.toString());
		
		System.out.println("---------removing based on index--------");
		randomList1.remove(0);
		System.out.println(randomList1.toString());
		
		
		System.out.println("---------Test on string--------");
		RandomList<String> randomList2 = new RandomList<>();
		randomList2.add("aBBa");
		randomList2.add("AbbA");
		randomList2.add("ABBA");
		randomList2.add("abba");
		randomList2.add("abba");
		randomList2.add("abba");
		System.out.println(randomList2.toString());
		
		System.out.println("---------removing occurence--------");
		randomList2.remove("abba");
		System.out.println(randomList2.toString());
		
		System.out.println("---------removing based on index--------");
		randomList2.remove(1);
		System.out.println(randomList2.toString());
		
	}

}
