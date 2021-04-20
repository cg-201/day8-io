package day8.demoread;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class D1ReadDemo {

	public static void main(String[] args)throws Exception {
		demo3();
	}
	
	static void demo3() throws Exception {
		String pathname = "/Users/research/Desktop/sample.json";
		File file = new File(pathname);
		
		
		Reader reader = new FileReader(file);
		
		int data = reader.read();
		while(data != -1) {
			System.out.print((char)data);
			
			data = reader.read();
		}
		
		
		reader.close();
	}
	
	static void demo2() throws Exception {
		String pathname = "/Users/research/Desktop/sample.json";
		File file = new File(pathname);
		
		
		Reader reader = new FileReader(file);
		
		int readNext = reader.read();
		while(readNext != -1) {
			
			char ch = (char)readNext;
			System.out.print(ch);
			
			
			// reading the next character
			readNext = reader.read();
		}
		
		
		
		// close the file.
		reader.close();
	}
	
	static void demo1() throws Exception {
		String pathname = "/Users/research/Desktop/sample.json";
		File file = new File(pathname);
		
		// absolute raw format
		Reader reader = new FileReader(file);
		char ch = (char)reader.read();
		
		System.out.println(ch);
		
		// close the file.
		reader.close();
	}
}
