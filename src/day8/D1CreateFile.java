package day8;

import java.io.File;

public class D1CreateFile {
	public static void main(String[] args) {
		
		demo1();
	}
	
	
	static void demo2() {
		try {
			String pathname = "/abcd/research/Desktop/myfile.txt";

			File file = new File(pathname);
			file.createNewFile();
			
			System.out.println("File Created successflly!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	static void demo1() {
		try {
			// String pathname = "\\Users\\research\\Desktop\\demo1.txt";
			String pathname = "/Users/research/Desktop/myfile.txt";

			File file = new File(pathname);
			file.createNewFile();
			
			System.out.println("File Created successflly!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
