package day8.demoread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class D2ReadDemo {
	public static void main(String[] args) throws Exception {
		demo2();
	}
	
	static void demo2() throws Exception {
		String pathname = "/Users/research/Desktop/sample.json";
		File file = new File(pathname);
		
		Reader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		
		String line1 = br.readLine();
		while(line1 != null) {
			System.out.println(line1);
			
			// moving to next line
			line1 = br.readLine();
		}
		
		
		
		br.close();
	}
	
	static void demo1() throws Exception {
		String pathname = "/Users/research/Desktop/sample.json";
		File file = new File(pathname);
		
		Reader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		
		String line1 = br.readLine();
		System.out.println(line1);
		
		String line2 = br.readLine();
		System.out.println(line2);
		
		br.close();
	}
}
