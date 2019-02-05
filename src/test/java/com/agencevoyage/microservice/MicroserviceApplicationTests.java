package com.agencevoyage.microservice;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MicroserviceApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Test
	public <T> void testFunctionOeratorInjava8() {
		
		Function<Integer, String> toString = n -> String.valueOf(n);
		Function<String, Integer> toInteger = s -> Integer.valueOf(s);

		assert "4".equals(toString.apply(4));
		assert toInteger.apply("4") == 4;

		assert "4".equals(toString.compose(toInteger).apply("4"));
		assert toString.andThen(toInteger).apply(4) == 4;
		
		
		
	//
		BiFunction<Integer, String, String> concat = (Integer i, String s) -> s + ": " + i;

		assert "un: 1".equals(concat.apply(1, "un"));
		
		assert UnaryOperator.identity().apply("un").equals("un");
		
		BinaryOperator<String> concatString = (s1, s2) -> s1.concat(": ").concat(s2);

		assert "un: 1".equals(concatString.apply("un", "1"));
		
		//
		
		Predicate<String> isEmpty = s -> s == null || s.isEmpty();
		Predicate<String> isTrimmed = s -> s.equals(s.trim());

		assert isEmpty.test(null) == true;
		assert isEmpty.test("") == true;
		assert isEmpty.test("not empty") == false;

		assert isEmpty.negate().and(isTrimmed).test("not empty") == true;
		assert isEmpty.negate().and(isTrimmed).test(" not empty ") == false;

		assert isEmpty.or(isTrimmed).test("") == true;
		assert isEmpty.or(isTrimmed).test("not empty") == true;

		assert Predicate.isEqual("hello").test("hello") == true;
		
		Supplier<String> emptyString = () -> "";

		assert "".equals(emptyString.get());
		//
		Consumer<String> print = s -> System.out.println(s);
		Consumer<String> hello = s -> System.out.printf("Hello %s !", s);

		print.accept("something"); // something
		print.andThen(hello).accept("JC"); // JC Hello JC !
		
		//comparator
		Comparator<Integer> ascending = (a, b) -> a.compareTo(b);

		assert ascending.compare(10, 1) > 0;
		assert ascending.reversed().compare(10, 1) < 0;
	}
}

