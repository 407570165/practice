package tom.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tester {

	public static void main(String[] args) {
			File dir =new File("C:\\tmp");
			if(dir.exists()&& dir.isDirectory()) {
				File[] files =dir.listFiles();
				for(File s : files) {
					if(s.isFile())
					System.out.println(s.getName());
				}
			}
			System.out.println(dir.mkdir());
			File dd =new File(dir, "aaaaa");
			System.out.println(dd.mkdirs());
			
	}
/*System.out.println(file.length());
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.canExecute());
			System.out.println(file.exists());
			System.out.println(file.isFile());*/
		
}
