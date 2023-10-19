package TestDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class predicateEx {
public static void main(String[] args) {
	
	
	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
	
	//type-1
	 //List<Integer> collect = list.stream().filter(t->t%2==0).collect(Collectors.toList());
	//System.out.println(collect);
	//list.stream().filter(t->t%2==0).forEach(System.out::println);
	
	
	list.stream().map(i->i+10).forEach(System.out::println);
	
}
}
