package webtest.io;

import java.io.IOException;
import java.util.List;

public class IoTest {

	public static void main(String[] args) {
		List<String> list = null;
		try {
			Utility.fileWriter("/home/chen/Documents/hello.txt");
			list = Utility.fileReader("/home/chen/Documents/hello.txt");
			list.forEach(p->{
				System.out.println(p);
			});
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Unknown errors");
		} finally {
			System.out.println("====================Test Finish===============");
		}

	}

}
