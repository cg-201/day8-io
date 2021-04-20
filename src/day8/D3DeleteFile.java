package day8;

import java.io.File;

public class D3DeleteFile {
	public static void main(String[] args) {
		
		String pathname = "/Users/research/Desktop/demo1.txt";
		File file = new File(pathname);
		
		if(file.exists()) {
			file.delete();
			System.out.println("file delete succssfully");
		} else {
			System.out.println("File does not exists!!");
		}
		
	}
}
