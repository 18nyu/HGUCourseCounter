package edu.handong.analysis;

import edu.handong.analysis.utils.NotEnoughArgumentException;

public class Main {
	public static void main(String[] args) {
		
		if(args.length < 2) {
			//TODO print improper argument
			try {
				throw new NotEnoughArgumentException("No CLI argument Exception! Please put a file path.");
			} catch (NotEnoughArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.exit(0);
		}
		else {	
			HGUCoursePatternAnalyzer analyzer = new HGUCoursePatternAnalyzer();
			analyzer.run(args);	
		}
		
	}
}