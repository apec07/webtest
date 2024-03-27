package webtest.io;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class Utility {
	

	public static List<String> fileReader(String path) throws IOException {
		LinkedList<String> list = new LinkedList<>();
		BufferedReader br = new BufferedReader(new FileReader(path));
		while(br.ready()) {
			list.add(br.readLine());
		}
		br.close();
		
		return list;
	}
	
	public static boolean fileWriter(String filename) throws IOException {
	
		FileOutputStream fos = new FileOutputStream(new File(filename),true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);
		for(int i=1;i<=5;i++)
			ps.println("this is my test text file"+i);
		
		ps.close();
		return true;
	}
	
	 
}
