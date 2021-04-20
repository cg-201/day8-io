package day8.demowrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class D3WriteDemo {
	public static void main(String[] args) throws Exception{
		
		String pathname = "/Users/research/Desktop/demo3.txt";
		File file = new File(pathname);
		
		
		PrintWriter pw = new PrintWriter(file);
		pw.append("Hellooooo\n");
		pw.append("World \n");
		pw.append("Hellooooo\n");
		pw.append("World\n");
		pw.append("Hellooooo\n");
		pw.append("World");
		
		
		pw.flush();
		pw.close();
	}
}
