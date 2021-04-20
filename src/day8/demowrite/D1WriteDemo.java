package day8.demowrite;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class D1WriteDemo {
	public static void main(String[] args) throws Exception{
		
		String pathname = "/Users/research/Desktop/demo.txt";
		File file = new File(pathname);
		
		
		Writer writer = new FileWriter(file);
		writer.write("hello World");
		
		writer.close();
	}
}
