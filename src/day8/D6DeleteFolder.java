package day8;

import java.io.File;

public class D6DeleteFolder {
	public static void main(String[] args) {
		
		String pathname = "/Users/research/Desktop/tuesday/soham.txt";
		
		File file = new File(pathname);
		
		if(file.exists()) {
			file.delete();
			System.out.println("Deleted Succssefully!");
		}
		
		
	}
}
