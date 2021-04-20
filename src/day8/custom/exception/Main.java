package day8.custom.exception;

public class Main {
	public static void main(String[] args) throws InvalidNumberException {
		
		int n = 100;
		
		if(n == 100) {
			throw new InvalidNumberException();
		}
		
		System.out.println(n);
		
	}
}
