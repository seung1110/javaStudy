package my.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileCutExam {

	public static void main(String[] args) {
		BufferedReader br = null;
		Set<String> set = new HashSet<String>();
		Pattern p = Pattern.compile("<a href");
		Matcher m;
		
		try {
			br = new BufferedReader(new FileReader("newFile.txt"));
			String str;
			while((str = br.readLine()) != null) {
				m = p.matcher(str);
				if(m.find()) {
					set.add(m.group());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

		for(String s : set)
			System.out.println(s);
		
	}

}
