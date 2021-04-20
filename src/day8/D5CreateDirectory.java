package day8;

import java.io.File;

public class D5CreateDirectory {

	public static void main(String[] args) {
		String pathname = "/Users/research/Desktop/tuesday/soham.txt";
		
		File file = new File(pathname);
		
		if(!file.exists()) {
			file.mkdir();
			System.out.println("Directory created successfully!!");
		} else {
			System.out.println("Directory already exists!!");
		}
	}
}
