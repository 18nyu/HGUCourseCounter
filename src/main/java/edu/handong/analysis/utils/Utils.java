package edu.handong.analysis.utils;

import java.io.*;
import java.util.ArrayList;

public class Utils {
	public static ArrayList<String> getLines(String file, boolean removeHeader) {
		ArrayList<String> temp;
		String buffer;
		try {
			reader=new BufferedReader(new FileReader(file));
		} catch(Exception e) {
			e.printStackTrace();
		}
		if(removeHeader) {
			buffer = reader.readLine();
			while(true) {
				buffer=reader.readLine();
				if(buffer==null) {
					break;
				}
				else {
					temp.add(buffer);
				}
			}
		} else {
			while(true) {
				buffer = reader.readLine();
				if(buffer==null) {
					break;
				}
				else {
					temp.add(buffer);
				}
			}
		}
		return temp;
	}

	public static void writeAFile(ArrayList<String> lines, String targetFileName) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(targetFileName));
		} catch (FileNotFoundException e) {
			File tmp = new File("logs/error.log");
			tmp.getParentFile().mkdirs();
			tmp.createNewFile();
		}
		
	}

}
