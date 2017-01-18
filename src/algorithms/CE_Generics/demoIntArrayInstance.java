package algorithms.CE_Generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class demoIntArrayInstance {
	
	static Integer[] myNumbers = {1, 2, 3, 6, 8, 4, 7, 8, 4, 10, 2, 5, 3, 4, 1};
	static Character[] myCharacters = {'a', '*', '$', 'a', '*', '$'};
	static String[] myStrings = {"hello", "ron", "burgundy", "ron", "burgundy", "hello"};
	static Set <Integer> myIntSet =  new HashSet<Integer>(Arrays.asList(2, 4, 2, 4, 5, 6, 1, 2, 4, 5, 7));
	static Integer searchInt = 2;
	
	public static int countOccurences(Integer[] number, int j) {
		int count = 0;
		for(int i = 0; i < number.length; i++) {
			if(j == number[i])
				count++;
		}
		return count;		
	}			
	public static <T> int countOccurences(T[] items, T thing) {
		int count = 0;
		for(int i = 0; i < items.length; i++) {
			if(thing == items[i]) 
				count++;					
		}
		return count;
	}
	
	public static <T, C extends Collection<T>> int countOccurences2(Collection<T> items, T thing) {
		int count = 0;
		for(T obj : items) {
			if(thing.equals(obj)) 
				count++;					
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.printf("Burgundy is in the array %d times\n", countOccurences(myStrings, "burgundy"));
		System.out.printf("$ is in the array %d times\n", countOccurences(myCharacters, '$'));
		System.out.printf("2 is in the array %d times\n", countOccurences(myNumbers, 2));
		System.out.printf("2 is in the array %d times\n", countOccurences2(myIntSet, searchInt));
	
	}
}


