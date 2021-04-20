package day8.demoread;

import java.io.File;
import java.util.Scanner;

public class D3ReadDemo {
	public static void main(String[] args)throws Exception {
		
		demo2();
	}
	
	static void demo2() throws Exception{
		String pathname = "/Users/research/Desktop/sample.json";
		File file = new File(pathname);
		
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line);
		}
		
		scanner.close();
	}
	
	static void demo1() throws Exception{
		String pathname = "/Users/research/Desktop/sample.json";
		File file = new File(pathname);
		
		Scanner scanner = new Scanner(file);
		
		String line = scanner.nextLine();
		System.out.println(line);
		
		String line1 = scanner.nextLine();
		System.out.println(line1);
		
		scanner.close();
	}
}

