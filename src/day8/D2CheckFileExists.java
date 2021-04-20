package day8;

import java.io.File;

public class D2CheckFileExists {

	public static void main(String[] args) throws Exception {
		
		String pathname = "/Users/research/Desktop/myfile1.txt";
		File file = new File(pathname);
		
		if(file.exists()) {
			System.out.println("File alread exists!!");
		} else {
			file.createNewFile();
		}
		
	}
}
