package day8.demowrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class D2WriteDemo {
	public static void main(String[] args) throws Exception{
		
		String pathname = "/Users/research/Desktop/demo2.txt";
		File file = new File(pathname);
		
		
		Writer writer = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(writer);
		
		bw.write("Helo world");
		bw.write("Hello Again");
		
		bw.close();
	}
}
