package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda {

	public static void main(String[] args) {
		processNumbers(
			Arrays.asList(1,20,40,4),
			p -> p < 20,
			p -> p*2,
			p -> System.out.println(p)
		);
		
		Arrays.asList(1,20,40,4)
			.stream()
			.filter(n -> n<30)
			.map(n -> "number: " + String.valueOf(n))
			.forEach(n -> System.out.println(n));
		
		Arrays.asList(1,20,40,4)
			.stream()
			.max(Integer::compareTo)
			.ifPresent(max -> System.out.println("max number: " + max));
		
		Arrays.asList(1,20,40,4)
			.stream()
			.reduce((result,n) -> result+n)
			.ifPresent(sum -> System.out.println("sum of elements: " + sum));
		
		System.out.println("counting " +
			Arrays.asList(1,20,40,4)
			.stream()
			.collect(Collectors.counting()));
	}
	
	public static void processNumbers(List<Integer> roster,Predicate<Integer> tester,
			Function<Integer,Integer> mapper, Consumer<Integer> block) {
        for (Integer p : roster) {
            if (tester.test(p)) {
                block.accept(mapper.apply(p));
            }
        }
	}

}
