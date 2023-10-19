package TestDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OneToTen {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 10).forEach(System.out::println);

		// print duplicate names
		List<String> list = Arrays.asList("Ramaa", "Raghavaa", "siva", "shankara", "Ramaa");
		Map<String, Long> count = list.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting()));
		count.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey)
				.forEach(System.out::println);

	}

}
