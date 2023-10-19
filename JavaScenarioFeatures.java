package TestDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaScenarioFeatures {
	public static void main(String[] args) {
		List<Emp> list = new ArrayList<>();
		list.add(new Emp(15011, "Siva", "Hyd", 600.6, 23, "HR", "Male", 1));
		list.add(new Emp(15012, "Ramaa", "Vizag", 700.6, 26, "Manager", "Male", 2));
		list.add(new Emp(15013, "Bramaranba", "BLR", 900.6, 27, "Sales", "female", 4));
		list.add(new Emp(15014, "Shankara", "Hyd", 300.6, 29, "HR", "Male", 6));
		list.add(new Emp(15015, "Ganesh", "Hyd", 800.6, 23, "Dev", "Male", 6));
		list.add(new Emp(15015, "Ganesh", "Hyd", 800.6, 23, "Dev", "Male", 6));

		list.add(new Emp(15016, "Badri", "Atp", 500.6, 23, "HR", "Male", 1));

		// print Female employees
		list.stream().filter(e -> e.getGender().equalsIgnoreCase("Female")).forEach(System.out::println);

		// print exp >6
		System.out.println("================/print  exp >6");
		list.stream().filter(e -> e.getExp() >= 6).forEach(System.out::println);
		System.out.println("+++++++low to high sal of emp");
		list.stream().sorted((e1, e2) -> (int) (e1.getSal() - e2.getSal())).forEach(System.out::println);
		System.out.println("+++++++High to low sal of emp");
		list.stream().sorted((e1, e2) -> (int) (e2.getSal() - e1.getSal())).limit(1).forEach(System.out::println);
		System.out.println("Second Highest sal      ");
		list.stream().sorted((e1, e2) -> (int) (e2.getSal() - e1.getSal())).limit(2).skip(1)
				.forEach(System.out::println);

		System.out.println("print unique dept...");
		list.stream().map(e -> e.getDept()).distinct().forEach(System.out::println);
		System.out.println("print lowest sal...");
		list.stream().sorted((e1, e2) -> (int) (e1.getSal() - e2.getSal())).limit(1).forEach(System.out::println);
		System.out.println("Second Lowest .....");
		list.stream().sorted((e1, e2) -> (int) (e1.getSal() - e2.getSal())).skip(1).limit(1)
				.forEach(System.out::println);
		System.out.println("Avaerage sal ...");
		Double averageSal = list.stream().collect(Collectors.averagingDouble(Emp::getSal));
		System.out.println(averageSal);
		System.out.println("print Age >25 and expe>3year their names only");
		list.stream().filter(e -> e.getAge() > 25 && e.getExp() >= 3).forEach(e -> System.out.println(e.getName()));
		System.out.println("print Emp name and sal ....");
		list.stream().filter(e -> e.getAge() > 25 && e.getExp() > 3)
				.forEach(e -> System.out.println(e.getName() + " " + e.getSal()));

		System.out.println("name length equal to six ");
		list.stream().filter(e -> e.getName().length() > 5).forEach(e -> System.out.println(e.getName()));
		// print duplicate dept
		System.out.println("print duplicate dept");
		/*Map<String, Long> empCount = list.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.counting()));
		empCount.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(System.out::println);*/
		
		Map<String, Long> count = list.stream().collect(Collectors.groupingBy(Emp::getDept,Collectors.counting()));
		count.entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::println);
		
		//print deptName and count
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Emp::getDept,Collectors.counting()));
		System.err.println(collect);
		
	}

}
