package day8;

import java.io.File;

public class D4FolderCheck {
	
	public static void main(String[] args) {
		
		String pathname = "/Users/research/Desktop/LIC.pdf";
		File file = new File(pathname);
		
		if(file.isDirectory()) {
			System.out.println("Its Directory!!");
		} else {
			System.out.println("Its not directory!!");
		}
		
		
	}
}
