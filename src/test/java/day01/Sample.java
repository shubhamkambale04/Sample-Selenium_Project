package day01;

import java.util.HashSet;
import java.util.Set;

public class Sample {

	public static void main(String[] args) {
		
		String s="uyh56nuh3nibhb";
		
		Set<Character> letters=new HashSet<>();
		Set<Character> numbers=new HashSet<>();
		
		int letterCount = 0, numberCount = 0;
		for(char ch:s.toCharArray())
		{
			if(Character.isDigit(ch))
			{
				numbers.add(ch);
				numberCount++;
			}else {
				letters.add(ch);
				letterCount++;
			}
		}
		System.out.println(letters+":"+letterCount);
		System.out.println(numbers+":"+numberCount);
	}
}
