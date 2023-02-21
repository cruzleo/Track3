package org.ssglobal.training.codes.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class GenerateIntegerStream {

	public void getDivByTwo(int[] num) {
		IntStream arrStream = IntStream.of(num);
		arrStream.filter(no -> no % 2 == 0 && no > 15).forEach(System.out::println);
	}

	public void getDivByThree(int[] num) {
		IntStream arrStream = IntStream.of(num);
		arrStream.filter(no -> no % 3 == 0 && no < 21).forEach(System.out::println);
	}

	public void getDivByFive(int[] num) {
		IntStream arrStream = IntStream.of(num);
		Stream<Integer> boxedArrNum = arrStream.boxed();
		List<Integer> listNum = boxedArrNum.collect(Collectors.toList());
		Stream<Integer> numStream = listNum.stream();
		numStream.filter(no -> no % 5 == 0).sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
