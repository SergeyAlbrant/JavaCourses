package Classwork170825;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseTrader {

	/*
	 * 
	 * 1 Find all transactions in the year 2011 and sort them by value (small to
	 * high). 
	 * 
	 * 2 What are all the unique cities where the traders work? 
	 * 
	 * 3 Find all traders from Cambridge and sort them by name. 
	 * 
	 * 4 Return a string of all traders’ names sorted alphabetically. 
	 * 
	 * 5 Are any traders based in Milan? 
	 * 
	 * 6 Print all transactions’ values from the traders living in Cambridge. 
	 * 
	 * 7 What’s the highest value of all the transactions? 
	 * 
	 * 8 Find the transaction with the smallest value.
	 */

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));
		
		
		//1
		List<Transaction> result1 = transactions.stream().filter(t -> t.getYear()==2011)
			.sorted(Comparator.comparing(Transaction::getValue))
			.collect(Collectors.toList());
		
		System.out.println(result1);
		
		//2 What are all the unique cities where the traders work? 
		
		List<String> result2 = transactions.stream().map(Transaction::getTrader)
				.map(Trader::getCity).distinct().collect(Collectors.toList());
		
		System.out.println(result2);
		
		// 3 Find all traders from Cambridge and sort them by name. 
		
		List<Trader> result3 = transactions.stream().map(Transaction::getTrader)
				.filter(t -> t.getCity().equals("Cambridge")).distinct()
				.sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
		
		System.out.println(result3);	
		
		
		// 4 Return a string of all traders’ names sorted alphabetically. 
		
		String result4 = transactions.stream().map(Transaction::getTrader)
				.distinct().map(Trader::getName).sorted().collect(Collectors.joining(", "));
		
		System.out.println(result4);	
		
		//5 Are any traders based in Milan? 
		
		Boolean result5 = transactions.stream().map(Transaction::getTrader).distinct()
				.anyMatch(t -> t.getCity().equals("Milan"));
		
		System.out.println(result5);
		
		//6 Print all transactions’ values from the traders living in Cambridge. 
		
		List<Integer> result6 = transactions.stream()
				.filter(t -> t.getTrader().getCity().equals("Cambridge"))
				.map(Transaction::getValue).collect(Collectors.toList());
		
		System.out.println(result6);
		
		//7 What’s the highest value of all the transactions? 
		
		Optional<Integer> result7 = transactions.stream()
				.map(Transaction::getValue).reduce(Integer::max);  //èëè max
		
		System.out.println(result7.get());
		
		
		//8 Find the transaction with the smallest value.
		Optional<Transaction> result8 = transactions.stream()
				.min(Comparator.comparing(Transaction::getValue));  //èëè max
		
		System.out.println(result8.get());
	}

}