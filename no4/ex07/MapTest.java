package ex07;

import java.util.Optional;

public class MapTest {
	public static void main(String[] args){
		Optional<String> sample = Optional.ofNullable(null);
		Optional<String> result = sample.map( str -> str.toUpperCase());
		
		System.out.println(result.isEmpty());
	}
}